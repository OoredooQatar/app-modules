package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StoreInfoResponse implements Serializable{


    private long serialVersionUID;

    public long getSerialVersionUID(){
        return serialVersionUID;
    }

    public void setSerialVersionUID(long serialVersionUID){
        this.serialVersionUID = serialVersionUID;
    }

    private String averageWaitingTime;

    public String getAverageWaitingTime(){
        return averageWaitingTime;
    }

    public void setAverageWaitingTime(String averageWaitingTime){
        this.averageWaitingTime = averageWaitingTime;
    }

    private String customersBeingServed;

    public String getCustomersBeingServed(){
        return customersBeingServed;
    }

    public void setCustomersBeingServed(String customersBeingServed){
        this.customersBeingServed = customersBeingServed;
    }

    private String customersWaiting;

    public String getCustomersWaiting(){
        return customersWaiting;
    }

    public void setCustomersWaiting(String customersWaiting){
        this.customersWaiting = customersWaiting;
    }

    private String maxWaitingTime;

    public String getMaxWaitingTime(){
        return maxWaitingTime;
    }

    public void setMaxWaitingTime(String maxWaitingTime){
        this.maxWaitingTime = maxWaitingTime;
    }

    private String totalWaitingTime;

    public String getTotalWaitingTime(){
        return totalWaitingTime;
    }

    public void setTotalWaitingTime(String totalWaitingTime){
        this.totalWaitingTime = totalWaitingTime;
    }

    private boolean isOpen;

    public boolean getIsOpen(){
        return isOpen;
    }

    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String address;

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    private String latitude;

    public String getLatitude(){
        return latitude;
    }

    public void setLatitude(String latitude){
        this.latitude = latitude;
    }

    private String longitude;

    public String getLongitude(){
        return longitude;
    }

    public void setLongitude(String longitude){
        this.longitude = longitude;
    }

    private String businessHours;

    public String getBusinessHours(){
        return businessHours;
    }

    public void setBusinessHours(String businessHours){
        this.businessHours = businessHours;
    }

    private String weekBusinessHours;

    public String getWeekBusinessHours(){
        return weekBusinessHours;
    }

    public void setWeekBusinessHours(String weekBusinessHours){
        this.weekBusinessHours = weekBusinessHours;
    }

    private String closingTime;

    public String getClosingTime(){
        return closingTime;
    }

    public void setClosingTime(String closingTime){
        this.closingTime = closingTime;
    }

    private boolean appointmentPossible;

    public boolean getAppointmentPossible(){
        return appointmentPossible;
    }

    public void setAppointmentPossible(boolean appointmentPossible){
        this.appointmentPossible = appointmentPossible;
    }

    private String telephone;

    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
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

    public static StoreInfoResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        StoreInfoResponse instance = new StoreInfoResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setSerialVersionUID(jsonObject.optLong("serialVersionUID"));
            instance.setAverageWaitingTime(jsonObject.optString("averageWaitingTime"));
            instance.setCustomersBeingServed(jsonObject.optString("customersBeingServed"));
            instance.setCustomersWaiting(jsonObject.optString("customersWaiting"));
            instance.setMaxWaitingTime(jsonObject.optString("maxWaitingTime"));
            instance.setTotalWaitingTime(jsonObject.optString("totalWaitingTime"));
            instance.setIsOpen(jsonObject.optBoolean("isOpen"));
            instance.setName(jsonObject.optString("name"));
            instance.setAddress(jsonObject.optString("address"));
            instance.setLatitude(jsonObject.optString("latitude"));
            instance.setLongitude(jsonObject.optString("longitude"));
            instance.setBusinessHours(jsonObject.optString("businessHours"));
            instance.setWeekBusinessHours(jsonObject.optString("weekBusinessHours"));
            instance.setClosingTime(jsonObject.optString("closingTime"));
            instance.setAppointmentPossible(jsonObject.optBoolean("appointmentPossible"));
            instance.setTelephone(jsonObject.optString("telephone"));
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