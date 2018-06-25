package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppMessage implements Serializable{


    private String code;

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    private String message;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public static AppMessage fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        AppMessage instance = new AppMessage();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCode(jsonObject.optString("code"));
            instance.setMessage(jsonObject.optString("message"));
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