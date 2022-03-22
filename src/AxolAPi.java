import java.net.URL;
public class AxolAPi {

    private static final String APIURL = "https://axoltlapi.herokuapp.com/";
/*
    public String getData(){
        URL url = new URL(APIURL);
        System.out.println(url);

        //return
    }
*/
    public static void main(String[] args) {

        AxolAPI_UI ui = new AxolAPI_UI();

        boolean keepUsing = true;

        while (keepUsing) {
            String mainResponse = ui.mainMenuPrompt();
            if (mainResponse.equals("1")){
                //yes
                System.out.println("Here is your image and fact:");
                //call getData
                //get and print fact and image URL
                String useAgainResponse = ui.useAgainPrompt();
                if (useAgainResponse.equals("2")){
                    System.out.println(ui.goodbye());
                    keepUsing = false;
                }
            }
            else if (mainResponse.equals("2")){
                //no
                System.out.println("Here is your fact:");
                //call getData
                //get and print fact
                String useAgainResponse = ui.useAgainPrompt();
                if (useAgainResponse.equals("2")){
                    System.out.println(ui.goodbye());
                    keepUsing = false;
                }
            }
            else if (mainResponse.equals("3")){
                System.out.println(ui.goodbye());
                break;
            }
        }
    }
}
