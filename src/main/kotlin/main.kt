fun main (){
    val amount: Double = 100_000.0 // 1000 рублей
    var commission: Double = amount / 100 * 0.75 // высчитываю 0,75% комиссии
    // если комиссия меньше 35 рублей, то присваиваю комиссии значение 35 рублей
    if (commission < 3500.0) commission = 3500.0
    val result = amount - commission
    println ("Переведено: $amount , Получено: $result") // ответ 965 рублей



    val likes = 53
    val lastCharacter = likes%10  // узнаю последнюю цифру лайков
    if(lastCharacter === 1 && likes != 11) println("Понравилось $likes человеку ") // загвоздка с числом 11
    // поэтому прописываю 2 условия
    else println("Понравилось $likes людям ")



    var previousBuy = 500
    val product = 2000
    val meloman = true
    var resultPrice = 0

    if(previousBuy <= 1000 ) resultPrice = product
    else if (previousBuy > 1000 && previousBuy < 10000) resultPrice = product - 100
    else resultPrice = (product * 0.95).toInt()

    if(meloman) println("Стоимость товара: $product. Стоимость после скидки: " + (resultPrice*0.99))
    else println("Стоимость товара: $product. Стоимость после скидки: $resultPrice")


}



