import java.util.Random;

public class Student {
    // declare variables
    String studentID;
    // generate random student ID using a constructor, this will generate a random  string to be the STudent ID
    public Student() {
        Random rand = new Random();
        studentID = String.valueOf(rand.nextInt(10000));
    }

    // return student ID method
    public String getStudentID(){
        return studentID;
    }
}
