package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FFAItem implements Serializable{


    private int categoryId;

    public int getCategoryId(){
    return categoryId;
    }

    public void setCategoryId(int categoryId){
    this.categoryId = categoryId;
    }

    private String itemCode;

    public String getItemCode(){
    return itemCode;
    }

    public void setItemCode(String itemCode){
    this.itemCode = itemCode;
    }

    private String itemDescription;

    public String getItemDescription(){
    return itemDescription;
    }

    public void setItemDescription(String itemDescription){
    this.itemDescription = itemDescription;
    }

    private String uom;

    public String getUom(){
    return uom;
    }

    public void setUom(String uom){
    this.uom = uom;
    }

public static FFAItem fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
FFAItem instance = new FFAItem();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setCategoryId(jsonObject.optInt("categoryId"));
    instance.setItemCode(jsonObject.optString("itemCode"));
    instance.setItemDescription(jsonObject.optString("itemDescription"));
    instance.setUom(jsonObject.optString("uom"));
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