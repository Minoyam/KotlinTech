package third

fun main() {
    val squreOfTriple: ((Int) -> Int) -> ((Int) -> Int) -> (Int) -> Int = { a ->
        { b ->
            { c ->
                a(b(c))
            }
        }
    }
}

fun <T> compose(): ((T) -> T) -> ((T) -> T) -> (T) -> T = { a ->
    { b ->
        { c ->
                a(b(c))
        }
    }
}