import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.*;
public class AxolAPI_Response {

    private static final String APIURL = "https://axoltlapi.herokuapp.com/";
    private String imageURL;
    private String fact;
/*
    public AxolAPI_Response(String imageURL, String fact){
        this.imageURL = imageURL;
        this.fact = fact;
    }
*/
    public boolean getData() {
    try {
        URL url = new URL(APIURL);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));

        JSONParser parser = new JSONParser();
        JSONObject axolData = (JSONObject) parser.parse(in);

        fact = (String) axolData.get("facts");
        imageURL = (String) axolData.get("url");

        return true;
    }catch(Exception e) {
        return false;
    }
    }





    public String getImageURL(){
        return imageURL;
    }

    public String getFact(){
        return fact;
    }


}