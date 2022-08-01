plugins {
    id("fr.defade.gitpatcher") version "1.0"
}

group = "fr.defade"
version = "1.0-SNAPSHOT"

patches {
    submodule = "VelocityUpstream"
    target = file("Velocity")
    patches = file("patches")
}