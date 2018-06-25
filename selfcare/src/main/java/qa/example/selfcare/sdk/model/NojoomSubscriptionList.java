package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomSubscriptionList implements Serializable{


    private String serviceId;

    public String getServiceId(){
        return serviceId;
    }

    public void setServiceId(String serviceId){
        this.serviceId = serviceId;
    }

    private String serviceNumber;

    public String getServiceNumber(){
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber){
        this.serviceNumber = serviceNumber;
    }

    private String serviceName;

    public String getServiceName(){
        return serviceName;
    }

    public void setServiceName(String serviceName){
        this.serviceName = serviceName;
    }

    private String serviceUser;

    public String getServiceUser(){
        return serviceUser;
    }

    public void setServiceUser(String serviceUser){
        this.serviceUser = serviceUser;
    }

    private boolean canCollectPoints;

    public boolean getCanCollectPoints(){
        return canCollectPoints;
    }

    public void setCanCollectPoints(boolean canCollectPoints){
        this.canCollectPoints = canCollectPoints;
    }

    public static NojoomSubscriptionList fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NojoomSubscriptionList instance = new NojoomSubscriptionList();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setServiceId(jsonObject.optString("serviceId"));
            instance.setServiceNumber(jsonObject.optString("serviceNumber"));
            instance.setServiceName(jsonObject.optString("serviceName"));
            instance.setServiceUser(jsonObject.optString("serviceUser"));
            instance.setCanCollectPoints(jsonObject.optBoolean("canCollectPoints"));
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