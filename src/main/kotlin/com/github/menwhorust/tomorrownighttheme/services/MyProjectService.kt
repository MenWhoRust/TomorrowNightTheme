package com.github.menwhorust.tomorrownighttheme.services

import com.github.menwhorust.tomorrownighttheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
