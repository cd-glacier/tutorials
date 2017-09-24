name := "test_akka_http"

version := "0.1"

scalaVersion := "2.12.3"

sbtPlugin := true

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.0.10",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.0.10" % Test
)
