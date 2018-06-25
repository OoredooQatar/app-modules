package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BalanceData implements Serializable{


    private String packName;

    public String getPackName(){
        return packName;
    }

    public void setPackName(String packName){
        this.packName = packName;
    }

    private int voice;

    public int getVoice(){
        return voice;
    }

    public void setVoice(int voice){
        this.voice = voice;
    }

    private int data;

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    private int gccData;

    public int getGccData(){
        return gccData;
    }

    public void setGccData(int gccData){
        this.gccData = gccData;
    }

    private int maxData;

    public int getMaxData(){
        return maxData;
    }

    public void setMaxData(int maxData){
        this.maxData = maxData;
    }

    private int maxGccData;

    public int getMaxGccData(){
        return maxGccData;
    }

    public void setMaxGccData(int maxGccData){
        this.maxGccData = maxGccData;
    }

    private int maxVoice;

    public int getMaxVoice(){
        return maxVoice;
    }

    public void setMaxVoice(int maxVoice){
        this.maxVoice = maxVoice;
    }

    private String closestVoice;

    public String getClosestVoice(){
        return closestVoice;
    }

    public void setClosestVoice(String closestVoice){
        this.closestVoice = closestVoice;
    }

    private String closestData;

    public String getClosestData(){
        return closestData;
    }

    public void setClosestData(String closestData){
        this.closestData = closestData;
    }

    private String closestGccData;

    public String getClosestGccData(){
        return closestGccData;
    }

    public void setClosestGccData(String closestGccData){
        this.closestGccData = closestGccData;
    }

    private String closestVoiceExpiry;

    public String getClosestVoiceExpiry(){
        return closestVoiceExpiry;
    }

    public void setClosestVoiceExpiry(String closestVoiceExpiry){
        this.closestVoiceExpiry = closestVoiceExpiry;
    }

    private String closestDataExpiry;

    public String getClosestDataExpiry(){
        return closestDataExpiry;
    }

    public void setClosestDataExpiry(String closestDataExpiry){
        this.closestDataExpiry = closestDataExpiry;
    }

    private String closestGccDataExpiry;

    public String getClosestGccDataExpiry(){
        return closestGccDataExpiry;
    }

    public void setClosestGccDataExpiry(String closestGccDataExpiry){
        this.closestGccDataExpiry = closestGccDataExpiry;
    }

    private String endFlag;

    public String getEndFlag(){
        return endFlag;
    }

    public void setEndFlag(String endFlag){
        this.endFlag = endFlag;
    }

    private Date endDate;

    public Date getEndDate(){
        return endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    public static BalanceData fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        BalanceData instance = new BalanceData();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPackName(jsonObject.optString("packName"));
            instance.setVoice(jsonObject.optInt("voice"));
            instance.setData(jsonObject.optInt("data"));
            instance.setGccData(jsonObject.optInt("gccData"));
            instance.setMaxData(jsonObject.optInt("maxData"));
            instance.setMaxGccData(jsonObject.optInt("maxGccData"));
            instance.setMaxVoice(jsonObject.optInt("maxVoice"));
            instance.setClosestVoice(jsonObject.optString("closestVoice"));
            instance.setClosestData(jsonObject.optString("closestData"));
            instance.setClosestGccData(jsonObject.optString("closestGccData"));
            instance.setClosestVoiceExpiry(jsonObject.optString("closestVoiceExpiry"));
            instance.setClosestDataExpiry(jsonObject.optString("closestDataExpiry"));
            instance.setClosestGccDataExpiry(jsonObject.optString("closestGccDataExpiry"));
            instance.setEndFlag(jsonObject.optString("endFlag"));
            instance.setEndDate(parseDate(jsonObject,"endDate"));
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