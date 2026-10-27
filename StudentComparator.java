import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int compValue =  Integer.compare(s1.getId(), s2.getId());
        if (compValue != 0)
            return compValue;
        return Integer.compare( s1.getLastName().length(), 
               s2.getLastName().length());
    }
}