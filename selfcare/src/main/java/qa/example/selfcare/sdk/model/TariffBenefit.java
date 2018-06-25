package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TariffBenefit implements Serializable{


    private int displayOrder;

    public int getDisplayOrder(){
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder){
        this.displayOrder = displayOrder;
    }

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

    private String category;

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public static TariffBenefit fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        TariffBenefit instance = new TariffBenefit();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setDisplayOrder(jsonObject.optInt("displayOrder"));
            instance.setName(jsonObject.optString("name"));
            instance.setValue(jsonObject.optString("value"));
            instance.setCategory(jsonObject.optString("category"));
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