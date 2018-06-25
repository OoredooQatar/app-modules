package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FetchMsisdnByAccNumResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.MsisdnDataExtension[] msisdnList;

    public qa.ooredoo.selfcare.sdk.model.MsisdnDataExtension[] getMsisdnList(){
    return msisdnList;
    }

    public void setMsisdnList(qa.ooredoo.selfcare.sdk.model.MsisdnDataExtension[] msisdnList){
    this.msisdnList = msisdnList;
    }

    private String accountNumber;

    public String getAccountNumber(){
    return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
    this.accountNumber = accountNumber;
    }

    private String totalPageCount;

    public String getTotalPageCount(){
    return totalPageCount;
    }

    public void setTotalPageCount(String totalPageCount){
    this.totalPageCount = totalPageCount;
    }

    private String totalActiveNumbers;

    public String getTotalActiveNumbers(){
    return totalActiveNumbers;
    }

    public void setTotalActiveNumbers(String totalActiveNumbers){
    this.totalActiveNumbers = totalActiveNumbers;
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

public static FetchMsisdnByAccNumResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
FetchMsisdnByAccNumResponse instance = new FetchMsisdnByAccNumResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    JSONArray msisdnListJsonArray = jsonObject.optJSONArray("msisdnList");
    if (msisdnListJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.MsisdnDataExtension[] msisdnListArray = new qa.ooredoo.selfcare.sdk.model.MsisdnDataExtension[msisdnListJsonArray.length()];
    for (int i = 0; i < msisdnListJsonArray.length(); i++) {
        msisdnListArray[i] = qa.ooredoo.selfcare.sdk.model.MsisdnDataExtension.fromJSON(msisdnListJsonArray.optString(i));
    }
    instance.setMsisdnList(msisdnListArray);
    }
    instance.setAccountNumber(jsonObject.optString("accountNumber"));
    instance.setTotalPageCount(jsonObject.optString("totalPageCount"));
    instance.setTotalActiveNumbers(jsonObject.optString("totalActiveNumbers"));
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