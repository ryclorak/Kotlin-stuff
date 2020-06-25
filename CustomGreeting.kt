fun GreetUser(name: String = "user"){	//default name is user
	println("Hello $name!");						//$ for inserting var into string
	println("Good morning.");
}

fun main(args: Array<String>) {
	print("Yo what's your name?\n>>");
	var name = readLine()!!; 						//var to make it mutable, !! to ensure not null
	println();													//newline after getting input
	GreetUser(name);	