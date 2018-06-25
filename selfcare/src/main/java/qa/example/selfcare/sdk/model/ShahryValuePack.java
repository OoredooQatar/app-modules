package qa.example.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShahryValuePack implements Serializable{


    private String shahryVP;

    public String getShahryVP(){
    return shahryVP;
    }

    public void setShahryVP(String shahryVP){
    this.shahryVP = shahryVP;
    }

    private String remainMinutes;

    public String getRemainMinutes(){
    return remainMinutes;
    }

    public void setRemainMinutes(String remainMinutes){
    this.remainMinutes = remainMinutes;
    }

    private String remainSMS;

    public String getRemainSMS(){
    return remainSMS;
    }

    public void setRemainSMS(String remainSMS){
    this.remainSMS = remainSMS;
    }

    private String remainMMS;

    public String getRemainMMS(){
    return remainMMS;
    }

    public void setRemainMMS(String remainMMS){
    this.remainMMS = remainMMS;
    }

    private String remainData;

    public String getRemainData(){
    return remainData;
    }

    public void setRemainData(String remainData){
    this.remainData = remainData;
    }

    private String carriedForward;

    public String getCarriedForward(){
    return carriedForward;
    }

    public void setCarriedForward(String carriedForward){
    this.carriedForward = carriedForward;
    }

    private String roamRcvdCalls;

    public String getRoamRcvdCalls(){
    return roamRcvdCalls;
    }

    public void setRoamRcvdCalls(String roamRcvdCalls){
    this.roamRcvdCalls = roamRcvdCalls;
    }

    private String maxMinutes;

    public String getMaxMinutes(){
    return maxMinutes;
    }

    public void setMaxMinutes(String maxMinutes){
    this.maxMinutes = maxMinutes;
    }

    private String maxSMS;

    public String getMaxSMS(){
    return maxSMS;
    }

    public void setMaxSMS(String maxSMS){
    this.maxSMS = maxSMS;
    }

    private String maxMMS;

    public String getMaxMMS(){
    return maxMMS;
    }

    public void setMaxMMS(String maxMMS){
    this.maxMMS = maxMMS;
    }

    private String maxData;

    public String getMaxData(){
    return maxData;
    }

    public void setMaxData(String maxData){
    this.maxData = maxData;
    }

    private String maxPackData;

    public String getMaxPackData(){
    return maxPackData;
    }

    public void setMaxPackData(String maxPackData){
    this.maxPackData = maxPackData;
    }

    private String roammaxCalls;

    public String getRoammaxCalls(){
    return roammaxCalls;
    }

    public void setRoammaxCalls(String roammaxCalls){
    this.roammaxCalls = roammaxCalls;
    }

    private String monthlyFee;

    public String getMonthlyFee(){
    return monthlyFee;
    }

    public void setMonthlyFee(String monthlyFee){
    this.monthlyFee = monthlyFee;
    }

    private String unbilledAmount;

    public String getUnbilledAmount(){
    return unbilledAmount;
    }

    public void setUnbilledAmount(String unbilledAmount){
    this.unbilledAmount = unbilledAmount;
    }

    private String internationalFreeMinutes;

    public String getInternationalFreeMinutes(){
    return internationalFreeMinutes;
    }

    public void setInternationalFreeMinutes(String internationalFreeMinutes){
    this.internationalFreeMinutes = internationalFreeMinutes;
    }

    private String iRKeyFreeMinutes;

    public String getIRKeyFreeMinutes(){
    return iRKeyFreeMinutes;
    }

    public void setIRKeyFreeMinutes(String iRKeyFreeMinutes){
    this.iRKeyFreeMinutes = iRKeyFreeMinutes;
    }

    private String packUsage;

    public String getPackUsage(){
    return packUsage;
    }

    public void setPackUsage(String packUsage){
    this.packUsage = packUsage;
    }

    private String packName;

    public String getPackName(){
    return packName;
    }

    public void setPackName(String packName){
    this.packName = packName;
    }

    private String packExpiryDate;

    public String getPackExpiryDate(){
    return packExpiryDate;
    }

    public void setPackExpiryDate(String packExpiryDate){
    this.packExpiryDate = packExpiryDate;
    }

    private String packTotalData;

    public String getPackTotalData(){
    return packTotalData;
    }

    public void setPackTotalData(String packTotalData){
    this.packTotalData = packTotalData;
    }

    private String rewardsMaxData;

    public String getRewardsMaxData(){
    return rewardsMaxData;
    }

    public void setRewardsMaxData(String rewardsMaxData){
    this.rewardsMaxData = rewardsMaxData;
    }

    private String rewardsMaxIDD;

    public String getRewardsMaxIDD(){
    return rewardsMaxIDD;
    }

    public void setRewardsMaxIDD(String rewardsMaxIDD){
    this.rewardsMaxIDD = rewardsMaxIDD;
    }

    private boolean roaming;

    public boolean getRoaming(){
    return roaming;
    }

    public void setRoaming(boolean roaming){
    this.roaming = roaming;
    }

    private boolean hasInternationalFreeMinutes;

    public boolean getHasInternationalFreeMinutes(){
    return hasInternationalFreeMinutes;
    }

    public void setHasInternationalFreeMinutes(boolean hasInternationalFreeMinutes){
    this.hasInternationalFreeMinutes = hasInternationalFreeMinutes;
    }

    private int tariffId;

    public int getTariffId(){
    return tariffId;
    }

    public void setTariffId(int tariffId){
    this.tariffId = tariffId;
    }

    private int productId;

    public int getProductId(){
    return productId;
    }

    public void setProductId(int productId){
    this.productId = productId;
    }

    private boolean hasMIP;

    public boolean getHasMIP(){
    return hasMIP;
    }

    public void setHasMIP(boolean hasMIP){
    this.hasMIP = hasMIP;
    }

    private String overallDataSummation;

    public String getOverallDataSummation(){
    return overallDataSummation;
    }

    public void setOverallDataSummation(String overallDataSummation){
    this.overallDataSummation = overallDataSummation;
    }

    private String overllMaxDataSummation;

    public String getOverllMaxDataSummation(){
    return overllMaxDataSummation;
    }

    public void setOverllMaxDataSummation(String overllMaxDataSummation){
    this.overllMaxDataSummation = overllMaxDataSummation;
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

    private String dcTotalRemainingData;

    public String getDcTotalRemainingData(){
    return dcTotalRemainingData;
    }

    public void setDcTotalRemainingData(String dcTotalRemainingData){
    this.dcTotalRemainingData = dcTotalRemainingData;
    }

    private String dcClosestExpiryDate;

    public String getDcClosestExpiryDate(){
    return dcClosestExpiryDate;
    }

    public void setDcClosestExpiryDate(String dcClosestExpiryDate){
    this.dcClosestExpiryDate = dcClosestExpiryDate;
    }

    private boolean dcActive;

    public boolean getDcActive(){
    return dcActive;
    }

    public void setDcActive(boolean dcActive){
    this.dcActive = dcActive;
    }

    private String bonusData;

    public String getBonusData(){
    return bonusData;
    }

    public void setBonusData(String bonusData){
    this.bonusData = bonusData;
    }

    private String bonusExpiryDate;

    public String getBonusExpiryDate(){
    return bonusExpiryDate;
    }

    public void setBonusExpiryDate(String bonusExpiryDate){
    this.bonusExpiryDate = bonusExpiryDate;
    }

    private String qndTitle;

    public String getQndTitle(){
    return qndTitle;
    }

    public void setQndTitle(String qndTitle){
    this.qndTitle = qndTitle;
    }

    private String totalDataBonus;

    public String getTotalDataBonus(){
    return totalDataBonus;
    }

    public void setTotalDataBonus(String totalDataBonus){
    this.totalDataBonus = totalDataBonus;
    }

    private String iPhoneKeyRemaining;

    public String getIPhoneKeyRemaining(){
    return iPhoneKeyRemaining;
    }

    public void setIPhoneKeyRemaining(String iPhoneKeyRemaining){
    this.iPhoneKeyRemaining = iPhoneKeyRemaining;
    }

    private boolean hasIphone7Key;

    public boolean getHasIphone7Key(){
    return hasIphone7Key;
    }

    public void setHasIphone7Key(boolean hasIphone7Key){
    this.hasIphone7Key = hasIphone7Key;
    }

    private String iphone7KeyTitle;

    public String getIphone7KeyTitle(){
    return iphone7KeyTitle;
    }

    public void setIphone7KeyTitle(String iphone7KeyTitle){
    this.iphone7KeyTitle = iphone7KeyTitle;
    }

    private String totalDawliMins;

    public String getTotalDawliMins(){
    return totalDawliMins;
    }

    public void setTotalDawliMins(String totalDawliMins){
    this.totalDawliMins = totalDawliMins;
    }

    private String internationalMinutesCountry;

    public String getInternationalMinutesCountry(){
    return internationalMinutesCountry;
    }

    public void setInternationalMinutesCountry(String internationalMinutesCountry){
    this.internationalMinutesCountry = internationalMinutesCountry;
    }

    private String internationalMinutesCountryBalance;

    public String getInternationalMinutesCountryBalance(){
    return internationalMinutesCountryBalance;
    }

    public void setInternationalMinutesCountryBalance(String internationalMinutesCountryBalance){
    this.internationalMinutesCountryBalance = internationalMinutesCountryBalance;
    }

    private qa.ooredoo.selfcare.sdk.model.response.ShahryBonusUsage[] shahryBonusUsageList;

    public qa.ooredoo.selfcare.sdk.model.response.ShahryBonusUsage[] getShahryBonusUsageList(){
    return shahryBonusUsageList;
    }

    public void setShahryBonusUsageList(qa.ooredoo.selfcare.sdk.model.response.ShahryBonusUsage[] shahryBonusUsageList){
    this.shahryBonusUsageList = shahryBonusUsageList;
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

    private String roamingData;

    public String getRoamingData(){
    return roamingData;
    }

    public void setRoamingData(String roamingData){
    this.roamingData = roamingData;
    }



    private String roamingMessage;

    public String getRoamingMessage(){
        return roamingMessage;
    }

    public void setRoamingMessage(String roamingMessage){
        this.roamingMessage = roamingMessage;
    }


    private qa.ooredoo.selfcare.sdk.model.response.DawliUsageResponse dawliUsageResponse;

    public qa.ooredoo.selfcare.sdk.model.response.DawliUsageResponse getDawliUsageResponse(){
    return dawliUsageResponse;
    }

    public void setDawliUsageResponse(qa.ooredoo.selfcare.sdk.model.response.DawliUsageResponse dawliUsageResponse){
    this.dawliUsageResponse = dawliUsageResponse;
    }

    private qa.ooredoo.selfcare.sdk.model.response.DawliUsageResponse[] dawliUsageResponseList;

    public qa.ooredoo.selfcare.sdk.model.response.DawliUsageResponse[] getDawliUsageResponseList(){
    return dawliUsageResponseList;
    }

    public void setDawliUsageResponseList(qa.ooredoo.selfcare.sdk.model.response.DawliUsageResponse[] dawliUsageResponseList){
    this.dawliUsageResponseList = dawliUsageResponseList;
    }

    private String dcClosestExpiryData;

    public String getDcClosestExpiryData(){
    return dcClosestExpiryData;
    }

    public void setDcClosestExpiryData(String dcClosestExpiryData){
    this.dcClosestExpiryData = dcClosestExpiryData;
    }

public static ShahryValuePack fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
ShahryValuePack instance = new ShahryValuePack();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setShahryVP(jsonObject.optString("shahryVP"));
    instance.setRemainMinutes(jsonObject.optString("remainMinutes"));
    instance.setRemainSMS(jsonObject.optString("remainSMS"));
    instance.setRemainMMS(jsonObject.optString("remainMMS"));
    instance.setRemainData(jsonObject.optString("remainData"));
    instance.setCarriedForward(jsonObject.optString("carriedForward"));
    instance.setRoamRcvdCalls(jsonObject.optString("roamRcvdCalls"));
    instance.setMaxMinutes(jsonObject.optString("maxMinutes"));
    instance.setMaxSMS(jsonObject.optString("maxSMS"));
    instance.setMaxMMS(jsonObject.optString("maxMMS"));
    instance.setMaxData(jsonObject.optString("maxData"));
    instance.setMaxPackData(jsonObject.optString("maxPackData"));
    instance.setRoammaxCalls(jsonObject.optString("roammaxCalls"));
    instance.setMonthlyFee(jsonObject.optString("monthlyFee"));
    instance.setUnbilledAmount(jsonObject.optString("unbilledAmount"));
    instance.setInternationalFreeMinutes(jsonObject.optString("internationalFreeMinutes"));
    instance.setIRKeyFreeMinutes(jsonObject.optString("iRKeyFreeMinutes"));
    instance.setPackUsage(jsonObject.optString("packUsage"));
    instance.setPackName(jsonObject.optString("packName"));
    instance.setPackExpiryDate(jsonObject.optString("packExpiryDate"));
    instance.setPackTotalData(jsonObject.optString("packTotalData"));
    instance.setRewardsMaxData(jsonObject.optString("rewardsMaxData"));
    instance.setRewardsMaxIDD(jsonObject.optString("rewardsMaxIDD"));
    instance.setRoaming(jsonObject.optBoolean("roaming"));
    instance.setHasInternationalFreeMinutes(jsonObject.optBoolean("hasInternationalFreeMinutes"));
    instance.setTariffId(jsonObject.optInt("tariffId"));
    instance.setProductId(jsonObject.optInt("productId"));
    instance.setHasMIP(jsonObject.optBoolean("hasMIP"));
    instance.setOverallDataSummation(jsonObject.optString("overallDataSummation"));
    instance.setOverllMaxDataSummation(jsonObject.optString("overllMaxDataSummation"));
    instance.setDcRemainingData(jsonObject.optString("dcRemainingData"));
    instance.setDcExpiryDate(jsonObject.optString("dcExpiryDate"));
    instance.setDcTotalRemainingData(jsonObject.optString("dcTotalRemainingData"));
    instance.setDcClosestExpiryDate(jsonObject.optString("dcClosestExpiryDate"));
    instance.setDcActive(jsonObject.optBoolean("dcActive"));
    instance.setBonusData(jsonObject.optString("bonusData"));
    instance.setBonusExpiryDate(jsonObject.optString("bonusExpiryDate"));
    instance.setQndTitle(jsonObject.optString("qndTitle"));
    instance.setTotalDataBonus(jsonObject.optString("totalDataBonus"));
    instance.setIPhoneKeyRemaining(jsonObject.optString("iPhoneKeyRemaining"));
    instance.setHasIphone7Key(jsonObject.optBoolean("hasIphone7Key"));
    instance.setIphone7KeyTitle(jsonObject.optString("iphone7KeyTitle"));
    instance.setTotalDawliMins(jsonObject.optString("totalDawliMins"));
    instance.setInternationalMinutesCountry(jsonObject.optString("internationalMinutesCountry"));
    instance.setInternationalMinutesCountryBalance(jsonObject.optString("internationalMinutesCountryBalance"));
    JSONArray shahryBonusUsageListJsonArray = jsonObject.optJSONArray("shahryBonusUsageList");
    if (shahryBonusUsageListJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.response.ShahryBonusUsage[] shahryBonusUsageListArray = new qa.ooredoo.selfcare.sdk.model.response.ShahryBonusUsage[shahryBonusUsageListJsonArray.length()];
    for (int i = 0; i < shahryBonusUsageListJsonArray.length(); i++) {
        shahryBonusUsageListArray[i] = qa.ooredoo.selfcare.sdk.model.response.ShahryBonusUsage.fromJSON(shahryBonusUsageListJsonArray.optString(i));
    }
    instance.setShahryBonusUsageList(shahryBonusUsageListArray);
    }
    instance.setIsUnlimited64KbpsSubscribed(jsonObject.optBoolean("isUnlimited64KbpsSubscribed"));
    instance.setUnlimitedKbpsPackName(jsonObject.optString("unlimitedKbpsPackName"));
    instance.setUnlinited64KbpsExpiryDate(jsonObject.optString("unlinited64KbpsExpiryDate"));
    instance.setUnlimitedKbpsDescription(jsonObject.optString("unlimitedKbpsDescription"));
    instance.setIsUnlimited64IconOnDashboard(jsonObject.optBoolean("isUnlimited64IconOnDashboard"));
    instance.setRoamingData(jsonObject.optString("roamingData"));
    instance.setRoamingMessage(jsonObject.optString("roamingMessage"));
    instance.setDawliUsageResponse(qa.ooredoo.selfcare.sdk.model.response.DawliUsageResponse.fromJSON(jsonObject.optString("dawliUsageResponse")));
    JSONArray dawliUsageResponseListJsonArray = jsonObject.optJSONArray("dawliUsageResponseList");
    if (dawliUsageResponseListJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.response.DawliUsageResponse[] dawliUsageResponseListArray = new qa.ooredoo.selfcare.sdk.model.response.DawliUsageResponse[dawliUsageResponseListJsonArray.length()];
    for (int i = 0; i < dawliUsageResponseListJsonArray.length(); i++) {
        dawliUsageResponseListArray[i] = qa.ooredoo.selfcare.sdk.model.response.DawliUsageResponse.fromJSON(dawliUsageResponseListJsonArray.optString(i));
    }
    instance.setDawliUsageResponseList(dawliUsageResponseListArray);
    }
    instance.setDcClosestExpiryData(jsonObject.optString("dcClosestExpiryData"));
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