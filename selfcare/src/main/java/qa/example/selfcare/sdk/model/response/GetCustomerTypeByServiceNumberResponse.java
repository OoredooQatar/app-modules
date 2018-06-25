package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCustomerTypeByServiceNumberResponse implements Serializable{


    private String userType;

    public String getUserType(){
        return userType;
    }

    public void setUserType(String userType){
        this.userType = userType;
    }

    private boolean serviceNumberExist;

    public boolean getServiceNumberExist(){
        return serviceNumberExist;
    }

    public void setServiceNumberExist(boolean serviceNumberExist){
        this.serviceNumberExist = serviceNumberExist;
    }

    private String maskedEmailId;

    public String getMaskedEmailId(){
        return maskedEmailId;
    }

    public void setMaskedEmailId(String maskedEmailId){
        this.maskedEmailId = maskedEmailId;
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

    public static GetCustomerTypeByServiceNumberResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        GetCustomerTypeByServiceNumberResponse instance = new GetCustomerTypeByServiceNumberResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setUserType(jsonObject.optString("userType"));
            instance.setServiceNumberExist(jsonObject.optBoolean("serviceNumberExist"));
            instance.setMaskedEmailId(jsonObject.optString("maskedEmailId"));
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