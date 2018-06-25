package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HalaMIP implements Serializable{


    private String mipPackName;

    public String getMipPackName(){
        return mipPackName;
    }

    public void setMipPackName(String mipPackName){
        this.mipPackName = mipPackName;
    }

    private String mipRemainingData;

    public String getMipRemainingData(){
        return mipRemainingData;
    }

    public void setMipRemainingData(String mipRemainingData){
        this.mipRemainingData = mipRemainingData;
    }

    private String mipExpiryDate;

    public String getMipExpiryDate(){
        return mipExpiryDate;
    }

    public void setMipExpiryDate(String mipExpiryDate){
        this.mipExpiryDate = mipExpiryDate;
    }

    public static HalaMIP fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        HalaMIP instance = new HalaMIP();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setMipPackName(jsonObject.optString("mipPackName"));
            instance.setMipRemainingData(jsonObject.optString("mipRemainingData"));
            instance.setMipExpiryDate(jsonObject.optString("mipExpiryDate"));
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