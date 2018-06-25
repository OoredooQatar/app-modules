package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateIDResponse implements Serializable{


    private String id;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    private String idType;

    public String getIdType(){
        return idType;
    }

    public void setIdType(String idType){
        this.idType = idType;
    }

    private String remainingSims;

    public String getRemainingSims(){
        return remainingSims;
    }

    public void setRemainingSims(String remainingSims){
        this.remainingSims = remainingSims;
    }

    private String currentSims;

    public String getCurrentSims(){
        return currentSims;
    }

    public void setCurrentSims(String currentSims){
        this.currentSims = currentSims;
    }

    private String nationality;

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
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

    public static ValidateIDResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ValidateIDResponse instance = new ValidateIDResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optString("id"));
            instance.setIdType(jsonObject.optString("idType"));
            instance.setRemainingSims(jsonObject.optString("remainingSims"));
            instance.setCurrentSims(jsonObject.optString("currentSims"));
            instance.setNationality(jsonObject.optString("nationality"));
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