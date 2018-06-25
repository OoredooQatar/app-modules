package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomActivity implements Serializable{


    private Date activityDate;

    public Date getActivityDate(){
        return activityDate;
    }

    public void setActivityDate(Date activityDate){
        this.activityDate = activityDate;
    }

    private String type;

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    private double numberOfAwardPoints;

    public double getNumberOfAwardPoints(){
        return numberOfAwardPoints;
    }

    public void setNumberOfAwardPoints(double numberOfAwardPoints){
        this.numberOfAwardPoints = numberOfAwardPoints;
    }

    private double numberOfTierPoints;

    public double getNumberOfTierPoints(){
        return numberOfTierPoints;
    }

    public void setNumberOfTierPoints(double numberOfTierPoints){
        this.numberOfTierPoints = numberOfTierPoints;
    }

    private String explanation;

    public String getExplanation(){
        return explanation;
    }

    public void setExplanation(String explanation){
        this.explanation = explanation;
    }

    private String partnerCompany;

    public String getPartnerCompany(){
        return partnerCompany;
    }

    public void setPartnerCompany(String partnerCompany){
        this.partnerCompany = partnerCompany;
    }

    private String activityClassification;

    public String getActivityClassification(){
        return activityClassification;
    }

    public void setActivityClassification(String activityClassification){
        this.activityClassification = activityClassification;
    }

    public static NojoomActivity fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NojoomActivity instance = new NojoomActivity();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setActivityDate(parseDate(jsonObject,"activityDate"));
            instance.setType(jsonObject.optString("type"));
            instance.setNumberOfAwardPoints(jsonObject.optDouble("numberOfAwardPoints"));
            instance.setNumberOfTierPoints(jsonObject.optDouble("numberOfTierPoints"));
            instance.setExplanation(jsonObject.optString("explanation"));
            instance.setPartnerCompany(jsonObject.optString("partnerCompany"));
            instance.setActivityClassification(jsonObject.optString("activityClassification"));
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