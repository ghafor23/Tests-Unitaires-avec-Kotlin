
package com.fixly.tp10comp

class Library {

    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun findBookByTitle(title: String): Book? {
        return books.find { it.title == title }
    }

    fun borrowBook(title: String): Boolean {

        val book = findBookByTitle(title)

        if (book != null && book.isAvailable) {

            book.isAvailable = false

            return true
        }

        return false
    }
}
