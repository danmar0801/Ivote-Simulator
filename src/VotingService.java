import java.util.HashMap;
import java.util.List;

public class VotingService implements iVotingService{

    private Question question;
    private HashMap<String, List<String>> submissions;

    public VotingService(Question question){
        this.question = question;
        this.submissions = new HashMap<>();

    }

    public void submitAnswer(String studentID, List<String> answer) {
        // Check if the question is Multi choice,
        // or check if the student has at least only one answer because both types should have at least one answer
        if (question.isMultipleChoice() || answer.size() == 1){
            submissions.put(studentID,answer);
        }
        // else the question submission is invalid
        else {
            System.out.println("Invalid answer submitted, please try again");
        }

    }

    @Override
    public void printResults() {
        // To hold all the valuesCounts for the answers
        HashMap<String,Integer> results = new HashMap<>();
        //loop the through the submissions hashmap
        for (List<String> studentAnswers : submissions.values()){
            //loop the answer list for each student
            for (String answer : studentAnswers){
                // This lin updates the count for each answer
                // the getOrdefault Methode gets the current count for a given answer; if the answer does not yet exist, will set default value to 0 +1
                results.put(answer, results.getOrDefault(answer, 0) + 1);
            }
        }
        System.out.println("Results:");
        for (String answer : results.keySet()) {
            System.out.println(answer + " : " + results.get(answer));
        }


    }

    public String[] returnAnswerBank() {
        String[] answerBank = question.getCandidateAnswers();
        return answerBank;
    }

    public Integer returnAnswerBankLength() {
        return null;
    }
}
