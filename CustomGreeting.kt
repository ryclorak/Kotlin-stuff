fun GreetUser(name: String = "user"){	//default name is user
	println("Hello $name!");			//$ for inserting var into string
	println("Good morning.");
}

fun main(args: Array<String>) {
	print("Yo what's your name?");