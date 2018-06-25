package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerManagementInfoResponse implements Serializable{


    private String accountAdmin;

    public String getAccountAdmin(){
    return accountAdmin;
    }

    public void setAccountAdmin(String accountAdmin){
    this.accountAdmin = accountAdmin;
    }

    private String accountAdminCell;

    public String getAccountAdminCell(){
    return accountAdminCell;
    }

    public void setAccountAdminCell(String accountAdminCell){
    this.accountAdminCell = accountAdminCell;
    }

    private String accountAdminEmail;

    public String getAccountAdminEmail(){
    return accountAdminEmail;
    }

    public void setAccountAdminEmail(String accountAdminEmail){
    this.accountAdminEmail = accountAdminEmail;
    }

    private String accountAdminFirstName;

    public String getAccountAdminFirstName(){
    return accountAdminFirstName;
    }

    public void setAccountAdminFirstName(String accountAdminFirstName){
    this.accountAdminFirstName = accountAdminFirstName;
    }

    private String accountAdminJobTitle;

    public String getAccountAdminJobTitle(){
    return accountAdminJobTitle;
    }

    public void setAccountAdminJobTitle(String accountAdminJobTitle){
    this.accountAdminJobTitle = accountAdminJobTitle;
    }

    private String accountAdminLastName;

    public String getAccountAdminLastName(){
    return accountAdminLastName;
    }

    public void setAccountAdminLastName(String accountAdminLastName){
    this.accountAdminLastName = accountAdminLastName;
    }

    private String accountAdminPhone;

    public String getAccountAdminPhone(){
    return accountAdminPhone;
    }

    public void setAccountAdminPhone(String accountAdminPhone){
    this.accountAdminPhone = accountAdminPhone;
    }

    private String accountMgr;

    public String getAccountMgr(){
    return accountMgr;
    }

    public void setAccountMgr(String accountMgr){
    this.accountMgr = accountMgr;
    }

    private String accountMgrCell;

    public String getAccountMgrCell(){
    return accountMgrCell;
    }

    public void setAccountMgrCell(String accountMgrCell){
    this.accountMgrCell = accountMgrCell;
    }

    private String accountMgrEmail;

    public String getAccountMgrEmail(){
    return accountMgrEmail;
    }

    public void setAccountMgrEmail(String accountMgrEmail){
    this.accountMgrEmail = accountMgrEmail;
    }

    private String accountMgrFirstName;

    public String getAccountMgrFirstName(){
    return accountMgrFirstName;
    }

    public void setAccountMgrFirstName(String accountMgrFirstName){
    this.accountMgrFirstName = accountMgrFirstName;
    }

    private String accountMgrJobTitle;

    public String getAccountMgrJobTitle(){
    return accountMgrJobTitle;
    }

    public void setAccountMgrJobTitle(String accountMgrJobTitle){
    this.accountMgrJobTitle = accountMgrJobTitle;
    }

    private String accountMgrLastName;

    public String getAccountMgrLastName(){
    return accountMgrLastName;
    }

    public void setAccountMgrLastName(String accountMgrLastName){
    this.accountMgrLastName = accountMgrLastName;
    }

    private String accountMgrPhone;

    public String getAccountMgrPhone(){
    return accountMgrPhone;
    }

    public void setAccountMgrPhone(String accountMgrPhone){
    this.accountMgrPhone = accountMgrPhone;
    }

    private String fullName;

    public String getFullName(){
    return fullName;
    }

    public void setFullName(String fullName){
    this.fullName = fullName;
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

public static CustomerManagementInfoResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
CustomerManagementInfoResponse instance = new CustomerManagementInfoResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setAccountAdmin(jsonObject.optString("accountAdmin"));
    instance.setAccountAdminCell(jsonObject.optString("accountAdminCell"));
    instance.setAccountAdminEmail(jsonObject.optString("accountAdminEmail"));
    instance.setAccountAdminFirstName(jsonObject.optString("accountAdminFirstName"));
    instance.setAccountAdminJobTitle(jsonObject.optString("accountAdminJobTitle"));
    instance.setAccountAdminLastName(jsonObject.optString("accountAdminLastName"));
    instance.setAccountAdminPhone(jsonObject.optString("accountAdminPhone"));
    instance.setAccountMgr(jsonObject.optString("accountMgr"));
    instance.setAccountMgrCell(jsonObject.optString("accountMgrCell"));
    instance.setAccountMgrEmail(jsonObject.optString("accountMgrEmail"));
    instance.setAccountMgrFirstName(jsonObject.optString("accountMgrFirstName"));
    instance.setAccountMgrJobTitle(jsonObject.optString("accountMgrJobTitle"));
    instance.setAccountMgrLastName(jsonObject.optString("accountMgrLastName"));
    instance.setAccountMgrPhone(jsonObject.optString("accountMgrPhone"));
    instance.setFullName(jsonObject.optString("fullName"));
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