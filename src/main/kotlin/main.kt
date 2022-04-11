fun main() {

    val itemCount = 10
    val preiousPurchase = 13000
    val isMeloman = true

    val itemPrice = 100.00
    val standardDiscount = 100.00
    val discountStart1 = 1001
    val discountStart2 = 10001
    val additionalDiscount = 5
    val melomanDiscount = 1


    val totalPrice = itemPrice * itemCount

    val intermediateResult = if (preiousPurchase > discountStart1 && preiousPurchase < discountStart2) (totalPrice - standardDiscount)
    else if (preiousPurchase > discountStart2)(totalPrice - (totalPrice*additionalDiscount/100))
    else (totalPrice)

    val result = if (isMeloman != false) (intermediateResult - (intermediateResult * melomanDiscount/100))
    else intermediateResult

    val kopecks: Int = (result * 100 %100).toInt()
    val rubles: Int =  result.toInt()

    println("Total price $rubles руб. $kopecks коп.")
}