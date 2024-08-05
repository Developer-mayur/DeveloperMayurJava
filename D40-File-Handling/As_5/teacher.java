// Que. 2 What is Serialization ? Write a java program to store the object into the file.


// Serialization in Java is the process of converting an object's state into a byte stream so that it can be stored in a file, transmitted over a network, or persisted in a database. This allows you to save the state of an object and later recreate it. 
// To make a class serializable, you must implement the java.io.Serializable interface. This interface is a marker interface, meaning it doesn't contain any methods to implement. It simply marks the class as serializable.

import java.io.Serializable;



public class teacher  implements Serializable {
int id;
int age;
String name;


// public teacher(){}
public   teacher(int id,int age, String name){
this.age=age;
this.id=id;
this.name=name;

}



public String toString(){

return name+""+age+""+id;
}

}
