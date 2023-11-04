
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String teamName = scan.nextLine().toLowerCase();
        int games = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String[] fileSplit = scanFile.nextLine().split(",");
                if (fileSplit.equals("")) {
                    continue;
                }
                String team = fileSplit[0].trim();
                String gastTeam = fileSplit[1].trim();
                int teamPoint = Integer.valueOf(fileSplit[2].trim());
                int gastPoint = Integer.valueOf(fileSplit[3].trim());
                if (teamName.equals(team.toLowerCase())) {
                    games++;
                    if (teamPoint > gastPoint) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (teamName.equals(gastTeam.toLowerCase())) {
                    games++;
                    if (gastPoint > teamPoint) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}
