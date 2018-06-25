package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PUKRetrievalData implements Serializable{


    private String puk1;

    public String getPuk1(){
        return puk1;
    }

    public void setPuk1(String puk1){
        this.puk1 = puk1;
    }

    private String puk2;

    public String getPuk2(){
        return puk2;
    }

    public void setPuk2(String puk2){
        this.puk2 = puk2;
    }

    public static PUKRetrievalData fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        PUKRetrievalData instance = new PUKRetrievalData();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPuk1(jsonObject.optString("puk1"));
            instance.setPuk2(jsonObject.optString("puk2"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public static Date parseDate(JSONObject jsonObject, String key){
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(jsonObject.optString(key));
        } catch (ParseException e) {
            return null;
        }
    }
}