name := """todo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.27"
    
libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
    
