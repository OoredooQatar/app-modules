package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ETR implements Serializable{


    private String category;

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    private String etrClass;

    public String getEtrClass(){
        return etrClass;
    }

    public void setEtrClass(String etrClass){
        this.etrClass = etrClass;
    }

    private String msisdn;

    public String getMsisdn(){
        return msisdn;
    }

    public void setMsisdn(String msisdn){
        this.msisdn = msisdn;
    }

    private String price;

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    private String format;

    public String getFormat(){
        return format;
    }

    public void setFormat(String format){
        this.format = format;
    }

    private String receivedEndDate;

    public String getReceivedEndDate(){
        return receivedEndDate;
    }

    public void setReceivedEndDate(String receivedEndDate){
        this.receivedEndDate = receivedEndDate;
    }

    private String remainingTime;

    public String getRemainingTime(){
        return remainingTime;
    }

    public void setRemainingTime(String remainingTime){
        this.remainingTime = remainingTime;
    }

    public static ETR fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ETR instance = new ETR();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCategory(jsonObject.optString("category"));
            instance.setEtrClass(jsonObject.optString("etrClass"));
            instance.setMsisdn(jsonObject.optString("msisdn"));
            instance.setPrice(jsonObject.optString("price"));
            instance.setFormat(jsonObject.optString("format"));
            instance.setReceivedEndDate(jsonObject.optString("receivedEndDate"));
            instance.setRemainingTime(jsonObject.optString("remainingTime"));
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