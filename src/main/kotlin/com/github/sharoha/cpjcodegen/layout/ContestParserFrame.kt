package com.github.sharoha.cpjcodegen.layout

import java.awt.*
import javax.swing.JFrame


class ContestParserFrame(private val layout: LayoutManager) : JFrame() {
    fun draw(title: String) {
        setTitle(title)
        setLayout(layout)
        size = Dimension(400, 400)
        location = Point(300, 300)
        isVisible = true
        defaultCloseOperation = DISPOSE_ON_CLOSE
    }
}