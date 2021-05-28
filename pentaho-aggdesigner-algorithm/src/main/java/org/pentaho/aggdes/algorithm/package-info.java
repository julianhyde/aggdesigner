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

/**
 * Defines the interface of the Aggregate Designer algorithm and supporting
 * classes.
 *
 * <p>The Aggregate Designer consists of a number of components:
 * <ul>
 * <li>The <dfn>schema loader</dfn> component
 *     ({@link org.pentaho.aggdes.model.SchemaLoader}) reads a star schema and
 *     presents the algorithm with a {@link org.pentaho.aggdes.model.Schema}
 *     object and embedded {@link org.pentaho.aggdes.model.Table}
 *     and {@link org.pentaho.aggdes.model.Attribute} objects.</li>
 *
 * <li>The <dfn>algorithm</dfn> component
 *     ({@link org.pentaho.aggdes.algorithm.Algorithm}) tries to find the
 *     most efficient set of aggregates for a given schema. A set of aggregates
 *     is efficient if it enables any expected query to evaluate quickly yet
 *     has a reasonable cost in terms of disk space and load time.</li>
 *
 * <li>The <dfn>result handler</dfn> component
 *     ({@code org.pentaho.aggdes.output.ResultHandler}) converts the result of
 *     the algorithm into a useful form such as a script of CREATE TABLE
 *     statements to create aggregate tables and INSERT statements to populate
 *     them. A result handler is not necessary if you are invoking the algorithm
 *     programmatically and your program will process the
 *     ({@link org.pentaho.aggdes.algorithm.Result})object produced by the
 *     algorithm itself.</li>
 * </ul>
 *
 * <p>Each of the components is specified a particular Java interface that extends
 *     {@link org.pentaho.aggdes.model.Component}. There is a default
 *     implementation for each component, but you can provide your own.</p>
 *
 * <p>There is a command-line utility {@code org.pentaho.aggdes.model.Main}
 *     to allow you to invoke the algorithm. You can choose which implementation
 *     of each component, and provide parameters to each component.</p>
 */
package org.pentaho.aggdes.algorithm;

// End package-info.java
