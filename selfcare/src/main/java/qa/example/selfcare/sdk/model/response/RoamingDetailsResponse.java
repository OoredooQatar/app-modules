package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RoamingDetailsResponse implements Serializable{


    private String currentCountry;

    public String getCurrentCountry(){
        return currentCountry;
    }

    public void setCurrentCountry(String currentCountry){
        this.currentCountry = currentCountry;
    }

    private String currentNetwork;

    public String getCurrentNetwork(){
        return currentNetwork;
    }

    public void setCurrentNetwork(String currentNetwork){
        this.currentNetwork = currentNetwork;
    }

    private String mccNcc;

    public String getMccNcc(){
        return mccNcc;
    }

    public void setMccNcc(String mccNcc){
        this.mccNcc = mccNcc;
    }

    private String flag;

    public String getFlag(){
        return flag;
    }

    public void setFlag(String flag){
        this.flag = flag;
    }

    private boolean isPassportSupported;

    public boolean getIsPassportSupported(){
        return isPassportSupported;
    }

    public void setIsPassportSupported(boolean isPassportSupported){
        this.isPassportSupported = isPassportSupported;
    }

    private boolean isOnPassportFriendlyNetwork;

    public boolean getIsOnPassportFriendlyNetwork(){
        return isOnPassportFriendlyNetwork;
    }

    public void setIsOnPassportFriendlyNetwork(boolean isOnPassportFriendlyNetwork){
        this.isOnPassportFriendlyNetwork = isOnPassportFriendlyNetwork;
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

    public static RoamingDetailsResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        RoamingDetailsResponse instance = new RoamingDetailsResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCurrentCountry(jsonObject.optString("currentCountry"));
            instance.setCurrentNetwork(jsonObject.optString("currentNetwork"));
            instance.setMccNcc(jsonObject.optString("mccNcc"));
            instance.setFlag(jsonObject.optString("flag"));
            instance.setIsPassportSupported(jsonObject.optBoolean("isPassportSupported"));
            instance.setIsOnPassportFriendlyNetwork(jsonObject.optBoolean("isOnPassportFriendlyNetwork"));
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