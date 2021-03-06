logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.9")
addSbtPlugin("com.heroku" % "sbt-heroku" % "1.0.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.7.6")