package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RoamingRates implements Serializable{


    private String callingQatarRate;

    public String getCallingQatarRate(){
    return callingQatarRate;
    }

    public void setCallingQatarRate(String callingQatarRate){
    this.callingQatarRate = callingQatarRate;
    }

    private String callingSameCountryRate;

    public String getCallingSameCountryRate(){
    return callingSameCountryRate;
    }

    public void setCallingSameCountryRate(String callingSameCountryRate){
    this.callingSameCountryRate = callingSameCountryRate;
    }

    private String callingAnotherCountryRate;

    public String getCallingAnotherCountryRate(){
    return callingAnotherCountryRate;
    }

    public void setCallingAnotherCountryRate(String callingAnotherCountryRate){
    this.callingAnotherCountryRate = callingAnotherCountryRate;
    }

    private String receivingCallRate;

    public String getReceivingCallRate(){
    return receivingCallRate;
    }

    public void setReceivingCallRate(String receivingCallRate){
    this.receivingCallRate = receivingCallRate;
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

    private String rateType;

    public String getRateType(){
    return rateType;
    }

    public void setRateType(String rateType){
    this.rateType = rateType;
    }

public static RoamingRates fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
RoamingRates instance = new RoamingRates();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setCallingQatarRate(jsonObject.optString("callingQatarRate"));
    instance.setCallingSameCountryRate(jsonObject.optString("callingSameCountryRate"));
    instance.setCallingAnotherCountryRate(jsonObject.optString("callingAnotherCountryRate"));
    instance.setReceivingCallRate(jsonObject.optString("receivingCallRate"));
    instance.setSmsRate(jsonObject.optString("smsRate"));
    instance.setInternetRate(jsonObject.optString("internetRate"));
    instance.setRateType(jsonObject.optString("rateType"));
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