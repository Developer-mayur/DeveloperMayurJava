#  *Question 1:*  
Define a product with the following attributes:  
- pid: long type  
- name: string type  
- location: string type  
- price: double type  
- status: boolean type  
- contactDetail: long type  

- Display only those products whose price is greater than 500.  
- Display only those products whose name starts with "D."  
- Display only those products whose name ends with "A."  
- Display all product names in uppercase where the location is either Indore or Goa.  

---

#    *Question 2:*  
Write a program to read an array from the user and display only those elements in the array that are Armstrong numbers.  

---

#     *Question 3:*  
Write a program to read an array from the user, pass the array to another method, and check how many palindrome numbers are in the array. Return the count of palindrome numbers to the main method.  

---

#     *Question 4:*  
(Please provide the text for Question 4 if you would like it to be rewritten as well.)







#     Question 5:*
You are tasked with developing a Java program to manage employee records. The program should allow users to input the first name, last name, employee ID, and job title of an employee. Once the user inputs these details, the program should display the employee's information, including their full name, employee ID, and job title.

Requirements:

Create a class Person with the following attributes:
•	firstName - String
•	lastName - String

This class serves as a base class for other classes and will be extended by the 'Employee' class.

Create a class 'Employee' that extends the 'Person' class:

•	Inherits attributes firstName and lastName from Person.
•	Has additional attributes:
1.	employeeId - int
2.	jobTitle - String
•	Implement getters, setters, and constructors for all the above-mentioned attributes in both Person and Employee classes.

Create a class named 'Main' which contains the main method where program execution begins:

•	It prompts the user to input the details of an employee.
•	It creates an Employee object with the provided details.
•	It displays the employee's information using the getters implemented in the 'Employee' class.
Input format :
•	The first line consists of a String that represents firstName.
•	The second line consists of a String that represents lastName.
•	The third line consists of an int that represents the employeeId.
•	The fourth line consists of a String that represents the jobTitle.
Output format :
•	The output should display the employee details in the following format:
Employee details:
Name: <firstName> <lastName>, <jobTitle>
Employee ID: <employeeId>

Refer to the sample output for formatting specifications.
Sample test cases :
Input 1 :
John
Mathew
120948
Developer
Output 1 :
Employee details:
Name: John Mathew, Developer
Employee ID: 120948
Input 2 :
Tony
Stark
98364
Senior Program Manager
Output 2 :
Employee details:
Name: Tony Stark, Senior Program Manager
Employee ID: 9836






#     Question 6:*

      
ONLINE TRANSACTION

Google Pay is a popular digital payment platform that allows users to send and receive money securely. It supports various types of transactions, including person-to-person payments, online purchases, and bill payments.

Implement the following classes to represent different types of transactions in Google Pay:

1. The Transaction class should have the following attributes:
 

2. The PeerToPeerTransaction class should inherit from Transaction and have an additional attribute:
 
 
  
3. The OnlinePurchaseTransaction class should inherit from Transaction and have an additional attribute:
 
 

4. The BillPaymentTransaction class should inherit from Transaction and have an additional attribute:
 
 

Write a Java program that demonstrates the usage of these classes. Create instances of PeerToPeerTransaction, OnlinePurchaseTransaction, and BillPaymentTransaction objects, and display their respective transaction information.

Your task is to implement the necessary classes and complete the main method to demonstrate the functionality. Provide the appropriate access modifiers, constructors, and methods as needed.
Input format :
•	The first input is an integer value representing the transaction ID.
•	The second input is a double value representing the amount.
•	The third input is a String value representing the recipient.
•	The fourth input is a String value representing the merchant.
•	The fifth input is a String value representing the bill type.
Output format :
The output should be in the following format:

Peer-to-Peer Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Recipient: <recipient>

Online Purchase Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Merchant: <merchant>

Bill Payment Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Bill Type: <billType>





#     Question 7:*

Employee Categorization by Salary Level

A company maintains a database that includes the details of all employees. Employees are categorized into two levels based on their salary:

Level 1: Top management with a salary of more than $100.
Level 2: Staff with a salary of $100 or less.

Your task is to implement a Java program to categorize employees based on their salary levels.

Requirements:

1. Employee Class:

Attributes:
•	empId (int): The employee's ID.
•	salary (float): The employee's salary.

Methods:
•	Constructor to initialize 'empId' and 'salary'.

2. EmployeeLevel Class:

Inherits from 'Employee'.

Methods:
•	Constructor to initialize 'empId' and 'salary'.
•	Method to determine and return the employee's level based on their salary.
Input format :
•	The input contains the empId and salary of the employee, separated by a space.
Output format :
•	The output should display the empId, salary, and level of the employee, each on a new line.

Refer to the sample output for formatting specifications.
Sample test cases :
Input 1 :
253 46.6
Output 1 :
253
46.6
2
Input 2 :
156 167
Output 2 :
156
167.0
1



#     Question 8:*
Bob has been tasked with creating a program to calculate and display the circumference and area of the circle.

The program should allow Bob to input the radius of a circle as both an integer and a double and compute both the circumference and area of the circle using separate overloaded methods:
1.	calculateCircumference- To calculate the circumference using the formula 2 * 3.14 * radius
2.	calculateArea- To calculate the area 3.14 * radius * radius

Write a program to help Bob.
Input format :
The first line of input consists of an integer m, representing the radius of the circle as a whole number.
The second line consists of a double value n, representing the radius of the circle as a decimal number.
Output format :
The first line of output displays two space-separated double values, rounded to two decimal places, representing the circumference of the circle with the integer radius and the double radius, respectively.
The second line displays two space-separated double values, rounded to two decimal places, representing the area of the circle with the integer radius and the double radius, respectively.

Refer to the sample output for formatting specifications.
Code constraints :
In this scenario, the test cases fall under the following constraints:
1 ≤ m ≤ 100
1.00 ≤ n ≤ 100.00
Sample test cases :
Input 1 :
5
3.5
Output 1 :
31.40 21.98
78.50 38.47
Input 2 :
1
1.00
Output 2 :
6.28 6.28
3.14 3.14
Input 3 :
100
100.00
Output 3 :
628.00 628.00
31400.00 31400.00









#     Question 9:*
Hagrid needs a program capable of performing two calculations: square roots and cube roots. 
1.	When he inputs an integer value, the program calculates the square root and displays the result. 
2.	Likewise, if he enters a double, he anticipates the program to compute the cube root and display the outcome. 

Create a program that enables Hagrid to input a number and then see the result of the respective root calculation. Use method overloading with the name calculateRoot() for this and also sqrt() and cbrt() functions from the Java library.
Input format :
The input consists of either an integer n or a double value d, representing the numerical value entered by Hagrid.
Output format :
If the input is an integer, the output displays the square root of n rounded to one decimal place.
If the input is a double value, the output displays the cube root of d rounded to one decimal place.

Refer to the sample output for the formatting specifications.
Sample test cases :
Input 1 :
4
Output 1 :
2.0
Input 2 :
27.0
Output 2 :
3.0
Input 3 :
1000
Output 3 :
31.6
Input 4 :
1000.00
Output 4 :
10.0



#     Question 10:*
Problem Statement

Teena's retail store has implemented a Loyalty Points System to reward customers based on their spending. The program includes two classes: Customer and PremiumCustomer.

For regular customers: Loyalty points = amount spent / 10
For premium customers: Loyalty points = 2 * (amount spent / 10)

Calculate and display the loyal points received by the customers using an overridden method calculateLoyaltyPoints.
Input format :
The first line of input consists of an integer representing the amount spent by the customer.
The second line consists of premium customer status (a string) - "yes" if the customer is a premium customer, "no" if they are not.
Output format :
The output displays the loyalty points earned based on the amount spent.

Refer to the sample output for formatting specifications.
Code constraints :
1 ≤ amount ≤ 10,000
Sample test cases :
Input 1 :
50
yes
Output 1 :
10
Input 2 :
40
no
Output 2 :
4











#     Question 11:*
1.5qYou are tasked with developing a Java program to manage employee records. The program should allow users to input the first name, last name, employee ID, and job title of an employee. Once the user inputs these details, the program should display the employee's information, including their full name, employee ID, and job title.

Requirements:

Create a class Person with the following attributes:
•	firstName - String
•	lastName - String

This class serves as a base class for other classes and will be extended by the 'Employee' class.

Create a class 'Employee' that extends the 'Person' class:

•	Inherits attributes firstName and lastName from Person.
•	Has additional attributes:
1.	employeeId - int
2.	jobTitle - String
•	Implement getters, setters, and constructors for all the above-mentioned attributes in both Person and Employee classes.

Create a class named 'Main' which contains the main method where program execution begins:

•	It prompts the user to input the details of an employee.
•	It creates an Employee object with the provided details.
•	It displays the employee's information using the getters implemented in the 'Employee' class.
Input format :
•	The first line consists of a String that represents firstName.
•	The second line consists of a String that represents lastName.
•	The third line consists of an int that represents the employeeId.
•	The fourth line consists of a String that represents the jobTitle.
Output format :
•	The output should display the employee details in the following format:
Employee details:
Name: <firstName> <lastName>, <jobTitle>
Employee ID: <employeeId>

Refer to the sample output for formatting specifications.
Sample test cases :
Input 1 :
John
Mathew
120948
Developer
Output 1 :
Employee details:
Name: John Mathew, Developer
Employee ID: 120948
Input 2 :
Tony
Stark
98364
Senior Program Manager
Output 2 :
Employee details:
Name: Tony Stark, Senior Program Manager
Employee ID: 9836


#     Question 12:*
ONLINE TRANSACTION

Google Pay is a popular digital payment platform that allows users to send and receive money securely. It supports various types of transactions, including person-to-person payments, online purchases, and bill payments.

Implement the following classes to represent different types of transactions in Google Pay:

1. The Transaction class should have the following attributes:
 

2. The PeerToPeerTransaction class should inherit from Transaction and have an additional attribute:
 
 
  
3. The OnlinePurchaseTransaction class should inherit from Transaction and have an additional attribute:
 
 

4. The BillPaymentTransaction class should inherit from Transaction and have an additional attribute:
 
 

Write a Java program that demonstrates the usage of these classes. Create instances of PeerToPeerTransaction, OnlinePurchaseTransaction, and BillPaymentTransaction objects, and display their respective transaction information.

Your task is to implement the necessary classes and complete the main method to demonstrate the functionality. Provide the appropriate access modifiers, constructors, and methods as needed.
Input format :
•	The first input is an integer value representing the transaction ID.
•	The second input is a double value representing the amount.
•	The third input is a String value representing the recipient.
•	The fourth input is a String value representing the merchant.
•	The fifth input is a String value representing the bill type.
Output format :
The output should be in the following format:

Peer-to-Peer Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Recipient: <recipient>

Online Purchase Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Merchant: <merchant>

Bill Payment Transaction:
Transaction ID: <transactionId>
Amount: $<amount>
Bill Type: <billType>



#     Question 13:*
Employee Categorization by Salary Level

A company maintains a database that includes the details of all employees. Employees are categorized into two levels based on their salary:

Level 1: Top management with a salary of more than $100.
Level 2: Staff with a salary of $100 or less.

Your task is to implement a Java program to categorize employees based on their salary levels.

Requirements:

1. Employee Class:

Attributes:
•	empId (int): The employee's ID.
•	salary (float): The employee's salary.

Methods:
•	Constructor to initialize 'empId' and 'salary'.

2. EmployeeLevel Class:

Inherits from 'Employee'.

Methods:
•	Constructor to initialize 'empId' and 'salary'.
•	Method to determine and return the employee's level based on their salary.
Input format :
•	The input contains the empId and salary of the employee, separated by a space.
Output format :
•	The output should display the empId, salary, and level of the employee, each on a new line.

Refer to the sample output for formatting specifications.
Sample test cases :
Input 1 :
253 46.6
Output 1 :
253
46.6
2
Input 2 :
156 167
Output 2 :
156
167.0
1
4.



#     Question 14:*
Problem Statement

Rithish is developing a straightforward pizza ordering system. To achieve this, he needs a Pizza class with a constructor for the base price and topping cost, along with a calculatePrice method overriding. He also wants a DiscountedPizza class that inherits from Pizza, applying a 10% discount for more than three toppings.

The program prompts the user for inputs, creates instances of both classes, calculates regular and discounted prices, and displays them formatted appropriately.

Example 1

Input:
9.5
1.25
3
Output: 
Price without discount: Rs.13.25
Price with discount: Rs.13.25
Explanation:
Rithish orders a pizza with a base price of Rs. 9.5, a topping cost of Rs. 1.25, and selects 3 toppings. The price is calculated as 9.5 + (1.25 * 3) = 13.25. The regular and discounted prices are both Rs. 13.25, as no discount has been applied.

Example 2

Input:
11.0
2.0
7
Output: 
Price without discount: Rs.25.00
Price with discount: Rs.22.50
Explanation:
Rithish orders another pizza with a higher base price of Rs. 11.0, a topping cost of Rs. 2.0, and chooses 7 toppings. 
Regular Price: 11.0 + (2.0 * 7) = Rs. 25.00.
Discounted Price: The discounted price is calculated as 90% of the regular price, i.e., 0.9 * 25.00 = Rs.22.50. 
Input format :
The first line of input consists of a double value, representing the base price of the pizza.
The second line consists of a double value, representing the cost per topping.
The third line consists of an integer, representing the number of toppings chosen for the pizza.
Output format :
The first line of output prints the price without discount, rounded off to two decimal places.
The second line prints the price with the discount, rounded off to two decimal places.

Refer to the sample output for formatting specifications.
Code constraints :
The base price and the cost per topping should be greater than zero.
1 ≤ number of toppings ≤ 10
Sample test cases :
Input 1 :
9.5
1.25
3
Output 1 :
Price without discount: Rs.13.25
Price with discount: Rs.13.25
Input 2 :
11.0
2.0
7
Output 2 :
Price without discount: Rs.25.00
Price with discount: Rs.2













#     Question 15:*
Problem Statement

Imagine Maria is developing a game, where it involves collecting resources on each planet, and the availability of resources is modelled using a geometric progression. 

Create an abstract class Series with an abstract method nextTerm(). Implement a subclass called GeometricSeries that calculates the next term in a geometric progression for the resource collection on planets. Allow players to input the initial resource level, resource growth ratio, and the number of planets they plan to explore. 

Display the predicted resource levels on each planet.
Input format :
The first line of input consists of an integer, representing the initial resource level.
The second line consists of an integer, representing the growth ratio.
The third line consists of an integer, representing the number of planets.
Output format :
The output displays the predicted resource levels of each planet, separated by space.

Refer to the sample output for formatting specifications.
Code constraints :
In this scenario, the test cases fall under the following constraints:
1 ≤ resource ≤ 10
1 ≤ growth ratio ≤ 10
1 ≤ number of planets ≤ 8
Sample test cases :
Input 1 :
2
3
5
Output 1 :
2 6 18 54 162 
Input 2 :
5
2
3
Output 2 :
5 10 20

















#     Question 16:*
Problem Statement

Wick is developing a real-time strategy game where the players command armies represented by square matrices. The game requires matrix operations to calculate army strength and overall battle outcomes. 

Write a program to assist Wich that includes an abstract class MatrixOperation with an abstract method performOperation() and a class MatrixAddition. Calculate the army strength by adding all the elements in the given matrices. Display the matrix that represents the army's strength.
Input format :
The first line of input consists of an integer N, representing the number of rows and columns of a square matrix.
The next N lines consist of N space-separated integers, representing the elements of the first matrix.
The following N lines consist of N space-separated integers representing the elements of another matrix.
Output format :
The output prints the army strength, which is the addition of the given matrices.

Refer to the sample output for formatting specifications.
Code constraints :
The given test cases fall under the following constraints:
1 ≤ N ≤ 5
Sample test cases :
Input 1 :
2
1 2
3 4
5 6
7 8
Output 1 :
6 8 
10 12 
Input 2 :
3
1 2 3
4 5 6
7 8 9
10 11 12
13 14 15
16 17 18
Output 2 :
11 13 15 
17 19 21 
23 25 27











#     Question 17:*
Assignment 1: Shape Area Calculation
Create a parent class Shape with a method calculateArea() that prints "Area calculation not defined for Shape."
Create subclasses:
Circle that overrides calculateArea() to calculate and print the area of a circle.
Rectangle that overrides calculateArea() to calculate and print the area of a rectangle.
Write a Main class to demonstrate polymorphism using an array of Shape objects.


#     Question 18:*
2.Create a parent class Animal with a method makeSound() that prints "Some generic sound."
Create subclasses:
Dog that overrides makeSound() to print "Woof Woof."
Cat that overrides makeSound() to print "Meow Meow."
In the Main class, use polymorphism to call makeSound() on different Animal objects.

#     Question 19:*
Assignment 3.
Create a parent class Bank with a method getInterestRate() that returns 0.
Create subclasses:
SBI that overrides getInterestRate() to return 5.
ICICI that overrides getInterestRate() to return 6.
Axis that overrides getInterestRate() to return 7.
In the Main class, demonstrate method overriding by calling getInterestRate() on different bank objects.


#     Question 20:*
Assignment 4:
Create a parent class Vehicle with a method speed() that prints "Speed varies for different vehicles."
Create subclasses:
Car that overrides speed() to print "The car speed is 120 km/h."
Bike that overrides speed() to print "The bike speed is 80 km/h."
Use polymorphism to display the speed of different vehicles in the Main class.


#     Question 21:*
Assignment 5:
Create a parent class Employee with a method calculateSalary() that prints "Base salary calculation for Employee."
Create subclasses:
Manager that overrides calculateSalary() to add a bonus to the base salary.
Developer that overrides calculateSalary() to calculate salary based on hours worked.
Demonstrate the overridden method in the Main class by creating an array of Employee objects and calling calculateSalary() on each.











#     Question 22:*
1.Problem Statement:
You are tasked with designing a system to manage a set of appliances. Each appliance has common characteristics and behaviors, but their operation may differ based on the type of appliance. Use abstract classes to model this system.

Instructions:
Abstract Class Design

Create an abstract class named Appliance with the following:
Fields:
String brand
boolean isOn
Constructor to initialize brand and set isOn to false initially.
Abstract method operate(): Defines the specific operation of an appliance.
Concrete methods:
turnOn(): Sets isOn to true and prints "The appliance is now ON."
turnOff(): Sets isOn to false and prints "The appliance is now OFF."
Subclasses

Create two subclasses of Appliance:
WashingMachine:
Override the operate() method to print "The washing machine is washing clothes."
Refrigerator:
Override the operate() method to print "The refrigerator is cooling items."
Driver Class

Create a Main class to:
Instantiate a WashingMachine and a Refrigerator.
Turn on each appliance and call their operate() method.
Turn off each appliance.


O/p:
Washing Machine:
The appliance is now ON.
The washing machine is washing clothes.
The appliance is now OFF.

Refrigerator:
The appliance is now ON.
The refrigerator is cooling items.
The appliance is now OFF.
2.


Scenario 1: Payment Processing System
You are developing a payment processing system to handle various payment methods.

Abstract Class:

Create an abstract class Payment with the following:
Fields:
double amount
String transactionID
Constructor to initialize the fields.
Abstract method processPayment().
Concrete method displayDetails() to print the transaction ID and amount.
Subclasses:

Create the following subclasses:
CreditCardPayment:
Additional field: String cardNumber.
Override processPayment() to print "Processing credit card payment for amount: $[amount].".
PaypalPayment:
Additional field: String paypalID.
Override processPayment() to print "Processing PayPal payment for amount: $[amount]."
Main Class:

Create instances of both CreditCardPayment and PaypalPayment.
Call processPayment() and displayDetails() for each object.


#     Question 23:*
 3.Online Learning Platform:
You are tasked with modeling a course management system.

Abstract Class:

Create an abstract class Course with the following:
Fields:
String courseName
int duration (in weeks)
Constructor to initialize fields.
Abstract method showContent().
Concrete method displayDetails() to print the course name and duration.
Subclasses:

Create the following subclasses:
ProgrammingCourse:
Additional field: String language.
Override showContent() to print "This course covers programming in [language]."
DesignCourse:
Additional field: String tool.
Override showContent() to print "This course focuses on design using [tool]."
Main Class:

Create objects of ProgrammingCourse and DesignCourse.
Call showContent() and displayDetails() for each course.


#     Question 24:*
4.Library Management System
You are designing a library system to manage books and media.

Abstract Class:

Create an abstract class LibraryItem with the following:
Fields:
String title
String author
Constructor to initialize fields.
Abstract method checkout().
Abstract method returnItem().
Concrete method displayInfo() to print the title and author.
Subclasses:

Create the following subclasses:
Book:
Additional field: int pages.
Override checkout() to print "Checking out book: [title]."
Override returnItem() to print "Returning book: [title]."
DVD:
Additional field: int duration (in minutes).
Override checkout() to print "Checking out DVD: [title]."
Override returnItem() to print "Returning DVD: [title]."
Main Class:

Create objects of Book and DVD.
Call checkout(), returnItem(), and displayInfo() for each item.









#     Question 25:*
Problem Statement

Jessica is tasked with designing a fantasy game character system. The system includes an abstract class named GameCharacter with two abstract methods: attack() and defend(). 

Two subclasses, Warrior and Wizard, extend the GameCharacter class. 

The program prompts the player to choose a character class (1. Warrior, 2. Wizard) and input their character's strength or magic power. The dynamic calculations involve tripling the strength (strength * 3) for the Warrior's attack and doubling the magic power(power * 2) for the Wizard's attack.

Jessica needs your help in completing the program. Help her finish it.
Input format :
The first line of input consists of an integer, representing the choice of the character - 1 for Warrior and 2 for Wizard.
If the choice is 1, the second line consists of an integer N, representing the strength.
If the choice is 2, the second line consists of an integer M, representing the magic power.
Output format :
If the choice is 1, the output displays the actions of a warrior in the following format:
"Warrior Actions:
Attack: Powerful sword slash for [result] damage!
Defend: Raises shield, defence boosted by [N]!"

If the choice is 2, the output displays the actions of a wizard in the following format:
"Wizard Actions:
Attack: Casts spell, deals [result] magical damage!
Defend: Creates magical barrier, defence boosted by [M]!"

If any other choice is given, print "Invalid choice".

Refer to the sample output for formatting specifications.
Code constraints :
1 ≤ M, N ≤ 106
Sample test cases :
Input 1 :
1
68
Output 1 :
Warrior Actions:
Attack: Powerful sword slash for 204 damage!
Defend: Raises shield, defence boosted by 68!
Input 2 :
2
998
Output 2 :
Wizard Actions:
Attack: Casts spell, deals 1996 magical damage!
Defend: Creates magical barrier, defence boosted by 998!
Input 3 :
3
76
Output 3 :
Invalid choice




#     Question 26:*
Problem Statement

Imagine Maria is developing a game, where it involves collecting resources on each planet, and the availability of resources is modelled using a geometric progression. 

Create an abstract class Series with an abstract method nextTerm(). Implement a subclass called GeometricSeries that calculates the next term in a geometric progression for the resource collection on planets. Allow players to input the initial resource level, resource growth ratio, and the number of planets they plan to explore. 

Display the predicted resource levels on each planet.
Input format :
The first line of input consists of an integer, representing the initial resource level.
The second line consists of an integer, representing the growth ratio.
The third line consists of an integer, representing the number of planets.
Output format :
The output displays the predicted resource levels of each planet, separated by space.

Refer to the sample output for formatting specifications.
Code constraints :
In this scenario, the test cases fall under the following constraints:
1 ≤ resource ≤ 10
1 ≤ growth ratio ≤ 10
1 ≤ number of planets ≤ 8
Sample test cases :
Input 1 :
2
3
5
Output 1 :
2 6 18 54 162 
Input 2 :
5
2
3
Output 2 :
5 10 20











#     Question 27:*
Problem Statement

Wick is developing a real-time strategy game where the players command armies represented by square matrices. The game requires matrix operations to calculate army strength and overall battle outcomes. 

Write a program to assist Wich that includes an abstract class MatrixOperation with an abstract method performOperation() and a class MatrixAddition. Calculate the army strength by adding all the elements in the given matrices. Display the matrix that represents the army's strength.
Input format :
The first line of input consists of an integer N, representing the number of rows and columns of a square matrix.
The next N lines consist of N space-separated integers, representing the elements of the first    matrix.
The following N lines consist of N space-separated integers representing the elements of another matrix.
Output format :
The output prints the army strength, which is the addition of the given matrices.

Refer to the sample output for formatting specifications.
Code constraints :
The given test cases fall under the following constraints:
1 ≤ N ≤ 5
Sample test cases :
Input 1 :
2
1 2
3 4
5 6
7 8
Output 1 :
6 8 
10 12 
Input 2 :
3
1 2 3
4 5 6
7 8 9
10 11 12
13 14 15
16 17 18
Output 2 :
11 13 15 
17 19 21 
23 25 27











#     Question 28:*
1. Payment Gateway Interface
Objective: Create a program to simulate payment processing using different payment methods.
1.
Create an interface PaymentGateway with a method processPayment(double amount).
Implement the interface in classes CreditCardPayment and UPIPayment.
Write a driver class to test the functionality by accepting the payment method from the user and processing the payment.

2.
2. Shape Area Calculator
Objective: Calculate the area of different shapes using a common interface.

Define an interface Shape with a method calculateArea().
Create classes Circle and Rectangle that implement the Shape interface.
Input dimensions and calculate the area of each shape.

3.
 Library Management System
Objective: Manage library operations using an interface.

Define an interface LibraryOperations with methods issueBook() and returnBook().
Implement the interface in Student and Teacher classes.
Demonstrate how students and teachers interact with the library differently.










#     Question 29:*

Problem Statement

Oviya is fascinated by automorphic numbers and wants to create a program to determine whether a given number is an automorphic number or not.

An automorphic number is a number whose square ends with the same digits as the number itself. For example, 25 = (25)2 = 625 

Oviya has defined two interfaces, NumberInput for taking user input and AutomorphicChecker for checking if a given number is automorphic. The class AutomorphicNumber implements both interfaces.

Help her to complete the task.
Input format :
The input consists of a single integer n.
Output format :
If the input number is an automorphic number, print "n is an automorphic number".
Otherwise, print "n is not an automorphic number".

Refer to the sample output for formatting specifications.
Code constraints :
1 ≤ n ≤ 500
Sample test cases :
Input 1 :
25
Output 1 :
25 is an automorphic number
Input 2 :
7
Output 2 :
7 is not an automorphic number








#     Question 30:*
Problem Statement

John is developing a car loan calculator and has structured his program using two interfaces, Principal and InterestRate, defining methods for principal and interest rate retrieval.

The Loan class implements these interfaces, taking principal and annual interest rates as parameters. User input is solicited for these values, and the program ensures their validity before performing calculations. If input values are invalid (less than or equal to zero), an error message is displayed.

Note: Total interest = principal * interest rate * years
Input format :
The first line of input consists of a double value P, representing the principal.
The second line consists of a double value R, representing the annual interest rate.
The third line consists of an integer value N, representing the loan duration in years.
Output format :
If the input values are valid, print "Total interest paid: Rs. " followed by a double value, representing the total interest paid, rounded off to two decimal places.
If the input values are invalid (negative or zero values for principal, annual interest rate, or loan duration), print "Invalid input values!".

Refer to the sample output for formatting specifications.
Code constraints :
In this scenario, the test cases fall under the following constraints:
0.00 < P < 10,00,000.00
0.01 ≤ R ≤ 0.99
0 < N < 25
Sample test cases :
Input 1 :
20000.00
0.05
5
Output 1 :
Total interest paid: Rs.5000.00
Input 2 :
45000.25
0
2
Output 2 :
Invalid input values!
Note :
The program will be evaluated only after the “Submit Code” is clicked.
Extra spaces and new line characters in the program output will result in the failure of the test case.





#     Question 31:*
1.
Palindrome Check
Write a program to check if a given string is a palindrome (reads the same backward as forward).

Example Input: madam
Example Output: Yes, it's a palindrome.

2.
Count Vowels and Consonants
Write a program to count the number of vowels and consonants in a string.

Example Input: hello world
Example Output: Vowels: 3, Consonants: 7
3.
String Reversal
Write a program to reverse a given string.
Example Input: Java
Example Output: avaJ
Remove Whitespace
4.
Remove all spaces from a given string without using built-in methods.
Example Input: I love coding
Example Output: Ilovecoding
5. WAP to read strin from user and count how many spaces available in that string.
6.Write a program to check string contains special characters($, @, #) or not..




#     Question 32:*
1.Character Frequency
Write a program to find the frequency of each character in a string.
Example Input: hello
Example Output: {h=1, e=1, l=2, o=1}


2.

Valid Password or Not

The HR committee of Sunrise Basket Company decided to enforce the following rules when an employee creates/changes his/her password.

1.	Password should be less than 15 and more than 8 characters in length.
2.	Password should contain at least one upper case and one lower case alphabet.   
3.	Password should contain at least one number.
4.	Password should contain at least one special character.
5.	Password should not contain a space.

The program must accept a given password string "password" as input.
Input format :
The input consists of String that represents password.
Output format :
The output should print "<password> is a valid password" or "<password> is a invalid password".
Refer sample output for formatting specifications.
Sample test cases :
Input 1 :
Ex@1234ab
Output 1 :
Ex@1234ab is a valid password
Input 2 :
Ex!!
Output 2 :
Ex!! is a invalid password
Input 3 :
Abcd @1234
Output 3 :
Abcd @1234 is a invalid 




3.
Venue Details

Create a class named Main and create two variables named, venueName and city of type string.
Write a main method to get the venue details in the string separated by a comma. Use String.split() function to display the details.
Input format :
The first line consists of a String that represents the venueName and city.
Output format :
The output should display the venue details.
Refer sample output for formatting specifications.
Sample test cases :
Input 1 :
M. A. Chidambaram Stadium,Chennai
Output 1 :
Venue Details:
Venue Name: M. A. Chidambaram Stadium
City Name: Chennai
Input 2 :
The Oval,London
Output 2 :
Venue Details:
Venue Name: The Oval
City Name: London
Note :
The program will be evaluated only after the “Submit Code” is clicked.
Extra spaces and new line characters in the program output will result in the failure of the test case.



4. Write a program to count number of consonants in given string..read string from user.

5. WAP to read a string from user and convert all the vovels into upper case.

6. WAP to convert First character of every word into upper case.











#  Exeption Handling

1. Divide by zero exception.
Write a program to obtain two numbers and print their quotient. In case of an exception print the exception message.
Input format :
Provide a single line of input separated by a space. Obtain the integers N1 and N2.
Output format :
Display the quotient if there is no exception; otherwise, print the exception message.
Refer to the sample output for reference.
Code constraints :
Integers only.
Sample test cases :
Input 1 :
44 2
Output 1 :
22
Input 2 :
2 0
Output 2 :
java.lang.ArithmeticException




2.Create a class named Main with the attribute "number" as an integer.
Write a program to catch IllegalArgumentException and ArithmeticException for the given input.
1.	If the input provided is 0, the program should throw an "ArithmeticException" with a message.
2.	If the input provided is greater than 7, the program should throw an "IllegalArgumentException" with a message.
3.	If neither of the above cases is true, the program should return the given number.

HINT: Use nested try block for both the exception.
Input format :
Input consists of an integer.
Output format :
Refer to the sample output for reference.
Sample test cases :
Input 1 :
5
Output 1 :
5
Input 2 :
8
Output 2 :
IllegalArgumentException caught - Number should not be greater than 7
Input 3 :
0
Output 3 :
ArithmeticException caught - / by zero


3.


Input Mismatch Exception
InputMismatchException occurs when an input of a different datatype is given other than the required. In common practice, it occurs when a String or double datatype is given for an int datatype. Let's handle this exception for practice. 

Create a driver class called Main. In the Main method, obtain integer input from the user. If the input is an integer, print the value or else throw the InputMismatchException.
Input format :
The input consists of a integer value.
Output format :
The output prints the given input otherwise throws InputMismatchException.
Refer sample output for reference.
Sample test cases :
Input 1 :
hello
Output 1 :
java.util.InputMismatchException
Input 2 :
9
Output 2 :
9



1.

Handling Book Invalid Quantity Exception in Library Software

Mohan, a librarian is creating software to automate his work. As part of this, he needs to handle the exception if the purchased quantity is greater than the available quantity. 
Create a class named "Book" with the following attributes
1.	id - String
2.	bookTitle - String
3.	authorName - String
4.	price - float
5.	quantity - int
Create an Exception class called InvalidQuantityException and use it in the class called “Book”. Include a method called purchase(int quantity) taking the purchased quantity as a parameter and update the quantity available appropriately. Print suitable exception if the purchased quantity is more than the available quantity. Help Mohan to complete this task. Refer to sample input and output.
Input format :
The first line of the input consists of bookID as a String
The second line of the input consists of bookTitle as String
The third line of the input consists of authorName as String
The fourth line of the input consists of price as a float
The fifth line of the input consists of the quantity available as an integer
The sixth line of the input consists of the quantity purchased as an positive integer
Output format :
The output should display the quantity available if it has or else throws an exception
Refer to the sample output for reference.
Sample test cases :
Input 1 :
YCW2019
You can win
Shiv Khera
245
25
20
Output 1 :
Quantity Available : 5
Input 2 :
YCW2019
You can win
Shiv Khera
245
25
30
Output 2 :
InvalidQuantityException: Quantity not available

2.

Validating Email Address and Handling Custom Exceptions

Write a program to validate an email address and display appropriate exceptions if any errors are encountered.
Create 3 custom exception classes as below
1.	DotException
2.	AtTheRateException
3.	DomainException
A typical email address should include a '.' character, '@' character, and a valid domain name. Valid domain names for practice include 'in', 'com', 'net', or 'biz'.
Input format :
The first line of input contains the email to be validated.
Output format :
Print 'Valid email address' if the email address provided meets the criteria, or 'Invalid email address' along with the appropriate exception message. Display 'Invalid Dot usage', 'Invalid @ usage', or 'Invalid Domain' messages based on the email ID provided.
Refer to the sample output for reference.
Sample test cases :
Input 1 :
sample@gmail.com
Output 1 :
Valid email address
Input 2 :
sample@gmail.com.
Output 2 :
DotException: Invalid Dot usage
Invalid email address
Input 3 :
sample@g@mail.com
Output 3 :
AtTheRateException: Invalid @ usage
Invalid email address
Input 4 :
sample@gmail.con
Output 4 :
DomainException: Invalid Domain
Invalid email address


3.

Handling Driving License Registration Exceptions

Write a program to approve or display suitable exceptions whenever a person tries to register for a driving license.
Create a class named Main with the following attributes 
1.	name - String
2.	userAge - int
3.	mark - int
Minimum eligibility for obtaining a driving license:
1.	Age should be above 18 years old.
2.	A person should pass the road rules eligibility test (with above 80 marks) for a total mark of 100.
Create two exceptions InvalidAgeForDrivingLicenseException and InvalidMarkForDrivingLicenseException to handle the above scenarios.
Input format :
The first line consists of a name a String.
The second line consists of age as an integer.
The next line consists of marks obtained as integers.
Output format :
The output should display "Approved" if he meets the criteria or the appropriate exception.
Refer to the sample output for reference.
Sample test cases :
Input 1 :
Guru
33
95
Output 1 :
Approved
Input 2 :
Smith
2
95
Output 2 :
InvalidAgeForDrivingLicenseException: Age should be more than 18 years old
Input 3 :
Jack
-3
95
Output 3 :
InvalidAgeForDrivingLicenseException: Invalid age
Input 4 :
Scott
33
75
Output 4 :
InvalidMarkForDrivingLicenseException: Mark should be more than 80
Input 5 :
Mathew
33
-45
Output 5 :
InvalidMarkForDrivingLicenseException: Invalid mark
Input 6 :
Guru
33
195
Output 6 :
InvalidMarkForDrivingLicenseException: Invalid mark