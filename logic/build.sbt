enablePlugins(ScalaJSPlugin)

ThisBuild / scalaVersion := "2.13.5"
ThisBuild / organization := "orca"

lazy val root = project.in(file(".")).
  aggregate(orca.js, orca.jvm).
  settings(
    publish := {},
    publishLocal := {},
  )

lazy val orca = crossProject(JSPlatform, JVMPlatform).in(file(".")).
  settings(
    name := "orca",
    version := "0.1",
    fork := true,
    connectInput := true,
    outputStrategy := Some(StdoutOutput),
    scalacOptions ++= Seq(
      "-Xfatal-warnings"
    )
  ).
  jvmSettings(
    libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % "0.11.0",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.5" % Test,
    libraryDependencies += "org.java-websocket" % "Java-WebSocket" % "1.5.1",
    libraryDependencies += "org.slf4j" % "slf4j-simple" % "2.0.0-alpha1",
  ).
  jsSettings(
    libraryDependencies += "com.thesamet.scalapb" %%% "scalapb-runtime" % "0.11.0",
    scalaJSUseMainModuleInitializer := false,
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) },
  )