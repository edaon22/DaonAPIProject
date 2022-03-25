// AxolAPI User Interface
import java.util.Scanner;
public class AxolAPI_UI {
    private Scanner input = new Scanner(System.in);

    public String mainMenuPrompt(){
        boolean validResponse = false;
        String mainResponse = null;

        System.out.println("Welcome to the AxolFacts Tool, where you can get facts and images of axolotls!");
        System.out.println("Would you like an image?");

        while (!validResponse){
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

    public int numFactsPrompt(){
        boolean validResponse = false;
        int numFactsResponse;
        int i = -1;

        System.out.println("How many facts would you like?");
        System.out.println("(Enter a number from 1-3)");

        while (!validResponse){
            try{
                numFactsResponse = input.nextInt();
                i = numFactsResponse;
                if ( i == 1 || i == 2 || i == 3){
                    validResponse = true;
                }
                else{
                    System.out.println("Please input a number from 1 to 3");
                }
            }
            catch(Exception e){
                input.next();
                System.out.println("Please enter integers only.");

            }
        }
        return i;
    }



    public String useAgainPrompt(){
        boolean validResponse = false;
        String useAgainResponse = null;

        while (!validResponse){
            System.out.println();
            System.out.println("Would you like run again?");
            System.out.println("1) Yes");
            System.out.println("2) No");

            input.nextLine();
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