package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HalaNonStopUsage implements Serializable{


    private String packName;

    public String getPackName(){
        return packName;
    }

    public void setPackName(String packName){
        this.packName = packName;
    }

    private String closestExpiryData;

    public String getClosestExpiryData(){
        return closestExpiryData;
    }

    public void setClosestExpiryData(String closestExpiryData){
        this.closestExpiryData = closestExpiryData;
    }

    private String closestExpiryDate;

    public String getClosestExpiryDate(){
        return closestExpiryDate;
    }

    public void setClosestExpiryDate(String closestExpiryDate){
        this.closestExpiryDate = closestExpiryDate;
    }

    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public static HalaNonStopUsage fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        HalaNonStopUsage instance = new HalaNonStopUsage();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPackName(jsonObject.optString("packName"));
            instance.setClosestExpiryData(jsonObject.optString("closestExpiryData"));
            instance.setClosestExpiryDate(jsonObject.optString("closestExpiryDate"));
            instance.setDescription(jsonObject.optString("description"));
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