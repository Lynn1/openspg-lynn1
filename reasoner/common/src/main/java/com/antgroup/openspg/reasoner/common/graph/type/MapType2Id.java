/*
 * Copyright 2023 OpenSPG Authors
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

package com.antgroup.openspg.reasoner.common.graph.type;

public interface MapType2Id {

  /**
   * get string type by type id
   *
   * @param typeId
   * @return
   */
  String getTypeById(Long typeId);

  /**
   * get type id by string type
   *
   * @param type
   * @return
   */
  Long getIdByType(String type);
}
