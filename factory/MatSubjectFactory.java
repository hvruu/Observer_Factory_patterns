package factory;

public class MatSubjectFactory implements SubjectFactory{
    @Override
    public Subject createSubject() {
        return new MathSubject();
    }
}
