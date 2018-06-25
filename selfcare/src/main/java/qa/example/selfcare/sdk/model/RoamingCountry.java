package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RoamingCountry implements Serializable{


    private String country;

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    private String countryAr;

    public String getCountryAr(){
        return countryAr;
    }

    public void setCountryAr(String countryAr){
        this.countryAr = countryAr;
    }

    private String countryCode;

    public String getCountryCode(){
        return countryCode;
    }

    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
    }

    private double multiplier;

    public double getMultiplier(){
        return multiplier;
    }

    public void setMultiplier(double multiplier){
        this.multiplier = multiplier;
    }

    private String digitalForceFlag;

    public String getDigitalForceFlag(){
        return digitalForceFlag;
    }

    public void setDigitalForceFlag(String digitalForceFlag){
        this.digitalForceFlag = digitalForceFlag;
    }

    public static RoamingCountry fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        RoamingCountry instance = new RoamingCountry();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCountry(jsonObject.optString("country"));
            instance.setCountryAr(jsonObject.optString("countryAr"));
            instance.setCountryCode(jsonObject.optString("countryCode"));
            instance.setMultiplier(jsonObject.optDouble("multiplier"));
            instance.setDigitalForceFlag(jsonObject.optString("digitalForceFlag"));
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