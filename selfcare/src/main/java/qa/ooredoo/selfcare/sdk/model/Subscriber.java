package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Subscriber implements Serializable{


    private boolean alNokhba;

    public boolean getAlNokhba(){
        return alNokhba;
    }

    public void setAlNokhba(boolean alNokhba){
        this.alNokhba = alNokhba;
    }

    private String privilegeClubID;

    public String getPrivilegeClubID(){
        return privilegeClubID;
    }

    public void setPrivilegeClubID(String privilegeClubID){
        this.privilegeClubID = privilegeClubID;
    }

    private String qtelNumber;

    public String getQtelNumber(){
        return qtelNumber;
    }

    public void setQtelNumber(String qtelNumber){
        this.qtelNumber = qtelNumber;
    }

    private boolean isLoyaltyMember;

    public boolean getIsLoyaltyMember(){
        return isLoyaltyMember;
    }

    public void setIsLoyaltyMember(boolean isLoyaltyMember){
        this.isLoyaltyMember = isLoyaltyMember;
    }

    private Account[] accounts;

    public Account[] getAccounts(){
        return accounts;
    }

    public void setAccounts(Account[] accounts){
        this.accounts = accounts;
    }

    private String prefPhoneNo;

    public String getPrefPhoneNo(){
        return prefPhoneNo;
    }

    public void setPrefPhoneNo(String prefPhoneNo){
        this.prefPhoneNo = prefPhoneNo;
    }

    private String allAccountsCount;

    public String getAllAccountsCount(){
        return allAccountsCount;
    }

    public void setAllAccountsCount(String allAccountsCount){
        this.allAccountsCount = allAccountsCount;
    }

    private String allAccountsBill;

    public String getAllAccountsBill(){
        return allAccountsBill;
    }

    public void setAllAccountsBill(String allAccountsBill){
        this.allAccountsBill = allAccountsBill;
    }

    private NojoomInfo nojoomInfo;

    public NojoomInfo getNojoomInfo(){
        return nojoomInfo;
    }

    public void setNojoomInfo(NojoomInfo nojoomInfo){
        this.nojoomInfo = nojoomInfo;
    }

    private String userID;

    public String getUserID(){
        return userID;
    }

    public void setUserID(String userID){
        this.userID = userID;
    }

    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
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

    private String city;

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    private String poBox;

    public String getPoBox(){
        return poBox;
    }

    public void setPoBox(String poBox){
        this.poBox = poBox;
    }

    private String primaryNumber;

    public String getPrimaryNumber(){
        return primaryNumber;
    }

    public void setPrimaryNumber(String primaryNumber){
        this.primaryNumber = primaryNumber;
    }

    private String idType;

    public String getIdType(){
        return idType;
    }

    public void setIdType(String idType){
        this.idType = idType;
    }

    private String idNumber;

    public String getIdNumber(){
        return idNumber;
    }

    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }

    private String country;

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    private String userType;

    public String getUserType(){
        return userType;
    }

    public void setUserType(String userType){
        this.userType = userType;
    }

    private String userNotificationFlag;

    public String getUserNotificationFlag(){
        return userNotificationFlag;
    }

    public void setUserNotificationFlag(String userNotificationFlag){
        this.userNotificationFlag = userNotificationFlag;
    }

    private String custType;

    public String getCustType(){
        return custType;
    }

    public void setCustType(String custType){
        this.custType = custType;
    }

    private String classification;

    public String getClassification(){
        return classification;
    }

    public void setClassification(String classification){
        this.classification = classification;
    }

    private String customerRefNumber;

    public String getCustomerRefNumber(){
        return customerRefNumber;
    }

    public void setCustomerRefNumber(String customerRefNumber){
        this.customerRefNumber = customerRefNumber;
    }

    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    private String postalAddress;

    public String getPostalAddress(){
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress){
        this.postalAddress = postalAddress;
    }

    private boolean onlineUser;

    public boolean getOnlineUser(){
        return onlineUser;
    }

    public void setOnlineUser(boolean onlineUser){
        this.onlineUser = onlineUser;
    }

    private String qodpbranding;

    public String getQodpbranding(){
        return qodpbranding;
    }

    public void setQodpbranding(String qodpbranding){
        this.qodpbranding = qodpbranding;
    }

    private String qodppreferredlocation;

    public String getQodppreferredlocation(){
        return qodppreferredlocation;
    }

    public void setQodppreferredlocation(String qodppreferredlocation){
        this.qodppreferredlocation = qodppreferredlocation;
    }

    private String qodppreferredplaceofinterest;

    public String getQodppreferredplaceofinterest(){
        return qodppreferredplaceofinterest;
    }

    public void setQodppreferredplaceofinterest(String qodppreferredplaceofinterest){
        this.qodppreferredplaceofinterest = qodppreferredplaceofinterest;
    }

    private boolean qodfirstLogin;

    public boolean getQodfirstLogin(){
        return qodfirstLogin;
    }

    public void setQodfirstLogin(boolean qodfirstLogin){
        this.qodfirstLogin = qodfirstLogin;
    }

    private String companyName;

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    private String gender;

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
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

    private String customerRef;

    public String getCustomerRef(){
        return customerRef;
    }

    public void setCustomerRef(String customerRef){
        this.customerRef = customerRef;
    }

    private String status;

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    private String userHash;

    public String getUserHash(){
        return userHash;
    }

    public void setUserHash(String userHash){
        this.userHash = userHash;
    }

    private String birthDate;

    public String getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    public static Subscriber fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        Subscriber instance = new Subscriber();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setAlNokhba(jsonObject.optBoolean("alNokhba"));
            instance.setPrivilegeClubID(jsonObject.optString("privilegeClubID"));
            instance.setQtelNumber(jsonObject.optString("qtelNumber"));
            instance.setIsLoyaltyMember(jsonObject.optBoolean("isLoyaltyMember"));
            JSONArray accountsJsonArray = jsonObject.optJSONArray("accounts");
            if (accountsJsonArray != null) {
                Account[] accountsArray = new Account[accountsJsonArray.length()];
                for (int i = 0; i < accountsJsonArray.length(); i++) {
                    accountsArray[i] = Account.fromJSON(accountsJsonArray.optString(i));
                }
                instance.setAccounts(accountsArray);
            }
            instance.setPrefPhoneNo(jsonObject.optString("prefPhoneNo"));
            instance.setAllAccountsCount(jsonObject.optString("allAccountsCount"));
            instance.setAllAccountsBill(jsonObject.optString("allAccountsBill"));
            instance.setNojoomInfo(NojoomInfo.fromJSON(jsonObject.optString("nojoomInfo")));
            instance.setUserID(jsonObject.optString("userID"));
            instance.setTitle(jsonObject.optString("title"));
            instance.setFirstName(jsonObject.optString("firstName"));
            instance.setLastName(jsonObject.optString("lastName"));
            instance.setEmail(jsonObject.optString("email"));
            instance.setCity(jsonObject.optString("city"));
            instance.setPoBox(jsonObject.optString("poBox"));
            instance.setPrimaryNumber(jsonObject.optString("primaryNumber"));
            instance.setIdType(jsonObject.optString("idType"));
            instance.setIdNumber(jsonObject.optString("idNumber"));
            instance.setCountry(jsonObject.optString("country"));
            instance.setUserType(jsonObject.optString("userType"));
            instance.setUserNotificationFlag(jsonObject.optString("userNotificationFlag"));
            instance.setCustType(jsonObject.optString("custType"));
            instance.setClassification(jsonObject.optString("classification"));
            instance.setCustomerRefNumber(jsonObject.optString("customerRefNumber"));
            instance.setPassword(jsonObject.optString("password"));
            instance.setPostalAddress(jsonObject.optString("postalAddress"));
            instance.setOnlineUser(jsonObject.optBoolean("onlineUser"));
            instance.setQodpbranding(jsonObject.optString("qodpbranding"));
            instance.setQodppreferredlocation(jsonObject.optString("qodppreferredlocation"));
            instance.setQodppreferredplaceofinterest(jsonObject.optString("qodppreferredplaceofinterest"));
            instance.setQodfirstLogin(jsonObject.optBoolean("qodfirstLogin"));
            instance.setCompanyName(jsonObject.optString("companyName"));
            instance.setGender(jsonObject.optString("gender"));
            instance.setJobTitle(jsonObject.optString("jobTitle"));
            instance.setJobFunction(jsonObject.optString("jobFunction"));
            instance.setLanguage(jsonObject.optString("language"));
            instance.setIndustryType(jsonObject.optString("industryType"));
            instance.setIndustrySize(jsonObject.optString("industrySize"));
            instance.setCustomerRef(jsonObject.optString("customerRef"));
            instance.setStatus(jsonObject.optString("status"));
            instance.setUserHash(jsonObject.optString("userHash"));
            instance.setBirthDate(jsonObject.optString("birthDate"));
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