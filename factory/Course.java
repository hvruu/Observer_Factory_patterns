package factory;
import java.util.Scanner;

public class Course {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which educational course do you want to enroll in?");
        String choice = scanner.nextLine();
        SubjectFactory subjectFactory = createSubjectOfNecessity(choice);
        Subject subject = subjectFactory.createSubject();

        subject.signUp();
    }

    static SubjectFactory createSubjectOfNecessity(String subj){
        if(subj.equalsIgnoreCase("physics")){
            return new PhysicsSubjectFactory();
        } else if (subj.equalsIgnoreCase("math")) {
            return new MatSubjectFactory();
        } else if (subj.equalsIgnoreCase("informatics")) {
            return new InfoSubjectFactory();
        } else{
            throw new RuntimeException("we don't have a course like " + subj +" yet");
        }
    }
}