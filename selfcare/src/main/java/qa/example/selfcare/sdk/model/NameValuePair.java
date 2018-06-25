package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NameValuePair implements Serializable{


    private long serialVersionUID;

    public long getSerialVersionUID(){
        return serialVersionUID;
    }

    public void setSerialVersionUID(long serialVersionUID){
        this.serialVersionUID = serialVersionUID;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String value;

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public static NameValuePair fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NameValuePair instance = new NameValuePair();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setSerialVersionUID(jsonObject.optLong("serialVersionUID"));
            instance.setName(jsonObject.optString("name"));
            instance.setValue(jsonObject.optString("value"));
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