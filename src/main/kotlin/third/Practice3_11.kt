package third

fun <T, U, V> swap(f: (T) -> (U) -> V): (U) -> (T) -> V = { u ->
    { t: T ->
        f(t)(u)
    }
}

data class Price(val value : Double){
    operator fun plus(price: Price) = Price(this.value + price.value)
}
data class Weight(val value : Double){
    operator fun plus(weight: Weight) = Weight(this.value + weight.value)
}




