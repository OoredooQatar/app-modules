package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CountryOperator implements Serializable{


    private String telecom;

    public String getTelecom(){
    return telecom;
    }

    public void setTelecom(String telecom){
    this.telecom = telecom;
    }

    private String stateId;

    public String getStateId(){
    return stateId;
    }

    public void setStateId(String stateId){
    this.stateId = stateId;
    }

    private String serviceId;

    public String getServiceId(){
    return serviceId;
    }

    public void setServiceId(String serviceId){
    this.serviceId = serviceId;
    }

    private boolean fourthGeneration;

    public boolean getFourthGeneration(){
    return fourthGeneration;
    }

    public void setFourthGeneration(boolean fourthGeneration){
    this.fourthGeneration = fourthGeneration;
    }

    private boolean passportSupport;

    public boolean getPassportSupport(){
    return passportSupport;
    }

    public void setPassportSupport(boolean passportSupport){
    this.passportSupport = passportSupport;
    }

public static CountryOperator fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
CountryOperator instance = new CountryOperator();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setTelecom(jsonObject.optString("telecom"));
    instance.setStateId(jsonObject.optString("stateId"));
    instance.setServiceId(jsonObject.optString("serviceId"));
    instance.setFourthGeneration(jsonObject.optBoolean("fourthGeneration"));
    instance.setPassportSupport(jsonObject.optBoolean("passportSupport"));
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