package third

class Practice3_1 {
    fun compose(a: (Int) -> Int, b: (Int) -> Int): (Int) -> Int = { a(b(it)) }
}