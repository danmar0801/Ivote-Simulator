public class MultiChoiceQuestion implements Question{
    private String questionText;
    private String[] questionsAnswers;

    // constructor to get the values for the var when the object is created
    public MultiChoiceQuestion(String questionText, String[] questionsAnswers){
        this.questionText = questionText;
        this.questionsAnswers = questionsAnswers;

    }
    // return the questions text
    public String getQuestionText() {
        return questionText;
    }
    //return the answer bank
    public String[] getCandidateAnswers() {
        return questionsAnswers;
    }
    // return true if the question is mutli
    public boolean isMultipleChoice() {
        return true;
    }
}
