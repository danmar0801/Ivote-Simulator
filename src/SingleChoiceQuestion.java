public class SingleChoiceQuestion implements Question{
    private String questionText;
    private String[] questionAnswers;


    //constructor to init the vars and get them at the creation of the object
    public SingleChoiceQuestion(String questionText, String[] questionsAnswers){
        this.questionText = questionText;
        this.questionAnswers = questionsAnswers;

    }
    // return the question text
    public String getQuestionText() {
        return questionText;
    }
    // retrun the answer bank as an array of strings
    public String[] getCandidateAnswers() {
        return questionAnswers;
    }
    // return a boolen value if the question is true
    public boolean isMultipleChoice() {
        return false;
    }

}
