public class AxolAPi {

    private static final String APIURL = "https://axoltlapi.herokuapp.com/";
    public static void main(String[] args) throws Exception{

        AxolAPI_UI ui = new AxolAPI_UI();

        boolean keepUsing = true;
        AxolAPI_Response dataRequest = new AxolAPI_Response();

        while (keepUsing) {
            String mainResponse = ui.mainMenuPrompt();
            if (mainResponse.equals("1")){ //yes image
                int numFacts = ui.numFactsPrompt();
                if (numFacts == 1){
                    System.out.println("Here is your image and fact:");
                }
                else if (numFacts > 1 && numFacts <= 5){
                    System.out.println("Here is your image and " + numFacts + " facts:");
                }
                if (dataRequest.getData()){
                    for (int i = 0; i < numFacts; i++){
                        dataRequest.getData();
                        System.out.println(dataRequest.getFact());
                    }
                    System.out.println(dataRequest.getImageURL());
                }

                String useAgainResponse = ui.useAgainPrompt();
                if (useAgainResponse.equals("2")){
                    System.out.println(ui.goodbye());
                    keepUsing = false;
                }
            }
            else if (mainResponse.equals("2")){ //no image
                int numFacts = ui.numFactsPrompt();
                if (numFacts == 1){
                    System.out.println("Here is your fact:");
                }
                else if (numFacts > 1 && numFacts <= 5){
                    System.out.println("Here are your " + numFacts + " facts:");
                }
                if (dataRequest.getData()){
                    for (int i = 0; i < numFacts; i++){
                        dataRequest.getData();
                        System.out.println(dataRequest.getFact());
                    }
                }
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
