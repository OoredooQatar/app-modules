package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForceValuePack implements Serializable{


    private String forcePackName;

    public String getForcePackName(){
        return forcePackName;
    }

    public void setForcePackName(String forcePackName){
        this.forcePackName = forcePackName;
    }

    private String initialSubscribedLocalVoiceSMS;

    public String getInitialSubscribedLocalVoiceSMS(){
        return initialSubscribedLocalVoiceSMS;
    }

    public void setInitialSubscribedLocalVoiceSMS(String initialSubscribedLocalVoiceSMS){
        this.initialSubscribedLocalVoiceSMS = initialSubscribedLocalVoiceSMS;
    }

    private String remainingLocalVoiceSMS;

    public String getRemainingLocalVoiceSMS(){
        return remainingLocalVoiceSMS;
    }

    public void setRemainingLocalVoiceSMS(String remainingLocalVoiceSMS){
        this.remainingLocalVoiceSMS = remainingLocalVoiceSMS;
    }

    private String alloactedLocalVoiceSMS;

    public String getAlloactedLocalVoiceSMS(){
        return alloactedLocalVoiceSMS;
    }

    public void setAlloactedLocalVoiceSMS(String alloactedLocalVoiceSMS){
        this.alloactedLocalVoiceSMS = alloactedLocalVoiceSMS;
    }

    private String boostedLocalVoiceSMS;

    public String getBoostedLocalVoiceSMS(){
        return boostedLocalVoiceSMS;
    }

    public void setBoostedLocalVoiceSMS(String boostedLocalVoiceSMS){
        this.boostedLocalVoiceSMS = boostedLocalVoiceSMS;
    }

    private String totalLocalVoiceSMS;

    public String getTotalLocalVoiceSMS(){
        return totalLocalVoiceSMS;
    }

    public void setTotalLocalVoiceSMS(String totalLocalVoiceSMS){
        this.totalLocalVoiceSMS = totalLocalVoiceSMS;
    }

    private String initialSubscribedLocalData;

    public String getInitialSubscribedLocalData(){
        return initialSubscribedLocalData;
    }

    public void setInitialSubscribedLocalData(String initialSubscribedLocalData){
        this.initialSubscribedLocalData = initialSubscribedLocalData;
    }

    private String remainingLocalData;

    public String getRemainingLocalData(){
        return remainingLocalData;
    }

    public void setRemainingLocalData(String remainingLocalData){
        this.remainingLocalData = remainingLocalData;
    }

    private String alloactedLocalData;

    public String getAlloactedLocalData(){
        return alloactedLocalData;
    }

    public void setAlloactedLocalData(String alloactedLocalData){
        this.alloactedLocalData = alloactedLocalData;
    }

    private String boostedLocalData;

    public String getBoostedLocalData(){
        return boostedLocalData;
    }

    public void setBoostedLocalData(String boostedLocalData){
        this.boostedLocalData = boostedLocalData;
    }

    private String totalLocalData;

    public String getTotalLocalData(){
        return totalLocalData;
    }

    public void setTotalLocalData(String totalLocalData){
        this.totalLocalData = totalLocalData;
    }

    private String initialSubscribedInternationalVoiceSMS;

    public String getInitialSubscribedInternationalVoiceSMS(){
        return initialSubscribedInternationalVoiceSMS;
    }

    public void setInitialSubscribedInternationalVoiceSMS(String initialSubscribedInternationalVoiceSMS){
        this.initialSubscribedInternationalVoiceSMS = initialSubscribedInternationalVoiceSMS;
    }

    private String remainingInternationalVoiceSMS;

    public String getRemainingInternationalVoiceSMS(){
        return remainingInternationalVoiceSMS;
    }

    public void setRemainingInternationalVoiceSMS(String remainingInternationalVoiceSMS){
        this.remainingInternationalVoiceSMS = remainingInternationalVoiceSMS;
    }

    private String alloactedInternationalVoiceSMS;

    public String getAlloactedInternationalVoiceSMS(){
        return alloactedInternationalVoiceSMS;
    }

    public void setAlloactedInternationalVoiceSMS(String alloactedInternationalVoiceSMS){
        this.alloactedInternationalVoiceSMS = alloactedInternationalVoiceSMS;
    }

    private String boostedInternationalVoiceSMS;

    public String getBoostedInternationalVoiceSMS(){
        return boostedInternationalVoiceSMS;
    }

    public void setBoostedInternationalVoiceSMS(String boostedInternationalVoiceSMS){
        this.boostedInternationalVoiceSMS = boostedInternationalVoiceSMS;
    }

    private String totalInternationalVoiceSMS;

    public String getTotalInternationalVoiceSMS(){
        return totalInternationalVoiceSMS;
    }

    public void setTotalInternationalVoiceSMS(String totalInternationalVoiceSMS){
        this.totalInternationalVoiceSMS = totalInternationalVoiceSMS;
    }

    private String initialSubscribedInternationalLockedVoiceSMS;

    public String getInitialSubscribedInternationalLockedVoiceSMS(){
        return initialSubscribedInternationalLockedVoiceSMS;
    }

    public void setInitialSubscribedInternationalLockedVoiceSMS(String initialSubscribedInternationalLockedVoiceSMS){
        this.initialSubscribedInternationalLockedVoiceSMS = initialSubscribedInternationalLockedVoiceSMS;
    }

    private String remainingInternationalLockedVoiceSMS;

    public String getRemainingInternationalLockedVoiceSMS(){
        return remainingInternationalLockedVoiceSMS;
    }

    public void setRemainingInternationalLockedVoiceSMS(String remainingInternationalLockedVoiceSMS){
        this.remainingInternationalLockedVoiceSMS = remainingInternationalLockedVoiceSMS;
    }

    private String alloactedInternationalLockedVoiceSMS;

    public String getAlloactedInternationalLockedVoiceSMS(){
        return alloactedInternationalLockedVoiceSMS;
    }

    public void setAlloactedInternationalLockedVoiceSMS(String alloactedInternationalLockedVoiceSMS){
        this.alloactedInternationalLockedVoiceSMS = alloactedInternationalLockedVoiceSMS;
    }

    private String boostedInternationalLockedVoiceSMS;

    public String getBoostedInternationalLockedVoiceSMS(){
        return boostedInternationalLockedVoiceSMS;
    }

    public void setBoostedInternationalLockedVoiceSMS(String boostedInternationalLockedVoiceSMS){
        this.boostedInternationalLockedVoiceSMS = boostedInternationalLockedVoiceSMS;
    }

    private String totalInternationalLockedVoiceSMS;

    public String getTotalInternationalLockedVoiceSMS(){
        return totalInternationalLockedVoiceSMS;
    }

    public void setTotalInternationalLockedVoiceSMS(String totalInternationalLockedVoiceSMS){
        this.totalInternationalLockedVoiceSMS = totalInternationalLockedVoiceSMS;
    }

    private String initialSubscribedRoamingUnits;

    public String getInitialSubscribedRoamingUnits(){
        return initialSubscribedRoamingUnits;
    }

    public void setInitialSubscribedRoamingUnits(String initialSubscribedRoamingUnits){
        this.initialSubscribedRoamingUnits = initialSubscribedRoamingUnits;
    }

    private String remainingRoamingUnits;

    public String getRemainingRoamingUnits(){
        return remainingRoamingUnits;
    }

    public void setRemainingRoamingUnits(String remainingRoamingUnits){
        this.remainingRoamingUnits = remainingRoamingUnits;
    }

    private String alloactedRoamingUnits;

    public String getAlloactedRoamingUnits(){
        return alloactedRoamingUnits;
    }

    public void setAlloactedRoamingUnits(String alloactedRoamingUnits){
        this.alloactedRoamingUnits = alloactedRoamingUnits;
    }

    private String boostedRoamingUnits;

    public String getBoostedRoamingUnits(){
        return boostedRoamingUnits;
    }

    public void setBoostedRoamingUnits(String boostedRoamingUnits){
        this.boostedRoamingUnits = boostedRoamingUnits;
    }

    private String totalRoamingUnits;

    public String getTotalRoamingUnits(){
        return totalRoamingUnits;
    }

    public void setTotalRoamingUnits(String totalRoamingUnits){
        this.totalRoamingUnits = totalRoamingUnits;
    }

    private String initialSubscribedRoamingData;

    public String getInitialSubscribedRoamingData(){
        return initialSubscribedRoamingData;
    }

    public void setInitialSubscribedRoamingData(String initialSubscribedRoamingData){
        this.initialSubscribedRoamingData = initialSubscribedRoamingData;
    }

    private String remainingRoamingData;

    public String getRemainingRoamingData(){
        return remainingRoamingData;
    }

    public void setRemainingRoamingData(String remainingRoamingData){
        this.remainingRoamingData = remainingRoamingData;
    }

    private String alloactedRoamingData;

    public String getAlloactedRoamingData(){
        return alloactedRoamingData;
    }

    public void setAlloactedRoamingData(String alloactedRoamingData){
        this.alloactedRoamingData = alloactedRoamingData;
    }

    private String boostedRoamingData;

    public String getBoostedRoamingData(){
        return boostedRoamingData;
    }

    public void setBoostedRoamingData(String boostedRoamingData){
        this.boostedRoamingData = boostedRoamingData;
    }

    private String totalRoamingData;

    public String getTotalRoamingData(){
        return totalRoamingData;
    }

    public void setTotalRoamingData(String totalRoamingData){
        this.totalRoamingData = totalRoamingData;
    }

    private DFCountries country;

    public DFCountries getCountry(){
        return country;
    }

    public void setCountry(DFCountries country){
        this.country = country;
    }

    public static ForceValuePack fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ForceValuePack instance = new ForceValuePack();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setForcePackName(jsonObject.optString("forcePackName"));
            instance.setInitialSubscribedLocalVoiceSMS(jsonObject.optString("initialSubscribedLocalVoiceSMS"));
            instance.setRemainingLocalVoiceSMS(jsonObject.optString("remainingLocalVoiceSMS"));
            instance.setAlloactedLocalVoiceSMS(jsonObject.optString("alloactedLocalVoiceSMS"));
            instance.setBoostedLocalVoiceSMS(jsonObject.optString("boostedLocalVoiceSMS"));
            instance.setTotalLocalVoiceSMS(jsonObject.optString("totalLocalVoiceSMS"));
            instance.setInitialSubscribedLocalData(jsonObject.optString("initialSubscribedLocalData"));
            instance.setRemainingLocalData(jsonObject.optString("remainingLocalData"));
            instance.setAlloactedLocalData(jsonObject.optString("alloactedLocalData"));
            instance.setBoostedLocalData(jsonObject.optString("boostedLocalData"));
            instance.setTotalLocalData(jsonObject.optString("totalLocalData"));
            instance.setInitialSubscribedInternationalVoiceSMS(jsonObject.optString("initialSubscribedInternationalVoiceSMS"));
            instance.setRemainingInternationalVoiceSMS(jsonObject.optString("remainingInternationalVoiceSMS"));
            instance.setAlloactedInternationalVoiceSMS(jsonObject.optString("alloactedInternationalVoiceSMS"));
            instance.setBoostedInternationalVoiceSMS(jsonObject.optString("boostedInternationalVoiceSMS"));
            instance.setTotalInternationalVoiceSMS(jsonObject.optString("totalInternationalVoiceSMS"));
            instance.setInitialSubscribedInternationalLockedVoiceSMS(jsonObject.optString("initialSubscribedInternationalLockedVoiceSMS"));
            instance.setRemainingInternationalLockedVoiceSMS(jsonObject.optString("remainingInternationalLockedVoiceSMS"));
            instance.setAlloactedInternationalLockedVoiceSMS(jsonObject.optString("alloactedInternationalLockedVoiceSMS"));
            instance.setBoostedInternationalLockedVoiceSMS(jsonObject.optString("boostedInternationalLockedVoiceSMS"));
            instance.setTotalInternationalLockedVoiceSMS(jsonObject.optString("totalInternationalLockedVoiceSMS"));
            instance.setInitialSubscribedRoamingUnits(jsonObject.optString("initialSubscribedRoamingUnits"));
            instance.setRemainingRoamingUnits(jsonObject.optString("remainingRoamingUnits"));
            instance.setAlloactedRoamingUnits(jsonObject.optString("alloactedRoamingUnits"));
            instance.setBoostedRoamingUnits(jsonObject.optString("boostedRoamingUnits"));
            instance.setTotalRoamingUnits(jsonObject.optString("totalRoamingUnits"));
            instance.setInitialSubscribedRoamingData(jsonObject.optString("initialSubscribedRoamingData"));
            instance.setRemainingRoamingData(jsonObject.optString("remainingRoamingData"));
            instance.setAlloactedRoamingData(jsonObject.optString("alloactedRoamingData"));
            instance.setBoostedRoamingData(jsonObject.optString("boostedRoamingData"));
            instance.setTotalRoamingData(jsonObject.optString("totalRoamingData"));
            instance.setCountry(DFCountries.fromJSON(jsonObject.optString("country")));
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