import Dependencies._

name := """Hermes"""
organization := "dev.skilgal"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies ++= Seq(
  scalaTest % Test,
  slick,
  slickHikari,
  h2database
)
