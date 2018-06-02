name := """consultorioback"""
 
version := "1.0"

herokuAppName in Compile := "backend-consultorio"

enablePlugins(JavaAppPackaging)
      
lazy val `consultorioback` = (project in file(".")).enablePlugins(PlayJava)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
scalaVersion := "2.11.11"

libraryDependencies ++= Seq( javaJdbc ,
  cache ,
  javaWs ,
  "mysql" % "mysql-connector-java" % "5.1.23",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  "org.jdbi" % "jdbi" % "2.78",
  "io.jsonwebtoken" % "jjwt" % "0.7.0",
  "io.javaslang" % "javaslang" % "2.0.2")

name := "consultorioback"

      