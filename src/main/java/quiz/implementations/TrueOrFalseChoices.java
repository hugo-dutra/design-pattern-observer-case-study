package quiz.implementations;

import quiz.data.Questions;
import quiz.interfaces.IQuestionType;
import quiz.models.Question;

import java.awt.geom.QuadCurve2D;
import java.util.List;
import java.util.Objects;

public class TrueOrFalseChoices implements IQuestionType {
    private final List<Question> questions = Questions.listOfQuestions();
    private Question question;
    private String choice;
    @Override
    public void displayQuestion() {
        int selectedQuestion = (int) (Math.random() * questions.size());
        question = questions.get(selectedQuestion);
        int randonQuestionChoice = (int) (Math.random() * question.choices.length - 1);
        choice = question.choices[randonQuestionChoice];
        System.out.println(question.question + ", " + choice+" ?");
    }

    @Override
    public void displayChoices() {
        System.out.println("True or False");
    }

    @Override
    public boolean checkAnswer(String answer) {
        boolean correctResponse = (Objects.equals(choice.toLowerCase(), question.answer.toLowerCase()));
        System.out.println("Correct answer is: " + correctResponse + " | " + question.answer.toLowerCase());
        return (Objects.equals(Boolean.parseBoolean(answer) , true) && correctResponse)
                || (Objects.equals(Boolean.parseBoolean(answer), false) && !correctResponse);
    }
}
