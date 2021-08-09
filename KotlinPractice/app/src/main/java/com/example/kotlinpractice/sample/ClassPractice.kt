package com.example.kotlinpractice
/*
/**
 * @author Hyeon Ae Jang
 * @email aeae_1@sookmyung.ac.kr
 * @created 2021-07-10
 * @desc
 */
open class Human(val name : String = "Anonymous"){

    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age} years old")
    }

    init {
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMMMYYY~~~")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human() {
    override fun singASong(){
        super.singASong()
        println("라라라")
        println("my name is : ${name}")
    }
}

fun main(){
//    val human = Human("minsu")
//    val stranger = Human()
//
//    human.eatingCake()

//    val mom = Human("Kuri", 52)

//    println("this human's name is ${human.name}")

    val korean = Korean()
    korean.singASong()

}
 */
