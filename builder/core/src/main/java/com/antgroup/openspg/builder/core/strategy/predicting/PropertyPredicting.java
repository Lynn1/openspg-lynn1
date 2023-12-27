package com.antgroup.openspg.builder.core.strategy.predicting;

import com.antgroup.openspg.builder.core.runtime.BuilderContext;
import com.antgroup.openspg.builder.model.exception.BuilderException;
import com.antgroup.openspg.builder.model.exception.PredictingException;
import com.antgroup.openspg.builder.model.record.BaseAdvancedRecord;
import java.util.List;

public interface PropertyPredicting {

  /** Initialize property linking strategy. */
  void init(BuilderContext context) throws BuilderException;

  /** Input an SPG property record and predict the property value. */
  List<BaseAdvancedRecord> predicting(BaseAdvancedRecord record) throws PredictingException;
}