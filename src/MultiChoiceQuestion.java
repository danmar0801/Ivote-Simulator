public class MultiChoiceQuestion implements Question{
    private String questionText;
    private String[] questionsANswers;


    public MultiChoiceQuestion(String questionText, String[] questionsAnswers){
        this.questionText = questionText;
        this.questionsANswers = questionsAnswers;

    }
    public String getQuestionText() {
        return questionText;
    }

    public String[] getCandidateAnswers() {
        return questionsANswers;
    }

    public boolean isMultipleChoice() {
        return true;
    }
}
