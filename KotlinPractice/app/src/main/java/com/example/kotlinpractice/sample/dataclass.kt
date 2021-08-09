package com.example.kotlinpractice
/*
/**
 * @author Hyeon Ae Jang
 * @email aeae_1@sookmyung.ac.kr
 * @created 2021-07-11
 * @desc
 */

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashCode(), equals(), copy()

data class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("koreanAir", "joyceHong", "2021-07-11", 14)
    val ticketB = TicketNormal("koreanAir", "joyceHong", "2021-07-11", 14)

    println(ticketA)
    println(ticketB)
}

 */