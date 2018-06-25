package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DFCountries implements Serializable{


    private String country;

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    private String iddCode;

    public String getIddCode(){
        return iddCode;
    }

    public void setIddCode(String iddCode){
        this.iddCode = iddCode;
    }

    private String imageURL;

    public String getImageURL(){
        return imageURL;
    }

    public void setImageURL(String imageURL){
        this.imageURL = imageURL;
    }

    private String digitalForceFlag;

    public String getDigitalForceFlag(){
        return digitalForceFlag;
    }

    public void setDigitalForceFlag(String digitalForceFlag){
        this.digitalForceFlag = digitalForceFlag;
    }

    private double multiplier;

    public double getMultiplier(){
        return multiplier;
    }

    public void setMultiplier(double multiplier){
        this.multiplier = multiplier;
    }

    public static DFCountries fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        DFCountries instance = new DFCountries();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCountry(jsonObject.optString("country"));
            instance.setIddCode(jsonObject.optString("iddCode"));
            instance.setImageURL(jsonObject.optString("imageURL"));
            instance.setDigitalForceFlag(jsonObject.optString("digitalForceFlag"));
            instance.setMultiplier(jsonObject.optDouble("multiplier"));
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