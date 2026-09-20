Fibonacci Sequence in Java
Description
This Java program generates and displays the Fibonacci sequence based on the number of terms entered by the user.

The Fibonacci sequence starts with 0 and 1. Each following number is calculated by adding the previous two numbers.

Example:

0 1 1 2 3 5 8 13 21 ...

Features
Accepts the number of terms from the user.

Generates the Fibonacci sequence using a for loop.

Uses Scanner to read user input.

Demonstrates variables, loops, and basic arithmetic in Java.

Technologies Used
Java

Scanner class for user input

How It Works
The program starts with two variables:

int a = 0, b = 1;

These represent the first two numbers in the Fibonacci sequence.

For each term, the program:

Prints the current value of a.

Calculates the next number using a + b.

Updates a to the value of b.

Updates b to the newly calculated number.

The process continues until the requested number of terms has been printed.

Example
Input
Enter number of terms:
7

Output
Fibonacci Sequence:
0
1
1
2
3
5
8

How to Run
1. Compile the program
From the project directory, run:

javac Fibonacci.java

2. Run the program
java Fibonacci

If you are using an IDE such as Eclipse or IntelliJ IDEA, you can also run the Fibonacci class directly.

Project Structure
day6/
└── Fibonacci.java

Notes
The program expects the user to enter an integer representing the number of Fibonacci terms to generate.

For example, entering 5 will produce:

0
1
1
2
3
