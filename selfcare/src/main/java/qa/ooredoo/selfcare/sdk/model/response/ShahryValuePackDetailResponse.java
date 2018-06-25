package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShahryValuePackDetailResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.ShahryValuePack shahryValuePack;

    public qa.ooredoo.selfcare.sdk.model.ShahryValuePack getShahryValuePack(){
        return shahryValuePack;
    }

    public void setShahryValuePack(qa.ooredoo.selfcare.sdk.model.ShahryValuePack shahryValuePack){
        this.shahryValuePack = shahryValuePack;
    }

    private qa.ooredoo.selfcare.sdk.model.ShahryEIPack shahryEIPack;

    public qa.ooredoo.selfcare.sdk.model.ShahryEIPack getShahryEIPack(){
        return shahryEIPack;
    }

    public void setShahryEIPack(qa.ooredoo.selfcare.sdk.model.ShahryEIPack shahryEIPack){
        this.shahryEIPack = shahryEIPack;
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

    public static ShahryValuePackDetailResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ShahryValuePackDetailResponse instance = new ShahryValuePackDetailResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setShahryValuePack(qa.ooredoo.selfcare.sdk.model.ShahryValuePack.fromJSON(jsonObject.optString("shahryValuePack")));
            instance.setShahryEIPack(qa.ooredoo.selfcare.sdk.model.ShahryEIPack.fromJSON(jsonObject.optString("shahryEIPack")));
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