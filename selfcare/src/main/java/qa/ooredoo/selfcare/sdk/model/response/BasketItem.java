package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasketItem implements Serializable{


    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String quantity;

    public String getQuantity(){
        return quantity;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    private String categoryId;

    public String getCategoryId(){
        return categoryId;
    }

    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }

    private long price;

    public long getPrice(){
        return price;
    }

    public void setPrice(long price){
        this.price = price;
    }

    private String basetItemId;

    public String getBasetItemId(){
        return basetItemId;
    }

    public void setBasetItemId(String basetItemId){
        this.basetItemId = basetItemId;
    }

    private String id;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    private String capacity;

    public String getCapacity(){
        return capacity;
    }

    public void setCapacity(String capacity){
        this.capacity = capacity;
    }

    private String quantityInStock;

    public String getQuantityInStock(){
        return quantityInStock;
    }

    public void setQuantityInStock(String quantityInStock){
        this.quantityInStock = quantityInStock;
    }

    private String colorHex;

    public String getColorHex(){
        return colorHex;
    }

    public void setColorHex(String colorHex){
        this.colorHex = colorHex;
    }

    private String color;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public static BasketItem fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        BasketItem instance = new BasketItem();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setName(jsonObject.optString("name"));
            instance.setQuantity(jsonObject.optString("quantity"));
            instance.setCategoryId(jsonObject.optString("categoryId"));
            instance.setPrice(jsonObject.optLong("price"));
            instance.setBasetItemId(jsonObject.optString("basetItemId"));
            instance.setId(jsonObject.optString("id"));
            instance.setCapacity(jsonObject.optString("capacity"));
            instance.setQuantityInStock(jsonObject.optString("quantityInStock"));
            instance.setColorHex(jsonObject.optString("colorHex"));
            instance.setColor(jsonObject.optString("color"));
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
