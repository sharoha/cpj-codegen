package com.github.sharoha.cpjcodegen.actions.contest

import com.github.sharoha.cpjcodegen.actions.AddProblemAction
import com.intellij.openapi.project.Project

class LeetcodeContestProblemAction: AddProblemAction<LeetcodeContestDialogWrapper>() {
    override fun getDialog(project: Project): LeetcodeContestDialogWrapper {
        return LeetcodeContestDialogWrapper(project)
    }

    override fun actionComplete() {
        println("Dialog process successfully completed")
    }
}