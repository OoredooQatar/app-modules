package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyHalaOffersUsage implements Serializable{


    private String myHalaOfferTitle;

    public String getMyHalaOfferTitle(){
        return myHalaOfferTitle;
    }

    public void setMyHalaOfferTitle(String myHalaOfferTitle){
        this.myHalaOfferTitle = myHalaOfferTitle;
    }

    private String myHalaOfferName;

    public String getMyHalaOfferName(){
        return myHalaOfferName;
    }

    public void setMyHalaOfferName(String myHalaOfferName){
        this.myHalaOfferName = myHalaOfferName;
    }

    private String myHalaOfferTotalAmount;

    public String getMyHalaOfferTotalAmount(){
        return myHalaOfferTotalAmount;
    }

    public void setMyHalaOfferTotalAmount(String myHalaOfferTotalAmount){
        this.myHalaOfferTotalAmount = myHalaOfferTotalAmount;
    }

    private String myHalaOfferRemainingAmount;

    public String getMyHalaOfferRemainingAmount(){
        return myHalaOfferRemainingAmount;
    }

    public void setMyHalaOfferRemainingAmount(String myHalaOfferRemainingAmount){
        this.myHalaOfferRemainingAmount = myHalaOfferRemainingAmount;
    }

    private String myHalaOfferClosestRemainingAmount;

    public String getMyHalaOfferClosestRemainingAmount(){
        return myHalaOfferClosestRemainingAmount;
    }

    public void setMyHalaOfferClosestRemainingAmount(String myHalaOfferClosestRemainingAmount){
        this.myHalaOfferClosestRemainingAmount = myHalaOfferClosestRemainingAmount;
    }

    private String myHalaOfferClosestExpiry;

    public String getMyHalaOfferClosestExpiry(){
        return myHalaOfferClosestExpiry;
    }

    public void setMyHalaOfferClosestExpiry(String myHalaOfferClosestExpiry){
        this.myHalaOfferClosestExpiry = myHalaOfferClosestExpiry;
    }

    private String myHalaOfferRemainngExpiry;

    public String getMyHalaOfferRemainngExpiry(){
        return myHalaOfferRemainngExpiry;
    }

    public void setMyHalaOfferRemainngExpiry(String myHalaOfferRemainngExpiry){
        this.myHalaOfferRemainngExpiry = myHalaOfferRemainngExpiry;
    }

    private String myHalaOfferSegment;

    public String getMyHalaOfferSegment(){
        return myHalaOfferSegment;
    }

    public void setMyHalaOfferSegment(String myHalaOfferSegment){
        this.myHalaOfferSegment = myHalaOfferSegment;
    }

    private String myHalaOfferDaId;

    public String getMyHalaOfferDaId(){
        return myHalaOfferDaId;
    }

    public void setMyHalaOfferDaId(String myHalaOfferDaId){
        this.myHalaOfferDaId = myHalaOfferDaId;
    }

    private String myHalaOfferUnit;

    public String getMyHalaOfferUnit(){
        return myHalaOfferUnit;
    }

    public void setMyHalaOfferUnit(String myHalaOfferUnit){
        this.myHalaOfferUnit = myHalaOfferUnit;
    }

    private String myHalaOfferTotalUnit;

    public String getMyHalaOfferTotalUnit(){
        return myHalaOfferTotalUnit;
    }

    public void setMyHalaOfferTotalUnit(String myHalaOfferTotalUnit){
        this.myHalaOfferTotalUnit = myHalaOfferTotalUnit;
    }

    private String mainBalanceExpiry;

    public String getMainBalanceExpiry(){
        return mainBalanceExpiry;
    }

    public void setMainBalanceExpiry(String mainBalanceExpiry){
        this.mainBalanceExpiry = mainBalanceExpiry;
    }

    private String color;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public static MyHalaOffersUsage fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        MyHalaOffersUsage instance = new MyHalaOffersUsage();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setMyHalaOfferTitle(jsonObject.optString("myHalaOfferTitle"));
            instance.setMyHalaOfferName(jsonObject.optString("myHalaOfferName"));
            instance.setMyHalaOfferTotalAmount(jsonObject.optString("myHalaOfferTotalAmount"));
            instance.setMyHalaOfferRemainingAmount(jsonObject.optString("myHalaOfferRemainingAmount"));
            instance.setMyHalaOfferClosestRemainingAmount(jsonObject.optString("myHalaOfferClosestRemainingAmount"));
            instance.setMyHalaOfferClosestExpiry(jsonObject.optString("myHalaOfferClosestExpiry"));
            instance.setMyHalaOfferRemainngExpiry(jsonObject.optString("myHalaOfferRemainngExpiry"));
            instance.setMyHalaOfferSegment(jsonObject.optString("myHalaOfferSegment"));
            instance.setMyHalaOfferDaId(jsonObject.optString("myHalaOfferDaId"));
            instance.setMyHalaOfferUnit(jsonObject.optString("myHalaOfferUnit"));
            instance.setMyHalaOfferTotalUnit(jsonObject.optString("myHalaOfferTotalUnit"));
            instance.setMainBalanceExpiry(jsonObject.optString("mainBalanceExpiry"));
            instance.setColor(jsonObject.optString("color"));
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