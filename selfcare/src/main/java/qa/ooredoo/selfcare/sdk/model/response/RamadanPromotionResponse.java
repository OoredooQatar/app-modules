package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RamadanPromotionResponse implements Serializable{


    private int counter;

    public int getCounter(){
        return counter;
    }

    public void setCounter(int counter){
        this.counter = counter;
    }

    private String month;

    public String getMonth(){
        return month;
    }

    public void setMonth(String month){
        this.month = month;
    }

    private int day;

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    private int year;

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    private qa.ooredoo.selfcare.sdk.model.NojoomReward[] rewards;

    public qa.ooredoo.selfcare.sdk.model.NojoomReward[] getRewards(){
        return rewards;
    }

    public void setRewards(qa.ooredoo.selfcare.sdk.model.NojoomReward[] rewards){
        this.rewards = rewards;
    }

    private boolean result;

    public boolean getResult(){
        return result;
    }

    public void setResult(boolean result){
        this.result = result;
    }

    private String operationResult;

    public String getOperationResult(){
        return operationResult;
    }

    public void setOperationResult(String operationResult){
        this.operationResult = operationResult;
    }

    private String operationCode;

    public String getOperationCode(){
        return operationCode;
    }

    public void setOperationCode(String operationCode){
        this.operationCode = operationCode;
    }

    private boolean hasAlert;

    public boolean getHasAlert(){
        return hasAlert;
    }

    public void setHasAlert(boolean hasAlert){
        this.hasAlert = hasAlert;
    }

    private String alertMessage;

    public String getAlertMessage(){
        return alertMessage;
    }

    public void setAlertMessage(String alertMessage){
        this.alertMessage = alertMessage;
    }

    public static RamadanPromotionResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        RamadanPromotionResponse instance = new RamadanPromotionResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCounter(jsonObject.optInt("counter"));
            instance.setMonth(jsonObject.optString("month"));
            instance.setDay(jsonObject.optInt("day"));
            instance.setYear(jsonObject.optInt("year"));
            JSONArray rewardsJsonArray = jsonObject.optJSONArray("rewards");
            if (rewardsJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.NojoomReward[] rewardsArray = new qa.ooredoo.selfcare.sdk.model.NojoomReward[rewardsJsonArray.length()];
                for (int i = 0; i < rewardsJsonArray.length(); i++) {
                    rewardsArray[i] = qa.ooredoo.selfcare.sdk.model.NojoomReward.fromJSON(rewardsJsonArray.optString(i));
                }
                instance.setRewards(rewardsArray);
            }
            instance.setResult(jsonObject.optBoolean("result"));
            instance.setOperationResult(jsonObject.optString("operationResult"));
            instance.setOperationCode(jsonObject.optString("operationCode"));
            instance.setHasAlert(jsonObject.optBoolean("hasAlert"));
            instance.setAlertMessage(jsonObject.optString("alertMessage"));
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