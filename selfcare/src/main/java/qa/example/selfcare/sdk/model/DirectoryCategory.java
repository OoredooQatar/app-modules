package qa.example.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DirectoryCategory implements Serializable{


    private int index;

    public int getIndex(){
        return index;
    }

    public void setIndex(int index){
        this.index = index;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String arabicName;

    public String getArabicName(){
        return arabicName;
    }

    public void setArabicName(String arabicName){
        this.arabicName = arabicName;
    }

    private String identifier;

    public String getIdentifier(){
        return identifier;
    }

    public void setIdentifier(String identifier){
        this.identifier = identifier;
    }

    private DirectoryCategory[] subCategories;

    public DirectoryCategory[] getSubCategories(){
        return subCategories;
    }

    public void setSubCategories(DirectoryCategory[] subCategories){
        this.subCategories = subCategories;
    }

    public static DirectoryCategory fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        DirectoryCategory instance = new DirectoryCategory();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setIndex(jsonObject.optInt("index"));
            instance.setName(jsonObject.optString("name"));
            instance.setArabicName(jsonObject.optString("arabicName"));
            instance.setIdentifier(jsonObject.optString("identifier"));
            JSONArray subCategoriesJsonArray = jsonObject.optJSONArray("subCategories");
            if (subCategoriesJsonArray != null) {
                DirectoryCategory[] subCategoriesArray = new DirectoryCategory[subCategoriesJsonArray.length()];
                for (int i = 0; i < subCategoriesJsonArray.length(); i++) {
                    subCategoriesArray[i] = DirectoryCategory.fromJSON(subCategoriesJsonArray.optString(i));
                }
                instance.setSubCategories(subCategoriesArray);
            }
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