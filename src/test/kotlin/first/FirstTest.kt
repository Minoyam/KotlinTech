package first

import org.junit.Test
import kotlin.test.assertEquals

class FirstTest{
    @Test
    fun testBuyDonuts(){
        val creditCard = CreditCard()
        val purchase =  buyDonuts(5,creditCard)
        assertEquals(Donut.price * 5, purchase.payment.amount)
        assertEquals(creditCard, purchase.payment.creditCard)
    }
}