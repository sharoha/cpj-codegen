package com.github.sharoha.cpjcodegen.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.progress.Task.Backgroundable
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper

abstract class AddProblemAction<T: ContestPanelDialogWrapper>: AnAction() {

    class BackgroundableProcess(
        project: Project,
        dialog: ContestPanelDialogWrapper
    ): Backgroundable(project, "Running ${dialog.panelTitle} dialog") {
        override fun run(indicator: ProgressIndicator) {

        }
    }
    override fun actionPerformed(e: AnActionEvent) {
        val dialogWrapper: T = getDialog(e.project ?: return)
        if (dialogWrapper.showAndGet()) {
            ProgressManager.getInstance()
                .run(BackgroundableProcess(project = e.project?: return, dialogWrapper))
        }
        actionComplete()
    }

    abstract fun getDialog(project: Project): T

    abstract fun actionComplete()
}