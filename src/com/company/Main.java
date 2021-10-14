package com.company;
import java.util.Scanner;

import java.rmi.MarshalledObject;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner obj = new Scanner(System.in);
        System.out.println("Choose a language to translate the word 'Hello':");
        System.out.println("1. German");
        System.out.println("2. French");
        System.out.println("3. Italian");
        System.out.println("4. Spanish");
        System.out.println("5. Portuguese");
        System.out.println("> ");

        int option = obj.nextInt();

        German germany = new German(1, "hallo");
        French france = new French(2, "bonjour");
        Italian italy = new Italian(3, "ciao");
        Spanish spain = new Spanish(4, "hola");
        Portuguese portugal = new Portuguese(5, "ola");



        switch(option) {
            case 1:
                System.out.println(germany.getHello() + " mein liebling!");
                break;
            case 2:
                System.out.println(france.getHello() + " mon amour!");
                break;
            case 3:
                System.out.println(italy.getHello() + " amore mio!");
                break;
            case 4:
                System.out.println(spain.getHello() + " mi amor!");
                break;
            case 5:
                System.out.println(portugal.getHello() + " meu amor!");
                break;
            default:
                System.out.println("Option must be 1-5");
        }

    }
}
