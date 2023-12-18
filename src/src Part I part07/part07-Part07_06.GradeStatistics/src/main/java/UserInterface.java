import java.util.Scanner;

public class UserInterface {
    private Grade grade;
    private Scanner scanner;

    public UserInterface(Grade grade, Scanner scanner) {
        this.grade = grade;
        this.scanner = scanner;
    }
    public void start(){
        while (true){
            System.out.println("Enter point totals,-1 stops");
            int point = Integer.valueOf(scanner.nextLine());
            if(point == -1){
                grade.print();
                break;
            }
           else {
                grade.addGrade(point);
            }
        }
    }
}
