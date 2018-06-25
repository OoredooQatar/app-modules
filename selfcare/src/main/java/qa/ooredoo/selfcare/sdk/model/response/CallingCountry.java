package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CallingCountry implements Serializable{


    private String country;

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    private String group;

    public String getGroup(){
        return group;
    }

    public void setGroup(String group){
        this.group = group;
    }

    private String groupName;

    public String getGroupName(){
        return groupName;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    private String flag;

    public String getFlag(){
        return flag;
    }

    public void setFlag(String flag){
        this.flag = flag;
    }

    private CallingRates[] callingRates;

    public CallingRates[] getCallingRates(){
        return callingRates;
    }

    public void setCallingRates(CallingRates[] callingRates){
        this.callingRates = callingRates;
    }

    public static CallingCountry fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        CallingCountry instance = new CallingCountry();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCountry(jsonObject.optString("country"));
            instance.setGroup(jsonObject.optString("group"));
            instance.setGroupName(jsonObject.optString("groupName"));
            instance.setFlag(jsonObject.optString("flag"));
            JSONArray callingRatesJsonArray = jsonObject.optJSONArray("callingRates");
            if (callingRatesJsonArray != null) {
                CallingRates[] callingRatesArray = new CallingRates[callingRatesJsonArray.length()];
                for (int i = 0; i < callingRatesJsonArray.length(); i++) {
                    callingRatesArray[i] = CallingRates.fromJSON(callingRatesJsonArray.optString(i));
                }
                instance.setCallingRates(callingRatesArray);
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