val dottyVersion = "0.22.0-RC1"
val scala2Version = "2.13.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "OpticsTypeclass",
    version := "0.1.0",
    scalaVersion := dottyVersion,
    crossScalaVersions:= Seq(dottyVersion, scala2Version),
    libraryDependencies += "org.scalameta" %% "munit" % "0.5.2" % "test",
    testFrameworks += new TestFramework("munit.Framework")
  )
