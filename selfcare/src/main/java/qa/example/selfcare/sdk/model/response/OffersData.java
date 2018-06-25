package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OffersData implements Serializable{


    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    private String image;

    public String getImage(){
        return image;
    }

    public void setImage(String image){
        this.image = image;
    }

    private String url;

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    private String buttonText;

    public String getButtonText(){
        return buttonText;
    }

    public void setButtonText(String buttonText){
        this.buttonText = buttonText;
    }

    private int status;

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    private int fulfill;

    public int getFulfill(){
        return fulfill;
    }

    public void setFulfill(int fulfill){
        this.fulfill = fulfill;
    }

    private String offerID;

    public String getOfferID(){
        return offerID;
    }

    public void setOfferID(String offerID){
        this.offerID = offerID;
    }

    private String refillId;

    public String getRefillId(){
        return refillId;
    }

    public void setRefillId(String refillId){
        this.refillId = refillId;
    }

    private String type;

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    private String categoryId;

    public String getCategoryId(){
        return categoryId;
    }

    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }

    private String notificationMessage;

    public String getNotificationMessage(){
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage){
        this.notificationMessage = notificationMessage;
    }

    private boolean copyable;

    public boolean getCopyable(){
        return copyable;
    }

    public void setCopyable(boolean copyable){
        this.copyable = copyable;
    }

    private String price;

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    private String confirmationText;

    public String getConfirmationText(){
        return confirmationText;
    }

    public void setConfirmationText(String confirmationText){
        this.confirmationText = confirmationText;
    }

    private int activeDay;

    public int getActiveDay(){
        return activeDay;
    }

    public void setActiveDay(int activeDay){
        this.activeDay = activeDay;
    }

    private int dynamicOfferId;

    public int getDynamicOfferId(){
        return dynamicOfferId;
    }

    public void setDynamicOfferId(int dynamicOfferId){
        this.dynamicOfferId = dynamicOfferId;
    }

    private String dynamicOfferStatus;

    public String getDynamicOfferStatus(){
        return dynamicOfferStatus;
    }

    public void setDynamicOfferStatus(String dynamicOfferStatus){
        this.dynamicOfferStatus = dynamicOfferStatus;
    }

    private String statusText;

    public String getStatusText(){
        return statusText;
    }

    public void setStatusText(String statusText){
        this.statusText = statusText;
    }

    private Date dynamicOfferDate;

    public Date getDynamicOfferDate(){
        return dynamicOfferDate;
    }

    public void setDynamicOfferDate(Date dynamicOfferDate){
        this.dynamicOfferDate = dynamicOfferDate;
    }

    private String dynamicOfferSender;

    public String getDynamicOfferSender(){
        return dynamicOfferSender;
    }

    public void setDynamicOfferSender(String dynamicOfferSender){
        this.dynamicOfferSender = dynamicOfferSender;
    }

    private String screenId;

    public String getScreenId(){
        return screenId;
    }

    public void setScreenId(String screenId){
        this.screenId = screenId;
    }

    public static OffersData fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        OffersData instance = new OffersData();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setTitle(jsonObject.optString("title"));
            instance.setDescription(jsonObject.optString("description"));
            instance.setImage(jsonObject.optString("image"));
            instance.setUrl(jsonObject.optString("url"));
            instance.setButtonText(jsonObject.optString("buttonText"));
            instance.setStatus(jsonObject.optInt("status"));
            instance.setFulfill(jsonObject.optInt("fulfill"));
            instance.setOfferID(jsonObject.optString("offerID"));
            instance.setRefillId(jsonObject.optString("refillId"));
            instance.setType(jsonObject.optString("type"));
            instance.setCategoryId(jsonObject.optString("categoryId"));
            instance.setNotificationMessage(jsonObject.optString("notificationMessage"));
            instance.setCopyable(jsonObject.optBoolean("copyable"));
            instance.setPrice(jsonObject.optString("price"));
            instance.setConfirmationText(jsonObject.optString("confirmationText"));
            instance.setActiveDay(jsonObject.optInt("activeDay"));
            instance.setDynamicOfferId(jsonObject.optInt("dynamicOfferId"));
            instance.setDynamicOfferStatus(jsonObject.optString("dynamicOfferStatus"));
            instance.setStatusText(jsonObject.optString("statusText"));
            instance.setDynamicOfferDate(parseDate(jsonObject,"dynamicOfferDate"));
            instance.setDynamicOfferSender(jsonObject.optString("dynamicOfferSender"));
            instance.setScreenId(jsonObject.optString("screenId"));
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