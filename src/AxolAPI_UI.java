// AxolAPI User Interface
import java.util.Scanner;
public class AxolAPI_UI {
    private Scanner input = new Scanner(System.in);

    public String mainMenuPrompt(){
        boolean validResponse = false;
        String mainResponse = null;

        while (!validResponse){
            System.out.println("Welcome to the AxolAPI Tool!");
            System.out.println("Would you like an image with your fact?");
            System.out.println("1) Yes");
            System.out.println("2) No");
            System.out.println("3) Quit");

            mainResponse = input.nextLine().toUpperCase();

            if (mainResponse.equals("1") || mainResponse.equals("2") || mainResponse.equals("3")){
                validResponse = true;
            }
            else {
                System.out.println("Please input a valid response (1, 2, or 3)");
            }
        }
        return mainResponse;
    }

    public String useAgainPrompt(){
        boolean validResponse = false;
        String useAgainResponse = null;

        while (!validResponse){
            System.out.println();
            System.out.println("Would you like run again?");
            System.out.println("1) Yes");
            System.out.println("2) No");

            useAgainResponse = input.nextLine().toUpperCase();

            if (useAgainResponse.equals("1") || useAgainResponse.equals("2")){
                validResponse = true;
            }
            else {
                System.out.println("Please input a valid response (1 or 2)");
            }
        }
        return useAgainResponse;
    }

    public String goodbye(){
        String bye = "Thank you for using. Goodbye.";
        return bye;
    }
}