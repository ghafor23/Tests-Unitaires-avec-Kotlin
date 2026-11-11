
package com.fixly.tp10comp

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LibraryTest {

    @Test
    fun testAddBook() {
        val library = Library()
        val book = Book("Java", "Ali")

        library.addBook(book)

        assertNotNull(library.findBookByTitle("Java"))
    }

    @Test
    fun testFindBookFound() {
        val library = Library()
        val book = Book("Kotlin", "Ahmed")

        library.addBook(book)

        assertEquals(book, library.findBookByTitle("Kotlin"))
    }

    @Test
    fun testFindBookNotFound() {
        val library = Library()

        assertNull(library.findBookByTitle("Python"))
    }

    @Test
    fun testBorrowAvailableBook() {
        val library = Library()
        val book = Book("Java", "Ali")

        library.addBook(book)

        assertTrue(library.borrowBook("Java"))
        assertFalse(book.isAvailable)
    }

    @Test
    fun testBorrowAlreadyBorrowedBook() {
        val library = Library()
        val book = Book("Java", "Ali", false)

        library.addBook(book)

        assertFalse(library.borrowBook("Java"))
    }

    @Test
    fun testBorrowBookNotFound() {
        val library = Library()

        assertFalse(library.borrowBook("Python"))
    }
}
