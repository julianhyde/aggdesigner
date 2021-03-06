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
package org.pentaho.aggdes.algorithm;

import org.pentaho.aggdes.model.Aggregate;

import java.io.PrintWriter;
import java.util.List;

/**
 * Recommendations produced by an aggregate table advisor job.
 */
public interface Result {
  /**
   * Returns a list of aggregate tables.
   *
   * @return list of aggregate tables
   */
  List<Aggregate> getAggregates();

  /**
   * Returns a list of cost/benefit for each aggregate.
   *
   * @return list of cost/benefit metrics
   */
  List<Algorithm.CostBenefit> getCostBenefits();

  /**
   * Prints a textual description of the result.
   *
   * @param pw Print writer
   */
  void describe(PrintWriter pw);
}

// End Result.java
