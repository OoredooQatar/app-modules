package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCreditLimitResponse implements Serializable{


    private String currentCreditLimit;

    public String getCurrentCreditLimit(){
    return currentCreditLimit;
    }

    public void setCurrentCreditLimit(String currentCreditLimit){
    this.currentCreditLimit = currentCreditLimit;
    }

    private String responseCode;

    public String getResponseCode(){
    return responseCode;
    }

    public void setResponseCode(String responseCode){
    this.responseCode = responseCode;
    }

    private String[] creditLimitList;

    public String[] getCreditLimitList(){
    return creditLimitList;
    }

    public void setCreditLimitList(String[] creditLimitList){
    this.creditLimitList = creditLimitList;
    }

    private String availableCreditLimit;

    public String getAvailableCreditLimit(){
    return availableCreditLimit;
    }

    public void setAvailableCreditLimit(String availableCreditLimit){
    this.availableCreditLimit = availableCreditLimit;
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

public static GetCreditLimitResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
GetCreditLimitResponse instance = new GetCreditLimitResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setCurrentCreditLimit(jsonObject.optString("currentCreditLimit"));
    instance.setResponseCode(jsonObject.optString("responseCode"));
    JSONArray creditLimitListJsonArray = jsonObject.optJSONArray("creditLimitList");
    if (creditLimitListJsonArray != null) {
    String[] creditLimitListArray = new String[creditLimitListJsonArray.length()];
    for (int i = 0; i < creditLimitListJsonArray.length(); i++) {
        creditLimitListArray[i] = creditLimitListJsonArray.optString(i);
    }
    instance.setCreditLimitList(creditLimitListArray);
    }
    instance.setAvailableCreditLimit(jsonObject.optString("availableCreditLimit"));
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