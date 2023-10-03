public class SingleChoiceQuestion implements Question{
    private String questionText;
    private String[] questionAnswers;

    public SingleChoiceQuestion(String questionText, String[] questionsAnswers){
        this.questionText = questionText;
        this.questionAnswers = questionsAnswers;

    }
    public String getQuestionText() {
        return questionText;
    }

    public String[] getCandidateAnswers() {
        return questionAnswers;
    }

    public boolean isMultipleChoice() {
        return false;
    }

}
