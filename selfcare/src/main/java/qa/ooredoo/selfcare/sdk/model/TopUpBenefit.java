package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TopUpBenefit implements Serializable{


    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String value;

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    private int order;

    public int getOrder(){
        return order;
    }

    public void setOrder(int order){
        this.order = order;
    }

    public static TopUpBenefit fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        TopUpBenefit instance = new TopUpBenefit();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setName(jsonObject.optString("name"));
            instance.setValue(jsonObject.optString("value"));
            instance.setOrder(jsonObject.optInt("order"));
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