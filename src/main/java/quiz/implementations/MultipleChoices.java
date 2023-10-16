package quiz.implementations;

import quiz.data.Questions;
import quiz.interfaces.IQuestionType;
import quiz.models.Question;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoices implements IQuestionType {
    private final List<Question> questions = Questions.listOfQuestions();
    private int selectedQuestion;

    @Override
    public void displayQuestion() {
        selectedQuestion = (int) (Math.random() * questions.size());
        Question question = questions.get(selectedQuestion);
        System.out.println(question.question);
    }

    @Override
    public void displayChoices() {
        Question question = questions.get(selectedQuestion);
        for (int i = 0; i < question.choices.length; i++) {
            System.out.println((i + 1) + ". " + question.choices[i]);
        }
    }

    @Override
    public boolean checkAnswer(String answer) {
        if(answer.length() == 1){
            return questions.get(selectedQuestion).answer
                    .equals(questions.get(selectedQuestion).choices[Integer.parseInt(answer) - 1]);
        }else{
            return questions.get(selectedQuestion).answer
                    .equals(answer);
        }
    }
}
