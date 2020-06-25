fun GreetUser(name: String = "user"){	//default name is user
	println("Hello $name!");						//$ for inserting var into string
	println("Good morning.");
}

fun main(args: Array<String>) {
	print("Yo what's your name?\n>>");
	var name = readLine()!!; 						//var to make it mutable, !! to ensure not null
	println();													//newline after getting input
	GreetUser(name);

	print("\n\n");

	GreetUser(name = readLine()!!);			//it works, yay conciseness

	//trying arrays and loops with kotlin, need to test the following code

	print("How many names do you want to add to the name array?\n>>")
	var num = readLine()!!.toInt();
	var nameArr: Array<String>(num);

	for (int i=0; i<num: i++)
		nameArr[i] = readLine()!!;				//TODO: look for ways

		//TODO: GreetUser using the array in a separate function
}	