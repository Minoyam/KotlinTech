package first

fun buyDonuts(quantity : Int = 1, creditCard : CreditCard) : Purchase =
    // List(quantity) { Donut() } -> Donut() 함수에 0부터 quantity - 1 까지 값을 적용하면서 리스트를 만든다.
    Purchase(List(quantity) {
        Donut()
    }, Payment(creditCard, Donut.price * quantity))