package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FetchAccNumByCustRefResponse implements Serializable{


    private String totalActiveAccounts;

    public String getTotalActiveAccounts(){
    return totalActiveAccounts;
    }

    public void setTotalActiveAccounts(String totalActiveAccounts){
    this.totalActiveAccounts = totalActiveAccounts;
    }

    private String totalPageCount;

    public String getTotalPageCount(){
    return totalPageCount;
    }

    public void setTotalPageCount(String totalPageCount){
    this.totalPageCount = totalPageCount;
    }

    private String[] accountsList;

    public String[] getAccountsList(){
    return accountsList;
    }

    public void setAccountsList(String[] accountsList){
    this.accountsList = accountsList;
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

public static FetchAccNumByCustRefResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
FetchAccNumByCustRefResponse instance = new FetchAccNumByCustRefResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setTotalActiveAccounts(jsonObject.optString("totalActiveAccounts"));
    instance.setTotalPageCount(jsonObject.optString("totalPageCount"));
    JSONArray accountsListJsonArray = jsonObject.optJSONArray("accountsList");
    if (accountsListJsonArray != null) {
    String[] accountsListArray = new String[accountsListJsonArray.length()];
    for (int i = 0; i < accountsListJsonArray.length(); i++) {
        accountsListArray[i] = accountsListJsonArray.optString(i);
    }
    instance.setAccountsList(accountsListArray);
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