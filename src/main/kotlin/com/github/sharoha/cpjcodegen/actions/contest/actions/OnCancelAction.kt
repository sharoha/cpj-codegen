package com.github.sharoha.cpjcodegen.actions.contest.actions

import java.awt.event.ActionEvent
import javax.swing.AbstractAction
import javax.swing.JDialog

class OnCancelAction(private val jDialog: JDialog): AbstractAction() {
    override fun actionPerformed(e: ActionEvent?) {
        jDialog.isVisible = false
    }
}