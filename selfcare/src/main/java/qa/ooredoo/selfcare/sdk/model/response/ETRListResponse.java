package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ETRListResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.ETR[] etr;

    public qa.ooredoo.selfcare.sdk.model.ETR[] getEtr(){
        return etr;
    }

    public void setEtr(qa.ooredoo.selfcare.sdk.model.ETR[] etr){
        this.etr = etr;
    }

    private String[] prefixes;

    public String[] getPrefixes(){
        return prefixes;
    }

    public void setPrefixes(String[] prefixes){
        this.prefixes = prefixes;
    }

    private String reserveMessage;

    public String getReserveMessage(){
        return reserveMessage;
    }

    public void setReserveMessage(String reserveMessage){
        this.reserveMessage = reserveMessage;
    }

    private String dueDateMessage;

    public String getDueDateMessage(){
        return dueDateMessage;
    }

    public void setDueDateMessage(String dueDateMessage){
        this.dueDateMessage = dueDateMessage;
    }

    private String hoursExpiry;

    public String getHoursExpiry(){
        return hoursExpiry;
    }

    public void setHoursExpiry(String hoursExpiry){
        this.hoursExpiry = hoursExpiry;
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

    public static ETRListResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ETRListResponse instance = new ETRListResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray etrJsonArray = jsonObject.optJSONArray("etr");
            if (etrJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.ETR[] etrArray = new qa.ooredoo.selfcare.sdk.model.ETR[etrJsonArray.length()];
                for (int i = 0; i < etrJsonArray.length(); i++) {
                    etrArray[i] = qa.ooredoo.selfcare.sdk.model.ETR.fromJSON(etrJsonArray.optString(i));
                }
                instance.setEtr(etrArray);
            }
            JSONArray prefixesJsonArray = jsonObject.optJSONArray("prefixes");
            if (prefixesJsonArray != null) {
                String[] prefixesArray = new String[prefixesJsonArray.length()];
                for (int i = 0; i < prefixesJsonArray.length(); i++) {
                    prefixesArray[i] = prefixesJsonArray.optString(i);
                }
                instance.setPrefixes(prefixesArray);
            }
            instance.setReserveMessage(jsonObject.optString("reserveMessage"));
            instance.setDueDateMessage(jsonObject.optString("dueDateMessage"));
            instance.setHoursExpiry(jsonObject.optString("hoursExpiry"));
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