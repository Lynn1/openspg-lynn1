package com.antgroup.openspg.builder.model.pipeline.config;

import com.antgroup.openspg.builder.model.pipeline.config.fusing.BaseFusingConfig;
import com.antgroup.openspg.builder.model.pipeline.enums.NodeTypeEnum;
import java.util.List;
import lombok.Getter;

@Getter
public class SPGTypeMappingNodeConfig extends BaseMappingNodeConfig {

  private final String spgType;

  private final List<MappingFilter> mappingFilters;

  private final List<MappingConfig> mappingConfigs;

  private final BaseFusingConfig subjectFusingConfig;

  private final List<PredictingConfig> predictingConfigs;

  public SPGTypeMappingNodeConfig(
      String spgType,
      List<MappingFilter> mappingFilters,
      List<MappingConfig> mappingConfigs,
      BaseFusingConfig subjectFusingConfig,
      List<PredictingConfig> predictingConfigs) {
    super(NodeTypeEnum.SPG_TYPE_MAPPING);
    this.spgType = spgType;
    this.mappingFilters = mappingFilters;
    this.mappingConfigs = mappingConfigs;
    this.subjectFusingConfig = subjectFusingConfig;
    this.predictingConfigs = predictingConfigs;
  }
}
