package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CountryState implements Serializable{


    private String id;

    public String getId(){
    return id;
    }

    public void setId(String id){
    this.id = id;
    }

    private String countryIsoCode;

    public String getCountryIsoCode(){
    return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode){
    this.countryIsoCode = countryIsoCode;
    }

    private String name;

    public String getName(){
    return name;
    }

    public void setName(String name){
    this.name = name;
    }

public static CountryState fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
CountryState instance = new CountryState();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setId(jsonObject.optString("id"));
    instance.setCountryIsoCode(jsonObject.optString("countryIsoCode"));
    instance.setName(jsonObject.optString("name"));
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