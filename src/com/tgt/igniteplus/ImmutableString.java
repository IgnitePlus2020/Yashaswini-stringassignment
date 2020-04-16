//A program to illustrate that strings are immutable
package com.tgt.igniteplus;
public class ImmutableString {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "GIT";
        s1.concat("HUB");
        System.out.println("String after concatenation : " + s1 );//S1 isnt changed even after concatenation shows that strings are immutable
        if(s1=="GIT HUB")
            System.out.print("Strings are mutable");
        else
            System.out.print("Strings are immutable");
    }
}
/*OUTPUT
String after concatenation : GIT
Strings are immutable
 */
