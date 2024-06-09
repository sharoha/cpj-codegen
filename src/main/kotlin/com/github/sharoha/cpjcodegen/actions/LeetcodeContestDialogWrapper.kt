package com.github.sharoha.cpjcodegen.actions

import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.TextBrowseFolderListener
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.ui.dsl.builder.bindText
import com.intellij.ui.dsl.builder.panel
import javax.swing.JComponent

class LeetcodeContestDialogWrapper(val project: Project): ContestPanelDialogWrapper("Leetcode Contest Parser") {
    private var path = ""
    override fun createCenterPanel(): JComponent {
        val browseField = TextFieldWithBrowseButton().apply {
            addBrowseFolderListener(
                TextBrowseFolderListener(
                    FileChooserDescriptor(true, false, false, false, false, false)
                        .withFileFilter { it.extension == "bib" }
                        .withTitle("Select BibTeX File")
                )
            )
        }

        return panel {
            row("Path to BibTeX file:") {
                cell(browseField).bindText({ path }, { path = it }).focused()
                contextHelp("Select a local path to a .bib file")
            }
        }
    }
}