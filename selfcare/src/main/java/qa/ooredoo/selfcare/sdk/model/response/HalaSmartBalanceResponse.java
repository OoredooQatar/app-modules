package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HalaSmartBalanceResponse implements Serializable{


    private String qndTitle;

    public String getQndTitle(){
        return qndTitle;
    }

    public void setQndTitle(String qndTitle){
        this.qndTitle = qndTitle;
    }

    private String units;

    public String getUnits(){
        return units;
    }

    public void setUnits(String units){
        this.units = units;
    }

    private String totalUnits;

    public String getTotalUnits(){
        return totalUnits;
    }

    public void setTotalUnits(String totalUnits){
        this.totalUnits = totalUnits;
    }

    private String data;

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    private String expiryDate;

    public String getExpiryDate(){
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }

    private String totalBalance;

    public String getTotalBalance(){
        return totalBalance;
    }

    public void setTotalBalance(String totalBalance){
        this.totalBalance = totalBalance;
    }

    private String packName;

    public String getPackName(){
        return packName;
    }

    public void setPackName(String packName){
        this.packName = packName;
    }

    private boolean hasHalaSmart;

    public boolean getHasHalaSmart(){
        return hasHalaSmart;
    }

    public void setHasHalaSmart(boolean hasHalaSmart){
        this.hasHalaSmart = hasHalaSmart;
    }

    private String wpRemainingUnits;

    public String getWpRemainingUnits(){
        return wpRemainingUnits;
    }

    public void setWpRemainingUnits(String wpRemainingUnits){
        this.wpRemainingUnits = wpRemainingUnits;
    }

    private String wpMaxUnits;

    public String getWpMaxUnits(){
        return wpMaxUnits;
    }

    public void setWpMaxUnits(String wpMaxUnits){
        this.wpMaxUnits = wpMaxUnits;
    }

    private String wpRemainingData;

    public String getWpRemainingData(){
        return wpRemainingData;
    }

    public void setWpRemainingData(String wpRemainingData){
        this.wpRemainingData = wpRemainingData;
    }

    private String wpMaxData;

    public String getWpMaxData(){
        return wpMaxData;
    }

    public void setWpMaxData(String wpMaxData){
        this.wpMaxData = wpMaxData;
    }

    private String wpExpiryDate;

    public String getWpExpiryDate(){
        return wpExpiryDate;
    }

    public void setWpExpiryDate(String wpExpiryDate){
        this.wpExpiryDate = wpExpiryDate;
    }

    private String wpName;

    public String getWpName(){
        return wpName;
    }

    public void setWpName(String wpName){
        this.wpName = wpName;
    }

    private boolean hasWeeklyPack;

    public boolean getHasWeeklyPack(){
        return hasWeeklyPack;
    }

    public void setHasWeeklyPack(boolean hasWeeklyPack){
        this.hasWeeklyPack = hasWeeklyPack;
    }

    private String bonusDataQND;

    public String getBonusDataQND(){
        return bonusDataQND;
    }

    public void setBonusDataQND(String bonusDataQND){
        this.bonusDataQND = bonusDataQND;
    }

    private String bonusExpiryDateQND;

    public String getBonusExpiryDateQND(){
        return bonusExpiryDateQND;
    }

    public void setBonusExpiryDateQND(String bonusExpiryDateQND){
        this.bonusExpiryDateQND = bonusExpiryDateQND;
    }

    private boolean hasQNDBonus;

    public boolean getHasQNDBonus(){
        return hasQNDBonus;
    }

    public void setHasQNDBonus(boolean hasQNDBonus){
        this.hasQNDBonus = hasQNDBonus;
    }

    private String mipTotalBalance;

    public String getMipTotalBalance(){
        return mipTotalBalance;
    }

    public void setMipTotalBalance(String mipTotalBalance){
        this.mipTotalBalance = mipTotalBalance;
    }

    private boolean hasMip;

    public boolean getHasMip(){
        return hasMip;
    }

    public void setHasMip(boolean hasMip){
        this.hasMip = hasMip;
    }

    private HalaMIP[] halaMIPPacksDetail;

    public HalaMIP[] getHalaMIPPacksDetail(){
        return halaMIPPacksDetail;
    }

    public void setHalaMIPPacksDetail(HalaMIP[] halaMIPPacksDetail){
        this.halaMIPPacksDetail = halaMIPPacksDetail;
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

    private String dcClosestExpiryData;

    public String getDcClosestExpiryData(){
        return dcClosestExpiryData;
    }

    public void setDcClosestExpiryData(String dcClosestExpiryData){
        this.dcClosestExpiryData = dcClosestExpiryData;
    }

    private String dcClosestExpiryDate;

    public String getDcClosestExpiryDate(){
        return dcClosestExpiryDate;
    }

    public void setDcClosestExpiryDate(String dcClosestExpiryDate){
        this.dcClosestExpiryDate = dcClosestExpiryDate;
    }

    private boolean hasDC;

    public boolean getHasDC(){
        return hasDC;
    }

    public void setHasDC(boolean hasDC){
        this.hasDC = hasDC;
    }

    private String bonusClosestValue;

    public String getBonusClosestValue(){
        return bonusClosestValue;
    }

    public void setBonusClosestValue(String bonusClosestValue){
        this.bonusClosestValue = bonusClosestValue;
    }

    private String bonusClosestExpiry;

    public String getBonusClosestExpiry(){
        return bonusClosestExpiry;
    }

    public void setBonusClosestExpiry(String bonusClosestExpiry){
        this.bonusClosestExpiry = bonusClosestExpiry;
    }

    private String totalBonusMinutes;

    public String getTotalBonusMinutes(){
        return totalBonusMinutes;
    }

    public void setTotalBonusMinutes(String totalBonusMinutes){
        this.totalBonusMinutes = totalBonusMinutes;
    }

    private String totalBonusData;

    public String getTotalBonusData(){
        return totalBonusData;
    }

    public void setTotalBonusData(String totalBonusData){
        this.totalBonusData = totalBonusData;
    }

    private boolean hasBonus;

    public boolean getHasBonus(){
        return hasBonus;
    }

    public void setHasBonus(boolean hasBonus){
        this.hasBonus = hasBonus;
    }

    private StandardBonus[] standardBonuseDetail;

    public StandardBonus[] getStandardBonuseDetail(){
        return standardBonuseDetail;
    }

    public void setStandardBonuseDetail(StandardBonus[] standardBonuseDetail){
        this.standardBonuseDetail = standardBonuseDetail;
    }

    private MyHalaOffersUsage[] myHalaOffersUsages;

    public MyHalaOffersUsage[] getMyHalaOffersUsages(){
        return myHalaOffersUsages;
    }

    public void setMyHalaOffersUsages(MyHalaOffersUsage[] myHalaOffersUsages){
        this.myHalaOffersUsages = myHalaOffersUsages;
    }

    private String ussdDataProductTitle;

    public String getUssdDataProductTitle(){
        return ussdDataProductTitle;
    }

    public void setUssdDataProductTitle(String ussdDataProductTitle){
        this.ussdDataProductTitle = ussdDataProductTitle;
    }

    private String ussdDataProductRemainingAmount;

    public String getUssdDataProductRemainingAmount(){
        return ussdDataProductRemainingAmount;
    }

    public void setUssdDataProductRemainingAmount(String ussdDataProductRemainingAmount){
        this.ussdDataProductRemainingAmount = ussdDataProductRemainingAmount;
    }

    private String ussdDataProductExpiry;

    public String getUssdDataProductExpiry(){
        return ussdDataProductExpiry;
    }

    public void setUssdDataProductExpiry(String ussdDataProductExpiry){
        this.ussdDataProductExpiry = ussdDataProductExpiry;
    }

    private String ussdDataProductUnit;

    public String getUssdDataProductUnit(){
        return ussdDataProductUnit;
    }

    public void setUssdDataProductUnit(String ussdDataProductUnit){
        this.ussdDataProductUnit = ussdDataProductUnit;
    }

    private boolean hasUssdData;

    public boolean getHasUssdData(){
        return hasUssdData;
    }

    public void setHasUssdData(boolean hasUssdData){
        this.hasUssdData = hasUssdData;
    }

    private DawliUsageResponse dawliUsageResponse;

    public DawliUsageResponse getDawliUsageResponse(){
        return dawliUsageResponse;
    }

    public void setDawliUsageResponse(DawliUsageResponse dawliUsageResponse){
        this.dawliUsageResponse = dawliUsageResponse;
    }

    private DawliUsageResponse[] dawliUsageResponseList;

    public DawliUsageResponse[] getDawliUsageResponseList(){
        return dawliUsageResponseList;
    }

    public void setDawliUsageResponseList(DawliUsageResponse[] dawliUsageResponseList){
        this.dawliUsageResponseList = dawliUsageResponseList;
    }

    private DawliOfferUsageResponse[] dawliOfferUsageList;

    public DawliOfferUsageResponse[] getDawliOfferUsageList(){
        return dawliOfferUsageList;
    }

    public void setDawliOfferUsageList(DawliOfferUsageResponse[] dawliOfferUsageList){
        this.dawliOfferUsageList = dawliOfferUsageList;
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

    private String unlimited64KbpsExpiryDate;

    public String getUnlimited64KbpsExpiryDate(){
        return unlimited64KbpsExpiryDate;
    }

    public void setUnlimited64KbpsExpiryDate(String unlimited64KbpsExpiryDate){
        this.unlimited64KbpsExpiryDate = unlimited64KbpsExpiryDate;
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

    private FlexCardUsage[] flexCardUsageList;

    public FlexCardUsage[] getFlexCardUsageList(){
        return flexCardUsageList;
    }

    public void setFlexCardUsageList(FlexCardUsage[] flexCardUsageList){
        this.flexCardUsageList = flexCardUsageList;
    }

    private FlexPackUsage[] flexPackUsageList;

    public FlexPackUsage[] getFlexPackUsageList(){
        return flexPackUsageList;
    }

    public void setFlexPackUsageList(FlexPackUsage[] flexPackUsageList){
        this.flexPackUsageList = flexPackUsageList;
    }

    private String flexTotalRemainingPoints;

    public String getFlexTotalRemainingPoints(){
        return flexTotalRemainingPoints;
    }

    public void setFlexTotalRemainingPoints(String flexTotalRemainingPoints){
        this.flexTotalRemainingPoints = flexTotalRemainingPoints;
    }

    private String flexDescriptionMessage;

    public String getFlexDescriptionMessage(){
        return flexDescriptionMessage;
    }

    public void setFlexDescriptionMessage(String flexDescriptionMessage){
        this.flexDescriptionMessage = flexDescriptionMessage;
    }

    private String lineValidity;

    public String getLineValidity(){
        return lineValidity;
    }

    public void setLineValidity(String lineValidity){
        this.lineValidity = lineValidity;
    }

    private String creditValidity;

    public String getCreditValidity(){
        return creditValidity;
    }

    public void setCreditValidity(String creditValidity){
        this.creditValidity = creditValidity;
    }


    private qa.ooredoo.selfcare.sdk.model.HalaNonStopUsage halaNonStopUsage;

    public qa.ooredoo.selfcare.sdk.model.HalaNonStopUsage getHalaNonStopUsage(){
        return halaNonStopUsage;
    }

    public void setHalaNonStopUsage(qa.ooredoo.selfcare.sdk.model.HalaNonStopUsage halaNonStopUsage){
        this.halaNonStopUsage = halaNonStopUsage;
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

    public static HalaSmartBalanceResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        HalaSmartBalanceResponse instance = new HalaSmartBalanceResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setQndTitle(jsonObject.optString("qndTitle"));
            instance.setUnits(jsonObject.optString("units"));
            instance.setTotalUnits(jsonObject.optString("totalUnits"));
            instance.setData(jsonObject.optString("data"));
            instance.setExpiryDate(jsonObject.optString("expiryDate"));
            instance.setTotalBalance(jsonObject.optString("totalBalance"));
            instance.setPackName(jsonObject.optString("packName"));
            instance.setHasHalaSmart(jsonObject.optBoolean("hasHalaSmart"));
            instance.setWpRemainingUnits(jsonObject.optString("wpRemainingUnits"));
            instance.setWpMaxUnits(jsonObject.optString("wpMaxUnits"));
            instance.setWpRemainingData(jsonObject.optString("wpRemainingData"));
            instance.setWpMaxData(jsonObject.optString("wpMaxData"));
            instance.setWpExpiryDate(jsonObject.optString("wpExpiryDate"));
            instance.setWpName(jsonObject.optString("wpName"));
            instance.setHasWeeklyPack(jsonObject.optBoolean("hasWeeklyPack"));
            instance.setBonusDataQND(jsonObject.optString("bonusDataQND"));
            instance.setBonusExpiryDateQND(jsonObject.optString("bonusExpiryDateQND"));
            instance.setHasQNDBonus(jsonObject.optBoolean("hasQNDBonus"));
            instance.setMipTotalBalance(jsonObject.optString("mipTotalBalance"));
            instance.setHasMip(jsonObject.optBoolean("hasMip"));
            JSONArray halaMIPPacksDetailJsonArray = jsonObject.optJSONArray("halaMIPPacksDetail");
            if (halaMIPPacksDetailJsonArray != null) {
                HalaMIP[] halaMIPPacksDetailArray = new HalaMIP[halaMIPPacksDetailJsonArray.length()];
                for (int i = 0; i < halaMIPPacksDetailJsonArray.length(); i++) {
                    halaMIPPacksDetailArray[i] = HalaMIP.fromJSON(halaMIPPacksDetailJsonArray.optString(i));
                }
                instance.setHalaMIPPacksDetail(halaMIPPacksDetailArray);
            }
            instance.setDcRemainingData(jsonObject.optString("dcRemainingData"));
            instance.setDcExpiryDate(jsonObject.optString("dcExpiryDate"));
            instance.setDcClosestExpiryData(jsonObject.optString("dcClosestExpiryData"));
            instance.setDcClosestExpiryDate(jsonObject.optString("dcClosestExpiryDate"));
            instance.setHasDC(jsonObject.optBoolean("hasDC"));
            instance.setBonusClosestValue(jsonObject.optString("bonusClosestValue"));
            instance.setBonusClosestExpiry(jsonObject.optString("bonusClosestExpiry"));
            instance.setTotalBonusMinutes(jsonObject.optString("totalBonusMinutes"));
            instance.setTotalBonusData(jsonObject.optString("totalBonusData"));
            instance.setHasBonus(jsonObject.optBoolean("hasBonus"));
            JSONArray standardBonuseDetailJsonArray = jsonObject.optJSONArray("standardBonuseDetail");
            if (standardBonuseDetailJsonArray != null) {
                StandardBonus[] standardBonuseDetailArray = new StandardBonus[standardBonuseDetailJsonArray.length()];
                for (int i = 0; i < standardBonuseDetailJsonArray.length(); i++) {
                    standardBonuseDetailArray[i] = StandardBonus.fromJSON(standardBonuseDetailJsonArray.optString(i));
                }
                instance.setStandardBonuseDetail(standardBonuseDetailArray);
            }
            JSONArray myHalaOffersUsagesJsonArray = jsonObject.optJSONArray("myHalaOffersUsages");
            if (myHalaOffersUsagesJsonArray != null) {
                MyHalaOffersUsage[] myHalaOffersUsagesArray = new MyHalaOffersUsage[myHalaOffersUsagesJsonArray.length()];
                for (int i = 0; i < myHalaOffersUsagesJsonArray.length(); i++) {
                    myHalaOffersUsagesArray[i] = MyHalaOffersUsage.fromJSON(myHalaOffersUsagesJsonArray.optString(i));
                }
                instance.setMyHalaOffersUsages(myHalaOffersUsagesArray);
            }
            instance.setUssdDataProductTitle(jsonObject.optString("ussdDataProductTitle"));
            instance.setUssdDataProductRemainingAmount(jsonObject.optString("ussdDataProductRemainingAmount"));
            instance.setUssdDataProductExpiry(jsonObject.optString("ussdDataProductExpiry"));
            instance.setUssdDataProductUnit(jsonObject.optString("ussdDataProductUnit"));
            instance.setHasUssdData(jsonObject.optBoolean("hasUssdData"));
            instance.setDawliUsageResponse(DawliUsageResponse.fromJSON(jsonObject.optString("dawliUsageResponse")));
            JSONArray dawliUsageResponseListJsonArray = jsonObject.optJSONArray("dawliUsageResponseList");
            if (dawliUsageResponseListJsonArray != null) {
                DawliUsageResponse[] dawliUsageResponseListArray = new DawliUsageResponse[dawliUsageResponseListJsonArray.length()];
                for (int i = 0; i < dawliUsageResponseListJsonArray.length(); i++) {
                    dawliUsageResponseListArray[i] = DawliUsageResponse.fromJSON(dawliUsageResponseListJsonArray.optString(i));
                }
                instance.setDawliUsageResponseList(dawliUsageResponseListArray);
            }
            JSONArray dawliOfferUsageListJsonArray = jsonObject.optJSONArray("dawliOfferUsageList");
            if (dawliOfferUsageListJsonArray != null) {
                DawliOfferUsageResponse[] dawliOfferUsageListArray = new DawliOfferUsageResponse[dawliOfferUsageListJsonArray.length()];
                for (int i = 0; i < dawliOfferUsageListJsonArray.length(); i++) {
                    dawliOfferUsageListArray[i] = DawliOfferUsageResponse.fromJSON(dawliOfferUsageListJsonArray.optString(i));
                }
                instance.setDawliOfferUsageList(dawliOfferUsageListArray);
            }
            instance.setIsUnlimited64KbpsSubscribed(jsonObject.optBoolean("isUnlimited64KbpsSubscribed"));
            instance.setUnlimitedKbpsPackName(jsonObject.optString("unlimitedKbpsPackName"));
            instance.setUnlimited64KbpsExpiryDate(jsonObject.optString("unlimited64KbpsExpiryDate"));
            instance.setUnlimitedKbpsDescription(jsonObject.optString("unlimitedKbpsDescription"));
            instance.setIsUnlimited64IconOnDashboard(jsonObject.optBoolean("isUnlimited64IconOnDashboard"));
            JSONArray flexCardUsageListJsonArray = jsonObject.optJSONArray("flexCardUsageList");
            if (flexCardUsageListJsonArray != null) {
                FlexCardUsage[] flexCardUsageListArray = new FlexCardUsage[flexCardUsageListJsonArray.length()];
                for (int i = 0; i < flexCardUsageListJsonArray.length(); i++) {
                    flexCardUsageListArray[i] = FlexCardUsage.fromJSON(flexCardUsageListJsonArray.optString(i));
                }
                instance.setFlexCardUsageList(flexCardUsageListArray);
            }
            JSONArray flexPackUsageListJsonArray = jsonObject.optJSONArray("flexPackUsageList");
            if (flexPackUsageListJsonArray != null) {
                FlexPackUsage[] flexPackUsageListArray = new FlexPackUsage[flexPackUsageListJsonArray.length()];
                for (int i = 0; i < flexPackUsageListJsonArray.length(); i++) {
                    flexPackUsageListArray[i] = FlexPackUsage.fromJSON(flexPackUsageListJsonArray.optString(i));
                }
                instance.setFlexPackUsageList(flexPackUsageListArray);
            }
            instance.setFlexTotalRemainingPoints(jsonObject.optString("flexTotalRemainingPoints"));
            instance.setFlexDescriptionMessage(jsonObject.optString("flexDescriptionMessage"));
            instance.setLineValidity(jsonObject.optString("lineValidity"));
            instance.setCreditValidity(jsonObject.optString("creditValidity"));
            instance.setHalaNonStopUsage(qa.ooredoo.selfcare.sdk.model.HalaNonStopUsage.fromJSON(jsonObject.optString("halaNonStopUsage")));
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