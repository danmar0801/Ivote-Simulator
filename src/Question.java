public interface Question {
    // get question text
    String getQuestionText();
    // get candidate answer
    String[] getCandidateAnswers();
    // is multiple Choise question
    boolean isMultipleChoice();
}
