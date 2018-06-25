package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlexCardUsage implements Serializable{


    private String cardName;

    public String getCardName(){
        return cardName;
    }

    public void setCardName(String cardName){
        this.cardName = cardName;
    }

    private String mainBalance;

    public String getMainBalance(){
        return mainBalance;
    }

    public void setMainBalance(String mainBalance){
        this.mainBalance = mainBalance;
    }

    private String mainBalanceExpiry;

    public String getMainBalanceExpiry(){
        return mainBalanceExpiry;
    }

    public void setMainBalanceExpiry(String mainBalanceExpiry){
        this.mainBalanceExpiry = mainBalanceExpiry;
    }

    private String mainBalanceClosestValue;

    public String getMainBalanceClosestValue(){
        return mainBalanceClosestValue;
    }

    public void setMainBalanceClosestValue(String mainBalanceClosestValue){
        this.mainBalanceClosestValue = mainBalanceClosestValue;
    }

    private String mainBalanceClosestExpiry;

    public String getMainBalanceClosestExpiry(){
        return mainBalanceClosestExpiry;
    }

    public void setMainBalanceClosestExpiry(String mainBalanceClosestExpiry){
        this.mainBalanceClosestExpiry = mainBalanceClosestExpiry;
    }

    private String unit;

    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

    public static FlexCardUsage fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        FlexCardUsage instance = new FlexCardUsage();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCardName(jsonObject.optString("cardName"));
            instance.setMainBalance(jsonObject.optString("mainBalance"));
            instance.setMainBalanceExpiry(jsonObject.optString("mainBalanceExpiry"));
            instance.setMainBalanceClosestValue(jsonObject.optString("mainBalanceClosestValue"));
            instance.setMainBalanceClosestExpiry(jsonObject.optString("mainBalanceClosestExpiry"));
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