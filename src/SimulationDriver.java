import java.util.Arrays;

public class SimulationDriver {

    public static void main(String[] args) {
        Student student = new Student();
        String ID = student.getStudentID();
        System.out.println(ID);
        // test out the multi question
        MultiChoiceQuestion msq = new MultiChoiceQuestion("what is the capital of italy",
                new String[]{"Paris","Rome","Washington","Los Angeles"});
        System.out.println(msq.getQuestionText());
        System.out.println(Arrays.toString(msq.getCandidateAnswers()));
        System.out.println(msq.isMultipleChoice());
        SingleChoiceQuestion scq = new SingleChoiceQuestion("what is the banana called",
                new String[]{"banana","not banana"});
        System.out.println(scq.getQuestionText());
        System.out.println(Arrays.toString(scq.getCandidateAnswers()));
        System.out.println(scq.isMultipleChoice());

    }
}
