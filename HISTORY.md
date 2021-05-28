<!--
{% comment %}
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
either express or implied.  See the License for the specific
language governing permissions and limitations under the
License.
{% endcomment %}
-->
# Aggregate Designer release history and change log

For a full list of releases, see <a href="https://github.com/julianhyde/aggdesigner/releases">github</a>.

## <a href="https://github.com/julianhyde/aggdesigner/releases/tag/aggdesigner-6.0">6.0</a> / under development

* Sign artifacts only if "release" profile is enabled
* [<a href="https://github.com/julianhyde/aggdesigner/issues/2">AGGDES-2</a>]
  Change groupId:artifactId to "net.hydromatic:aggdesigner"
* Upgrade to foodmart-data-hsqldb-0.4

## <a href="https://github.com/julianhyde/aggdesigner/releases/tag/pentaho-aggdesigner-5.1.5-jhyde">5.1.5-jhyde</a> / 2015-01-27

* Make commons-logging dependency "compile"

## <a href="https://github.com/julianhyde/aggdesigner/releases/tag/pentaho-aggdesigner-5.1.4-jhyde">5.1.4-jhyde</a> / 2015-01-26

* Disable some tests; all Travis now runs clean
* Use hsqldb, rather than MySQL, as default test database; upgrade hsqldb
* Enable Travis CI
* Add history, LICENSE, NOTICE
* [<a href="https://github.com/julianhyde/aggdesigner/issues/21">AGGDES-1</a>]
  Make commons-logging and dom4j dependencies "provided
* Test the algorithm on a more realistic schema, with state depending on
  zipcode

## <a href="https://github.com/julianhyde/aggdesigner/releases/tag/pentaho-aggdesigner-5.1.3-jhyde">5.1.3-jhyde</a> / 2014-09-30

* Change scm to allow pushes during release process
* Resolve SNAPSHOT dependencies
* Change distribution repo just while we make a release
* [<a href="http://jira.pentaho.com/browse/PAD-144">PAD-144</a>]
  Improve test schema and database
  * Test the algorithm on a more realistic schema, with state depending on zipcode
  * Use hsqldb, rather than MySQL, as default test database
  * Upgrade hsqldb
* [<a href="http://jira.pentaho.com/browse/PAD-143">PAD-143</a>]
  Factor algorithm into its own maven module
  * Move pure algorithm classes into a new maven module
    `pentaho-aggdesigner-algorithm`, which does not depend on mondrian
  * Specify git version in `maven-release-plugin`, otherwise can't
    commit during release process
  * Remove version from `build.properties`: it confuses maven release
    plugin
* [<a href="http://jira.pentaho.com/browse/PAD-142">PAD-142</a>]
  * Test MonteCarlo algorithm on 10 attributes
  * Widen return type of `Schema.getAttributes()`
  * Use an `ArrayDeque` rather than a `LinkedList`; better memory usage
* [<a href="http://jira.pentaho.com/browse/PAD-141">PAD-141</a>]
  Code hygiene
  * Remove `@author`, `@version`, `@since` tags
  * Remove trailing spaces
  * Expand tabs
* [<a href="http://jira.pentaho.com/browse/PAD-140">PAD-140</a>]
  Convert to maven
  * Add parent POM
  * Add test resources to `subfloor.xml`; fixes test suite
* Fork from
  <a href="https://github.com/pentaho/pentaho-aggdesigner">Pentaho</a>
* Change license from GPL version 2 to Apache Software License 2.0

For ancient history, see
<a href="https://github.com/pentaho/pentaho-aggdesigner">Pentaho's github</a>.
