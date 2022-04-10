package com.company;
import java.io.EOFException;
import java.util.*;

public class Main {

    static void hesapMakinesi() {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number..");
        int a= sc.nextInt();

        System.out.println("Enter operation..");
        String b= sc.next();

        System.out.println("Enter second number..");
        int c= sc.nextInt();

        if (b.equals("+")){
            System.out.println(a+c);
        }else if (b.equals("/")){
            try {
                System.out.println(a / c);
            }
            catch (ArithmeticException e) {
                System.out.println("Divided by zero operation cannot possible");
            }
        }

    }


    public static void main(String[] args) {
        hesapMakinesi();
    }
}