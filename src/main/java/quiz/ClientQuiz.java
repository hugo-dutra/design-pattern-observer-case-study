package quiz;

import quiz.implementations.ConsolePlatform;
import quiz.implementations.MultipleChoices;
import quiz.implementations.QuizGame;
import quiz.implementations.TrueOrFalseChoices;
import quiz.interfaces.IPlatform;
import quiz.interfaces.IQuestionType;

import java.util.Objects;
import java.util.Scanner;

public class ClientQuiz {
    public static void main(String[] args) {

        String inputScan = "";
        Scanner scan = new Scanner(System.in);
        IPlatform consolePlatform;

        System.out.println("Welcome to the Quiz Game! \n");
        System.out.println("Please choose the type of questions you want to answer: \n");
        System.out.println("1. True or False \n");
        System.out.println("2. Multiple Choices \n");

        int number = scan.nextInt();

        switch (number){
            case 1:
                IQuestionType trueOrFalseQuestions = trueOrFalseQuestions();
                while (!Objects.equals(inputScan, "exit")) {
                    consolePlatform = new ConsolePlatform(trueOrFalseQuestions);
                    QuizGame quiz = new QuizGame(trueOrFalseQuestions, consolePlatform);
                    quiz.play();
                    inputScan = scan.nextLine();
                    if (trueOrFalseQuestions.checkAnswer(inputScan)
                            && !Objects.equals(inputScan.toLowerCase(), "exit")
                            && !Objects.equals(inputScan, "")) {
                        System.out.println("Correct! \n");
                    } else {
                        if (!Objects.equals(inputScan.toLowerCase(), "exit"))
                            System.out.println("Incorrect! \n");
                    }
                }
                break;
            case 2:
                IQuestionType multipleChoiceQuestion  = multipleChoicesQuestions();
                while (!Objects.equals(inputScan.toLowerCase(), "exit")) {
                    consolePlatform = new ConsolePlatform(multipleChoiceQuestion);
                    QuizGame quiz2 = new QuizGame(multipleChoiceQuestion, consolePlatform);
                    quiz2.play();
                    inputScan = scan.nextLine();
                    if (multipleChoiceQuestion.checkAnswer(inputScan)
                            && !Objects.equals(inputScan, "exit")
                            && !Objects.equals(inputScan, "")) {
                        System.out.println("Correct! \n");
                    } else {
                        if (!Objects.equals(inputScan.toLowerCase(), "exit"))
                            System.out.println("Incorrect! \n");
                    }
                }
                break;
            default:
                break;
        }
    }

    private static TrueOrFalseChoices trueOrFalseQuestions(){
        return new TrueOrFalseChoices();
    }

    private static MultipleChoices multipleChoicesQuestions(){
        return new MultipleChoices();
    }



}
