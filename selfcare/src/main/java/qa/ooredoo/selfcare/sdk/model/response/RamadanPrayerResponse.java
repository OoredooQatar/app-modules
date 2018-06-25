package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RamadanPrayerResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.RamadanPrayer[] prayers;

    public qa.ooredoo.selfcare.sdk.model.RamadanPrayer[] getPrayers(){
        return prayers;
    }

    public void setPrayers(qa.ooredoo.selfcare.sdk.model.RamadanPrayer[] prayers){
        this.prayers = prayers;
    }

    private String hijriDate;

    public String getHijriDate(){
        return hijriDate;
    }

    public void setHijriDate(String hijriDate){
        this.hijriDate = hijriDate;
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

    public static RamadanPrayerResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        RamadanPrayerResponse instance = new RamadanPrayerResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray prayersJsonArray = jsonObject.optJSONArray("prayers");
            if (prayersJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.RamadanPrayer[] prayersArray = new qa.ooredoo.selfcare.sdk.model.RamadanPrayer[prayersJsonArray.length()];
                for (int i = 0; i < prayersJsonArray.length(); i++) {
                    prayersArray[i] = qa.ooredoo.selfcare.sdk.model.RamadanPrayer.fromJSON(prayersJsonArray.optString(i));
                }
                instance.setPrayers(prayersArray);
            }
            instance.setHijriDate(jsonObject.optString("hijriDate"));
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