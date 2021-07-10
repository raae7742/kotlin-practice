package com.example.kotlinpractice

/** @author Hyeon Ae Jang ...*/
fun main(){
    //3. String Template
    val name = "Joyce"
    val lastName = "Hong"
    println("my name is ${name + lastName}. I'm 22")

    println("this is 2\$")
}

//1. 함수
fun helloWorld() {
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
//val = value

fun hi() {
    val a : Int = 10
    var b : Int = 9

    var e : String

    b = 100

    val c = 100
    var d = 100

    var name = "joyce"
}

//4. 조건식
fun maxBy(a : Int, b : Int) : Int {
    if (a>b)
        return a
    else
        return b
}

fun maxBy2(a : Int, b : Int) = if (a>b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement

//5. Array and List
// Array
// List 1. List 2. MutableList

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3,4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    val result = list.get(0)

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20) //lista listb
}

// 6. For / While
fun forAndWhile(){
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")
    for (name in students){
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for (i in 1..10 step 2){
        sum += i
    }

    for (i in 10 downTo 1){
        sum += i
    }

    for (i in 1 until 100){ // 1~99
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }
}

// 7. Nullable / NonNull
fun nullcheck(){
    //NPE : Null pointer Exception
    var name : String = "joyce"
    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()


    // ?: - default value
    val lastName : String? = null
    val fullName = name + " " + (lastName?: "NO lastname")

    println(fullName)

}

//!! - Compile에서 null을 알림 - 절대로 null이 들어올리 없다고 알리는 기호 (최대한 지양)
fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email : String? = "joycehongXXXX@nana.vom"
    // email이 null이 아니면
    email?.let{
        println("my email is ${email}")
    }
}


