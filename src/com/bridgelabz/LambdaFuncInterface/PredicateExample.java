package com.bridgelabz.LambdaFuncInterface;

import java.util.function.Predicate;

public class PredicateExample {                 // Use only if you have conditional statements in your program
    public static void main(String[] args) {
        Predicate<Integer>p1=i->(i>15);  // i>15 or not
        System.out.println(p1.test(35));  // always takes 1 argument only which is of boolean return type and default abstract method is test()

        Predicate<String>p2=s->(s.length()>7);   // length greater than 7 or not
        System.out.println(p2.test("z650"));

        String[] names={"john","Ram","Rohith","Davey"};
        Predicate<String>p3=s->(s.length()>4);// predicate logic
        for(String str:names){
            if(p3.test(str)){
                System.out.println(str);
            }
        }
    }
}
