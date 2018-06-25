package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PostpaidKeyStatusResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.Tariff subscribedTariff;

    public qa.ooredoo.selfcare.sdk.model.Tariff getSubscribedTariff(){
        return subscribedTariff;
    }

    public void setSubscribedTariff(qa.ooredoo.selfcare.sdk.model.Tariff subscribedTariff){
        this.subscribedTariff = subscribedTariff;
    }

    private boolean active;

    public boolean getActive(){
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    private boolean isPromoActive;

    public boolean getIsPromoActive(){
        return isPromoActive;
    }

    public void setIsPromoActive(boolean isPromoActive){
        this.isPromoActive = isPromoActive;
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

    public static PostpaidKeyStatusResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        PostpaidKeyStatusResponse instance = new PostpaidKeyStatusResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setSubscribedTariff(qa.ooredoo.selfcare.sdk.model.Tariff.fromJSON(jsonObject.optString("subscribedTariff")));
            instance.setActive(jsonObject.optBoolean("active"));
            instance.setIsPromoActive(jsonObject.optBoolean("isPromoActive"));
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