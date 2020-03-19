package com.example.essentials.Pair

class BasicBook (var title: String = "Test book", var author: String = "Authur Wrighter", var year: Int = 1990) {

    fun getBasicInfo(): Pair<String, String> {
        return title to author
    }

    fun getAllInfo(): Triple<String, String, Int> {
        return Triple (title, author, year)
    }
}


fun main() {
    var book = BasicBook()

    var pair = book.getBasicInfo()
    println ("Title: ${pair.first} - Author: ${pair.second}")
    var triple  = book.getAllInfo()
    println ("Title: ${triple.first} - Author: ${triple.second} - Year: ${triple.third}")

}