import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
public class AxolAPI_Response {

    private static final String APIURL = "https://axoltlapi.herokuapp.com/";
    private String imageURL;
    private String fact;

    public String getImageURL(){ return imageURL;}

    public String getFact(){ return fact;}

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
        }
        catch(Exception e) {
        return false;
        }
    }
    /*
    AxolAPI_Response dataRequest = new AxolAPI_Response();

    String imageUrl = dataRequest.getImageURL();
    String destinationFile = "image.jpg";
    */

    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
        URL url = new URL(imageUrl);
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(destinationFile);

        byte[] b = new byte[2048];
        int length;

        while ((length = is.read(b)) != -1) {
            os.write(b, 0, length);
        }

        is.close();
        os.close();
    }
    public void cleanUp(String destinationFile){
        File image = new File(destinationFile);
            if (image.delete()) {
                System.out.println("Deleted the image file.");
            }
            else {
                System.out.println("Failed to delete the image file.");
            }
    }


}