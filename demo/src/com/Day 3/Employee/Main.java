package com.Employee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of the employee");
        String name;
        name = sc.nextLine();
        System.out.println("Date_of_birth of the employee");
        float date_of_birth;
        date_of_birth = sc.nextFloat();
        System.out.println("Month_of_birth of the employee");
        int month_of_birth;
        month_of_birth = sc.nextInt();
        System.out.println("Year_of_birth of the employee");
        float year_of_birth;
        year_of_birth = sc.nextFloat();
        System.out.println("Monthly_salary of the employee");
        float monthly_salary;
        monthly_salary = sc.nextFloat();
        float annual_salary = monthly_salary*12;
        System.out.println("Annual salary is"+annual_salary);
        float tax = 0;
        if (annual_salary >= 500000){
            System.out.println("Total tax on annual salary will be 20%");
            tax = annual_salary*20/100;
        }
        else if (annual_salary >= 400000){
            System.out.println("Total tax on annual salary will be 15%");
            tax = annual_salary*15/100;
        }
        else if (annual_salary >= 300000){
            System.out.println("Total tax on annual salary will be 10%");
            tax = annual_salary*10/100;
        }
        else if (annual_salary >= 200000){
            System.out.println("Total tax on annual salary will be 5%");
            tax = annual_salary*5/100;
        }
        else {
            System.out.println("No tax is applied on annual salary");
        }
        System.out.println("Total tax on the annual salary is "+tax);
        float present_year = 2020;
        float age = present_year - year_of_birth;
        System.out.println("The age of the employee is "+age);

    }
}
