/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.  See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */
package org.pentaho.aggdes.model;


/**
 * OLAP Cube Level, Child of Hierarchy
 */
public interface Level {

  /**
   * Name of the Level
   *
   * @return name
   */
  String getName();

  /**
   * Attribute associated with level if available
   *
   * Note that All Levels will not have an attribute associated with them.
   *
   * @return attribute
   */
  Attribute getAttribute();


  /**
   * returns the parent level, null if root level
   *
   * @return level
   */
  Level getParent();
}

// End Level.java
