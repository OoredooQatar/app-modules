package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BalanceOPC implements Serializable{


    private String startDate;

    public String getStartDate(){
        return startDate;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    private String expiryDate;

    public String getExpiryDate(){
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }

    private String internationalUnits;

    public String getInternationalUnits(){
        return internationalUnits;
    }

    public void setInternationalUnits(String internationalUnits){
        this.internationalUnits = internationalUnits;
    }

    private String internationalData;

    public String getInternationalData(){
        return internationalData;
    }

    public void setInternationalData(String internationalData){
        this.internationalData = internationalData;
    }

    private String globalData;

    public String getGlobalData(){
        return globalData;
    }

    public void setGlobalData(String globalData){
        this.globalData = globalData;
    }

    public static BalanceOPC fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        BalanceOPC instance = new BalanceOPC();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setStartDate(jsonObject.optString("startDate"));
            instance.setExpiryDate(jsonObject.optString("expiryDate"));
            instance.setInternationalUnits(jsonObject.optString("internationalUnits"));
            instance.setInternationalData(jsonObject.optString("internationalData"));
            instance.setGlobalData(jsonObject.optString("globalData"));
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