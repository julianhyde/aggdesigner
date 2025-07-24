# Aggregate Designer HOWTO

Here's some miscellaneous documentation about using and developing
Aggregate Designer.

# Release

Make sure `mvn clean install`, `mvn site`, and
`mvn javadoc:javadoc javadoc:test-javadoc` pass under JDK 8 - 21.

Also check [Travis CI](https://travis-ci.org/julianhyde/aggdesigner).

Upgrade dependencies to their latest release: run
```bash
./mvnw versions:display-dependency-updates
./mvnw versions:update-properties
```
and commit the modified `pom.xml`.

Update the [release history](HISTORY.md) and the version number at the
bottom of [README](README.md), and the copyright date in `NOTICE`.

Switch to JDK 21.

Check that the sandbox is clean:

```bash
git clean -nx
mvn clean
```

Prepare:

```bash
export GPG_TTY=$(tty)
mvn -Prelease -DreleaseVersion=x.y.0 -DdevelopmentVersion=x.(y+1).0-SNAPSHOT release:prepare
```

Perform:

```bash
mvn -Prelease -DskipTests release:perform
```

Then go to [Sonatype](https://oss.sonatype.org/#stagingRepositories),
log in, close the repository, and release.

Make sure that the [site](http://www.hydromatic.net/aggdesigner/) has been updated.

[Announce the release](https://twitter.com/julianhyde/status/622842100736856064).
