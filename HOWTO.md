# Aggregate Designer HOWTO

Here's some miscellaneous documentation about using and developing
Aggregate Designer.

# Release

Make sure that `mvn clean install site` runs on JDK 1.6, 1.7, 1.8,
on Linux and Windows.
Also check [Travis CI](https://travis-ci.org/julianhyde/aggdesigner).

Update the [release history](HISTORY.md) and the version number at the
bottom of [README](README.md).

```
mvn clean
mvn release:clean
git clean -nx
git clean -fx
read -s GPG_PASSPHRASE
mvn -Prelease -Dgpg.passphrase=${GPG_PASSPHRASE} release:prepare
mvn -Prelease -Dgpg.passphrase=${GPG_PASSPHRASE} release:perform
```

Then go to [Sonatype](https://oss.sonatype.org/#stagingRepositories),
log in, close the repository, and release.

Make sure that the [site](http://www.hydromatic.net/aggdesigner/) has been updated.

[Announce the release](https://twitter.com/julianhyde/status/622842100736856064).
