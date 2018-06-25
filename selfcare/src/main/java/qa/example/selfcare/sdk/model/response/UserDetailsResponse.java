package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserDetailsResponse implements Serializable{


    private String hash;

    public String getHash(){
        return hash;
    }

    public void setHash(String hash){
        this.hash = hash;
    }

    private String firstName;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    private String lastName;

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    private String email;

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    private String mobileNumber;

    public String getMobileNumber(){
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
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

    private String crn;

    public String getCrn(){
        return crn;
    }

    public void setCrn(String crn){
        this.crn = crn;
    }

    private String customerRef;

    public String getCustomerRef(){
        return customerRef;
    }

    public void setCustomerRef(String customerRef){
        this.customerRef = customerRef;
    }

    private boolean contactUnderCustomerRef;

    public boolean getContactUnderCustomerRef(){
        return contactUnderCustomerRef;
    }

    public void setContactUnderCustomerRef(boolean contactUnderCustomerRef){
        this.contactUnderCustomerRef = contactUnderCustomerRef;
    }

    private String userType;

    public String getUserType(){
        return userType;
    }

    public void setUserType(String userType){
        this.userType = userType;
    }

    private String companyName;

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    private String segmant;

    public String getSegmant(){
        return segmant;
    }

    public void setSegmant(String segmant){
        this.segmant = segmant;
    }

    private String gender;

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    private String nationality;

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    private String jobTitle;

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    private String jobFunction;

    public String getJobFunction(){
        return jobFunction;
    }

    public void setJobFunction(String jobFunction){
        this.jobFunction = jobFunction;
    }

    private String language;

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    private String industryType;

    public String getIndustryType(){
        return industryType;
    }

    public void setIndustryType(String industryType){
        this.industryType = industryType;
    }

    private String industrySize;

    public String getIndustrySize(){
        return industrySize;
    }

    public void setIndustrySize(String industrySize){
        this.industrySize = industrySize;
    }

    private String birthDate;

    public String getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    private boolean firstLogin;

    public boolean getFirstLogin(){
        return firstLogin;
    }

    public void setFirstLogin(boolean firstLogin){
        this.firstLogin = firstLogin;
    }

    private String notificationFlag;

    public String getNotificationFlag(){
        return notificationFlag;
    }

    public void setNotificationFlag(String notificationFlag){
        this.notificationFlag = notificationFlag;
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

    public static UserDetailsResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        UserDetailsResponse instance = new UserDetailsResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setHash(jsonObject.optString("hash"));
            instance.setFirstName(jsonObject.optString("firstName"));
            instance.setLastName(jsonObject.optString("lastName"));
            instance.setEmail(jsonObject.optString("email"));
            instance.setMobileNumber(jsonObject.optString("mobileNumber"));
            instance.setIdType(jsonObject.optString("idType"));
            instance.setIdValue(jsonObject.optString("idValue"));
            instance.setCrn(jsonObject.optString("crn"));
            instance.setCustomerRef(jsonObject.optString("customerRef"));
            instance.setContactUnderCustomerRef(jsonObject.optBoolean("contactUnderCustomerRef"));
            instance.setUserType(jsonObject.optString("userType"));
            instance.setCompanyName(jsonObject.optString("companyName"));
            instance.setSegmant(jsonObject.optString("segmant"));
            instance.setGender(jsonObject.optString("gender"));
            instance.setNationality(jsonObject.optString("nationality"));
            instance.setJobTitle(jsonObject.optString("jobTitle"));
            instance.setJobFunction(jsonObject.optString("jobFunction"));
            instance.setLanguage(jsonObject.optString("language"));
            instance.setIndustryType(jsonObject.optString("industryType"));
            instance.setIndustrySize(jsonObject.optString("industrySize"));
            instance.setBirthDate(jsonObject.optString("birthDate"));
            instance.setFirstLogin(jsonObject.optBoolean("firstLogin"));
            instance.setNotificationFlag(jsonObject.optString("notificationFlag"));
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