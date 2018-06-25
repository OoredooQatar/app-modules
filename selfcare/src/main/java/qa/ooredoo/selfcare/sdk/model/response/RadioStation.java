package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RadioStation implements Serializable{


    private int id;

    public int getId(){
    return id;
    }

    public void setId(int id){
    this.id = id;
    }

    private String name;

    public String getName(){
    return name;
    }

    public void setName(String name){
    this.name = name;
    }

    private String streamURL;

    public String getStreamURL(){
    return streamURL;
    }

    public void setStreamURL(String streamURL){
    this.streamURL = streamURL;
    }

    private String imageURL;

    public String getImageURL(){
    return imageURL;
    }

    public void setImageURL(String imageURL){
    this.imageURL = imageURL;
    }

    private String desc;

    public String getDesc(){
    return desc;
    }

    public void setDesc(String desc){
    this.desc = desc;
    }

    private String longDesc;

    public String getLongDesc(){
    return longDesc;
    }

    public void setLongDesc(String longDesc){
    this.longDesc = longDesc;
    }

public static RadioStation fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
RadioStation instance = new RadioStation();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setId(jsonObject.optInt("id"));
    instance.setName(jsonObject.optString("name"));
    instance.setStreamURL(jsonObject.optString("streamURL"));
    instance.setImageURL(jsonObject.optString("imageURL"));
    instance.setDesc(jsonObject.optString("desc"));
    instance.setLongDesc(jsonObject.optString("longDesc"));
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