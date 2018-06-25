package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NeedfulThingsResponse implements Serializable{


    private boolean newVersionAvailable;

    public boolean getNewVersionAvailable(){
        return newVersionAvailable;
    }

    public void setNewVersionAvailable(boolean newVersionAvailable){
        this.newVersionAvailable = newVersionAvailable;
    }

    private boolean forceUpdate;

    public boolean getForceUpdate(){
        return forceUpdate;
    }

    public void setForceUpdate(boolean forceUpdate){
        this.forceUpdate = forceUpdate;
    }

    private boolean liveChat;

    public boolean getLiveChat(){
        return liveChat;
    }

    public void setLiveChat(boolean liveChat){
        this.liveChat = liveChat;
    }

    private String updateData;

    public String getUpdateData(){
        return updateData;
    }

    public void setUpdateData(String updateData){
        this.updateData = updateData;
    }

    private String payload;

    public String getPayload(){
        return payload;
    }

    public void setPayload(String payload){
        this.payload = payload;
    }

    private String bmsText;

    public String getBmsText(){
        return bmsText;
    }

    public void setBmsText(String bmsText){
        this.bmsText = bmsText;
    }

    private String ramadanFirstDate;

    public String getRamadanFirstDate(){
        return ramadanFirstDate;
    }

    public void setRamadanFirstDate(String ramadanFirstDate){
        this.ramadanFirstDate = ramadanFirstDate;
    }

    private String ramadanEndDate;

    public String getRamadanEndDate(){
        return ramadanEndDate;
    }

    public void setRamadanEndDate(String ramadanEndDate){
        this.ramadanEndDate = ramadanEndDate;
    }

    private String todayHijriDate;

    public String getTodayHijriDate(){
        return todayHijriDate;
    }

    public void setTodayHijriDate(String todayHijriDate){
        this.todayHijriDate = todayHijriDate;
    }

    private String todayGeorgianDate;

    public String getTodayGeorgianDate(){
        return todayGeorgianDate;
    }

    public void setTodayGeorgianDate(String todayGeorgianDate){
        this.todayGeorgianDate = todayGeorgianDate;
    }

    private qa.ooredoo.selfcare.sdk.model.response.CacheRegister[] cacheRegisters;

    public qa.ooredoo.selfcare.sdk.model.response.CacheRegister[] getCacheRegisters(){
        return cacheRegisters;
    }

    public void setCacheRegisters(qa.ooredoo.selfcare.sdk.model.response.CacheRegister[] cacheRegisters){
        this.cacheRegisters = cacheRegisters;
    }

    private qa.ooredoo.selfcare.sdk.model.response.AppUpdates[] appUpdates;

    public qa.ooredoo.selfcare.sdk.model.response.AppUpdates[] getAppUpdates(){
        return appUpdates;
    }

    public void setAppUpdates(qa.ooredoo.selfcare.sdk.model.response.AppUpdates[] appUpdates){
        this.appUpdates = appUpdates;
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

    public static NeedfulThingsResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NeedfulThingsResponse instance = new NeedfulThingsResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setNewVersionAvailable(jsonObject.optBoolean("newVersionAvailable"));
            instance.setForceUpdate(jsonObject.optBoolean("forceUpdate"));
            instance.setLiveChat(jsonObject.optBoolean("liveChat"));
            instance.setUpdateData(jsonObject.optString("updateData"));
            instance.setPayload(jsonObject.optString("payload"));
            instance.setBmsText(jsonObject.optString("bmsText"));
            instance.setRamadanFirstDate(jsonObject.optString("ramadanFirstDate"));
            instance.setRamadanEndDate(jsonObject.optString("ramadanEndDate"));
            instance.setTodayHijriDate(jsonObject.optString("todayHijriDate"));
            instance.setTodayGeorgianDate(jsonObject.optString("todayGeorgianDate"));
            JSONArray cacheRegistersJsonArray = jsonObject.optJSONArray("cacheRegisters");
            if (cacheRegistersJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.response.CacheRegister[] cacheRegistersArray = new qa.ooredoo.selfcare.sdk.model.response.CacheRegister[cacheRegistersJsonArray.length()];
                for (int i = 0; i < cacheRegistersJsonArray.length(); i++) {
                    cacheRegistersArray[i] = qa.ooredoo.selfcare.sdk.model.response.CacheRegister.fromJSON(cacheRegistersJsonArray.optString(i));
                }
                instance.setCacheRegisters(cacheRegistersArray);
            }
            JSONArray appUpdatesJsonArray = jsonObject.optJSONArray("appUpdates");
            if (appUpdatesJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.response.AppUpdates[] appUpdatesArray = new qa.ooredoo.selfcare.sdk.model.response.AppUpdates[appUpdatesJsonArray.length()];
                for (int i = 0; i < appUpdatesJsonArray.length(); i++) {
                    appUpdatesArray[i] = qa.ooredoo.selfcare.sdk.model.response.AppUpdates.fromJSON(appUpdatesJsonArray.optString(i));
                }
                instance.setAppUpdates(appUpdatesArray);
            }
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