package pl.infoshare.structures._4_sets._1_comparing;

public class Student implements Comparable<Student> {

    private String name;
    private double avarageScore;

    public Student(String name, int avarageScore) {
        this.name = name;
        this.avarageScore = avarageScore;
    }

    public String getName() {
        return name;
    }

    public double getAvarageScore() {
        return avarageScore;
    }

    @Override
    public int compareTo(Student o) {
        if (avarageScore > o.avarageScore) {
            return 1;
        }
        if (avarageScore < o.avarageScore) {
            return -1;
        }
        return 0;
    }
}
