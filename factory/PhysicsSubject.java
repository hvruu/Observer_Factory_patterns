package factory;

public class PhysicsSubject implements Subject{

    @Override
    public void signUp() {
        System.out.println("You have registered for a physics course.");
    }
}
