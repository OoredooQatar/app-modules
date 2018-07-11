package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrePaidNumber implements Serializable{


    private String customerNumber;

    public String getCustomerNumber(){
    return customerNumber;
    }

    public void setCustomerNumber(String customerNumber){
    this.customerNumber = customerNumber;
    }

    private String accountNumber;

    public String getAccountNumber(){
    return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
    this.accountNumber = accountNumber;
    }

    private String customerType;

    public String getCustomerType(){
    return customerType;
    }

    public void setCustomerType(String customerType){
    this.customerType = customerType;
    }

    private String idType;

    public String getIdType(){
    return idType;
    }

    public void setIdType(String idType){
    this.idType = idType;
    }

    private String idValue;

    public String getIdValue(){
    return idValue;
    }

    public void setIdValue(String idValue){
    this.idValue = idValue;
    }

    private String simNo;

    public String getSimNo(){
    return simNo;
    }

    public void setSimNo(String simNo){
    this.simNo = simNo;
    }

    private String msisdn;

    public String getMsisdn(){
    return msisdn;
    }

    public void setMsisdn(String msisdn){
    this.msisdn = msisdn;
    }

    private String isShahryControl;

    public String getIsShahryControl(){
    return isShahryControl;
    }

    public void setIsShahryControl(String isShahryControl){
    this.isShahryControl = isShahryControl;
    }

public static PrePaidNumber fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
PrePaidNumber instance = new PrePaidNumber();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setCustomerNumber(jsonObject.optString("customerNumber"));
    instance.setAccountNumber(jsonObject.optString("accountNumber"));
    instance.setCustomerType(jsonObject.optString("customerType"));
    instance.setIdType(jsonObject.optString("idType"));
    instance.setIdValue(jsonObject.optString("idValue"));
    instance.setSimNo(jsonObject.optString("simNo"));
    instance.setMsisdn(jsonObject.optString("msisdn"));
    instance.setIsShahryControl(jsonObject.optString("isShahryControl"));
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