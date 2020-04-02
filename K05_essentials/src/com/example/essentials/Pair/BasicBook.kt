package com.example.essentials.Pair

class BasicBook (var title: String = "Test book", var author: String = "Authur Wrighter", var year: Int = 1990, var pages: Int = 200) {

    fun getBasicInfo(): Pair<String, String> {
        return title to author
    }

    fun getAllInfo(): Triple<String, String, Int> {
        return Triple (title, author, year)
    }
}


fun BasicBook.getWeight() : Double {
    return 1.5 * this.pages
}

fun BasicBook.tornPages(numPages: Int) {
    pages -= numPages
    if(numPages < 0)
        pages = 0
}

fun main() {
    var book = BasicBook()

    var pair = book.getBasicInfo()
    println ("Title: ${pair.first} - Author: ${pair.second}")
    var triple  = book.getAllInfo()
    println ("Title: ${triple.first} - Author: ${triple.second} - Year: ${triple.third}")

    println("Weight: ${book.getWeight()}")
    book.tornPages(100)
    println("Weight after torn pages: ${book.getWeight()}")
}