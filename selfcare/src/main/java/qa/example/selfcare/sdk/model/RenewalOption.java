package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RenewalOption implements Serializable{


    private String id;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public static RenewalOption fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        RenewalOption instance = new RenewalOption();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optString("id"));
            instance.setTitle(jsonObject.optString("title"));
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