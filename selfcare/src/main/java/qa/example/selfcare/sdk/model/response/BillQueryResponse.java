package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BillQueryResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.Account[] accountList;

    public qa.ooredoo.selfcare.sdk.model.Account[] getAccountList(){
    return accountList;
    }

    public void setAccountList(qa.ooredoo.selfcare.sdk.model.Account[] accountList){
    this.accountList = accountList;
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

public static BillQueryResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
BillQueryResponse instance = new BillQueryResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    JSONArray accountListJsonArray = jsonObject.optJSONArray("accountList");
    if (accountListJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.Account[] accountListArray = new qa.ooredoo.selfcare.sdk.model.Account[accountListJsonArray.length()];
    for (int i = 0; i < accountListJsonArray.length(); i++) {
        accountListArray[i] = qa.ooredoo.selfcare.sdk.model.Account.fromJSON(accountListJsonArray.optString(i));
    }
    instance.setAccountList(accountListArray);
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