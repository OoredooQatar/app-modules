package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForceUsageDetailsResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.ForceValuePack forceValuePack;

    public qa.ooredoo.selfcare.sdk.model.ForceValuePack getForceValuePack(){
        return forceValuePack;
    }

    public void setForceValuePack(qa.ooredoo.selfcare.sdk.model.ForceValuePack forceValuePack){
        this.forceValuePack = forceValuePack;
    }

    private qa.ooredoo.selfcare.sdk.model.RoamingAllUsage roamingAllUsage;

    public qa.ooredoo.selfcare.sdk.model.RoamingAllUsage getRoamingAllUsage(){
        return roamingAllUsage;
    }

    public void setRoamingAllUsage(qa.ooredoo.selfcare.sdk.model.RoamingAllUsage roamingAllUsage){
        this.roamingAllUsage = roamingAllUsage;
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

    public static ForceUsageDetailsResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ForceUsageDetailsResponse instance = new ForceUsageDetailsResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setForceValuePack(qa.ooredoo.selfcare.sdk.model.ForceValuePack.fromJSON(jsonObject.optString("forceValuePack")));
            instance.setRoamingAllUsage(qa.ooredoo.selfcare.sdk.model.RoamingAllUsage.fromJSON(jsonObject.optString("roamingAllUsage")));
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