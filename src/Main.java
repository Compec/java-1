package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("1------");
        // 1-------
        // First of all this line right here is what is called a "comment"
        // A comment is some 'text' that is ignored by Java
        // It basically does not exist in the eyes of Java compiler


        System.out.println("2------");
        // 2-------
        // Let us print(display) to the screen.
        // To be more precise, the screen here is the console, a basic text-based interface
        // This will print `Hello World!` to the console
        System.out.println("Hello World!");
        // Remember, ALL statements in Java (like telling it to print something to the screen)
        // MUST end with a semicolon `;`
        // We have used `println` which is short for `print line`.
        // `println` function here prints `Hello World!` then returns to the next line.
        // There is also a `print` function which prints the given text but DOES NOT return to the next line

        System.out.println("3------");
        // 3-------
        // Variables are what hold our data in our program
        // Data can mean `how old is the user?`, `what is the name of user?` or `what is 2 + 3?`
        // All variables must have a type, to let Java know what kind of data we want to store.
        // For example this line tells Java to store an integer number that represents age
        int age = 20;
        // Here Java reserves some place in the computer's memory, labels it as `age` and *assigns* the value 20 to it
        // Now anytime I want to refer to this variable I can simply refer to it by its name `age`
        // For example let's print the user's age
        System.out.println("The user's age is:");
        System.out.println(age);
        // In the second line, Java does not print a text `age` but actually goes to the variable
        // we defined earlier called `age`, looks up its value and prints it to the screen


        System.out.println("4------");
        // 4-------
        // There are many types of variables
        // - To hold integers we generally use int, long (both negative and positive integers)
        //      * int are 32 bit integers. What that means is that the integer given will be represented in memory using
        //      32 binary bits. We will go over them again, but what this practically means is that the largest 32 bit
        //      integer is 2^31–1=2,147,483,647 and the smallest is -2,147,483,648 while the largest 64 bit integer
        //      is 2^63 - 1 (a very big number) and the smallest is -2^63
        // - To hold numbers with decimals (for example 3.14) we use float or double.
        //      * floats are 32 bit `decimal number` (more precisely called floating-point numbers, but it is not
        //      important for now)
        //      * doubles are 64 bit `decimal number` (more precisely called floating-point numbers, but it is not
        //      important for now)
        // - To hold text we use String (be careful, `S` in `String` is uppercase!)
        // - To hold a truth value we use booleans
        //      * booleans can only have two states either `true` or `false`, nothing else
        // Examples:
        int myInt = 1;
        float myFloat = 3.14f; // The `f` at the end of the number is an exception to float numbers, it must be added
        // at the end of the number. We will talk about it in the future
        String myString = "I am a string";
        // Let's print them
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myString);

        System.out.println("5------");
        // 5-------
        // There are multiple operators on numbers
        // - Addition is: + operator
        // - Subtraction is: - operator
        // - Multiplication is: * operator (not an `x`)
        // - Division is: / operator
        // - Modulo is: % operator (percentage sign)
        // Examples
        System.out.println(1 + 2); // 3
        System.out.println(10 - 1); // 9
        System.out.println(10 / 2); // 5
        System.out.println(3 * 2); // 6
        System.out.println(3 % 2); // 1
        // There is a special case with division with integers
        // if you have
        int myDivision = 3 / 2;
        System.out.println("myDivision");
        System.out.println(myDivision);
        // You would expect myDivision to have the value `1.5` but you see `1` instead... why is that?
        // The answer is simple, myDivision is of type `int` for `integer` but `1.5` is a decimal number...
        // The division that happens here is the Euclidean division
        // We know that 3 = 1 * 2 + 1
        // Because the variable myDivison is of type `int` Java neglects the rest value
        // MODULO instead only takes the rest of the division that is why 3 % 2 gave 1

        System.out.println("6------");
        // 6-------
        // Variables can get operators on them. For example
        int a = 0;
        a = a + 1;
        // The thing that is really important to understand here is that the `=` symbol here does NOT equality as in
        // mathematics. It is called an assignment operator
        // The way it works is, first Java evaluates the right-hand side of the `=` symbol which is here `a + 1`
        // and tries to find its value
        // It first sees a, gets its current value which is 0, add it with 1 giving 0 + 1 = 1 and storing this new
        // value in a
        System.out.println(a); // 1
        // The same of course can be done with all the operators listed in the previous section

        // Programmers like to type as much less code as possible, so there are shortcuts for what we wrote.
        // a = a + 1 is exactly the same as a += 1
        a += 3;
        // basically, you can read this as `add 3 to a and store it in a`
        System.out.println(a); // 4
        // There are shortcuts for all the other operators as well
        a -= 1; // Subtracts 1 from a and stores it
        System.out.println(a); // 3
        a *= 2; // Multiplies a by 2 and stores it
        System.out.println(a); // 6
        a /= 3; // Divides a by 3 and stores it
        System.out.println(a); // 2
        a %= 5; // Takes the rest of the division of a by 5 and stores it
        System.out.println(a); // 0

        // For increment and decrement operations, IF the increment/decrement amount is exactly 1
        // We can use an even shorter form like this:
        a++;
        System.out.println(a); // 1
        a--;
        System.out.println(a); // 0

        System.out.println("7------");
        // 7-------
        // String concatenation is a way to `join` two strings
        // For example
        String name = "Ali";
        String welcome = "Welcome";
        String concatenatedString = welcome + " " + name + "!";
        // Here we have 4 strings:
        // - "Welcome"
        // - " " (an empty space)
        // - "Ali"
        // - "!"
        // and 3 concatenations
        System.out.println(concatenatedString); // `Welcome Ali!`

        System.out.println("8------");
        // 8-------
        // Conditional structures allow us to tell the program specific code based on some condition
        // For example we can tell the user different things based on his GPA
        double gpa = 3.5;

        if(gpa >= 3.5) {
            System.out.println("You must be from Boğaziçi...!");
        } else if (gpa >= 2.0) {
            System.out.println("Keep it up!");
        } else {
            System.out.println("Can do better");
        }

        // The basic structure is
        // if(condition1) {
        //      ...
        // } else if(condition2) {
        //      ...
        // } else {
        //      ...
        // }
        // There can only be up to one else
        // There can be as many else if as needed
        // Both are optional

        // Try playing with the value of GPA (maybe even give it negative values) and see what happens to the code!

        System.out.println("9------");
        // 9-------
        // Loops allow us to run code many times
        // We can use a for loop to display all numbers from 1 to 10 for example like this
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Inside the for(...):
        // - First section is the `initialization`. This is where you usually define the variable that will be used
        // as sort of a counter of loops
        // - Second section is the `condition`. The code inside the `for` loop will get executed as long as this
        // condition is verified
        // - Third section is the `incrementation`. The counter (here `i`) will increment by one each time the loop
        // is run

        // What happens is:
        // a) Initialize i
        // b) Is i less or equal than 10?
        //     yes?) Run all the code inside the for loop then c)
        //     no?) Exit the for loop
        // c) Increment i by one then b)

        // Play around with i and the condition, and see what happens!

        // Another loop construct is the while loop. As the name might suggest, while keeps executing the code as
        // long as the condition is satisfied
        int j = 1;
        while(j <= 10) {
            System.out.println(j);
            j++;
        }
        // As you might have noticed, this has the same exact behaviour as the previous for loop, just a different
        // way to write it

        System.out.println("10------");
        // 10-------
        // A function is like a black box, it get inputs, processes them, then outputs something
        // Below you will find the function called `add`
        // It takes two parameters `a` and `b`, both of type integers
        // And returns an integer as a result (because `add` has `int` in front of it)
        int myFirstNumber = 10;
        int mySecondNumber = 20;
        int additionResult = add(myFirstNumber, mySecondNumber);
        System.out.println(additionResult);

        // Functions in java do not necessarily need inputs or outputs.
        // For example the function `sayHello` takes zero parameters and returns no value
        sayHello();


        System.out.println("11------");
        // 11-------
        // In order to read user input from the console, write the following line:
        Scanner scanner = new Scanner(System.in);
        // AND make sure that you have the following line at the very top of your file
        // right before `public class Main`
        // `import java.util.Scanner;`
        // without the backticks (``)

        System.out.println("What is your name?");

        // scanner.nextLine() is a function which waits for the user to type some text and press ENTER and gives
        // us the text typed, which gets stored in userName
        String userName = scanner.nextLine();
        System.out.println("Welcome, " + userName + "!");
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}