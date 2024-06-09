package com.github.sharoha.cpjcodegen.actions.contest

import com.github.sharoha.cpjcodegen.model.Platforms
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.TextBrowseFolderListener
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.openapi.vcs.ui.TextFieldAction
import com.intellij.ui.components.JBLabel
import com.intellij.ui.dsl.builder.bindText
import com.intellij.ui.dsl.builder.panel
import com.intellij.util.textCompletion.TextFieldWithCompletion
import com.intellij.vcs.log.ui.actions.TextFieldWithProgress
import java.awt.TextField
import javax.swing.JComponent
import javax.swing.JTextField

class LeetcodeContestDialogWrapper(val project: Project): ContestPanelDialogWrapper("Leetcode Contest Parser") {
    private var path = ""

    // this is required to initialize the DialogWrapper property
    init {
        init()
    }

    override fun platform(): Platforms {
        return Platforms.LEETCODE
    }

    override fun createCenterPanel(): JComponent {
        val platform = "Platform:"
        val textField = JBLabel("Leetcode")

//        }
//        val browseField = TextFieldWithBrowseButton().apply {
//            addBrowseFolderListener(
//                TextBrowseFolderListener(
//                    FileChooserDescriptor(true, false, false, false, false, false)
//                        .withFileFilter { it.extension == "bib" }
//                        .withTitle("Select BibTeX File")
//                )
//            )
//        }

        return panel {
            row(platform) {
                cell(textField)
            }
        }
    }
}