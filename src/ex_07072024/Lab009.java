package ex_07072024;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Entered year is a leap year");
        }
        else
        {
            System.out.println("Entered year is not a leap year");
        }
    }
}
