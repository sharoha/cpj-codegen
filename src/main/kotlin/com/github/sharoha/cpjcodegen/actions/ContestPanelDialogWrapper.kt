package com.github.sharoha.cpjcodegen.actions

import com.intellij.openapi.ui.DialogWrapper

// Provides the Dialog box for a specific action
abstract class ContestPanelDialogWrapper(val panelTitle: String): DialogWrapper(true)