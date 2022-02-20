package machine

var water = 400
var milk = 540
var coffee = 120
var cups = 9
var money = 550

fun espresso() {
    if (water - 250 >= 0) {
        if (coffee - 16 >= 0) {
            if (cups - 1 >= 0) {
                println("I have enough resources, making you a coffee!")
                water -= 250
                coffee -= 16
                cups -= 1
                money += 4
            } else {
                println("Sorry, not enough cups!")
            }
        } else {
            println("Sorry, not enough coffee!")
        }
    } else {
        println("Sorry, not enough water!")
    }
}

fun latte() {
    if (water - 350 >= 0) {
        if (milk - 75 >= 0) {
            if (coffee - 20 >= 0) {
                if (cups - 1 >= 0) {
                    println("I have enough resources, making you a coffee!")
                    water -= 350
                    milk -= 75
                    coffee -= 20
                    cups -= 1
                    money += 7
                } else {
                    println("Sorry, not enough cups!")
                }
            } else {
                println("Sorry, not enough coffee!")
            }
        } else {
            println("Sorry, not enough milk!")
        }
    } else {
        println("Sorry, not enough water!")
    }
}

fun cappuccino() {
    if (water - 200 >= 0) {
        if (milk - 100 >= 0) {
            if (coffee - 12 >= 0) {
                if (cups - 1 >= 0) {
                    println("I have enough resources, making you a coffee!")
                    water -= 200
                    milk -= 100
                    coffee -= 12
                    cups -= 1
                    money += 6
                } else {
                    println("Sorry, not enough cups!")
                }
            } else {
                println("Sorry, not enough coffee!")
            }
        } else {
            println("Sorry, not enough milk!")
        }
    } else {
        println("Sorry, not enough water!")
    }
}

fun fill() {
    print("Write how many ml of water do you want to add:")
    var addWater = readLine()!!.toInt()
    water += addWater

    print("Write how many ml of milk do you want to add:")
    var addMilk = readLine()!!.toInt()
    milk += addMilk

    print("Write how many grams of coffee beans do you want to add:")
    var addCoffee = readLine()!!.toInt()
    coffee += addCoffee

    print("Write how many disposable cups of coffee do you want to add:")
    var addCups = readLine()!!.toInt()
    cups += addCups
}

fun take() {
    println("I gave you $$money")
    money = 0
}

fun remaining() {
    println(
        """
The coffee machine has:
$water of water
$milk of milk
$coffee of coffee beans
$cups of disposable cups
$$money of money
        """.trimIndent())
}

fun main() {

    inner@ do {
    print("Write action (buy, fill, take, remaining, exit):")
    val answer = readLine()!!

        when (answer) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                var answerBuy = readLine()!!

                when (answerBuy) {
                    "1" -> espresso()
                    "2" -> latte()
                    "3" -> cappuccino()
                    "back" -> continue@inner
                }
            }
            "fill" -> fill()
            "take" -> take()
            "remaining" -> remaining()
        }
    } while (answer != "exit")
}
