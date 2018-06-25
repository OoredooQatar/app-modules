package qa.example.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OoredooPassportCountry implements Serializable{


    private String country;

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    private String flag;

    public String getFlag(){
        return flag;
    }

    public void setFlag(String flag){
        this.flag = flag;
    }

    private OoredooPassportTelecom[] telecoms;

    public OoredooPassportTelecom[] getTelecoms(){
        return telecoms;
    }

    public void setTelecoms(OoredooPassportTelecom[] telecoms){
        this.telecoms = telecoms;
    }

    public static OoredooPassportCountry fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        OoredooPassportCountry instance = new OoredooPassportCountry();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCountry(jsonObject.optString("country"));
            instance.setFlag(jsonObject.optString("flag"));
            JSONArray telecomsJsonArray = jsonObject.optJSONArray("telecoms");
            if (telecomsJsonArray != null) {
                OoredooPassportTelecom[] telecomsArray = new OoredooPassportTelecom[telecomsJsonArray.length()];
                for (int i = 0; i < telecomsJsonArray.length(); i++) {
                    telecomsArray[i] = OoredooPassportTelecom.fromJSON(telecomsJsonArray.optString(i));
                }
                instance.setTelecoms(telecomsArray);
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