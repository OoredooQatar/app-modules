package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FaFNumber implements Serializable{


    private String number;

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    private Date startDate;

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    private boolean modifiableFlag;

    public boolean getModifiableFlag(){
        return modifiableFlag;
    }

    public void setModifiableFlag(boolean modifiableFlag){
        this.modifiableFlag = modifiableFlag;
    }

    public static FaFNumber fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        FaFNumber instance = new FaFNumber();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setNumber(jsonObject.optString("number"));
            instance.setStartDate(parseDate(jsonObject,"startDate"));
            instance.setModifiableFlag(jsonObject.optBoolean("modifiableFlag"));
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