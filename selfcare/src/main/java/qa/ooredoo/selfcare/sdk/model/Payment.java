package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment implements Serializable{


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private String accountNumber;

    private String paymentSequence;

    public String getPaymentSequence(){
        return paymentSequence;
    }

    public void setPaymentSequence(String paymentSequence){
        this.paymentSequence = paymentSequence;
    }

    private String amount;

    public String getAmount(){
        return amount;
    }

    public void setAmount(String amount){
        this.amount = amount;
    }

    private String date;

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    private String paymentMethodName;

    public String getPaymentMethodName(){
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName){
        this.paymentMethodName = paymentMethodName;
    }

    private String status;

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    private String referenceNumber;

    public String getReferenceNumber(){
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber){
        this.referenceNumber = referenceNumber;
    }

    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public static Payment fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        Payment instance = new Payment();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setAccountNumber(jsonObject.optString("accountNumber"));
            instance.setPaymentSequence(jsonObject.optString("paymentSequence"));
            instance.setAmount(jsonObject.optString("amount"));
            instance.setDate(jsonObject.optString("date"));
            instance.setPaymentMethodName(jsonObject.optString("paymentMethodName"));
            instance.setStatus(jsonObject.optString("status"));
            instance.setReferenceNumber(jsonObject.optString("referenceNumber"));
            instance.setDescription(jsonObject.optString("description"));
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