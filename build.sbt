name := "akka-quickstart-java"

version := "1.0"

scalaVersion := "2.13.1"

lazy val akkaVersion = "2.6.17"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.7",
  "junit" % "junit" % "4.13.2" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test)
