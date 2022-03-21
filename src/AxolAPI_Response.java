public class AxolAPI_Response {

    private String imageURL;
    private String fact;

    public AxolAPI_Response(String imageURL, String fact){
        this.imageURL = imageURL;
        this.fact = fact;
    }

    public String getImageURL(){
        return imageURL;
    }

    public String getFact(){
        return fact;
    }


}