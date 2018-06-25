package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OoredooPassportDetailedResponse implements Serializable{


    private String resultCode;

    public String getResultCode(){
        return resultCode;
    }

    public void setResultCode(String resultCode){
        this.resultCode = resultCode;
    }

    private String language;

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    private qa.ooredoo.selfcare.sdk.model.BalanceData[] balanceList;

    public qa.ooredoo.selfcare.sdk.model.BalanceData[] getBalanceList(){
        return balanceList;
    }

    public void setBalanceList(qa.ooredoo.selfcare.sdk.model.BalanceData[] balanceList){
        this.balanceList = balanceList;
    }

    private BalanceOPC[] balanceOPCList;

    public BalanceOPC[] getBalanceOPCList(){
        return balanceOPCList;
    }

    public void setBalanceOPCList(BalanceOPC[] balanceOPCList){
        this.balanceOPCList = balanceOPCList;
    }

    private qa.ooredoo.selfcare.sdk.model.BalanceData total;

    public qa.ooredoo.selfcare.sdk.model.BalanceData getTotal(){
        return total;
    }

    public void setTotal(qa.ooredoo.selfcare.sdk.model.BalanceData total){
        this.total = total;
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

    public static OoredooPassportDetailedResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        OoredooPassportDetailedResponse instance = new OoredooPassportDetailedResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setResultCode(jsonObject.optString("resultCode"));
            instance.setLanguage(jsonObject.optString("language"));
            JSONArray balanceListJsonArray = jsonObject.optJSONArray("balanceList");
            if (balanceListJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.BalanceData[] balanceListArray = new qa.ooredoo.selfcare.sdk.model.BalanceData[balanceListJsonArray.length()];
                for (int i = 0; i < balanceListJsonArray.length(); i++) {
                    balanceListArray[i] = qa.ooredoo.selfcare.sdk.model.BalanceData.fromJSON(balanceListJsonArray.optString(i));
                }
                instance.setBalanceList(balanceListArray);
            }
            JSONArray balanceOPCListJsonArray = jsonObject.optJSONArray("balanceOPCList");
            if (balanceOPCListJsonArray != null) {
                BalanceOPC[] balanceOPCListArray = new BalanceOPC[balanceOPCListJsonArray.length()];
                for (int i = 0; i < balanceOPCListJsonArray.length(); i++) {
                    balanceOPCListArray[i] = BalanceOPC.fromJSON(balanceOPCListJsonArray.optString(i));
                }
                instance.setBalanceOPCList(balanceOPCListArray);
            }
            instance.setTotal(qa.ooredoo.selfcare.sdk.model.BalanceData.fromJSON(jsonObject.optString("total")));
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