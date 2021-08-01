package com.example.kotlinpractice

/**
 * @author Hyeon Ae Jang
 * @email aeae_1@sookmyung.ac.kr
 * @created 2021-07-11
 * @desc Companion Object
 */

class Book private constructor(val id : Int, val name : String) {
    companion object BookFactory : IdProvider{
        val myBook = "new book"
        fun create() = Book(getId(), myBook)
        override fun getId(): Int {
            return 444
        }
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main() {
    val book = Book.create()

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}