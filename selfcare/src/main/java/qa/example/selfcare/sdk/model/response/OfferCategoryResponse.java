package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OfferCategoryResponse implements Serializable{


    private String categoryId;

    public String getCategoryId(){
        return categoryId;
    }

    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }

    private String categoryName;

    public String getCategoryName(){
        return categoryName;
    }

    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }

    private String tileTitle;

    public String getTileTitle(){
        return tileTitle;
    }

    public void setTileTitle(String tileTitle){
        this.tileTitle = tileTitle;
    }

    private String imageURL;

    public String getImageURL(){
        return imageURL;
    }

    public void setImageURL(String imageURL){
        this.imageURL = imageURL;
    }

    public static OfferCategoryResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        OfferCategoryResponse instance = new OfferCategoryResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCategoryId(jsonObject.optString("categoryId"));
            instance.setCategoryName(jsonObject.optString("categoryName"));
            instance.setTileTitle(jsonObject.optString("tileTitle"));
            instance.setImageURL(jsonObject.optString("imageURL"));
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