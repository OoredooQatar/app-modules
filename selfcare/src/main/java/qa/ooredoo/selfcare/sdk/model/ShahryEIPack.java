package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShahryEIPack implements Serializable{


    private String packName;

    public String getPackName(){
        return packName;
    }

    public void setPackName(String packName){
        this.packName = packName;
    }

    private String globalData;

    public String getGlobalData(){
        return globalData;
    }

    public void setGlobalData(String globalData){
        this.globalData = globalData;
    }

    private String globalDataExpiry;

    public String getGlobalDataExpiry(){
        return globalDataExpiry;
    }

    public void setGlobalDataExpiry(String globalDataExpiry){
        this.globalDataExpiry = globalDataExpiry;
    }

    private String globalDataRenewal;

    public String getGlobalDataRenewal(){
        return globalDataRenewal;
    }

    public void setGlobalDataRenewal(String globalDataRenewal){
        this.globalDataRenewal = globalDataRenewal;
    }

    private String globalDescription;

    public String getGlobalDescription(){
        return globalDescription;
    }

    public void setGlobalDescription(String globalDescription){
        this.globalDescription = globalDescription;
    }

    private String globalUnit;

    public String getGlobalUnit(){
        return globalUnit;
    }

    public void setGlobalUnit(String globalUnit){
        this.globalUnit = globalUnit;
    }

    private String localData;

    public String getLocalData(){
        return localData;
    }

    public void setLocalData(String localData){
        this.localData = localData;
    }

    private String localDataExpiry;

    public String getLocalDataExpiry(){
        return localDataExpiry;
    }

    public void setLocalDataExpiry(String localDataExpiry){
        this.localDataExpiry = localDataExpiry;
    }

    private String localDataRenewal;

    public String getLocalDataRenewal(){
        return localDataRenewal;
    }

    public void setLocalDataRenewal(String localDataRenewal){
        this.localDataRenewal = localDataRenewal;
    }

    private String localUnit;

    public String getLocalUnit(){
        return localUnit;
    }

    public void setLocalUnit(String localUnit){
        this.localUnit = localUnit;
    }

    public static ShahryEIPack fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ShahryEIPack instance = new ShahryEIPack();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPackName(jsonObject.optString("packName"));
            instance.setGlobalData(jsonObject.optString("globalData"));
            instance.setGlobalDataExpiry(jsonObject.optString("globalDataExpiry"));
            instance.setGlobalDataRenewal(jsonObject.optString("globalDataRenewal"));
            instance.setGlobalDescription(jsonObject.optString("globalDescription"));
            instance.setGlobalUnit(jsonObject.optString("globalUnit"));
            instance.setLocalData(jsonObject.optString("localData"));
            instance.setLocalDataExpiry(jsonObject.optString("localDataExpiry"));
            instance.setLocalDataRenewal(jsonObject.optString("localDataRenewal"));
            instance.setLocalUnit(jsonObject.optString("localUnit"));
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