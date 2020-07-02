package first

import java.lang.IllegalStateException

data class Payment(val creditCard: CreditCard, val amount: Int){
    fun combine(payment : Payment) : Payment =
        if(creditCard == payment.creditCard)
            Payment(creditCard, amount + payment.amount)
    else
            throw  IllegalStateException("Cards don't match.")

    companion object {
        /*
        groupBy(f : (A) -> B) : Map<B, List<A>> : A타입의 값을 B타입의 값으로 반환하는 함수를 인자로 받아 키와 값의 pair로 이뤄진 맵을 반환
        values : List<A> Map의 인스턴스 함수로, 맵에 들어있는 모든 값의 리스트를 반환
        map(f: (A) -> B) : List<B> List의 인스턴스 함수로, A타입의 값을 B타입의 값으로 반환하는 함수를 인자로 받아 List<B>으로 반환
        reduce(f: (A,A)  -> A) : A  리스트를 축약할 때 사용할 어떤 연산을 받아 리스트를 한 값으로 축약
        */
        fun groupByCard(payments: List<Payment>) : List<Payment> =
            payments.groupBy { it.creditCard }
                .values
                .map { it.reduce(Payment::combine) } // List<Payment>를 하나의 Payment로 축약하여 변환
    }
}