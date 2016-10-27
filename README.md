[![Build Status](https://travis-ci.org/julianhyde/aggdesigner.svg?branch=master)](https://travis-ci.org/julianhyde/aggdesigner)

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

You need Java (1.6 or higher; 1.8 preferred), git and maven (3.2.1 or higher).

```bash
$ git clone git://github.com/julianhyde/aggdesigner.git
$ cd aggdesigner
$ mvn install
```

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
