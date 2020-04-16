//program to demonstrate ways to compare two Strings in Java
package com.tgt.igniteplus;

public class StringCompare {
    public static void main(String[] args) {
        String string_1 = "hello";
        String string_2 = "HELLO";


        System.out.println("\n using equals() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.equals(string_2));

        System.out.println("\n using == operator:");
        System.out.print(string_1 + " equals " + string_2 + ":");
        System.out.println(string_1 == string_2);

        System.out.println("\n using equalsIgnoreCase() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.equalsIgnoreCase(string_2));

        System.out.println("\n using compareTo() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.compareTo(string_2));


        System.out.println("\n using compareToIgnoreCase() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.compareToIgnoreCase(string_2));
    }
}
/*output
 using equals() method:
hello equals HELLO:	false

 using == operator:
hello equals HELLO:false

 using equalsIgnoreCase() method:
hello equals HELLO:	true

 using compareTo() method:
hello equals HELLO:	32

 using compareToIgnoreCase() method:
hello equals HELLO:	0

 */