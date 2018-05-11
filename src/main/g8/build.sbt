name := "$name$"

scalaVersion := "2.11.2"

ideaExcludeFolders += ".idea"
ideaExcludeFolders += ".idea_modules"


libraryDependencies ++= Seq(
  "commons-io" % "commons-io" % "2.4",
  "io.argonaut" %% "argonaut" % "6.1-M4",
  "org.specs2" %% "specs2" % "2.4.1" % "test",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "com.google.guava" % "guava" % "18.0",
  "org.typelevel" %% "cats-core" % "0.4.0"
)
