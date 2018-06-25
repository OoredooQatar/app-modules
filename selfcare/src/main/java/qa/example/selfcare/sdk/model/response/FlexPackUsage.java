package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlexPackUsage implements Serializable{


    private String packName;

    public String getPackName(){
        return packName;
    }

    public void setPackName(String packName){
        this.packName = packName;
    }

    private String carriedPoints;

    public String getCarriedPoints(){
        return carriedPoints;
    }

    public void setCarriedPoints(String carriedPoints){
        this.carriedPoints = carriedPoints;
    }

    private String connectPoints;

    public String getConnectPoints(){
        return connectPoints;
    }

    public void setConnectPoints(String connectPoints){
        this.connectPoints = connectPoints;
    }

    private String totalPoints;

    public String getTotalPoints(){
        return totalPoints;
    }

    public void setTotalPoints(String totalPoints){
        this.totalPoints = totalPoints;
    }

    private String renewalDate;

    public String getRenewalDate(){
        return renewalDate;
    }

    public void setRenewalDate(String renewalDate){
        this.renewalDate = renewalDate;
    }

    private String unit;

    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

    public static FlexPackUsage fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        FlexPackUsage instance = new FlexPackUsage();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPackName(jsonObject.optString("packName"));
            instance.setCarriedPoints(jsonObject.optString("carriedPoints"));
            instance.setConnectPoints(jsonObject.optString("connectPoints"));
            instance.setTotalPoints(jsonObject.optString("totalPoints"));
            instance.setRenewalDate(jsonObject.optString("renewalDate"));
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