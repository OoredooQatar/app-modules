package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomInfo implements Serializable{


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

    private String middleName;

    public String getMiddleName(){
        return middleName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    private String surName;

    public String getSurName(){
        return surName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    private String status;

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    private String preferredPhoneNum;

    public String getPreferredPhoneNum(){
        return preferredPhoneNum;
    }

    public void setPreferredPhoneNum(String preferredPhoneNum){
        this.preferredPhoneNum = preferredPhoneNum;
    }

    private int awardPointsAvailable;

    public int getAwardPointsAvailable(){
        return awardPointsAvailable;
    }

    public void setAwardPointsAvailable(int awardPointsAvailable){
        this.awardPointsAvailable = awardPointsAvailable;
    }

    private int totalTierPoints;

    public int getTotalTierPoints(){
        return totalTierPoints;
    }

    public void setTotalTierPoints(int totalTierPoints){
        this.totalTierPoints = totalTierPoints;
    }

    private int awardPointsOnHold;

    public int getAwardPointsOnHold(){
        return awardPointsOnHold;
    }

    public void setAwardPointsOnHold(int awardPointsOnHold){
        this.awardPointsOnHold = awardPointsOnHold;
    }

    private String tierCode;

    public String getTierCode(){
        return tierCode;
    }

    public void setTierCode(String tierCode){
        this.tierCode = tierCode;
    }

    private String tierName;

    public String getTierName(){
        return tierName;
    }

    public void setTierName(String tierName){
        this.tierName = tierName;
    }

    private int totalAwardPoints;

    public int getTotalAwardPoints(){
        return totalAwardPoints;
    }

    public void setTotalAwardPoints(int totalAwardPoints){
        this.totalAwardPoints = totalAwardPoints;
    }

    private int expiringPoints;

    public int getExpiringPoints(){
        return expiringPoints;
    }

    public void setExpiringPoints(int expiringPoints){
        this.expiringPoints = expiringPoints;
    }

    private String loyaltyMemberID;

    public String getLoyaltyMemberID(){
        return loyaltyMemberID;
    }

    public void setLoyaltyMemberID(String loyaltyMemberID){
        this.loyaltyMemberID = loyaltyMemberID;
    }

    private String serviceType;

    public String getServiceType(){
        return serviceType;
    }

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    private int expiringPoints1;

    public int getExpiringPoints1(){
        return expiringPoints1;
    }

    public void setExpiringPoints1(int expiringPoints1){
        this.expiringPoints1 = expiringPoints1;
    }

    private String expiryDate1;

    public String getExpiryDate1(){
        return expiryDate1;
    }

    public void setExpiryDate1(String expiryDate1){
        this.expiryDate1 = expiryDate1;
    }

    private int expiringPoints2;

    public int getExpiringPoints2(){
        return expiringPoints2;
    }

    public void setExpiringPoints2(int expiringPoints2){
        this.expiringPoints2 = expiringPoints2;
    }

    private String expiryDate2;

    public String getExpiryDate2(){
        return expiryDate2;
    }

    public void setExpiryDate2(String expiryDate2){
        this.expiryDate2 = expiryDate2;
    }

    private String forceRegisteredNumber;

    public String getForceRegisteredNumber(){
        return forceRegisteredNumber;
    }

    public void setForceRegisteredNumber(String forceRegisteredNumber){
        this.forceRegisteredNumber = forceRegisteredNumber;
    }

    private String forceEmailAddress;

    public String getForceEmailAddress(){
        return forceEmailAddress;
    }

    public void setForceEmailAddress(String forceEmailAddress){
        this.forceEmailAddress = forceEmailAddress;
    }

    private int pointsUntilNextTier;

    public int getPointsUntilNextTier(){
        return pointsUntilNextTier;
    }

    public void setPointsUntilNextTier(int pointsUntilNextTier){
        this.pointsUntilNextTier = pointsUntilNextTier;
    }

    public static NojoomInfo fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NojoomInfo instance = new NojoomInfo();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setTitle(jsonObject.optString("title"));
            instance.setFirstName(jsonObject.optString("firstName"));
            instance.setMiddleName(jsonObject.optString("middleName"));
            instance.setSurName(jsonObject.optString("surName"));
            instance.setStatus(jsonObject.optString("status"));
            instance.setPreferredPhoneNum(jsonObject.optString("preferredPhoneNum"));
            instance.setAwardPointsAvailable(jsonObject.optInt("awardPointsAvailable"));
            instance.setTotalTierPoints(jsonObject.optInt("totalTierPoints"));
            instance.setAwardPointsOnHold(jsonObject.optInt("awardPointsOnHold"));
            instance.setTierCode(jsonObject.optString("tierCode"));
            instance.setTierName(jsonObject.optString("tierName"));
            instance.setTotalAwardPoints(jsonObject.optInt("totalAwardPoints"));
            instance.setExpiringPoints(jsonObject.optInt("expiringPoints"));
            instance.setLoyaltyMemberID(jsonObject.optString("loyaltyMemberID"));
            instance.setServiceType(jsonObject.optString("serviceType"));
            instance.setExpiringPoints1(jsonObject.optInt("expiringPoints1"));
            instance.setExpiryDate1(jsonObject.optString("expiryDate1"));
            instance.setExpiringPoints2(jsonObject.optInt("expiringPoints2"));
            instance.setExpiryDate2(jsonObject.optString("expiryDate2"));
            instance.setForceRegisteredNumber(jsonObject.optString("forceRegisteredNumber"));
            instance.setForceEmailAddress(jsonObject.optString("forceEmailAddress"));
            instance.setPointsUntilNextTier(jsonObject.optInt("pointsUntilNextTier"));
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