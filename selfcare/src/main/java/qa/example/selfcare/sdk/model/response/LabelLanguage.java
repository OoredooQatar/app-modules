package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LabelLanguage implements Serializable{


    private String lang;

    public String getLang(){
    return lang;
    }

    public void setLang(String lang){
    this.lang = lang;
    }

    private String message;

    public String getMessage(){
    return message;
    }

    public void setMessage(String message){
    this.message = message;
    }

public static LabelLanguage fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
LabelLanguage instance = new LabelLanguage();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setLang(jsonObject.optString("lang"));
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