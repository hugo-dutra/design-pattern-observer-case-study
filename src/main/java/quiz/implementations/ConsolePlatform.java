package quiz.implementations;

import quiz.interfaces.IPlatform;
import quiz.interfaces.IQuestionType;

public class ConsolePlatform implements IPlatform {
    private final IQuestionType questionType;

    public ConsolePlatform(IQuestionType questionType) {
        this.questionType = questionType;
    }

    @Override
    public void showQuestions() {
        questionType.displayQuestion();
    }

    @Override
    public void showChoices() {
        questionType.displayChoices();
    }
}
