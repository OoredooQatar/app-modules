package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OoredooPassportResponse implements Serializable{


    private String resultCode;

    public String getResultCode(){
        return resultCode;
    }

    public void setResultCode(String resultCode){
        this.resultCode = resultCode;
    }

    private String dataBalance;

    public String getDataBalance(){
        return dataBalance;
    }

    public void setDataBalance(String dataBalance){
        this.dataBalance = dataBalance;
    }

    private String voiceBalance;

    public String getVoiceBalance(){
        return voiceBalance;
    }

    public void setVoiceBalance(String voiceBalance){
        this.voiceBalance = voiceBalance;
    }

    private Date endDate;

    public Date getEndDate(){
        return endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    private String opeFlag;

    public String getOpeFlag(){
        return opeFlag;
    }

    public void setOpeFlag(String opeFlag){
        this.opeFlag = opeFlag;
    }

    private String closestData;

    public String getClosestData(){
        return closestData;
    }

    public void setClosestData(String closestData){
        this.closestData = closestData;
    }

    private String closestDataExpiry;

    public String getClosestDataExpiry(){
        return closestDataExpiry;
    }

    public void setClosestDataExpiry(String closestDataExpiry){
        this.closestDataExpiry = closestDataExpiry;
    }

    private String maxData;

    public String getMaxData(){
        return maxData;
    }

    public void setMaxData(String maxData){
        this.maxData = maxData;
    }

    private String closestVoice;

    public String getClosestVoice(){
        return closestVoice;
    }

    public void setClosestVoice(String closestVoice){
        this.closestVoice = closestVoice;
    }

    private String closestVoiceExpiry;

    public String getClosestVoiceExpiry(){
        return closestVoiceExpiry;
    }

    public void setClosestVoiceExpiry(String closestVoiceExpiry){
        this.closestVoiceExpiry = closestVoiceExpiry;
    }

    private String maxVoice;

    public String getMaxVoice(){
        return maxVoice;
    }

    public void setMaxVoice(String maxVoice){
        this.maxVoice = maxVoice;
    }

    private String gccData;

    public String getGccData(){
        return gccData;
    }

    public void setGccData(String gccData){
        this.gccData = gccData;
    }

    private String gccDataExpiry;

    public String getGccDataExpiry(){
        return gccDataExpiry;
    }

    public void setGccDataExpiry(String gccDataExpiry){
        this.gccDataExpiry = gccDataExpiry;
    }

    private String maxGCCData;

    public String getMaxGCCData(){
        return maxGCCData;
    }

    public void setMaxGCCData(String maxGCCData){
        this.maxGCCData = maxGCCData;
    }

    private String closestGCCData;

    public String getClosestGCCData(){
        return closestGCCData;
    }

    public void setClosestGCCData(String closestGCCData){
        this.closestGCCData = closestGCCData;
    }

    private String closestGCCDataExpiry;

    public String getClosestGCCDataExpiry(){
        return closestGCCDataExpiry;
    }

    public void setClosestGCCDataExpiry(String closestGCCDataExpiry){
        this.closestGCCDataExpiry = closestGCCDataExpiry;
    }

    private String language;

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    private boolean result;

    public boolean getResult(){
        return result;
    }

    public void setResult(boolean result){
        this.result = result;
    }

    private String operationResult;

    public String getOperationResult(){
        return operationResult;
    }

    public void setOperationResult(String operationResult){
        this.operationResult = operationResult;
    }

    private String operationCode;

    public String getOperationCode(){
        return operationCode;
    }

    public void setOperationCode(String operationCode){
        this.operationCode = operationCode;
    }

    private boolean hasAlert;

    public boolean getHasAlert(){
        return hasAlert;
    }

    public void setHasAlert(boolean hasAlert){
        this.hasAlert = hasAlert;
    }

    private String alertMessage;

    public String getAlertMessage(){
        return alertMessage;
    }

    public void setAlertMessage(String alertMessage){
        this.alertMessage = alertMessage;
    }

    public static OoredooPassportResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        OoredooPassportResponse instance = new OoredooPassportResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setResultCode(jsonObject.optString("resultCode"));
            instance.setDataBalance(jsonObject.optString("dataBalance"));
            instance.setVoiceBalance(jsonObject.optString("voiceBalance"));
            instance.setEndDate(parseDate(jsonObject,"endDate"));
            instance.setOpeFlag(jsonObject.optString("opeFlag"));
            instance.setClosestData(jsonObject.optString("closestData"));
            instance.setClosestDataExpiry(jsonObject.optString("closestDataExpiry"));
            instance.setMaxData(jsonObject.optString("maxData"));
            instance.setClosestVoice(jsonObject.optString("closestVoice"));
            instance.setClosestVoiceExpiry(jsonObject.optString("closestVoiceExpiry"));
            instance.setMaxVoice(jsonObject.optString("maxVoice"));
            instance.setGccData(jsonObject.optString("gccData"));
            instance.setGccDataExpiry(jsonObject.optString("gccDataExpiry"));
            instance.setMaxGCCData(jsonObject.optString("maxGCCData"));
            instance.setClosestGCCData(jsonObject.optString("closestGCCData"));
            instance.setClosestGCCDataExpiry(jsonObject.optString("closestGCCDataExpiry"));
            instance.setLanguage(jsonObject.optString("language"));
            instance.setResult(jsonObject.optBoolean("result"));
            instance.setOperationResult(jsonObject.optString("operationResult"));
            instance.setOperationCode(jsonObject.optString("operationCode"));
            instance.setHasAlert(jsonObject.optBoolean("hasAlert"));
            instance.setAlertMessage(jsonObject.optString("alertMessage"));
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