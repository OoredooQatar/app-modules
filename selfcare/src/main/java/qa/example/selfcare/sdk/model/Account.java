package qa.example.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account implements Serializable{


    private boolean prepaid;

    public boolean getPrepaid(){
        return prepaid;
    }

    public void setPrepaid(boolean prepaid){
        this.prepaid = prepaid;
    }

    private String accountNumber;

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    private String status;

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    private String accountName;

    public String getAccountName(){
        return accountName;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    private String serviceType;

    public String getServiceType(){
        return serviceType;
    }

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    private Date creationDate;

    public Date getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }

    private String customerClass;

    public String getCustomerClass(){
        return customerClass;
    }

    public void setCustomerClass(String customerClass){
        this.customerClass = customerClass;
    }

    private String classificationType;

    public String getClassificationType(){
        return classificationType;
    }

    public void setClassificationType(String classificationType){
        this.classificationType = classificationType;
    }

    private Date billCycleCode;

    public Date getBillCycleCode(){
        return billCycleCode;
    }

    public void setBillCycleCode(Date billCycleCode){
        this.billCycleCode = billCycleCode;
    }

    private Service[] services;

    public Service[] getServices(){
        return services;
    }

    public void setServices(Service[] services){
        this.services = services;
    }

    private BillInquiry billInquiry;

    public BillInquiry getBillInquiry(){
        return billInquiry;
    }

    public void setBillInquiry(BillInquiry billInquiry){
        this.billInquiry = billInquiry;
    }

    public static Account fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        Account instance = new Account();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPrepaid(jsonObject.optBoolean("prepaid"));
            instance.setAccountNumber(jsonObject.optString("accountNumber"));
            instance.setStatus(jsonObject.optString("status"));
            instance.setAccountName(jsonObject.optString("accountName"));
            instance.setServiceType(jsonObject.optString("serviceType"));
            instance.setCreationDate(parseDate(jsonObject,"creationDate"));
            instance.setCustomerClass(jsonObject.optString("customerClass"));
            instance.setClassificationType(jsonObject.optString("classificationType"));
            instance.setBillCycleCode(parseDate(jsonObject,"billCycleCode"));
            JSONArray servicesJsonArray = jsonObject.optJSONArray("services");
            if (servicesJsonArray != null) {
                Service[] servicesArray = new Service[servicesJsonArray.length()];
                for (int i = 0; i < servicesJsonArray.length(); i++) {
                    servicesArray[i] = Service.fromJSON(servicesJsonArray.optString(i));
                }
                instance.setServices(servicesArray);
            }
            instance.setBillInquiry(BillInquiry.fromJSON(jsonObject.optString("billInquiry")));
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