package qa.ooredoo.selfcare.sdk.backend.ucip;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrepaidService implements Serializable{


    private String serviceGroup;

    public String getServiceGroup(){
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup){
        this.serviceGroup = serviceGroup;
    }

    private String serviceCode;

    public String getServiceCode(){
        return serviceCode;
    }

    public void setServiceCode(String serviceCode){
        this.serviceCode = serviceCode;
    }

    private String serviceState;

    public String getServiceState(){
        return serviceState;
    }

    public void setServiceState(String serviceState){
        this.serviceState = serviceState;
    }

    private Date expiryDate;

    public Date getExpiryDate(){
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate){
        this.expiryDate = expiryDate;
    }

    private boolean pendingCancellation;

    public boolean getPendingCancellation(){
        return pendingCancellation;
    }

    public void setPendingCancellation(boolean pendingCancellation){
        this.pendingCancellation = pendingCancellation;
    }

    private String recurringCharge;

    public String getRecurringCharge(){
        return recurringCharge;
    }

    public void setRecurringCharge(String recurringCharge){
        this.recurringCharge = recurringCharge;
    }

    private String activationCharge;

    public String getActivationCharge(){
        return activationCharge;
    }

    public void setActivationCharge(String activationCharge){
        this.activationCharge = activationCharge;
    }

    public static PrepaidService fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        PrepaidService instance = new PrepaidService();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setServiceGroup(jsonObject.optString("serviceGroup"));
            instance.setServiceCode(jsonObject.optString("serviceCode"));
            instance.setServiceState(jsonObject.optString("serviceState"));
            instance.setExpiryDate(parseDate(jsonObject,"expiryDate"));
            instance.setPendingCancellation(jsonObject.optBoolean("pendingCancellation"));
            instance.setRecurringCharge(jsonObject.optString("recurringCharge"));
            instance.setActivationCharge(jsonObject.optString("activationCharge"));
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