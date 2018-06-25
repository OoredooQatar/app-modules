package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductTypeValidationResponse implements Serializable{


    private String productType;

    public String getProductType(){
        return productType;
    }

    public void setProductType(String productType){
        this.productType = productType;
    }

    private String productStatus;

    public String getProductStatus(){
        return productStatus;
    }

    public void setProductStatus(String productStatus){
        this.productStatus = productStatus;
    }

    private double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    private double creditLimit;

    public double getCreditLimit(){
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit){
        this.creditLimit = creditLimit;
    }

    private boolean supervisionPeriod;

    public boolean getSupervisionPeriod(){
        return supervisionPeriod;
    }

    public void setSupervisionPeriod(boolean supervisionPeriod){
        this.supervisionPeriod = supervisionPeriod;
    }

    private boolean onlyTopupForValidityExtensionAllowed;

    public boolean getOnlyTopupForValidityExtensionAllowed(){
        return onlyTopupForValidityExtensionAllowed;
    }

    public void setOnlyTopupForValidityExtensionAllowed(boolean onlyTopupForValidityExtensionAllowed){
        this.onlyTopupForValidityExtensionAllowed = onlyTopupForValidityExtensionAllowed;
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

    public static ProductTypeValidationResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ProductTypeValidationResponse instance = new ProductTypeValidationResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setProductType(jsonObject.optString("productType"));
            instance.setProductStatus(jsonObject.optString("productStatus"));
            instance.setBalance(jsonObject.optDouble("balance"));
            instance.setCreditLimit(jsonObject.optDouble("creditLimit"));
            instance.setSupervisionPeriod(jsonObject.optBoolean("supervisionPeriod"));
            instance.setOnlyTopupForValidityExtensionAllowed(jsonObject.optBoolean("onlyTopupForValidityExtensionAllowed"));
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