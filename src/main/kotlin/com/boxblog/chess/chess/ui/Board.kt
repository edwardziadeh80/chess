package com.boxblog.chess.chess.ui

data class Board(val title: String){

    private val board = Array(8) { Array(8) { Element.EMPTY_CELL } }

    fun draw() {

        val boardAsString = board.mapIndexed { index, row ->
            val cells = row.joinToString(" | ") { it.view }
            "| $cells | ${index + 1}\n${Element.DIVIDER.view}"
        }

        println(title) // print game's title
        println(Element.DIVIDER.view) // print starting divider

        // 2️⃣
        println(boardAsString.reversed().joinToString("\n"))

        // print ending string with left padding
        println("  ${Element.ALPHABETICAL_INDEXES.view}")
    }
}
