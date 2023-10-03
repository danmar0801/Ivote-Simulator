import java.util.HashMap;

public class VotingService implements iVotingService{

    private Question question;
    private HashMap<String,String> submissions;

    public VotingService(Question question){
        this.question = question;
        this.submissions = new HashMap<>();

    }
    @Override
    public void submitAnswer(String studentID, String answer) {

    }

    @Override
    public void printResults() {

    }
}
