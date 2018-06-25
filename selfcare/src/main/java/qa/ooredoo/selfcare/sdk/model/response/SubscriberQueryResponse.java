package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SubscriberQueryResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.Subscriber subscriber;

    public qa.ooredoo.selfcare.sdk.model.Subscriber getSubscriber(){
        return subscriber;
    }

    public void setSubscriber(qa.ooredoo.selfcare.sdk.model.Subscriber subscriber){
        this.subscriber = subscriber;
    }

    private qa.ooredoo.selfcare.sdk.model.AuthenticatedSubscriber authenticatedSubscriber;

    public qa.ooredoo.selfcare.sdk.model.AuthenticatedSubscriber getAuthenticatedSubscriber(){
        return authenticatedSubscriber;
    }

    public void setAuthenticatedSubscriber(qa.ooredoo.selfcare.sdk.model.AuthenticatedSubscriber authenticatedSubscriber){
        this.authenticatedSubscriber = authenticatedSubscriber;
    }

    private String token;

    public String getToken(){
        return token;
    }

    public void setToken(String token){
        this.token = token;
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

    public static SubscriberQueryResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        SubscriberQueryResponse instance = new SubscriberQueryResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setSubscriber(qa.ooredoo.selfcare.sdk.model.Subscriber.fromJSON(jsonObject.optString("subscriber")));
            instance.setAuthenticatedSubscriber(qa.ooredoo.selfcare.sdk.model.AuthenticatedSubscriber.fromJSON(jsonObject.optString("authenticatedSubscriber")));
            instance.setToken(jsonObject.optString("token"));
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