import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      crossPaths := false,
      autoScalaLibrary := false,      
      testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v")),
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies += junitInterface % Test
  )
