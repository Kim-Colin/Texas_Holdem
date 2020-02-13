lazy val root = (project in file("."))
.settings(
    name := "Texas_Holdem",
    scalaVersion := "2.12.3",
    version := "0.0.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
) 