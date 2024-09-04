package Strings;

public class StringsExample {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println("a.equals(b): "+a.equals(b)+" b.hashCode: "+b.hashCode());
        System.out.println("Printing a: "+a+" a.hashCode():  "+a.hashCode());
        a = a.concat(" World");
        System.out.println("after concatenation-> Printing a: "+a+" a.hashCode(): "+a.hashCode());

        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println("Printing sb1: "+sb1+" sb1.hashCode(): "+sb1.hashCode());
        sb1.append(" World");
        System.out.println("after append->Printing sb1: "+sb1+" sb1.hashCode(): "+sb1.hashCode());

        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("Printing sb1: "+sb2+" sb2.hashCode(): "+sb2.hashCode());
        sb2.append(" World");
        System.out.println("after append->Printing sb1: "+sb2+" sb2.hashCode(): "+sb2.hashCode());
        System.out.println(sb1.equals(sb2));
        sb2.reverse();
        System.out.println("after reverse->Printing sb2: "+sb2+" sb2.hashCode(): "+sb2.hashCode());
    }
}
/*
1. String
Immutable Nature: When you create a String in Java, it is stored in the String Pool
(part of the heap memory). If you modify a String, a new object is created in memory,
leaving the original object unchanged. This immutability leads to increased memory usage
if you perform many string operations.

String Pool: The String Pool helps in saving memory by reusing instances of strings.
For example, if two String objects have the same value, Java will point both references
to the same object in the pool rather than creating a new one.

2. StringBuffer
Mutable Nature: StringBuffer is mutable, meaning it can be modified after creation.
Memory allocation for a StringBuffer object is dynamic and can grow as needed.
It doesn't create new objects every time it's modified, unlike String.

Synchronization: StringBuffer is thread-safe because its methods are synchronized.
However, this thread safety comes with a slight performance overhead, which might
lead to slower operations compared to StringBuilder.

Memory Efficiency: Since StringBuffer modifies the original object, it is more
memory-efficient than String when dealing with a large number of modifications.

3. StringBuilder
Mutable Nature: Like StringBuffer, StringBuilder is also mutable and can be modified after creation.
However, it is not synchronized, making it faster but not thread-safe.

Memory Usage: StringBuilder is more memory-efficient than String and slightly more efficient than
StringBuffer due to the lack of synchronization overhead.

Use Case: StringBuilder is ideal for single-threaded environments where you need to perform
frequent string manipulations without the need for thread safety.

Memory Management Summary
Feature	        String
Memory Usage	High (due to immutability)
Creation of Objects	Creates new objects on modification
String Pool	: Uses String Pool

Feature : StringBuffer
Memory Usage : Lower (mutable, synchronized)
Creation of Objects: Modifies existing object
String Pool: No String Pool

Feature: StringBuilder
Memory Usage: Lowest (mutable, non-synchronized)
Creation of Objects: Modifies existing object
String Pool: No String Pool
*/
