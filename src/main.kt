fun main(){
    println("Welcome to the Burger Hut, please enter your menu selection.")
    var userAns = 0

    do{
        println("1) hamburger")
        println("2) fries")
        println("3) milkshake")
        println("4) chicken nuggets")
        println("5) fish sandwich")
        println("6) exit")
        print("Enter choice: ")
        userAns = readLine()!!.toInt()
        var userFood = "Error please enter a valid number"
        when (userAns){
            1 -> userFood = "hamburger"
            2 -> userFood = "fries"
            3 -> userFood = "milkshake"
            4 -> userFood = "chicken nuggets"
            5 -> userFood = "fish sandwich"
            6 -> userFood = "exit"
        }
        println("you have selected number $userAns: $userFood")
    }while (userAns != 6)


}