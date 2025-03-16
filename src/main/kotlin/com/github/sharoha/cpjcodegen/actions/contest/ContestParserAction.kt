package com.github.sharoha.cpjcodegen.actions.contest

import com.github.sharoha.cpjcodegen.actions.ParseAction
import com.github.sharoha.cpjcodegen.model.Platforms
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.ComboBox
import com.intellij.ui.components.JBList
import com.intellij.ui.components.JBScrollPane
import com.intellij.util.ui.JBUI
import net.miginfocom.layout.Grid
import java.awt.BorderLayout
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JDialog
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.ListSelectionModel

class ContestParserAction: ParseAction<JDialog>() {
    // TODO('Whenever a Platform is selected, we should render the corresponding contest list of it, this is done via the interface ContestParser')
    // TODO('For now lets only parse the contests that is provided in the first page, So for instance Codeforces displays the Contest names in pages, with page number getting incremented sequentially')

    override fun getDialog(project: Project): JDialog {
        val jDialog = JDialog()
        jDialog.title = "Contest Parser"
        val contentPane = jDialog.contentPane
        contentPane.layout = BorderLayout()

        contentPane.add(getUpperPanel(), BorderLayout.NORTH)
        contentPane.add(getCenterPanel(), BorderLayout.CENTER)
        contentPane.add(getLowerPanel(), BorderLayout.SOUTH)
        return jDialog
    }

    // TODO ("Add logic to get the selected Item")
    private fun getUpperPanel(): JPanel {
        val upperPanel = JPanel()
        upperPanel.border = JBUI.Borders.empty(10)
        upperPanel.layout = BorderLayout(5, 5)
        val platformSelector = ComboBox(getPlatformList())
        val refreshButton = JButton("Refresh")

        upperPanel.add(platformSelector, BorderLayout.CENTER)
        upperPanel.add(refreshButton, BorderLayout.EAST)
        return upperPanel
    }

    private fun getCenterPanel(): JPanel {
        val centerPanel = JPanel(GridLayout(1, 2, 5, 5))
        centerPanel.border = JBUI.Borders.empty(10)

        // TODO contest list needs to be updated with dynamic value
        val contestList = JBList("Contest 1", "Contest 2")
        contestList.selectionMode = ListSelectionModel.SINGLE_SELECTION
        val contestScroll = JBScrollPane(contestList)
        centerPanel.add(contestScroll)

        // TODO problem list needs to be updated with the selected contest
        val taskList = JBList("Problem 1", "Problem 2")
        val taskScroll = JBScrollPane(taskList)
        centerPanel.add(taskScroll)
        return centerPanel
    }

    private fun getLowerPanel(): JPanel {
        val bottomPanel = JPanel()
        bottomPanel.border = JBUI.Borders.empty(10)
        bottomPanel.layout = BorderLayout(5, 5)

        bottomPanel.add(getOkCancelPanel(), BorderLayout.EAST)

        return bottomPanel
    }

    private fun getOkCancelPanel(): JPanel {
        val okCancelPanel = JPanel()
        okCancelPanel.layout = GridLayout(1, 2)

        val okButton = JButton("OK")
        okCancelPanel.add(okButton)

        val cancelButton = JButton("Cancel")
        okCancelPanel.add(cancelButton)
        return okCancelPanel
    }
    private fun getPlatformList(): Array<Platforms> {
        return Platforms.entries.toTypedArray()
    }
    override fun actionComplete(dialog: JDialog) {
        // based on the
        TODO("Not yet implemented")
    }
}