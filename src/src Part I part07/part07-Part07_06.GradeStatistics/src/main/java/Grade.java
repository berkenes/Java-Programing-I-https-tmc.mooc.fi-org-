import java.util.ArrayList;

public class Grade {
    private ArrayList<Integer> grades;

    public Grade() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int gradeAdd) {
        if (gradeAdd >= 0 && gradeAdd <= 100) {
            this.grades.add(gradeAdd);
        }
    }

    public String gradeAverage() {
        int sum = 0;
        double result = 0;
        for (int grade : grades) {
            sum += grade;
        }
        result = 1.0 * sum / grades.size();
        return result + "";
    }

    public String passingGrade() {
        int sum = 0;
        double result = 0;
        int passingCount = 0;
        for (int grade : grades) {
            if (grade > 49) {
                sum += grade;
                passingCount++;
            }

        }
        result = 1.0 * sum / passingCount;
        if (sum == 0) {
            return "-";
        } else {
            return result + "";
        }
    }

    public String passingPercentage() {
        int passingCount = 0;
        double percentage = 0;
        for (int grade : grades) {
            if (grade > 49) {
                passingCount++;
            }
        }
        percentage = 100.0 * passingCount / grades.size();
        return percentage + "";
    }

    public void gradeDistribution() {
        int[] gradeDistArr = new int[6]; // 0-5 adding the point
        for (int grade : grades) {
            if (grade < 0 || grade > 100) {
                continue;
            } else if (grade <= 49) {
                gradeDistArr[0]++;
            } else if (grade <= 59 && grade > 49) {
                gradeDistArr[1]++;
            } else if (grade <= 69 && grade > 59) {
                gradeDistArr[2]++;
            } else if (grade <= 79 && grade > 59) {
                gradeDistArr[3]++;
            } else if (grade <= 89 && grade > 79) {
                gradeDistArr[4]++;
            } else {
                gradeDistArr[5]++;
            }

        }
        System.out.println("Grade distribution:");
        int index = 0;
        for (int a : gradeDistArr) {
            System.out.print(index + ":");

            for (int i = 0; i < a; i++){
                System.out.print("*");
            }
            System.out.print("\n");
            index++;
        }
    }
    public void print(){
        System.out.println("Point average (all): " + this.gradeAverage());
        System.out.println("Point average (passing): " + this.passingGrade());
        System.out.println("Pass percentage: " + this.passingPercentage());
        gradeDistribution();
    }
}
