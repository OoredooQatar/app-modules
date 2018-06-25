package qa.example.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TariffGroup implements Serializable{


    private int id;

    public int getId(){
    return id;
    }

    public void setId(int id){
    this.id = id;
    }

    private String title;

    public String getTitle(){
    return title;
    }

    public void setTitle(String title){
    this.title = title;
    }

    private String description;

    public String getDescription(){
    return description;
    }

    public void setDescription(String description){
    this.description = description;
    }

    private String imageurl;

    public String getImageurl(){
    return imageurl;
    }

    public void setImageurl(String imageurl){
    this.imageurl = imageurl;
    }

    private String order;

    public String getOrder(){
    return order;
    }

    public void setOrder(String order){
    this.order = order;
    }

    private String iconUrl;

    public String getIconUrl(){
    return iconUrl;
    }

    public void setIconUrl(String iconUrl){
    this.iconUrl = iconUrl;
    }

    private TariffGroup[] children;

    public TariffGroup[] getChildren(){
    return children;
    }

    public void setChildren(TariffGroup[] children){
    this.children = children;
    }

public static TariffGroup fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
TariffGroup instance = new TariffGroup();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setId(jsonObject.optInt("id"));
    instance.setTitle(jsonObject.optString("title"));
    instance.setDescription(jsonObject.optString("description"));
    instance.setImageurl(jsonObject.optString("imageurl"));
    instance.setOrder(jsonObject.optString("order"));
    instance.setIconUrl(jsonObject.optString("iconUrl"));
    JSONArray childrenJsonArray = jsonObject.optJSONArray("children");
    if (childrenJsonArray != null) {
    TariffGroup[] childrenArray = new TariffGroup[childrenJsonArray.length()];
    for (int i = 0; i < childrenJsonArray.length(); i++) {
        childrenArray[i] = TariffGroup.fromJSON(childrenJsonArray.optString(i));
    }
    instance.setChildren(childrenArray);
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