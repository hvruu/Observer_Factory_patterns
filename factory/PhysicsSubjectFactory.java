package factory;

public class PhysicsSubjectFactory implements SubjectFactory{
    @Override
    public Subject createSubject() {
        return new PhysicsSubject();
    }
}
