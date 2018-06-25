package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomRedemption implements Serializable{


    private String authenticationCode;

    public String getAuthenticationCode(){
        return authenticationCode;
    }

    public void setAuthenticationCode(String authenticationCode){
        this.authenticationCode = authenticationCode;
    }

    private String pointsDeducted;

    public String getPointsDeducted(){
        return pointsDeducted;
    }

    public void setPointsDeducted(String pointsDeducted){
        this.pointsDeducted = pointsDeducted;
    }

    private int awardPointsAvailable;

    public int getAwardPointsAvailable(){
        return awardPointsAvailable;
    }

    public void setAwardPointsAvailable(int awardPointsAvailable){
        this.awardPointsAvailable = awardPointsAvailable;
    }

    private String statusCode;

    public String getStatusCode(){
        return statusCode;
    }

    public void setStatusCode(String statusCode){
        this.statusCode = statusCode;
    }

    public static NojoomRedemption fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NojoomRedemption instance = new NojoomRedemption();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setAuthenticationCode(jsonObject.optString("authenticationCode"));
            instance.setPointsDeducted(jsonObject.optString("pointsDeducted"));
            instance.setAwardPointsAvailable(jsonObject.optInt("awardPointsAvailable"));
            instance.setStatusCode(jsonObject.optString("statusCode"));
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