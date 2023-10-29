package factory;

public class MathSubject implements Subject{
    @Override
    public void signUp() {
        System.out.println("You have registered for a math course.");
    }
}
