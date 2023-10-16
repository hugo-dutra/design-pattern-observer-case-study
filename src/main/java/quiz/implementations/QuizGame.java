package quiz.implementations;

import quiz.interfaces.IPlatform;
import quiz.interfaces.IQuestionType;

public class QuizGame {
    private IQuestionType questionType;
    private IPlatform platform;

    public QuizGame(IQuestionType questionType, IPlatform platform) {
        this.questionType = questionType;
        this.platform = platform;
    }

    public void play() {
        platform.showQuestions();
        platform.showChoices();
    }

}
