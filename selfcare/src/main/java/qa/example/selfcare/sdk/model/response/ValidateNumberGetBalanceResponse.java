package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateNumberGetBalanceResponse implements Serializable{


    private boolean shahry;

    public boolean getShahry(){
        return shahry;
    }

    public void setShahry(boolean shahry){
        this.shahry = shahry;
    }

    private boolean hala;

    public boolean getHala(){
        return hala;
    }

    public void setHala(boolean hala){
        this.hala = hala;
    }

    private boolean halago;

    public boolean getHalago(){
        return halago;
    }

    public void setHalago(boolean halago){
        this.halago = halago;
    }

    private String balance;

    public String getBalance(){
        return balance;
    }

    public void setBalance(String balance){
        this.balance = balance;
    }

    private boolean supervisionPeriod;

    public boolean getSupervisionPeriod(){
        return supervisionPeriod;
    }

    public void setSupervisionPeriod(boolean supervisionPeriod){
        this.supervisionPeriod = supervisionPeriod;
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

    public static ValidateNumberGetBalanceResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ValidateNumberGetBalanceResponse instance = new ValidateNumberGetBalanceResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setShahry(jsonObject.optBoolean("shahry"));
            instance.setHala(jsonObject.optBoolean("hala"));
            instance.setHalago(jsonObject.optBoolean("halago"));
            instance.setBalance(jsonObject.optString("balance"));
            instance.setSupervisionPeriod(jsonObject.optBoolean("supervisionPeriod"));
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