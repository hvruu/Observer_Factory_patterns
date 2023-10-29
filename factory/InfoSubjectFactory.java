package factory;

public class InfoSubjectFactory implements SubjectFactory{
    @Override
    public Subject createSubject() {
        return new InfoSubject();
    }
}
