import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SimulationDriver {

    public static void main(String[] args) {
        // make question
        //Question question = new MultiChoiceQuestion("Question #1: ", new String[]{"A","B","C","D"});
        Question question = new SingleChoiceQuestion("questions Text", new String[]{"1. True","2.False"});

        // configure the votingService to the question
        VotingService ivote = new VotingService(question);
        // create 100 student and simulate their answers
        for (int i = 1 ; i<11; i++){
            // create random student
            Student student = new Student();

            // list to hold their answers
            List<String> answers = new ArrayList<>();

            // gen an answer for the single choice question
            if (!question.isMultipleChoice()){
                // add answer to answer list
                answers.add(ivote.genSingleChoiceAnswer());
            }
            // gen an answer for the multi choice question
            else if (question.isMultipleChoice()){
                // add answer to answer list
                answers.addAll(ivote.genMultiChoiceAnswer());
            }


            // submit their answer
            ivote.submitAnswer(student.getStudentID(), answers);
        }


        // output the Results
        ivote.printResults();

    }
}
