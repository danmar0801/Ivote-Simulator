public class MultiChoiceQuestion implements Question{
    private String questionText;
    private String[] questionsAnswers;


    public MultiChoiceQuestion(String questionText, String[] questionsAnswers){
        this.questionText = questionText;
        this.questionsAnswers = questionsAnswers;

    }
    public String getQuestionText() {
        return questionText;
    }

    public String[] getCandidateAnswers() {
        return questionsAnswers;
    }

    public boolean isMultipleChoice() {
        return true;
    }
}
