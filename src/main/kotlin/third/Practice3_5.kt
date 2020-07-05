package third

fun main() {
    fun <T, U, V> compose(): ((T) -> U) -> ((V) -> T) -> (V) -> U = { a ->
        { b ->
            { c ->
                a(b(c))
            }
        }
    }
}
