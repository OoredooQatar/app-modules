package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DawliUsageResponse implements Serializable{


    private String daId;

    public String getDaId(){
        return daId;
    }

    public void setDaId(String daId){
        this.daId = daId;
    }

    private String balance;

    public String getBalance(){
        return balance;
    }

    public void setBalance(String balance){
        this.balance = balance;
    }

    private String remainingBalance;

    public String getRemainingBalance(){
        return remainingBalance;
    }

    public void setRemainingBalance(String remainingBalance){
        this.remainingBalance = remainingBalance;
    }

    private String closestBalance;

    public String getClosestBalance(){
        return closestBalance;
    }

    public void setClosestBalance(String closestBalance){
        this.closestBalance = closestBalance;
    }

    private String remainingExpiry;

    public String getRemainingExpiry(){
        return remainingExpiry;
    }

    public void setRemainingExpiry(String remainingExpiry){
        this.remainingExpiry = remainingExpiry;
    }

    private String closestExpiry;

    public String getClosestExpiry(){
        return closestExpiry;
    }

    public void setClosestExpiry(String closestExpiry){
        this.closestExpiry = closestExpiry;
    }

    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    private String balanceExpiry;

    public String getBalanceExpiry(){
        return balanceExpiry;
    }

    public void setBalanceExpiry(String balanceExpiry){
        this.balanceExpiry = balanceExpiry;
    }

    private String unit;

    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

    public static DawliUsageResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        DawliUsageResponse instance = new DawliUsageResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setDaId(jsonObject.optString("daId"));
            instance.setBalance(jsonObject.optString("balance"));
            instance.setRemainingBalance(jsonObject.optString("remainingBalance"));
            instance.setClosestBalance(jsonObject.optString("closestBalance"));
            instance.setRemainingExpiry(jsonObject.optString("remainingExpiry"));
            instance.setClosestExpiry(jsonObject.optString("closestExpiry"));
            instance.setTitle(jsonObject.optString("title"));
            instance.setBalanceExpiry(jsonObject.optString("balanceExpiry"));
            instance.setUnit(jsonObject.optString("unit"));
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