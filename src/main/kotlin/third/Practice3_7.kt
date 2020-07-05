package third

fun <A,B,C> ma(a: A, b : (A) ->(B) ->(C)) : (B) -> C = b(a)