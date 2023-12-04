
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradePoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradePoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.gradePoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        }
        int sum = 0;
        int totalNumber = grades.size();

        for (int grade : grades) {
            sum += grade;
        }
        return 1.0 * sum / totalNumber;
    }

    public double averageOfPoints() {
        double average = 0;
        int sum = 0;
        if (gradePoints.isEmpty()) {
            average = -1;
        } else {
            int totalNumber = gradePoints.size();
            for (int gradePoints : gradePoints) {
                sum += gradePoints;
            }
            average = 1.0 * sum / totalNumber;
        }
        return average;
    }
}
