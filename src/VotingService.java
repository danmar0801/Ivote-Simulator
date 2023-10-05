import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class VotingService implements iVotingService{

    private Question question;
    private HashMap<String, List<String>> submissions;
    // constructor to get the values of the values when an object is created, and to init the hashmap
    public VotingService(Question question){
        this.question = question;
        this.submissions = new HashMap<>();

    }
    // submits answer into hashmap submissions
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
    // print the results
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
        // loop through the results hashmap to print the results
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
        Integer length = question.getCandidateAnswers().length;
        return length;
    }

    public String genSingleChoiceAnswer(){
        // pick a random number between 0 and the upper limit of the answer back, if the question has two answers it would be 1, if it has 4 answers it will be 3
        Random rand = new Random();
        int num = rand.nextInt(returnAnswerBankLength());
        // pick the answer from the bank that matches with the with number
        String answer = returnAnswerBank()[num];
        return answer;
    }

    @Override
    public List<String> genMultiChoiceAnswer() {
        List<String> randomAnswers = new ArrayList<>();
        Random rand = new Random();
        String[] answersBank = returnAnswerBank();
        for (String answer : answersBank) {
            if (rand.nextBoolean()) {
                randomAnswers.add(answer);
            }
        }
        // Ensure that the student has at least one answer
        if (randomAnswers.isEmpty()) {
            randomAnswers.add(answersBank[rand.nextInt(answersBank.length)]);
        }
        return randomAnswers;
    }
}
