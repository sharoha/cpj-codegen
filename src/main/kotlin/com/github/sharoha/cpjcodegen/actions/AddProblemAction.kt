package com.github.sharoha.cpjcodegen.actions

import com.github.sharoha.cpjcodegen.actions.contest.ContestPanelDialogWrapper
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.progress.Task.Backgroundable
import com.intellij.openapi.project.Project
import com.intellij.util.progress.sleepCancellable

abstract class AddProblemAction<T: ContestPanelDialogWrapper>: AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val dialogWrapper: T = getDialog(e.project ?: return)
        if (dialogWrapper.showAndGet()) {
            ProgressManager.getInstance()
                .run(BackgroundableProcess(project = e.project?: return, dialogWrapper))
        }
        actionComplete()
    }

    class BackgroundableProcess(
        project: Project,
        dialog: ContestPanelDialogWrapper
    ): Backgroundable(project, "${dialog.panelTitle} dialog") {
        // will be used to create data item, like problem list, contest list etc
        override fun run(indicator: ProgressIndicator) {
            println("Inside background process")
            sleepCancellable(10000)
        }

        // will be used to create task once the Background process completes
        override fun onSuccess() {
            println("Successfully closed")
        }
    }


    abstract fun getDialog(project: Project): T

    abstract fun actionComplete()
}