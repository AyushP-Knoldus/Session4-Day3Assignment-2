ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Session4-Day3Assignment2",
    idePackagePrefix := Some("com.knoldus")
  )

