package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DawliCountries implements Serializable{


    private String countryId;

    public String getCountryId(){
        return countryId;
    }

    public void setCountryId(String countryId){
        this.countryId = countryId;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String code;

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    private String falgURL;

    public String getFalgURL(){
        return falgURL;
    }

    public void setFalgURL(String falgURL){
        this.falgURL = falgURL;
    }

    private String dawliDenomination;

    public String getDawliDenomination(){
        return dawliDenomination;
    }

    public void setDawliDenomination(String dawliDenomination){
        this.dawliDenomination = dawliDenomination;
    }

    public static DawliCountries fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        DawliCountries instance = new DawliCountries();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCountryId(jsonObject.optString("countryId"));
            instance.setName(jsonObject.optString("name"));
            instance.setCode(jsonObject.optString("code"));
            instance.setFalgURL(jsonObject.optString("falgURL"));
            instance.setDawliDenomination(jsonObject.optString("dawliDenomination"));
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