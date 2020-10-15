package com.QuizApplication;
public class Game {
    Questions[] questions = new Questions[3];
    public void initgame(){
        for(int i=0;i<3;i++){
            questions[i]=new Questions();
        }
        questions[0].Question="What is the capital of India";
        questions[0].Option1="Mumbai";
        questions[0].Option2="Kolkata";
        questions[0].Option3="Delhi";
        questions[0].Option4="Chennai";
        questions[0].CorrectAnswer=3;

        questions[1].Question="Who won the ICC ODI cricket world cup in 2011";
        questions[1].Option1="South Africa";
        questions[1].Option2="India";
        questions[1].Option3="England";
        questions[1].Option4="Australia";
        questions[1].CorrectAnswer=2;

        questions[2].Question="Who died in the movie Avengers:Endgame";
        questions[2].Option1="Thor";
        questions[2].Option2="Hulk";
        questions[2].Option3="Hawk eye";
        questions[2].Option4="Ironman";
        questions[2].CorrectAnswer=4;
    }
    Player player = new Player();
    public void play(){
        player.GetDetails();
        for(int i=0;i<3;i++){
            boolean status = questions[i].AskQuestions();
            if(status==true){
                System.out.println("Your answer is correct");
                player.score++;
            }
            else{
                System.out.println("Your answer is wrong");
        }
            System.out.println(player.name+" your score is "+player.score);
        }
    }
}
