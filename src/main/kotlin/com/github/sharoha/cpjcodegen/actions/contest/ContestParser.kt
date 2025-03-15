package com.github.sharoha.cpjcodegen.actions.contest

interface ContestParser {
    /**
     * This method parses the contest list for a given Platform page
     */
    fun parseContestPage(html: String): ContestDetails

}