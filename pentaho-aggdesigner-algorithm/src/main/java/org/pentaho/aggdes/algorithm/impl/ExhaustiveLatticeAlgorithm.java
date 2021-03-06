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
package org.pentaho.aggdes.algorithm.impl;

import org.pentaho.aggdes.algorithm.Progress;
import org.pentaho.aggdes.algorithm.Result;
import org.pentaho.aggdes.model.Aggregate;
import org.pentaho.aggdes.model.Parameter;
import org.pentaho.aggdes.model.Schema;
import org.pentaho.aggdes.util.AggDesUtil;

import java.util.List;
import java.util.Map;

/**
 * Implementation of {@link org.pentaho.aggdes.algorithm.Algorithm}
 * that tries all possible sets of
 * {@link org.pentaho.aggdes.model.Aggregate} objects.
 *
 * <p>Expensive in terms of memory and CPU, this algorithm is practical only
 * for small schemas (less than say 15 attributes).
 */
public class ExhaustiveLatticeAlgorithm extends AlgorithmImpl {
  public ExhaustiveLatticeAlgorithm() {
    super();
  }

  @Override public Result run(Schema schema,
      Map<Parameter, Object> parameterValues, Progress progress) {
    this.schema = schema;
    onStart(parameterValues, progress);

    // Create a lattice, populated with all aggregates.
    Lattice lattice = new ExhaustiveLatticeImpl(schema);
    double remainingCost = schema.getStatisticsProvider().getFactRowCount();
    return runAlgorithm(lattice, remainingCost, 0, Integer.MAX_VALUE);
  }

  public List<CostBenefit> computeAggregateCosts(Schema schema,
      Map<Parameter, Object> parameterValues,
      List<Aggregate> aggregateList) {
    final ExhaustiveLatticeImpl lattice =
        new ExhaustiveLatticeImpl(schema);
    final List<AggregateImpl> aggregateImplList =
        AggDesUtil.cast(aggregateList);
    return lattice.computeAggregateCosts(aggregateImplList);
  }
}

// End ExhaustiveLatticeAlgorithm.java
