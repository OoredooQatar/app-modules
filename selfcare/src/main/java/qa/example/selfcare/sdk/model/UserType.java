package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserType implements Serializable{


    private int type;

    public int getType(){
        return type;
    }

    public void setType(int type){
        this.type = type;
    }

    public static UserType fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        UserType instance = new UserType();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setType(jsonObject.optInt("type"));
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