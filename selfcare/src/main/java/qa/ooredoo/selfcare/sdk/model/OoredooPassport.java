package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OoredooPassport implements Serializable{


    private String country;

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    private String telecom;

    public String getTelecom(){
        return telecom;
    }

    public void setTelecom(String telecom){
        this.telecom = telecom;
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

    private String callingSameCountryRate;

    public String getCallingSameCountryRate(){
        return callingSameCountryRate;
    }

    public void setCallingSameCountryRate(String callingSameCountryRate){
        this.callingSameCountryRate = callingSameCountryRate;
    }

    private String callingQatarRate;

    public String getCallingQatarRate(){
        return callingQatarRate;
    }

    public void setCallingQatarRate(String callingQatarRate){
        this.callingQatarRate = callingQatarRate;
    }

    private String callingAnotherCountryRate;

    public String getCallingAnotherCountryRate(){
        return callingAnotherCountryRate;
    }

    public void setCallingAnotherCountryRate(String callingAnotherCountryRate){
        this.callingAnotherCountryRate = callingAnotherCountryRate;
    }

    private String receivingCallsRate;

    public String getReceivingCallsRate(){
        return receivingCallsRate;
    }

    public void setReceivingCallsRate(String receivingCallsRate){
        this.receivingCallsRate = receivingCallsRate;
    }

    private String smsRate;

    public String getSmsRate(){
        return smsRate;
    }

    public void setSmsRate(String smsRate){
        this.smsRate = smsRate;
    }

    private String internetRate;

    public String getInternetRate(){
        return internetRate;
    }

    public void setInternetRate(String internetRate){
        this.internetRate = internetRate;
    }

    public static OoredooPassport fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        OoredooPassport instance = new OoredooPassport();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCountry(jsonObject.optString("country"));
            instance.setTelecom(jsonObject.optString("telecom"));
            instance.setFourthGeneration(jsonObject.optBoolean("fourthGeneration"));
            instance.setPassportSupport(jsonObject.optBoolean("passportSupport"));
            instance.setCallingSameCountryRate(jsonObject.optString("callingSameCountryRate"));
            instance.setCallingQatarRate(jsonObject.optString("callingQatarRate"));
            instance.setCallingAnotherCountryRate(jsonObject.optString("callingAnotherCountryRate"));
            instance.setReceivingCallsRate(jsonObject.optString("receivingCallsRate"));
            instance.setSmsRate(jsonObject.optString("smsRate"));
            instance.setInternetRate(jsonObject.optString("internetRate"));
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