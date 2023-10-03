public class SingleChoiceQuestion implements Question{
    @Override
    public String getQuestionText() {
        return null;
    }

    @Override
    public String[] getCandidateAnswers() {
        return new String[0];
    }

    @Override
    public boolean isMultipleChoice() {
        return false;
    }
}
