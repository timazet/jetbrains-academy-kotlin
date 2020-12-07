package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val machine = CoffeeMachine()

    while (true) {
        print("Write action (buy, fill, take, remaining, exit): ")
        val userInput = scanner.next()
        when {
            userInput == "exit" && machine.state == State.READY -> return
            else -> machine.process(userInput)
        }
        println()
    }
}

class CoffeeMachine {

    var state = State.READY

    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550

    fun process(userInput: String) {
        when {
            userInput == "buy" -> suggestCoffee()
            userInput == "take" -> takeMoney()
            userInput == "remaining" -> remainedResources()
            state == State.BUYING -> prepareCoffee(userInput)
            userInput == "fill" -> {
                println()
                print("Write how many ml of water do you want to add: ")
                state = State.FILLING_WATER
            }
            state == State.FILLING_WATER -> {
                water += userInput.toInt()
                print("Write how many ml of milk do you want to add: ")
                state = State.FILLING_MILK
            }
            state == State.FILLING_MILK -> {
                milk += userInput.toInt()
                print("Write how many grams of coffee beans do you want to add: ")
                state = State.FILLING_BEANS
            }
            state == State.FILLING_BEANS -> {
                beans += userInput.toInt()
                print("Write how many disposable cups of coffee do you want to add: ")
                state = State.FILLING_CUPS
            }
            state == State.FILLING_CUPS -> {
                cups += userInput.toInt()
                state = State.READY
            }
        }
    }

    private fun suggestCoffee() {
        println()
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        state = State.BUYING
    }

    private fun prepareCoffee(userInput: String) {
        when (userInput) {
            "1" -> tryToMakeCoffee(250, 0, 16, 4)
            "2" -> tryToMakeCoffee(350, 75, 20, 7)
            "3" -> tryToMakeCoffee(200, 100, 12, 6)
            "back" -> Unit
        }
        state = State.READY
    }

    private fun tryToMakeCoffee(requiredWater: Int, requiredMilk: Int, requiredBeans: Int,
                                cost: Int, requiredCups: Int = 1) {
        if (water - requiredWater < 0) {
            println("Sorry, not enough water!")
            return
        }
        if (milk - requiredMilk < 0) {
            println("Sorry, not enough milk!")
            return
        }
        if (beans - requiredBeans < 0) {
            println("Sorry, not enough coffee beans!")
            return
        }
        if (cups - requiredCups < 0) {
            println("Sorry, not enough disposable cups!")
            return
        }

        println("I have enough resources, making you a coffee!")
        water -= requiredWater
        milk -= requiredMilk
        beans -= requiredBeans
        cups -= requiredCups
        money += cost
    }

    private fun takeMoney() {
        println()
        println("I gave you $$money")
        money = 0
    }

    private fun remainedResources() {
        println()
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$beans of coffee beans")
        println("$cups of disposable cups")
        println("$$money of money")
    }

}

enum class State {
    READY,
    BUYING,
    FILLING_WATER,
    FILLING_MILK,
    FILLING_BEANS,
    FILLING_CUPS,
}