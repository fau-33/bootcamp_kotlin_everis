package kotlin_basico

const val EQUAL = 0
const val LESS = -1
const val MORE = 1

fun main(){
    val d = 22
    val t = 90
    println(d > t)
    println(d.compareTo(t) == MORE)
}