package quiz.interfaces;

public interface IQuestionType {
    public void displayQuestion();
    public void displayChoices();
    public boolean checkAnswer(String answer);
}
