import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.8"
  lazy val h2database = "com.h2database" % "h2" % "1.4.200"
  lazy val slick = "com.typesafe.slick" %% "slick" % "3.3.3"
  lazy val slickHikari = "com.typesafe.slick" %% "slick-hikaricp" % "3.3.3"
}
