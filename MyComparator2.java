import java.util.Comparator;

public class MyComparator2 implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.charAt(0) < s2.charAt(0))
            return -1;
        else if(s1.charAt(0) > s2.charAt(0))
            return 1;
        else
            return Integer.compare(s1.length(), s2.length());
    }
}