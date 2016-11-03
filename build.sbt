
scalaVersion in ThisBuild := "2.11.8"

lazy val root = (project in file(".")).
  settings(
    name := "hello",
    version := "1.0",
    libraryDependencies ++= Seq(
      "org.scalaz" %% "scalaz-core" % "7.2.7",
      "org.scalaz" %% "scalaz-concurrent" % "7.2.7"
    )
  )
