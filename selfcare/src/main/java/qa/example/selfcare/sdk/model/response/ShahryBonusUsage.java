package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShahryBonusUsage implements Serializable{


    private String totalRemaining;

    public String getTotalRemaining(){
        return totalRemaining;
    }

    public void setTotalRemaining(String totalRemaining){
        this.totalRemaining = totalRemaining;
    }

    private String closestRemaining;

    public String getClosestRemaining(){
        return closestRemaining;
    }

    public void setClosestRemaining(String closestRemaining){
        this.closestRemaining = closestRemaining;
    }

    private String totalRemainingExpiry;

    public String getTotalRemainingExpiry(){
        return totalRemainingExpiry;
    }

    public void setTotalRemainingExpiry(String totalRemainingExpiry){
        this.totalRemainingExpiry = totalRemainingExpiry;
    }

    private String closestRemainingExpiry;

    public String getClosestRemainingExpiry(){
        return closestRemainingExpiry;
    }

    public void setClosestRemainingExpiry(String closestRemainingExpiry){
        this.closestRemainingExpiry = closestRemainingExpiry;
    }

    private String totalUnit;

    public String getTotalUnit(){
        return totalUnit;
    }

    public void setTotalUnit(String totalUnit){
        this.totalUnit = totalUnit;
    }

    private String closestUnit;

    public String getClosestUnit(){
        return closestUnit;
    }

    public void setClosestUnit(String closestUnit){
        this.closestUnit = closestUnit;
    }

    private String bonusTitle;

    public String getBonusTitle(){
        return bonusTitle;
    }

    public void setBonusTitle(String bonusTitle){
        this.bonusTitle = bonusTitle;
    }

    private String bonusName;

    public String getBonusName(){
        return bonusName;
    }

    public void setBonusName(String bonusName){
        this.bonusName = bonusName;
    }

    private String bonusSegement;

    public String getBonusSegement(){
        return bonusSegement;
    }

    public void setBonusSegement(String bonusSegement){
        this.bonusSegement = bonusSegement;
    }

    public static ShahryBonusUsage fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ShahryBonusUsage instance = new ShahryBonusUsage();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setTotalRemaining(jsonObject.optString("totalRemaining"));
            instance.setClosestRemaining(jsonObject.optString("closestRemaining"));
            instance.setTotalRemainingExpiry(jsonObject.optString("totalRemainingExpiry"));
            instance.setClosestRemainingExpiry(jsonObject.optString("closestRemainingExpiry"));
            instance.setTotalUnit(jsonObject.optString("totalUnit"));
            instance.setClosestUnit(jsonObject.optString("closestUnit"));
            instance.setBonusTitle(jsonObject.optString("bonusTitle"));
            instance.setBonusName(jsonObject.optString("bonusName"));
            instance.setBonusSegement(jsonObject.optString("bonusSegement"));
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