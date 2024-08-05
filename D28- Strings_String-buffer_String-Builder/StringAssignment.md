
## 1. What is String in java? What  do you mean by mutability and immutability?

                         "Strings in Java"

In Java, a string represents a sequence of characters. But unlike some other programming languages, strings in Java are actually objects. This means they are created and manipulated using the String class.

There are two main ways to create strings in Java:

String literals: These are enclosed in double quotes ("). For example, String greeting = "Hello world!" creates a string object with the value "Hello world!".
Using the new keyword with a String class constructor. This is less common, but it allows you more control over how the string is created.
Mutability and Immutability

Mutability: An object is considered mutable if its state can be changed after it is created. In other words, you can modify the contents of the object.
Immutability: An object is immutable if its state cannot be changed after it is created. Any attempt to modify the object will result in a new object being created with the changes.
Java Strings and Immutability

An important thing to remember about strings in Java is that they are immutable. This means that once a string is created, its content cannot be changed. Any methods that appear to modify a string, such as toUpperCase() or concat(), actually create a new string object with the modifications and return that new object. The original string remains unchanged.

There are several benefits to immutability:

Thread safety: Immutable objects are inherently thread-safe because multiple threads cannot modify the same object at the same time.
Makes reasoning about strings simpler: Since you know a string cannot be changed, it's easier to predict how your code will behave.




## 2) What is diffenence b/w String , SrtingBuffer and StringBuilder?Explain with example.

                             Mutability:

String: Immutable - Once created, the content cannot be changed.
StringBuffer & StringBuilder: Mutable - You can modify their content after creation.
Thread Safety:

StringBuffer: Thread-safe - Methods are synchronized, meaning only one thread can access and modify the object at a time. Useful for multithreaded environments.
StringBuilder: Not thread-safe - Methods are not synchronized. Faster than StringBuffer but requires caution in multithreaded environments.
Performance:

String: Generally fast for simple operations due to immutability (less overhead for modification).
StringBuffer: Slower than StringBuilder due to synchronization overhead.
StringBuilder: Fastest option due to lack of synchronization. Preferred for single-threaded environments or when performance is critical.
When to use which:

String: Use for constant text data or when thread safety and modification aren't concerns. String concatenation (+) internally uses StringBuffer or StringBuilder anyway.
StringBuffer: Use for thread-safe string manipulation in multithreaded environments.
StringBuilder: Use for efficient string manipulation in single-threaded environments where thread safety isn't a concern.





 
3) What is difference b/w == operator and String class equals() method?
4) How many ways to initialize String  in java? Explain role of String literal pool.
5) Write a java program to reverse each word of String.
	Sample Input: “Java Is Plateform Independent”
	Output: “avaJ sI mrofetalP tnednepednI”
6) Write a java program to find all possible palindrom of given String.
	Sample Input: “aaabbbacccababacccaabb”
7) WAP to remove the duplicate letters from given String.
	Sample Input: “aabbccddd”
	Output: “abcd”
8) WAP to find out total occurrence of each letter in string.
	 Sample Input: “aabbccddd”
	 Output:   a- 2 times
			b- 2 times
			c- 2 times
			d- 3 times
9) WAP to find word of maximum length in given String.
	Sample Input: “Dear Student ,You have need to work hard”
`	Output: “Student”
10) WAP to count the word whose first letter is  vowel.
11) Input name of a person and count how many vowels it contains. Use String class methods.
12) Input data exactly in the following format, and print sum of all integer values.
	Sample Input: “67, 89, 23, 67, 12, 55, 66”. (Hint use String class split method and Integer class parseInt method)
13) WAP check if two Strings are anagrams of each other?
(Hint Anagram words: LISTEN - SILENT 
				  TRIANGLE - INTEGRAL)

14) WAP check if a String contains only digits?
