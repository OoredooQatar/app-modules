package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomReward implements Serializable{


    private String awardID;

    public String getAwardID(){
        return awardID;
    }

    public void setAwardID(String awardID){
        this.awardID = awardID;
    }

    private String awardName;

    public String getAwardName(){
        return awardName;
    }

    public void setAwardName(String awardName){
        this.awardName = awardName;
    }

    private String awardImagePath;

    public String getAwardImagePath(){
        return awardImagePath;
    }

    public void setAwardImagePath(String awardImagePath){
        this.awardImagePath = awardImagePath;
    }

    private String imageData;

    public String getImageData(){
        return imageData;
    }

    public void setImageData(String imageData){
        this.imageData = imageData;
    }

    private String redemptionInputType;

    public String getRedemptionInputType(){
        return redemptionInputType;
    }

    public void setRedemptionInputType(String redemptionInputType){
        this.redemptionInputType = redemptionInputType;
    }

    private String webExplanation;

    public String getWebExplanation(){
        return webExplanation;
    }

    public void setWebExplanation(String webExplanation){
        this.webExplanation = webExplanation;
    }

    private String otherExplanation;

    public String getOtherExplanation(){
        return otherExplanation;
    }

    public void setOtherExplanation(String otherExplanation){
        this.otherExplanation = otherExplanation;
    }

    private String lastExplanation;

    public String getLastExplanation(){
        return lastExplanation;
    }

    public void setLastExplanation(String lastExplanation){
        this.lastExplanation = lastExplanation;
    }

    private int pointsRequired;

    public int getPointsRequired(){
        return pointsRequired;
    }

    public void setPointsRequired(int pointsRequired){
        this.pointsRequired = pointsRequired;
    }

    private String awardValue;

    public String getAwardValue(){
        return awardValue;
    }

    public void setAwardValue(String awardValue){
        this.awardValue = awardValue;
    }

    public static NojoomReward fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NojoomReward instance = new NojoomReward();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setAwardID(jsonObject.optString("awardID"));
            instance.setAwardName(jsonObject.optString("awardName"));
            instance.setAwardImagePath(jsonObject.optString("awardImagePath"));
            instance.setImageData(jsonObject.optString("imageData"));
            instance.setRedemptionInputType(jsonObject.optString("redemptionInputType"));
            instance.setWebExplanation(jsonObject.optString("webExplanation"));
            instance.setOtherExplanation(jsonObject.optString("otherExplanation"));
            instance.setLastExplanation(jsonObject.optString("lastExplanation"));
            instance.setPointsRequired(jsonObject.optInt("pointsRequired"));
            instance.setAwardValue(jsonObject.optString("awardValue"));
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