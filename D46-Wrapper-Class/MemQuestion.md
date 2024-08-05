@1. What do Java Wrapper classes do?


@2. List the eight primitive data types in Java.


@3. Why do we need Wrapper classes?


@4. What is autoboxing?


@5. What is unboxing?


@6. Explain the purpose of the valueOf() method in Wrapper classes.


@7. Differentiate between == and equals() when comparing Wrapper objects.


@8. Can you explain the significance of the hashCode() method in Wrapper classes?
The hashCode() method returns the hash code value for the object, which is crucial for hashing-based data structures like HashMap.


@9. How can you convert a Wrapper object to a primitive data type?


@10. Discuss the parseInt() method in the Integer class.
The parseInt() method is used to convert a String to an int primitive.
String numStr = "123";  
int num = Integer.parseInt(numStr);  


@11. Explain the compareTo() method in the Comparable interface.
The compareTo() method is used to compare two Wrapper objects and returns a negative, zero, or positive value based on their order.
Integer a = 10;  
Integer b = 5;  
System.out.println(a.compareTo(b)); // 1 (a > b)  


@12. How do you check if a given string is a valid representation of a particular primitive type?
 


@13. Explain the purpose of the Boolean class in Java.



@15. How can you convert a boolean primitive to a Boolean object?
ADVERTISEMENT


@16. Explain the toString() method in Wrapper classes.
The toString() method returns a string representation of the object, which is useful for printing or logging.
ADVERTISEMENT
Integer num = 42;  
System.out.println(num.toString()); // "42"  




@20. How can you convert a Wrapper object to a String?
We can use the toString() method or simply concatenate it with an empty string.
Integer num = 42;  
String numStr = num.toString();  
// or  
String numStr2 = num + "";  





@21. Explain the toBinaryString() method in the Integer class.
The toBinaryString() method converts an int to a binary string representation.
int num = 42;  
String binaryStr = Integer.toBinaryString(num);  


@22. What is the purpose of the MAX_VALUE and MIN_VALUE constants in Wrapper classes?
 These constants represent the maximum and minimum values of the primitive data types.
System.out.println(Integer.MAX_VALUE); // 2147483647  
System.out.println(Integer.MIN_VALUE); // -2147483648  


@23. Discuss the parseXxx() methods in Wrapper classes.
The parseXxx() methods (e.g., parseInt(), parseDouble()) are used to convert a String to the corresponding primitive type.
String numStr = "42";  
int num = Integer.parseInt(numStr);  
ADVERTISEMENT



@24. How can you create a BigInteger object from a String?



@26. Explain the valueOf() method in the BigDecimal class.




@28. Can you use Wrapper classes in a switch statement?
 
 

