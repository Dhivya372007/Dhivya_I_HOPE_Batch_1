import java.util.*;

public class ComparatorImplementation {
    public static void main(String[] args) {
        
        List<Student> s = new ArrayList<>();

        s.add(new Student(10, 15, 20.5));
        s.add(new Student(5, 25, 70.5));
        s.add(new Student(15, 5, 100.0));
        s.add(new Student(10, 18, 90.0));

        Collections.sort(s, new AgeComparator());

        for (Student st : s) {
            System.out.println(st);
        }
    }
}

class Student {
    int rollNo;
    int age;
    double mark;

    Student(int rollNo, int age, double mark) {
        this.rollNo = rollNo;
        this.age = age;
        this.mark = mark;
    }

    public String toString() {
        return rollNo + " " + age + " " + mark;
    }
}
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {

        int res = Integer.compare(s1.rollNo, s2.rollNo);

        if (res == 0) {
            return Double.compare(s2.mark, s1.mark);
        }

        return res;
    }
}
