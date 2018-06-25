package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RamadanPrayer implements Serializable{


    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String order;

    public String getOrder(){
        return order;
    }

    public void setOrder(String order){
        this.order = order;
    }

    private String time;

    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.time = time;
    }

    public static RamadanPrayer fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        RamadanPrayer instance = new RamadanPrayer();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setName(jsonObject.optString("name"));
            instance.setOrder(jsonObject.optString("order"));
            instance.setTime(jsonObject.optString("time"));
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