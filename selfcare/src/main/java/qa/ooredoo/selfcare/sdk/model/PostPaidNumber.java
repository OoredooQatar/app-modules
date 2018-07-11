package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PostPaidNumber implements Serializable{


    private String productName;

    public String getProductName(){
    return productName;
    }

    public void setProductName(String productName){
    this.productName = productName;
    }

    private String tariffName;

    public String getTariffName(){
    return tariffName;
    }

    public void setTariffName(String tariffName){
    this.tariffName = tariffName;
    }

    private String eventSource;

    public String getEventSource(){
    return eventSource;
    }

    public void setEventSource(String eventSource){
    this.eventSource = eventSource;
    }

    private String accountNumber;

    public String getAccountNumber(){
    return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
    this.accountNumber = accountNumber;
    }

    private String invoiceNetMoney;

    public String getInvoiceNetMoney(){
    return invoiceNetMoney;
    }

    public void setInvoiceNetMoney(String invoiceNetMoney){
    this.invoiceNetMoney = invoiceNetMoney;
    }

    private String paymentDueDate;

    public String getPaymentDueDate(){
    return paymentDueDate;
    }

    public void setPaymentDueDate(String paymentDueDate){
    this.paymentDueDate = paymentDueDate;
    }

    private String unbilledUsage;

    public String getUnbilledUsage(){
    return unbilledUsage;
    }

    public void setUnbilledUsage(String unbilledUsage){
    this.unbilledUsage = unbilledUsage;
    }

public static PostPaidNumber fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
PostPaidNumber instance = new PostPaidNumber();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setProductName(jsonObject.optString("productName"));
    instance.setTariffName(jsonObject.optString("tariffName"));
    instance.setEventSource(jsonObject.optString("eventSource"));
    instance.setAccountNumber(jsonObject.optString("accountNumber"));
    instance.setInvoiceNetMoney(jsonObject.optString("invoiceNetMoney"));
    instance.setPaymentDueDate(jsonObject.optString("paymentDueDate"));
    instance.setUnbilledUsage(jsonObject.optString("unbilledUsage"));
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