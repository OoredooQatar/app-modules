package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RoamingAllUsage implements Serializable{


    private String remainingValue;

    public String getRemainingValue(){
        return remainingValue;
    }

    public void setRemainingValue(String remainingValue){
        this.remainingValue = remainingValue;
    }

    private String subscribedValue;

    public String getSubscribedValue(){
        return subscribedValue;
    }

    public void setSubscribedValue(String subscribedValue){
        this.subscribedValue = subscribedValue;
    }

    private String minimumValue;

    public String getMinimumValue(){
        return minimumValue;
    }

    public void setMinimumValue(String minimumValue){
        this.minimumValue = minimumValue;
    }

    private String maxValue;

    public String getMaxValue(){
        return maxValue;
    }

    public void setMaxValue(String maxValue){
        this.maxValue = maxValue;
    }

    public static RoamingAllUsage fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        RoamingAllUsage instance = new RoamingAllUsage();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setRemainingValue(jsonObject.optString("remainingValue"));
            instance.setSubscribedValue(jsonObject.optString("subscribedValue"));
            instance.setMinimumValue(jsonObject.optString("minimumValue"));
            instance.setMaxValue(jsonObject.optString("maxValue"));
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