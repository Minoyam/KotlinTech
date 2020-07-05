package third

fun <A, B, C> cr(f: (A, B) -> C): (A) -> (B) -> C = { a ->
    { b ->
        f(a, b)
    }
}


