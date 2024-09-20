/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
// 	birthdayGreeting()
// 	val greeting = birthdayGreeting()
//     println(greeting)
//     println(birthdayGreeting("Rover", 5))
//     println(birthdayGreeting("Rex", 2))
//     println(birthdayGreeting(name = "Rex", age = 2))
    println(birthdayGreeting(age = 5))
//     println(birthdayGreeting("Rex", 2))
    println(birthdayGreeting(age = 2))
    
    
}

// fun birthdayGreeting() {
//     println("Happy Birthday, Rover!")
//     println("You are now 5 years old!")
// }

// fun birthdayGreeting(): String {
//     println("Happy Birthday, Rover!")
//     println("You are now 5 years old!")
// }

// fun birthdayGreeting(): String {
//     val nameGreeting = "Happy Birthday, Rover!"
//     val ageGreeting = "You are now 5 years old!"
//     return "$nameGreeting\n$ageGreeting"
// }

fun birthdayGreeting(name: String = "Rover", age: Int): String {
//     val nameGreeting = "Happy Birthday, $name!"
//     val ageGreeting = "You are now $age years old!"
//     return "$nameGreeting\n$ageGreeting"
    return "Happy Birthday, $name! You are now $age years old!"
}
