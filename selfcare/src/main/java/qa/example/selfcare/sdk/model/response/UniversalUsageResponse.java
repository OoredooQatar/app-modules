package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UniversalUsageResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.ShahryValuePack shahryUsageResponse;

    public qa.ooredoo.selfcare.sdk.model.ShahryValuePack getShahryUsageResponse(){
        return shahryUsageResponse;
    }

    public void setShahryUsageResponse(qa.ooredoo.selfcare.sdk.model.ShahryValuePack shahryUsageResponse){
        this.shahryUsageResponse = shahryUsageResponse;
    }

    private HalaSmartBalanceResponse halaUsageResponse;

    public HalaSmartBalanceResponse getHalaUsageResponse(){
        return halaUsageResponse;
    }

    public void setHalaUsageResponse(HalaSmartBalanceResponse halaUsageResponse){
        this.halaUsageResponse = halaUsageResponse;
    }

    private OoredooPassportDetailedResponse passportUsageDetails;

    public OoredooPassportDetailedResponse getPassportUsageDetails(){
        return passportUsageDetails;
    }

    public void setPassportUsageDetails(OoredooPassportDetailedResponse passportUsageDetails){
        this.passportUsageDetails = passportUsageDetails;
    }

    private MBBBalanceResponse mbbUsageResponse;

    public MBBBalanceResponse getMbbUsageResponse(){
        return mbbUsageResponse;
    }

    public void setMbbUsageResponse(MBBBalanceResponse mbbUsageResponse){
        this.mbbUsageResponse = mbbUsageResponse;
    }

    private qa.ooredoo.selfcare.sdk.model.ShahryEIPack shahryEIPack;

    public qa.ooredoo.selfcare.sdk.model.ShahryEIPack getShahryEIPack(){
        return shahryEIPack;
    }

    public void setShahryEIPack(qa.ooredoo.selfcare.sdk.model.ShahryEIPack shahryEIPack){
        this.shahryEIPack = shahryEIPack;
    }

    private int daysUntilNexCycle;

    public int getDaysUntilNexCycle(){
        return daysUntilNexCycle;
    }

    public void setDaysUntilNexCycle(int daysUntilNexCycle){
        this.daysUntilNexCycle = daysUntilNexCycle;
    }

    private String maxCreditAllowance;

    public String getMaxCreditAllowance(){
        return maxCreditAllowance;
    }

    public void setMaxCreditAllowance(String maxCreditAllowance){
        this.maxCreditAllowance = maxCreditAllowance;
    }

    private String balance;

    public String getBalance(){
        return balance;
    }

    public void setBalance(String balance){
        this.balance = balance;
    }

    private Date balanceValidity;

    public Date getBalanceValidity(){
        return balanceValidity;
    }

    public void setBalanceValidity(Date balanceValidity){
        this.balanceValidity = balanceValidity;
    }

    private String remainingCreditAllowance;

    public String getRemainingCreditAllowance(){
        return remainingCreditAllowance;
    }

    public void setRemainingCreditAllowance(String remainingCreditAllowance){
        this.remainingCreditAllowance = remainingCreditAllowance;
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

    public static UniversalUsageResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        UniversalUsageResponse instance = new UniversalUsageResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setShahryUsageResponse(qa.ooredoo.selfcare.sdk.model.ShahryValuePack.fromJSON(jsonObject.optString("shahryUsageResponse")));
            instance.setHalaUsageResponse(HalaSmartBalanceResponse.fromJSON(jsonObject.optString("halaUsageResponse")));
            instance.setPassportUsageDetails(OoredooPassportDetailedResponse.fromJSON(jsonObject.optString("passportUsageDetails")));
            instance.setMbbUsageResponse(MBBBalanceResponse.fromJSON(jsonObject.optString("mbbUsageResponse")));
            instance.setShahryEIPack(qa.ooredoo.selfcare.sdk.model.ShahryEIPack.fromJSON(jsonObject.optString("shahryEIPack")));
            instance.setDaysUntilNexCycle(jsonObject.optInt("daysUntilNexCycle"));
            instance.setMaxCreditAllowance(jsonObject.optString("maxCreditAllowance"));
            instance.setBalance(jsonObject.optString("balance"));
            instance.setBalanceValidity(parseDate(jsonObject,"balanceValidity"));
            instance.setRemainingCreditAllowance(jsonObject.optString("remainingCreditAllowance"));
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