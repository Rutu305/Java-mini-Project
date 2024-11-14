import java.util.Random;
import java.util.Scanner;

public class EVM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] result = new int[6]; // Adjusted to 6 to match the 6 voting options
        int vote, choice;
        
        do {
            System.out.println("---- Parliament Election  24-25 ----");

            System.out.println("Enter choice : ");
            System.out.println("1.Vote\n2. Calculate Result\n3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    do {
                        System.out.println("---- Parliament Election Candidate list 24-25 ----");
                        System.out.println("1. Amit Shinde\t*\n2. Rohit Deshmukh\t+\n3. Kiran Kadam\t/\n4. Neha Patil\t-\n5. Ramesh Bhosale\t>\n6. NOTA\n7. Back to Main Menu");
                        vote = sc.nextInt();

                        if (vote > 0 && vote <= 6) {
                            result[vote - 1]++;
                            System.out.println("Vote recorded for choice " + vote);
                        } else if (vote == 7) {
                            break;
                        } else {
                            System.out.println("Invalid vote. Please try again.");
                        }
                    } while (vote != 7);
                    break;

                case 2:
                    int systemCaptcha = random.nextInt(900000) + 100000; // 6-digit captcha
                    System.out.println("Enter captcha: " + systemCaptcha);
                    int captcha = sc.nextInt();
                    if (captcha == systemCaptcha) {
                        System.out.println("Calculating results...");
                        // Display results sorted
                        for (int i = 0; i < result.length; i++) {
                            System.out.println("Candidate " + (i + 1) + ": " + result[i] + " votes");
                        }
                        choice=3;// Set choice to 3 to exit after displaying results
                    } else {
                        System.out.println("Incorrect captcha. Returning to main menu.");
                    }
                    break;
                    

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        } while (choice != 3);

    }
}
