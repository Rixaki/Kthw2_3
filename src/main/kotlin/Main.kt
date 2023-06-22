fun main(args: Array<String>) {

    var amount: Int = 200
    var discount: Int = 0
    var result: Int = amount

    var isRegular: Boolean = true
    println("Покупка - $amount руб.")

    if ((amount < 1001) && !(isRegular)){
        result = amount
        println("Скидка не распространяется")
    }
    if ((amount >= 1001) && (amount <= 10_000)){
        discount = 100
        result = amount - discount
        println("Как меломану любителю, после применения скидки 100р - $result руб.")
    }
    if (amount > 10_000){
        discount = (amount*0.05).toInt()
        result = amount - discount
        println("Как заядлому меломану, после применения скидки 5% - $result руб.")
    }
    if (isRegular){
        discount = (result*0.01).toInt()
        result -= discount
        println("Как постоянному гостю, после применения скидки 1% - $result руб.")
    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
}