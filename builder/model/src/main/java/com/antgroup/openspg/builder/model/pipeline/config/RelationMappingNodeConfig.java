package com.antgroup.openspg.builder.model.pipeline.config;

import com.antgroup.openspg.builder.model.pipeline.enums.NodeTypeEnum;
import java.util.List;
import lombok.Getter;

@Getter
public class RelationMappingNodeConfig extends BaseMappingNodeConfig {

  private final String relation;

  private final List<MappingFilter> mappingFilters;

  private final List<MappingConfig> mappingConfigs;

  private final List<PredictingConfig> predictingConfigs;

  public RelationMappingNodeConfig(
      String relation,
      List<MappingFilter> mappingFilters,
      List<MappingConfig> mappingConfigs,
      List<PredictingConfig> predictingConfigs) {
    super(NodeTypeEnum.RELATION_MAPPING);
    this.relation = relation;
    this.mappingFilters = mappingFilters;
    this.mappingConfigs = mappingConfigs;
    this.predictingConfigs = predictingConfigs;
  }
}
