/*
 * Copyright 2023 Ant Group CO., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 */

package com.antgroup.openspg.builder.core.runtime;

import com.antgroup.openspg.builder.model.BuilderException;
import com.antgroup.openspg.builder.core.physical.process.BaseProcessor;
import lombok.Getter;

@Getter
public class BuilderRecordException extends BuilderException {

  private final BaseProcessor<?> processor;

  public BuilderRecordException(
      BaseProcessor<?> processor, Throwable cause, String messagePattern, Object... args) {
    super(cause, messagePattern, args);
    this.processor = processor;
  }

  public BuilderRecordException(BaseProcessor<?> processor, String messagePattern, Object... args) {
    this(processor, null, messagePattern, args);
  }
}
