package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DawliOfferUsageResponse implements Serializable{


    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String totalRemainingBalance;

    public String getTotalRemainingBalance(){
        return totalRemainingBalance;
    }

    public void setTotalRemainingBalance(String totalRemainingBalance){
        this.totalRemainingBalance = totalRemainingBalance;
    }

    private String totalExpiry;

    public String getTotalExpiry(){
        return totalExpiry;
    }

    public void setTotalExpiry(String totalExpiry){
        this.totalExpiry = totalExpiry;
    }

    private String closestRemainingBalance;

    public String getClosestRemainingBalance(){
        return closestRemainingBalance;
    }

    public void setClosestRemainingBalance(String closestRemainingBalance){
        this.closestRemainingBalance = closestRemainingBalance;
    }

    private String closestExpiry;

    public String getClosestExpiry(){
        return closestExpiry;
    }

    public void setClosestExpiry(String closestExpiry){
        this.closestExpiry = closestExpiry;
    }

    private String segment;

    public String getSegment(){
        return segment;
    }

    public void setSegment(String segment){
        this.segment = segment;
    }

    private String daId;

    public String getDaId(){
        return daId;
    }

    public void setDaId(String daId){
        this.daId = daId;
    }

    private String unit;

    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

    public static DawliOfferUsageResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        DawliOfferUsageResponse instance = new DawliOfferUsageResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setTitle(jsonObject.optString("title"));
            instance.setName(jsonObject.optString("name"));
            instance.setTotalRemainingBalance(jsonObject.optString("totalRemainingBalance"));
            instance.setTotalExpiry(jsonObject.optString("totalExpiry"));
            instance.setClosestRemainingBalance(jsonObject.optString("closestRemainingBalance"));
            instance.setClosestExpiry(jsonObject.optString("closestExpiry"));
            instance.setSegment(jsonObject.optString("segment"));
            instance.setDaId(jsonObject.optString("daId"));
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