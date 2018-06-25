package qa.example.selfcare.sdk.backend.services.crm;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EshopProduct implements Serializable{


    private String id;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String price;

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    private String quantity;

    public String getQuantity(){
        return quantity;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public static EshopProduct fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        EshopProduct instance = new EshopProduct();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optString("id"));
            instance.setName(jsonObject.optString("name"));
            instance.setPrice(jsonObject.optString("price"));
            instance.setQuantity(jsonObject.optString("quantity"));
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