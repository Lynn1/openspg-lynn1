package com.antgroup.openspg.builder.core.physical.process;

import com.antgroup.openspg.builder.core.operator.fusing.SubGraphFusing;
import com.antgroup.openspg.builder.core.operator.fusing.SubGraphFusingImpl;
import com.antgroup.openspg.builder.core.operator.fusing.SubjectFusing;
import com.antgroup.openspg.builder.core.operator.fusing.SubjectFusingImpl;
import com.antgroup.openspg.builder.core.operator.predicating.RecordPredicating;
import com.antgroup.openspg.builder.core.operator.predicating.RecordPredicatingImpl;
import com.antgroup.openspg.builder.core.runtime.BuilderContext;
import com.antgroup.openspg.builder.model.exception.BuilderException;
import com.antgroup.openspg.builder.model.pipeline.config.SubGraphMappingNodeConfig;
import com.antgroup.openspg.builder.model.record.BaseAdvancedRecord;
import com.antgroup.openspg.builder.model.record.BaseRecord;
import com.antgroup.openspg.builder.model.record.BaseSPGRecord;
import com.antgroup.openspg.builder.model.record.BuilderRecord;
import com.antgroup.openspg.core.schema.model.identifier.SPGTypeIdentifier;
import com.antgroup.openspg.core.schema.model.type.BaseSPGType;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

public class SubGraphMappingProcessor extends BaseMappingProcessor<SubGraphMappingNodeConfig> {

  private BaseSPGType spgType;
  private SubGraphFusing subGraphFusing;
  private RecordPredicating recordPredicating;
  private SubjectFusing subjectFusing;

  public SubGraphMappingProcessor(String id, String name, SubGraphMappingNodeConfig config) {
    super(id, name, config);
  }

  @Override
  public void doInit(BuilderContext context) throws BuilderException {
    super.doInit(context);

    SPGTypeIdentifier identifier = SPGTypeIdentifier.parse(config.getSpgType());
    this.spgType = (BaseSPGType) loadSchema(identifier, context.getCatalog());

    this.subGraphFusing = new SubGraphFusingImpl(config.getMappingConfigs());
    this.subGraphFusing.init(context);

    this.subjectFusing = new SubjectFusingImpl(config.getSubjectFusingConfig());
    this.subjectFusing.init(context);

    this.recordPredicating = new RecordPredicatingImpl(config.getPredicatingConfigs());
    this.recordPredicating.init(context);
  }

  @Override
  public List<BaseRecord> process(List<BaseRecord> inputs) {
    List<BaseRecord> advancedRecords = new ArrayList<>(inputs.size());
    for (BaseRecord baseRecord : inputs) {
      BuilderRecord record = (BuilderRecord) baseRecord;
      if (isFiltered(record, config.getMappingFilters())) {
        continue;
      }

      BuilderRecord mappedRecord = mapping(record, config.getMappingConfigs());
      BaseAdvancedRecord advancedRecord = toSPGRecord(mappedRecord, spgType);
      if (advancedRecord != null) {
        subGraphFusing.subGraphFusing(advancedRecord);
        recordPredicating.propertyPredicating(advancedRecord);
        advancedRecords.add(advancedRecord);
      }

      List<BaseSPGRecord> subGraphRecords =
          spgTypeRecordMapping(record, spgType, config, subGraphFusing);
      if (CollectionUtils.isNotEmpty(subGraphRecords)) {
        advancedRecords.addAll(subGraphRecords);
      }
    }
    return advancedRecords;
  }

  @Override
  public void close() throws Exception {}
}