package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CMSFormData implements Serializable{


    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    private String data;

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    private String grouping;

    public String getGrouping(){
        return grouping;
    }

    public void setGrouping(String grouping){
        this.grouping = grouping;
    }

    private String formType;

    public String getFormType(){
        return formType;
    }

    public void setFormType(String formType){
        this.formType = formType;
    }

    private String timeStamp;

    public String getTimeStamp(){
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp){
        this.timeStamp = timeStamp;
    }

    public static CMSFormData fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        CMSFormData instance = new CMSFormData();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optInt("id"));
            instance.setData(jsonObject.optString("data"));
            instance.setGrouping(jsonObject.optString("grouping"));
            instance.setFormType(jsonObject.optString("formType"));
            instance.setTimeStamp(jsonObject.optString("timeStamp"));
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