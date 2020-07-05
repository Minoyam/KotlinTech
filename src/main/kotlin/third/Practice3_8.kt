package third

fun <A,B,C> ma(b : (B),a : (A) ->(B) -> C) : (A) -> C = {
    aa: A -> a(aa)(b)
}