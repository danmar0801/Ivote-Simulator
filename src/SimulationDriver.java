import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SimulationDriver {

    public static void main(String[] args) {
        // make question
        Question question = new MultiChoiceQuestion("Question #1: ",
                new String[]{"A","B","C","D"});
        Question singleQuestion = new SingleChoiceQuestion("questions Text",
                new String[]{"1. True","2.False"});

        // these values are need to generate the random answers for the students
        // the answer bank, this will help us to pick the answer to submit
        String[] answerBank = question.getCandidateAnswers();
        // the answer bank length, this will allow us to set the upper limit of random numbers to gen
        Integer answerBankLength = answerBank.length;


        // configure the votingService to the question
        VotingService ivote = new VotingService(singleQuestion);
        // create 100 student and simulate their answers
        for (int i = 1 ; i<11; i++){
            // create random student
            Student student = new Student();

            // generate a random answer for them
            // list to hold their answers
            List<String> answers = new ArrayList<>();
            // pick a random number between 0 and the upper limit of the answer back, if the question has two answers it would be 1, if it has 4 answers it will be 3
            Random rand = new Random();
            int num = rand.nextInt(answerBankLength);
            // pick the answer from the bank that matches with the with number
            String answer = answerBank[num];
            answers.add(answer);

            // submit their answer
            ivote.submitAnswer(student.getStudentID(), answers);
        }


        // output the Results
        ivote.printResults();

    }
}
