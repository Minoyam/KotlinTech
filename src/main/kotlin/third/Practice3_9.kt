package third

fun <A,B,C,D> func(a: A, b: B, c: C, d: D) : String ="$a, $b, $c, $d"

fun <A,B,C,D> funcc() : (A) -> (B) -> (C) -> (D) -> String =
        { a-> { b-> { c-> { d-> "$a, $b, $c, $d" } } } }