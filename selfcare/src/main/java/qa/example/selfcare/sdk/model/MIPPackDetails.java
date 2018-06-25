package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MIPPackDetails implements Serializable{


    private String packName;

    public String getPackName(){
        return packName;
    }

    public void setPackName(String packName){
        this.packName = packName;
    }

    private String remainingData;

    public String getRemainingData(){
        return remainingData;
    }

    public void setRemainingData(String remainingData){
        this.remainingData = remainingData;
    }

    private String maxData;

    public String getMaxData(){
        return maxData;
    }

    public void setMaxData(String maxData){
        this.maxData = maxData;
    }

    public static MIPPackDetails fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        MIPPackDetails instance = new MIPPackDetails();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPackName(jsonObject.optString("packName"));
            instance.setRemainingData(jsonObject.optString("remainingData"));
            instance.setMaxData(jsonObject.optString("maxData"));
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