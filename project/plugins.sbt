// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers ++= Seq(
    "sbt-idea-repo" at "http://mpeltonen.github.com/maven/",
     "Typesafe releases" at "http://repo.typesafe.com/typesafe/releases",
        "repo.novus snaps" at "http://repo.novus.com/snapshots/",
        "repo.codahale" at "http://repo.codahale.com",
        "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
        "repo scalatools releases" at "https://oss.sonatype.org/content/groups/scala-tools/",
        "Typesafe Ivy Releases Repository" at "http://repo.typesafe.com/typesafe/ivy-releases/")


// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.0")

addSbtPlugin("com.typesafe.sbtscalariform" % "sbtscalariform" % "0.3.1")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")
