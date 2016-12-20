name := "liftjson-scalajson-interop"

organization := "me.frmr.jsonutils"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.1"

crossScalaVersions := Seq("2.11.8", "2.12.1")

libraryDependencies ++= Seq(
  "net.liftweb"    %% "lift-json"       % "3.0.1"      % "provided",
  "org.mdedetrich" %% "scala-json-ast"  % "1.0.0-M6"   % "provided",

  "org.scalatest"  %% "scalatest"       % "3.0.1"      % "test",
  "org.scalacheck" %% "scalacheck"      % "1.13.4"     % "test"
)

scalacOptions ++= Seq("-unchecked", "-feature", "-deprecation")

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.trim.endsWith("SNAPSHOT")) {
    Some("snapshots" at nexus + "content/repositories/snapshots")
  } else {
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
  }
}

credentials += Credentials(Path.userHome / ".sonatype")

pomExtra :=
<url>https://github.com/farmdawgnation/lift-newrelic</url>
<licenses>
  <license>
    <name>Apache 2</name>
    <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
    <distribution>repo</distribution>
  </license>
</licenses>
<scm>
  <url>https://github.com/farmdawgnation/liftjson-scalajson-interop.git</url>
  <connection>https://github.com/farmdawgnation/liftjson-scalajson-interop.git</connection>
</scm>
<developers>
  <developer>
    <id>farmdawgnation</id>
    <name>Matt Farmer</name>
    <email>matt@frmr.me</email>
  </developer>
</developers>
