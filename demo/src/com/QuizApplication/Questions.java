package com.QuizApplication;
import java.util.Scanner;
public class Questions {
    Scanner sc = new Scanner(System.in);
    String Question,Option1,Option2,Option3,Option4;
    int CorrectAnswer,UserAnswer;
    public boolean AskQuestions(){
        System.out.println(Question);
        System.out.println("1."+Option1);
        System.out.println("2."+Option2);
        System.out.println("3."+Option3);
        System.out.println("4."+Option4);
        UserAnswer = sc.nextInt();
        if (UserAnswer==CorrectAnswer){
           return true;
        }
        return false;
    }
}
