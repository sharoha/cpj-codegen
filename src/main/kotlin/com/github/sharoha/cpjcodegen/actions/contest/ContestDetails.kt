package com.github.sharoha.cpjcodegen.actions.contest

import com.github.sharoha.cpjcodegen.model.Platforms
import java.net.URL

data class ContestDetails(
    val platform: Platforms,
    val contestLinkMap: Map<String, URL>
)