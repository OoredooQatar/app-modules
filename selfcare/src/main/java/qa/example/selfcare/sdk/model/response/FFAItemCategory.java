package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FFAItemCategory implements Serializable{


    private String categoryName;

    public String getCategoryName(){
    return categoryName;
    }

    public void setCategoryName(String categoryName){
    this.categoryName = categoryName;
    }

    private int categoryId;

    public int getCategoryId(){
    return categoryId;
    }

    public void setCategoryId(int categoryId){
    this.categoryId = categoryId;
    }

public static FFAItemCategory fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
FFAItemCategory instance = new FFAItemCategory();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setCategoryName(jsonObject.optString("categoryName"));
    instance.setCategoryId(jsonObject.optInt("categoryId"));
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