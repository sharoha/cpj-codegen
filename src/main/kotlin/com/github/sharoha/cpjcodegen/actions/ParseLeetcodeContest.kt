package com.github.sharoha.cpjcodegen.actions

import com.github.sharoha.cpjcodegen.layout.ContestParserFrame
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import java.awt.BorderLayout

class ParseLeetcodeContest: AnAction(){
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project
        val panel = ContestParserFrame(BorderLayout(400, 400))
        panel.draw("Parse Contest")
    }
}