package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MBBBalanceResponse implements Serializable{


    private String packName;

    public String getPackName(){
        return packName;
    }

    public void setPackName(String packName){
        this.packName = packName;
    }

    private String mainRemainingData;

    public String getMainRemainingData(){
        return mainRemainingData;
    }

    public void setMainRemainingData(String mainRemainingData){
        this.mainRemainingData = mainRemainingData;
    }

    private String mainExpiryDate;

    public String getMainExpiryDate(){
        return mainExpiryDate;
    }

    public void setMainExpiryDate(String mainExpiryDate){
        this.mainExpiryDate = mainExpiryDate;
    }

    private String dcRemainingData;

    public String getDcRemainingData(){
        return dcRemainingData;
    }

    public void setDcRemainingData(String dcRemainingData){
        this.dcRemainingData = dcRemainingData;
    }

    private String dcExpiryDate;

    public String getDcExpiryDate(){
        return dcExpiryDate;
    }

    public void setDcExpiryDate(String dcExpiryDate){
        this.dcExpiryDate = dcExpiryDate;
    }

    private String closestExpiryData;

    public String getClosestExpiryData(){
        return closestExpiryData;
    }

    public void setClosestExpiryData(String closestExpiryData){
        this.closestExpiryData = closestExpiryData;
    }

    private String closestExpiryDate;

    public String getClosestExpiryDate(){
        return closestExpiryDate;
    }

    public void setClosestExpiryDate(String closestExpiryDate){
        this.closestExpiryDate = closestExpiryDate;
    }

    private String totalRemainingData;

    public String getTotalRemainingData(){
        return totalRemainingData;
    }

    public void setTotalRemainingData(String totalRemainingData){
        this.totalRemainingData = totalRemainingData;
    }

    private String totalBonusData;

    public String getTotalBonusData(){
        return totalBonusData;
    }

    public void setTotalBonusData(String totalBonusData){
        this.totalBonusData = totalBonusData;
    }

    private boolean dcActive;

    public boolean getDcActive(){
        return dcActive;
    }

    public void setDcActive(boolean dcActive){
        this.dcActive = dcActive;
    }

    private ShahryBonusUsage[] mbbBonusUsage;

    public ShahryBonusUsage[] getMbbBonusUsage(){
        return mbbBonusUsage;
    }

    public void setMbbBonusUsage(ShahryBonusUsage[] mbbBonusUsage){
        this.mbbBonusUsage = mbbBonusUsage;
    }

    private boolean isUnlimited64KbpsSubscribed;

    public boolean getIsUnlimited64KbpsSubscribed(){
        return isUnlimited64KbpsSubscribed;
    }

    public void setIsUnlimited64KbpsSubscribed(boolean isUnlimited64KbpsSubscribed){
        this.isUnlimited64KbpsSubscribed = isUnlimited64KbpsSubscribed;
    }

    private String unlimitedKbpsPackName;

    public String getUnlimitedKbpsPackName(){
        return unlimitedKbpsPackName;
    }

    public void setUnlimitedKbpsPackName(String unlimitedKbpsPackName){
        this.unlimitedKbpsPackName = unlimitedKbpsPackName;
    }

    private String unlinited64KbpsExpiryDate;

    public String getUnlinited64KbpsExpiryDate(){
        return unlinited64KbpsExpiryDate;
    }

    public void setUnlinited64KbpsExpiryDate(String unlinited64KbpsExpiryDate){
        this.unlinited64KbpsExpiryDate = unlinited64KbpsExpiryDate;
    }

    private String unlimitedKbpsDescription;

    public String getUnlimitedKbpsDescription(){
        return unlimitedKbpsDescription;
    }

    public void setUnlimitedKbpsDescription(String unlimitedKbpsDescription){
        this.unlimitedKbpsDescription = unlimitedKbpsDescription;
    }

    private boolean isUnlimited64IconOnDashboard;

    public boolean getIsUnlimited64IconOnDashboard(){
        return isUnlimited64IconOnDashboard;
    }

    public void setIsUnlimited64IconOnDashboard(boolean isUnlimited64IconOnDashboard){
        this.isUnlimited64IconOnDashboard = isUnlimited64IconOnDashboard;
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

    public static MBBBalanceResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        MBBBalanceResponse instance = new MBBBalanceResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPackName(jsonObject.optString("packName"));
            instance.setMainRemainingData(jsonObject.optString("mainRemainingData"));
            instance.setMainExpiryDate(jsonObject.optString("mainExpiryDate"));
            instance.setDcRemainingData(jsonObject.optString("dcRemainingData"));
            instance.setDcExpiryDate(jsonObject.optString("dcExpiryDate"));
            instance.setClosestExpiryData(jsonObject.optString("closestExpiryData"));
            instance.setClosestExpiryDate(jsonObject.optString("closestExpiryDate"));
            instance.setTotalRemainingData(jsonObject.optString("totalRemainingData"));
            instance.setTotalBonusData(jsonObject.optString("totalBonusData"));
            instance.setDcActive(jsonObject.optBoolean("dcActive"));
            JSONArray mbbBonusUsageJsonArray = jsonObject.optJSONArray("mbbBonusUsage");
            if (mbbBonusUsageJsonArray != null) {
                ShahryBonusUsage[] mbbBonusUsageArray = new ShahryBonusUsage[mbbBonusUsageJsonArray.length()];
                for (int i = 0; i < mbbBonusUsageJsonArray.length(); i++) {
                    mbbBonusUsageArray[i] = ShahryBonusUsage.fromJSON(mbbBonusUsageJsonArray.optString(i));
                }
                instance.setMbbBonusUsage(mbbBonusUsageArray);
            }
            instance.setIsUnlimited64KbpsSubscribed(jsonObject.optBoolean("isUnlimited64KbpsSubscribed"));
            instance.setUnlimitedKbpsPackName(jsonObject.optString("unlimitedKbpsPackName"));
            instance.setUnlinited64KbpsExpiryDate(jsonObject.optString("unlinited64KbpsExpiryDate"));
            instance.setUnlimitedKbpsDescription(jsonObject.optString("unlimitedKbpsDescription"));
            instance.setIsUnlimited64IconOnDashboard(jsonObject.optBoolean("isUnlimited64IconOnDashboard"));
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