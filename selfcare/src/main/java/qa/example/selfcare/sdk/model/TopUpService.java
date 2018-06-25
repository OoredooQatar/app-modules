package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TopUpService implements Serializable{


    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String subscriptionCode;

    public String getSubscriptionCode(){
        return subscriptionCode;
    }

    public void setSubscriptionCode(String subscriptionCode){
        this.subscriptionCode = subscriptionCode;
    }

    private String subscriptionHandle;

    public String getSubscriptionHandle(){
        return subscriptionHandle;
    }

    public void setSubscriptionHandle(String subscriptionHandle){
        this.subscriptionHandle = subscriptionHandle;
    }

    public static TopUpService fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        TopUpService instance = new TopUpService();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setName(jsonObject.optString("name"));
            instance.setSubscriptionCode(jsonObject.optString("subscriptionCode"));
            instance.setSubscriptionHandle(jsonObject.optString("subscriptionHandle"));
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