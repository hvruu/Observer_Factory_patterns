package factory;

public class InfoSubject implements Subject{
    @Override
    public void signUp() {
        System.out.println("You have registered for a computer science course.");
    }
}
