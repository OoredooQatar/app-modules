package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SelfServiceMachine implements Serializable{


    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String address;

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    private String workingDays;

    public String getWorkingDays(){
        return workingDays;
    }

    public void setWorkingDays(String workingDays){
        this.workingDays = workingDays;
    }

    private String businessHours;

    public String getBusinessHours(){
        return businessHours;
    }

    public void setBusinessHours(String businessHours){
        this.businessHours = businessHours;
    }

    private String latitude;

    public String getLatitude(){
        return latitude;
    }

    public void setLatitude(String latitude){
        this.latitude = latitude;
    }

    private String longitude;

    public String getLongitude(){
        return longitude;
    }

    public void setLongitude(String longitude){
        this.longitude = longitude;
    }

    private String mapUrl;

    public String getMapUrl(){
        return mapUrl;
    }

    public void setMapUrl(String mapUrl){
        this.mapUrl = mapUrl;
    }

    private String lang;

    public String getLang(){
        return lang;
    }

    public void setLang(String lang){
        this.lang = lang;
    }

    public static SelfServiceMachine fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        SelfServiceMachine instance = new SelfServiceMachine();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optInt("id"));
            instance.setName(jsonObject.optString("name"));
            instance.setAddress(jsonObject.optString("address"));
            instance.setWorkingDays(jsonObject.optString("workingDays"));
            instance.setBusinessHours(jsonObject.optString("businessHours"));
            instance.setLatitude(jsonObject.optString("latitude"));
            instance.setLongitude(jsonObject.optString("longitude"));
            instance.setMapUrl(jsonObject.optString("mapUrl"));
            instance.setLang(jsonObject.optString("lang"));
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