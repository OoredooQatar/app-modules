package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentDetailsResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.Payment[] paymentDetails;

    public qa.ooredoo.selfcare.sdk.model.Payment[] getPaymentDetails(){
        return paymentDetails;
    }

    public void setPaymentDetails(qa.ooredoo.selfcare.sdk.model.Payment[] paymentDetails){
        this.paymentDetails = paymentDetails;
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

    public static PaymentDetailsResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        PaymentDetailsResponse instance = new PaymentDetailsResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray paymentDetailsJsonArray = jsonObject.optJSONArray("paymentDetails");
            if (paymentDetailsJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.Payment[] paymentDetailsArray = new qa.ooredoo.selfcare.sdk.model.Payment[paymentDetailsJsonArray.length()];
                for (int i = 0; i < paymentDetailsJsonArray.length(); i++) {
                    paymentDetailsArray[i] = qa.ooredoo.selfcare.sdk.model.Payment.fromJSON(paymentDetailsJsonArray.optString(i));
                }
                instance.setPaymentDetails(paymentDetailsArray);
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