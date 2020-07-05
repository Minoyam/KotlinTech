package third

fun <T, U, V> higherAndThen(): ((T) -> U) -> ((U) -> V) -> ((T) -> V) = { a ->
    { b ->
        { c ->
                b(a(c))
        }
    }
}