package third
typealias IntBinOp = (Int) -> (Int) ->  Int
class Practice3_3 {
    fun sum(): (Int) -> ((Int) -> Int) = { a->
        {b-> a + b }
    }
}

fun main() {
    val add : IntBinOp = {a -> { b-> a + b}}
    println(add(3)(5))
    println(Practice3_3().sum()(3)(5))
}