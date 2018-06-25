package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TileItems implements Serializable{


    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    private String value;

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    private String color;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    private TileItems[] subItemsList;

    public TileItems[] getSubItemsList(){
        return subItemsList;
    }

    public void setSubItemsList(TileItems[] subItemsList){
        this.subItemsList = subItemsList;
    }

    public static TileItems fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        TileItems instance = new TileItems();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setTitle(jsonObject.optString("title"));
            instance.setValue(jsonObject.optString("value"));
            instance.setDescription(jsonObject.optString("description"));
            instance.setColor(jsonObject.optString("color"));
            JSONArray subItemsListJsonArray = jsonObject.optJSONArray("subItemsList");
            if (subItemsListJsonArray != null) {
                TileItems[] subItemsListArray = new TileItems[subItemsListJsonArray.length()];
                for (int i = 0; i < subItemsListJsonArray.length(); i++) {
                    subItemsListArray[i] = TileItems.fromJSON(subItemsListJsonArray.optString(i));
                }
                instance.setSubItemsList(subItemsListArray);
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