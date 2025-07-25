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

## <a href="https://github.com/julianhyde/aggdesigner/releases/tag/aggdesigner-6.1">6.1</a> / 2025-07-24

Release 6.1
([<a href="https://github.com/julianhyde/aggdesigner/issues/9">AGGDES-9</a>])
upgrades dependencies (including fixing
[CVE-2025-48924](https://osv.dev/vulnerability/GHSA-j288-q9x7-2f5v)),
enables GitHub CI, and uses a new mechanism to deploy to Maven
Central.

* Include javadoc in deployment
* Publish to Central Portal, following sunset of OSSRH
* Upgrade `maven-gpg-plugin` from 1.6 to 3.2.8
* Upgrade `maven-javadoc-plugin` from 3.0.1 to 3.11.2
* Upgrade `maven-site-plugin` from 3.7.1 to 3.21.0
* Upgrade `maven-dependency-plugin` from 3.1.1 to 3.8.1
* [<a href="https://github.com/julianhyde/aggdesigner/issues/3">AGGDES-3</a>]
  Upgrade `commons-lang3` from 3.12.0 to 3.18.0
  (fixes [CVE-2025-48924](https://osv.dev/vulnerability/GHSA-j288-q9x7-2f5v))
* Upgrade `commons-logging` from 1.2 to 1.3.5
* Upgrade `foodmart-data-hsqldb` from 0.4 to 0.5
* Upgrade `hsqldb` from 2.6.0 to 2.7.4
* Upgrade Maven from 3.6.3 to 3.9.9
* Enable GitHub CI and Dependabot
* Upgrade `checkstyle` from 7.8.2 to 10.26.1
* Upgrade `maven-checkstyle-plugin` from 3.1.0 to 3.6.0
* Travis: quote variables, skip install
* Rename `master` branch to `main`
* Remove `pentaho-aggdesigner-core` and `pentaho-aggdesigner-ui` modules
* Maven wrapper

## <a href="https://github.com/julianhyde/aggdesigner/releases/tag/aggdesigner-6.0">6.0</a> / 2016-10-27

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
