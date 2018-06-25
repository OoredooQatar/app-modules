package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TopUpResponse implements Serializable{


    private String dataCashRef;

    public String getDataCashRef(){
        return dataCashRef;
    }

    public void setDataCashRef(String dataCashRef){
        this.dataCashRef = dataCashRef;
    }

    private String date;

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    private String amount;

    public String getAmount(){
        return amount;
    }

    public void setAmount(String amount){
        this.amount = amount;
    }

    private String serviceNumber;

    public String getServiceNumber(){
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber){
        this.serviceNumber = serviceNumber;
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

    public static TopUpResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        TopUpResponse instance = new TopUpResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setDataCashRef(jsonObject.optString("dataCashRef"));
            instance.setDate(jsonObject.optString("date"));
            instance.setAmount(jsonObject.optString("amount"));
            instance.setServiceNumber(jsonObject.optString("serviceNumber"));
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