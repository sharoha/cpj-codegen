package com.github.sharoha.cpjcodegen.actions.problem

import com.github.sharoha.cpjcodegen.actions.AddProblemAction
import com.intellij.openapi.project.Project

class LeetcodeProblemAction: AddProblemAction<LeetcodeProblemDialogWrapper>() {
    override fun getDialog(project: Project): LeetcodeProblemDialogWrapper {
        return LeetcodeProblemDialogWrapper(project)
    }

    override fun actionComplete() {
        TODO("Not yet implemented")
    }
}