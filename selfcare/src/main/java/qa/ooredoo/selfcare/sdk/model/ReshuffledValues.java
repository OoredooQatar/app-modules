package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReshuffledValues implements Serializable{


    private String localVoiceSMS;

    public String getLocalVoiceSMS(){
        return localVoiceSMS;
    }

    public void setLocalVoiceSMS(String localVoiceSMS){
        this.localVoiceSMS = localVoiceSMS;
    }

    private String localData;

    public String getLocalData(){
        return localData;
    }

    public void setLocalData(String localData){
        this.localData = localData;
    }

    private String internationVoiceSMS;

    public String getInternationVoiceSMS(){
        return internationVoiceSMS;
    }

    public void setInternationVoiceSMS(String internationVoiceSMS){
        this.internationVoiceSMS = internationVoiceSMS;
    }

    private String internationalVoiceSMSLock;

    public String getInternationalVoiceSMSLock(){
        return internationalVoiceSMSLock;
    }

    public void setInternationalVoiceSMSLock(String internationalVoiceSMSLock){
        this.internationalVoiceSMSLock = internationalVoiceSMSLock;
    }

    private String roamingUnits;

    public String getRoamingUnits(){
        return roamingUnits;
    }

    public void setRoamingUnits(String roamingUnits){
        this.roamingUnits = roamingUnits;
    }

    private String roamingData;

    public String getRoamingData(){
        return roamingData;
    }

    public void setRoamingData(String roamingData){
        this.roamingData = roamingData;
    }

    private String startDate;

    public String getStartDate(){
        return startDate;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    private String packName;

    public String getPackName(){
        return packName;
    }

    public void setPackName(String packName){
        this.packName = packName;
    }

    private String currentPackName;

    public String getCurrentPackName(){
        return currentPackName;
    }

    public void setCurrentPackName(String currentPackName){
        this.currentPackName = currentPackName;
    }

    private DFCountries countries;

    public DFCountries getCountries(){
        return countries;
    }

    public void setCountries(DFCountries countries){
        this.countries = countries;
    }

    public static ReshuffledValues fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ReshuffledValues instance = new ReshuffledValues();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setLocalVoiceSMS(jsonObject.optString("localVoiceSMS"));
            instance.setLocalData(jsonObject.optString("localData"));
            instance.setInternationVoiceSMS(jsonObject.optString("internationVoiceSMS"));
            instance.setInternationalVoiceSMSLock(jsonObject.optString("internationalVoiceSMSLock"));
            instance.setRoamingUnits(jsonObject.optString("roamingUnits"));
            instance.setRoamingData(jsonObject.optString("roamingData"));
            instance.setStartDate(jsonObject.optString("startDate"));
            instance.setPackName(jsonObject.optString("packName"));
            instance.setCurrentPackName(jsonObject.optString("currentPackName"));
            instance.setCountries(DFCountries.fromJSON(jsonObject.optString("countries")));
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