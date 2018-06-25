package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OoredooStore implements Serializable{


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

    private int storeId;

    public int getStoreId(){
        return storeId;
    }

    public void setStoreId(int storeId){
        this.storeId = storeId;
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

    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    private String telephone;

    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
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

    private boolean isOpen;

    public boolean getIsOpen(){
        return isOpen;
    }

    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }

    private String servicesAvailable;

    public String getServicesAvailable(){
        return servicesAvailable;
    }

    public void setServicesAvailable(String servicesAvailable){
        this.servicesAvailable = servicesAvailable;
    }

    private String mapUrl;

    public String getMapUrl(){
        return mapUrl;
    }

    public void setMapUrl(String mapUrl){
        this.mapUrl = mapUrl;
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

    public static OoredooStore fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        OoredooStore instance = new OoredooStore();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setLatitude(jsonObject.optString("latitude"));
            instance.setLongitude(jsonObject.optString("longitude"));
            instance.setStoreId(jsonObject.optInt("storeId"));
            instance.setName(jsonObject.optString("name"));
            instance.setAddress(jsonObject.optString("address"));
            instance.setTitle(jsonObject.optString("title"));
            instance.setTelephone(jsonObject.optString("telephone"));
            instance.setBusinessHours(jsonObject.optString("businessHours"));
            instance.setWeekBusinessHours(jsonObject.optString("weekBusinessHours"));
            instance.setIsOpen(jsonObject.optBoolean("isOpen"));
            instance.setServicesAvailable(jsonObject.optString("servicesAvailable"));
            instance.setMapUrl(jsonObject.optString("mapUrl"));
            instance.setClosingTime(jsonObject.optString("closingTime"));
            instance.setAppointmentPossible(jsonObject.optBoolean("appointmentPossible"));
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