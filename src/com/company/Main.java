package com.company;
import java.io.EOFException;
import java.util.*;

public class Main {

    static void hesapMakinesi() {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number..");
        double a= sc.nextDouble();

        System.out.println("Enter operation..");
        String b= sc.next();

        System.out.println("Enter second number..");
        double c= sc.nextDouble();

        if (b.equals("+")){
            System.out.println(a+c);
        }

    }


    public static void main(String[] args) {
        hesapMakinesi();
    }
}