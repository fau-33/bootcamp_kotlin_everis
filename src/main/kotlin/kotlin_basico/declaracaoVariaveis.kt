package kotlin_basico

const val MAX_AGE = 68
fun main(){
    //Valor definido durante a execução
    //val currentAge = 30
    //currentAge = 90
    //println(currentAge)

    //Valor definido e alterado
    //durante a execução
    //var currentAge = 30
    //currentAge = 90
    //println(currentAge)

    //Valor definido durante a compilação
    var currentAge : Int
    currentAge = 90
    println(currentAge > MAX_AGE)
}