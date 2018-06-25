package qa.ooredoo.selfcare.sdk.backend.services.cms;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class B2B_ParkedRequest implements Serializable{


    private int id;

    public int getId(){
    return id;
    }

    public void setId(int id){
    this.id = id;
    }

    private String customerRefNumber;

    public String getCustomerRefNumber(){
    return customerRefNumber;
    }

    public void setCustomerRefNumber(String customerRefNumber){
    this.customerRefNumber = customerRefNumber;
    }

    private String serviceNumber;

    public String getServiceNumber(){
    return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber){
    this.serviceNumber = serviceNumber;
    }

    private String accountNumber;

    public String getAccountNumber(){
    return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
    this.accountNumber = accountNumber;
    }

    private String customerName;

    public String getCustomerName(){
    return customerName;
    }

    public void setCustomerName(String customerName){
    this.customerName = customerName;
    }

    private String customerSurname;

    public String getCustomerSurname(){
    return customerSurname;
    }

    public void setCustomerSurname(String customerSurname){
    this.customerSurname = customerSurname;
    }

    private String requestedProduct;

    public String getRequestedProduct(){
    return requestedProduct;
    }

    public void setRequestedProduct(String requestedProduct){
    this.requestedProduct = requestedProduct;
    }

    private String subscriptionHandle;

    public String getSubscriptionHandle(){
    return subscriptionHandle;
    }

    public void setSubscriptionHandle(String subscriptionHandle){
    this.subscriptionHandle = subscriptionHandle;
    }

    private String subscriptionCode;

    public String getSubscriptionCode(){
    return subscriptionCode;
    }

    public void setSubscriptionCode(String subscriptionCode){
    this.subscriptionCode = subscriptionCode;
    }

    private String language;

    public String getLanguage(){
    return language;
    }

    public void setLanguage(String language){
    this.language = language;
    }

    private boolean forActivate;

    public boolean getForActivate(){
    return forActivate;
    }

    public void setForActivate(boolean forActivate){
    this.forActivate = forActivate;
    }

    private String status;

    public String getStatus(){
    return status;
    }

    public void setStatus(String status){
    this.status = status;
    }

    private Date created;

    public Date getCreated(){
    return created;
    }

    public void setCreated(Date created){
    this.created = created;
    }

    private Date updated;

    public Date getUpdated(){
    return updated;
    }

    public void setUpdated(Date updated){
    this.updated = updated;
    }

    private String groupName;

    public String getGroupName(){
    return groupName;
    }

    public void setGroupName(String groupName){
    this.groupName = groupName;
    }

    private String labelName;

    public String getLabelName(){
    return labelName;
    }

    public void setLabelName(String labelName){
    this.labelName = labelName;
    }

    private String deptName;

    public String getDeptName(){
    return deptName;
    }

    public void setDeptName(String deptName){
    this.deptName = deptName;
    }

    private String idName;

    public String getIdName(){
    return idName;
    }

    public void setIdName(String idName){
    this.idName = idName;
    }

    private String createdText;

    public String getCreatedText(){
    return createdText;
    }

    public void setCreatedText(String createdText){
    this.createdText = createdText;
    }

public static B2B_ParkedRequest fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
B2B_ParkedRequest instance = new B2B_ParkedRequest();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setId(jsonObject.optInt("id"));
    instance.setCustomerRefNumber(jsonObject.optString("customerRefNumber"));
    instance.setServiceNumber(jsonObject.optString("serviceNumber"));
    instance.setAccountNumber(jsonObject.optString("accountNumber"));
    instance.setCustomerName(jsonObject.optString("customerName"));
    instance.setCustomerSurname(jsonObject.optString("customerSurname"));
    instance.setRequestedProduct(jsonObject.optString("requestedProduct"));
    instance.setSubscriptionHandle(jsonObject.optString("subscriptionHandle"));
    instance.setSubscriptionCode(jsonObject.optString("subscriptionCode"));
    instance.setLanguage(jsonObject.optString("language"));
    instance.setForActivate(jsonObject.optBoolean("forActivate"));
    instance.setStatus(jsonObject.optString("status"));
    instance.setCreated(parseDate(jsonObject,"created"));
    instance.setUpdated(parseDate(jsonObject,"updated"));
    instance.setGroupName(jsonObject.optString("groupName"));
    instance.setLabelName(jsonObject.optString("labelName"));
    instance.setDeptName(jsonObject.optString("deptName"));
    instance.setIdName(jsonObject.optString("idName"));
    instance.setCreatedText(jsonObject.optString("createdText"));
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