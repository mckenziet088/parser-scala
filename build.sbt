name := "nanol-parser-scala"

version := "0.1"

scalaVersion := "3.1.0"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Yexplicit-nulls", "-language:strictEquality")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.0.0",
  "org.scalatest"          %% "scalatest"                % "3.2.9" % Test
)

enablePlugins(JavaAppPackaging)

scalacOptions ++= Seq("-rewrite", "-new-syntax")
