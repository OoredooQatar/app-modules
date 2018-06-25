package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BillInquiry implements Serializable{


    private String accountNumber;

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    private String accountBalance;

    public String getAccountBalance(){
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance){
        this.accountBalance = accountBalance;
    }

    private String billedBalance;

    public String getBilledBalance(){
        return billedBalance;
    }

    public void setBilledBalance(String billedBalance){
        this.billedBalance = billedBalance;
    }

    private String unbilledBalance;

    public String getUnbilledBalance(){
        return unbilledBalance;
    }

    public void setUnbilledBalance(String unbilledBalance){
        this.unbilledBalance = unbilledBalance;
    }

    private Date dueDate;

    public Date getDueDate(){
        return dueDate;
    }

    public void setDueDate(Date dueDate){
        this.dueDate = dueDate;
    }

    private String accountStatus;

    public String getAccountStatus(){
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus){
        this.accountStatus = accountStatus;
    }

    private boolean vipNumber;

    public boolean getVipNumber(){
        return vipNumber;
    }

    public void setVipNumber(boolean vipNumber){
        this.vipNumber = vipNumber;
    }

    private String customerRefNum;

    public String getCustomerRefNum(){
        return customerRefNum;
    }

    public void setCustomerRefNum(String customerRefNum){
        this.customerRefNum = customerRefNum;
    }

    private String minPayableAmount;

    public String getMinPayableAmount(){
        return minPayableAmount;
    }

    public void setMinPayableAmount(String minPayableAmount){
        this.minPayableAmount = minPayableAmount;
    }

    private Date issueDate;

    public Date getIssueDate(){
        return issueDate;
    }

    public void setIssueDate(Date issueDate){
        this.issueDate = issueDate;
    }

    private String creditLimit;

    public String getCreditLimit(){
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit){
        this.creditLimit = creditLimit;
    }

    private boolean creditLimitFlag;

    public boolean getCreditLimitFlag(){
        return creditLimitFlag;
    }

    public void setCreditLimitFlag(boolean creditLimitFlag){
        this.creditLimitFlag = creditLimitFlag;
    }

    private String lastBillDownloadURL;

    public String getLastBillDownloadURL(){
        return lastBillDownloadURL;
    }

    public void setLastBillDownloadURL(String lastBillDownloadURL){
        this.lastBillDownloadURL = lastBillDownloadURL;
    }

    private String availableCreditLimit;

    public String getAvailableCreditLimit(){
        return availableCreditLimit;
    }

    public void setAvailableCreditLimit(String availableCreditLimit){
        this.availableCreditLimit = availableCreditLimit;
    }

    public static BillInquiry fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        BillInquiry instance = new BillInquiry();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setAccountNumber(jsonObject.optString("accountNumber"));
            instance.setAccountBalance(jsonObject.optString("accountBalance"));
            instance.setBilledBalance(jsonObject.optString("billedBalance"));
            instance.setUnbilledBalance(jsonObject.optString("unbilledBalance"));
            instance.setDueDate(parseDate(jsonObject,"dueDate"));
            instance.setAccountStatus(jsonObject.optString("accountStatus"));
            instance.setVipNumber(jsonObject.optBoolean("vipNumber"));
            instance.setCustomerRefNum(jsonObject.optString("customerRefNum"));
            instance.setMinPayableAmount(jsonObject.optString("minPayableAmount"));
            instance.setIssueDate(parseDate(jsonObject,"issueDate"));
            instance.setCreditLimit(jsonObject.optString("creditLimit"));
            instance.setCreditLimitFlag(jsonObject.optBoolean("creditLimitFlag"));
            instance.setLastBillDownloadURL(jsonObject.optString("lastBillDownloadURL"));
            instance.setAvailableCreditLimit(jsonObject.optString("availableCreditLimit"));
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