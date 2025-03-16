package com.github.sharoha.cpjcodegen.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import java.awt.Dimension
import javax.swing.JDialog

abstract class ParseAction<T: JDialog>: AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val dialogWrapper = getDialog(e.project ?: return)
        dialogWrapper.pack()
        dialogWrapper.size = Dimension(800, 800)
        dialogWrapper.setLocationRelativeTo(dialogWrapper.owner)
        dialogWrapper.isVisible = true
        actionComplete(dialogWrapper)
    }

    abstract fun getDialog(project: Project): T

    abstract fun actionComplete(dialog: JDialog)
}