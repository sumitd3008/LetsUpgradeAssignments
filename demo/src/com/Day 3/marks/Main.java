package com.marks;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Total marks in Subject1");
        float subject1 = sc.nextFloat();
        System.out.println("Total marks in Subject2");
        float subject2 = sc.nextFloat();
        System.out.println("Total marks in Subject3");
        float subject3 = sc.nextFloat();
        System.out.println("Total marks in Subject4");
        float subject4 = sc.nextFloat();
        System.out.println("Total marks in Subject5");
        float subject5 = sc.nextFloat();
        float sum = subject1 + subject2 + subject3 + subject4 + subject5;
        float percentage = (sum/500)*100;
        System.out.println("Your percentage is "+percentage+"%");
        if (percentage >= 90){
            System.out.println("You have got a grade");
        }
        else if (percentage >= 75){
            System.out.println("You have got b grade");
        }
        else if (percentage >= 60){
            System.out.println("You have got c grade");
        }
        else if (percentage >= 40){
            System.out.println("You have got d grade");
        }
        else{
            System.out.println("You are fail");
        }
    }
}

