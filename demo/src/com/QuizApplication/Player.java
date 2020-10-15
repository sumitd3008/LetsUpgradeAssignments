package com.QuizApplication;
import java.util.Scanner;
public class Player {
    Scanner sc = new Scanner(System.in);
    String name;
    int score = 0;
    public void GetDetails(){
        System.out.println("What is your name");
        name = sc.next();
    }
}
