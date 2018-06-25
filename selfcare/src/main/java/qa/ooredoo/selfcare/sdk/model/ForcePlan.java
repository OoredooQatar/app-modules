package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForcePlan implements Serializable{


    private String planId;

    public String getPlanId(){
        return planId;
    }

    public void setPlanId(String planId){
        this.planId = planId;
    }

    private String nameEn;

    public String getNameEn(){
        return nameEn;
    }

    public void setNameEn(String nameEn){
        this.nameEn = nameEn;
    }

    private String nameAr;

    public String getNameAr(){
        return nameAr;
    }

    public void setNameAr(String nameAr){
        this.nameAr = nameAr;
    }

    private double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    private int localUnits;

    public int getLocalUnits(){
        return localUnits;
    }

    public void setLocalUnits(int localUnits){
        this.localUnits = localUnits;
    }

    private int localData;

    public int getLocalData(){
        return localData;
    }

    public void setLocalData(int localData){
        this.localData = localData;
    }

    private int internationalUnits;

    public int getInternationalUnits(){
        return internationalUnits;
    }

    public void setInternationalUnits(int internationalUnits){
        this.internationalUnits = internationalUnits;
    }

    public static ForcePlan fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ForcePlan instance = new ForcePlan();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPlanId(jsonObject.optString("planId"));
            instance.setNameEn(jsonObject.optString("nameEn"));
            instance.setNameAr(jsonObject.optString("nameAr"));
            instance.setPrice(jsonObject.optDouble("price"));
            instance.setLocalUnits(jsonObject.optInt("localUnits"));
            instance.setLocalData(jsonObject.optInt("localData"));
            instance.setInternationalUnits(jsonObject.optInt("internationalUnits"));
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