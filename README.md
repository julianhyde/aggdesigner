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
[![Build Status](https://travis-ci.com/julianhyde/aggdesigner.svg?branch=main)](https://travis-ci.com/julianhyde/aggdesigner)

# Aggregate Designer

A tool that designs an optimal set of aggregates (summary tables) for
OLAP queries.

(Based on <a href="https://github.com/pentaho/pentaho-aggdesigner">Pentaho Aggregate Designer</a>.)

## Get Aggregate Designer

### From Maven

Get Aggregate Designer from
<a href="https://search.maven.org/#search%7Cga%7C1%7Ca%3Aaggdesigner">Maven central</a>:

```xml
<dependency>
  <groupId>net.hydromatic</groupId>
  <artifactId>aggdesigner</artifactId>
  <version>6.0</version>
</dependency>
```

### Download and build

You need Java (JDK 8 or higher), Git and Apache Maven (3.5.4 or higher).

```bash
$ git clone git://github.com/julianhyde/aggdesigner.git
$ cd aggdesigner
$ ./mvnw install
```

(On Windows, use `mvnw.cmd` rather than `./mvnw`.)

## More information

* License: <a href="LICENSE">Apache Software License, Version 2.0</a>
* Author: Julian Hyde
* Project page: http://www.hydromatic.net/aggdesigner
* API: http://www.hydromatic.net/aggdesigner/apidocs
* Source code: http://github.com/julianhyde/aggdesigner
* Developers list:
  <a href="mailto:mondrian@pentaho.org">mondrian at pentaho.org</a>
  (<a href="http://lists.pentaho.org/pipermail/mondrian/">archive</a>,
  <a href="http://lists.pentaho.org/mailman/listinfo/mondrian">subscribe</a>)
* Issues: https://github.com/julianhyde/aggdesigner/issues
* <a href="HISTORY.md">Release notes and history</a>
* <a href="HOWTO.md">HOWTO</a>
