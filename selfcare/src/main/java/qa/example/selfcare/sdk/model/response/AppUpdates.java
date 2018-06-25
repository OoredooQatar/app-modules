package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppUpdates implements Serializable{


    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    private int categoryId;

    public int getCategoryId(){
        return categoryId;
    }

    public void setCategoryId(int categoryId){
        this.categoryId = categoryId;
    }

    private int subCategoryId;

    public int getSubCategoryId(){
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId){
        this.subCategoryId = subCategoryId;
    }

    private String color;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public static AppUpdates fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        AppUpdates instance = new AppUpdates();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optInt("id"));
            instance.setCategoryId(jsonObject.optInt("categoryId"));
            instance.setSubCategoryId(jsonObject.optInt("subCategoryId"));
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