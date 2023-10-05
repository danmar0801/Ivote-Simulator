import java.util.List;

public interface iVotingService {

    void submitAnswer(String studentID, List<String> answer);
    void printResults();

    String[] returnAnswerBank();
    Integer returnAnswerBankLength();
}
