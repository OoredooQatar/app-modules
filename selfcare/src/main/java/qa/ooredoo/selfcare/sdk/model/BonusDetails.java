package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BonusDetails implements Serializable{


    private String bonusId;

    public String getBonusId(){
        return bonusId;
    }

    public void setBonusId(String bonusId){
        this.bonusId = bonusId;
    }

    private String bonusValue;

    public String getBonusValue(){
        return bonusValue;
    }

    public void setBonusValue(String bonusValue){
        this.bonusValue = bonusValue;
    }

    private String bonusExpiry;

    public String getBonusExpiry(){
        return bonusExpiry;
    }

    public void setBonusExpiry(String bonusExpiry){
        this.bonusExpiry = bonusExpiry;
    }

    private String bonusClosestValue;

    public String getBonusClosestValue(){
        return bonusClosestValue;
    }

    public void setBonusClosestValue(String bonusClosestValue){
        this.bonusClosestValue = bonusClosestValue;
    }

    private String bonusClosestExpiry;

    public String getBonusClosestExpiry(){
        return bonusClosestExpiry;
    }

    public void setBonusClosestExpiry(String bonusClosestExpiry){
        this.bonusClosestExpiry = bonusClosestExpiry;
    }

    public static BonusDetails fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        BonusDetails instance = new BonusDetails();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setBonusId(jsonObject.optString("bonusId"));
            instance.setBonusValue(jsonObject.optString("bonusValue"));
            instance.setBonusExpiry(jsonObject.optString("bonusExpiry"));
            instance.setBonusClosestValue(jsonObject.optString("bonusClosestValue"));
            instance.setBonusClosestExpiry(jsonObject.optString("bonusClosestExpiry"));
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