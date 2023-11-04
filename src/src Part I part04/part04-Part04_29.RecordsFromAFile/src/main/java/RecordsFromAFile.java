
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try(Scanner fileName = new Scanner(Paths.get(file))){
            while (fileName.hasNextLine()){
              String[] line = fileName.nextLine().split(",");
             /* if(line.length!=2){
                  continue;
              }

              */
              String name = line [0];
              int age = Integer.valueOf(line[1]);

                System.out.println( name + ", age: " + age + " years");

        }

        }
        catch (Exception e){
            System.out.println("Fie was not able to be read" + e.getMessage());
        }
    }
}
