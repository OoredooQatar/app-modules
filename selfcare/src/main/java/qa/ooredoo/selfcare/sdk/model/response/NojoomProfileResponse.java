package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomProfileResponse implements Serializable{


    private String preferredPhoneNum;

    public String getPreferredPhoneNum(){
        return preferredPhoneNum;
    }

    public void setPreferredPhoneNum(String preferredPhoneNum){
        this.preferredPhoneNum = preferredPhoneNum;
    }

    private String locationCity;

    public String getLocationCity(){
        return locationCity;
    }

    public void setLocationCity(String locationCity){
        this.locationCity = locationCity;
    }

    private String gender;

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    private String birthDate;

    public String getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    private String preferredLanguage;

    public String getPreferredLanguage(){
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage){
        this.preferredLanguage = preferredLanguage;
    }

    private String postalAddressLine1;

    public String getPostalAddressLine1(){
        return postalAddressLine1;
    }

    public void setPostalAddressLine1(String postalAddressLine1){
        this.postalAddressLine1 = postalAddressLine1;
    }

    private String postalAddressLine2;

    public String getPostalAddressLine2(){
        return postalAddressLine2;
    }

    public void setPostalAddressLine2(String postalAddressLine2){
        this.postalAddressLine2 = postalAddressLine2;
    }

    private String postalAddressLine3;

    public String getPostalAddressLine3(){
        return postalAddressLine3;
    }

    public void setPostalAddressLine3(String postalAddressLine3){
        this.postalAddressLine3 = postalAddressLine3;
    }

    private String postOfficeBox;

    public String getPostOfficeBox(){
        return postOfficeBox;
    }

    public void setPostOfficeBox(String postOfficeBox){
        this.postOfficeBox = postOfficeBox;
    }

    private String emailAddress;

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    private String jobTitle;

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    private String hobbyInterest1;

    public String getHobbyInterest1(){
        return hobbyInterest1;
    }

    public void setHobbyInterest1(String hobbyInterest1){
        this.hobbyInterest1 = hobbyInterest1;
    }

    private String hobbyInterest2;

    public String getHobbyInterest2(){
        return hobbyInterest2;
    }

    public void setHobbyInterest2(String hobbyInterest2){
        this.hobbyInterest2 = hobbyInterest2;
    }

    private String hobbyInterest3;

    public String getHobbyInterest3(){
        return hobbyInterest3;
    }

    public void setHobbyInterest3(String hobbyInterest3){
        this.hobbyInterest3 = hobbyInterest3;
    }

    private String commonTravelDest;

    public String getCommonTravelDest(){
        return commonTravelDest;
    }

    public void setCommonTravelDest(String commonTravelDest){
        this.commonTravelDest = commonTravelDest;
    }

    private String readingInterest;

    public String getReadingInterest(){
        return readingInterest;
    }

    public void setReadingInterest(String readingInterest){
        this.readingInterest = readingInterest;
    }

    private String favoriteMovieGenreID;

    public String getFavoriteMovieGenreID(){
        return favoriteMovieGenreID;
    }

    public void setFavoriteMovieGenreID(String favoriteMovieGenreID){
        this.favoriteMovieGenreID = favoriteMovieGenreID;
    }

    private String favoriteMallID;

    public String getFavoriteMallID(){
        return favoriteMallID;
    }

    public void setFavoriteMallID(String favoriteMallID){
        this.favoriteMallID = favoriteMallID;
    }

    private String consentUsSMS;

    public String getConsentUsSMS(){
        return consentUsSMS;
    }

    public void setConsentUsSMS(String consentUsSMS){
        this.consentUsSMS = consentUsSMS;
    }

    private String consentUsEmail;

    public String getConsentUsEmail(){
        return consentUsEmail;
    }

    public void setConsentUsEmail(String consentUsEmail){
        this.consentUsEmail = consentUsEmail;
    }

    private String consentUsPaper;

    public String getConsentUsPaper(){
        return consentUsPaper;
    }

    public void setConsentUsPaper(String consentUsPaper){
        this.consentUsPaper = consentUsPaper;
    }

    private String consentUsPointsCreditedSMS;

    public String getConsentUsPointsCreditedSMS(){
        return consentUsPointsCreditedSMS;
    }

    public void setConsentUsPointsCreditedSMS(String consentUsPointsCreditedSMS){
        this.consentUsPointsCreditedSMS = consentUsPointsCreditedSMS;
    }

    private String consentPartnerSMS;

    public String getConsentPartnerSMS(){
        return consentPartnerSMS;
    }

    public void setConsentPartnerSMS(String consentPartnerSMS){
        this.consentPartnerSMS = consentPartnerSMS;
    }

    private String consentPartnerEmail;

    public String getConsentPartnerEmail(){
        return consentPartnerEmail;
    }

    public void setConsentPartnerEmail(String consentPartnerEmail){
        this.consentPartnerEmail = consentPartnerEmail;
    }

    private String consentPartnerPaper;

    public String getConsentPartnerPaper(){
        return consentPartnerPaper;
    }

    public void setConsentPartnerPaper(String consentPartnerPaper){
        this.consentPartnerPaper = consentPartnerPaper;
    }

    private String qtelCallCenterMayContact;

    public String getQtelCallCenterMayContact(){
        return qtelCallCenterMayContact;
    }

    public void setQtelCallCenterMayContact(String qtelCallCenterMayContact){
        this.qtelCallCenterMayContact = qtelCallCenterMayContact;
    }

    private String partnerCallCenterMayContact;

    public String getPartnerCallCenterMayContact(){
        return partnerCallCenterMayContact;
    }

    public void setPartnerCallCenterMayContact(String partnerCallCenterMayContact){
        this.partnerCallCenterMayContact = partnerCallCenterMayContact;
    }

    private String receiveEStatement;

    public String getReceiveEStatement(){
        return receiveEStatement;
    }

    public void setReceiveEStatement(String receiveEStatement){
        this.receiveEStatement = receiveEStatement;
    }

    private String receivePostStatement;

    public String getReceivePostStatement(){
        return receivePostStatement;
    }

    public void setReceivePostStatement(String receivePostStatement){
        this.receivePostStatement = receivePostStatement;
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

    public static NojoomProfileResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NojoomProfileResponse instance = new NojoomProfileResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPreferredPhoneNum(jsonObject.optString("preferredPhoneNum"));
            instance.setLocationCity(jsonObject.optString("locationCity"));
            instance.setGender(jsonObject.optString("gender"));
            instance.setBirthDate(jsonObject.optString("birthDate"));
            instance.setPreferredLanguage(jsonObject.optString("preferredLanguage"));
            instance.setPostalAddressLine1(jsonObject.optString("postalAddressLine1"));
            instance.setPostalAddressLine2(jsonObject.optString("postalAddressLine2"));
            instance.setPostalAddressLine3(jsonObject.optString("postalAddressLine3"));
            instance.setPostOfficeBox(jsonObject.optString("postOfficeBox"));
            instance.setEmailAddress(jsonObject.optString("emailAddress"));
            instance.setJobTitle(jsonObject.optString("jobTitle"));
            instance.setHobbyInterest1(jsonObject.optString("hobbyInterest1"));
            instance.setHobbyInterest2(jsonObject.optString("hobbyInterest2"));
            instance.setHobbyInterest3(jsonObject.optString("hobbyInterest3"));
            instance.setCommonTravelDest(jsonObject.optString("commonTravelDest"));
            instance.setReadingInterest(jsonObject.optString("readingInterest"));
            instance.setFavoriteMovieGenreID(jsonObject.optString("favoriteMovieGenreID"));
            instance.setFavoriteMallID(jsonObject.optString("favoriteMallID"));
            instance.setConsentUsSMS(jsonObject.optString("consentUsSMS"));
            instance.setConsentUsEmail(jsonObject.optString("consentUsEmail"));
            instance.setConsentUsPaper(jsonObject.optString("consentUsPaper"));
            instance.setConsentUsPointsCreditedSMS(jsonObject.optString("consentUsPointsCreditedSMS"));
            instance.setConsentPartnerSMS(jsonObject.optString("consentPartnerSMS"));
            instance.setConsentPartnerEmail(jsonObject.optString("consentPartnerEmail"));
            instance.setConsentPartnerPaper(jsonObject.optString("consentPartnerPaper"));
            instance.setQtelCallCenterMayContact(jsonObject.optString("qtelCallCenterMayContact"));
            instance.setPartnerCallCenterMayContact(jsonObject.optString("partnerCallCenterMayContact"));
            instance.setReceiveEStatement(jsonObject.optString("receiveEStatement"));
            instance.setReceivePostStatement(jsonObject.optString("receivePostStatement"));
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