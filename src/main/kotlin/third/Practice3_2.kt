package third

class Practice3_2 {
    fun<T,U,V> compose(a : (T) -> U, b : (V) ->(T)) : (V) -> (U) = {
        a(b(it))
    }
}