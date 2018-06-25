package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomStatementDetail implements Serializable{


    private Date statementDate;

    public Date getStatementDate(){
        return statementDate;
    }

    public void setStatementDate(Date statementDate){
        this.statementDate = statementDate;
    }

    private String statementDescription;

    public String getStatementDescription(){
        return statementDescription;
    }

    public void setStatementDescription(String statementDescription){
        this.statementDescription = statementDescription;
    }

    private int awardPointsAvailable;

    public int getAwardPointsAvailable(){
        return awardPointsAvailable;
    }

    public void setAwardPointsAvailable(int awardPointsAvailable){
        this.awardPointsAvailable = awardPointsAvailable;
    }

    private int awardPointsOnHold;

    public int getAwardPointsOnHold(){
        return awardPointsOnHold;
    }

    public void setAwardPointsOnHold(int awardPointsOnHold){
        this.awardPointsOnHold = awardPointsOnHold;
    }

    private int statusPoints;

    public int getStatusPoints(){
        return statusPoints;
    }

    public void setStatusPoints(int statusPoints){
        this.statusPoints = statusPoints;
    }

    public static NojoomStatementDetail fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NojoomStatementDetail instance = new NojoomStatementDetail();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setStatementDate(parseDate(jsonObject,"statementDate"));
            instance.setStatementDescription(jsonObject.optString("statementDescription"));
            instance.setAwardPointsAvailable(jsonObject.optInt("awardPointsAvailable"));
            instance.setAwardPointsOnHold(jsonObject.optInt("awardPointsOnHold"));
            instance.setStatusPoints(jsonObject.optInt("statusPoints"));
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