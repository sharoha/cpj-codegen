package com.github.sharoha.cpjcodegen.actions.contest

import com.github.sharoha.cpjcodegen.model.Platforms
import com.intellij.openapi.ui.DialogWrapper

// Provides the Dialog box for a specific action
abstract class ContestPanelDialogWrapper(val panelTitle: String): DialogWrapper(true) {
    abstract fun platform(): Platforms

}