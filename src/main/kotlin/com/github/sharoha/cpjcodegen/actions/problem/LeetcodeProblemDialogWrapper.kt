package com.github.sharoha.cpjcodegen.actions.problem

import com.github.sharoha.cpjcodegen.actions.contest.ContestPanelDialogWrapper
import com.github.sharoha.cpjcodegen.model.Platforms
import com.intellij.openapi.project.Project
import javax.swing.JComponent

class LeetcodeProblemDialogWrapper(val project: Project): ContestPanelDialogWrapper("Leetcode Contest Parser") {
    override fun platform(): Platforms {
        TODO("Not yet implemented")
    }

    override fun createCenterPanel(): JComponent? {
        TODO("Not yet implemented")
    }
}