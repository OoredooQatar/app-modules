package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCustomerServiceNumbersResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.PostPaidNumber[] postPaidNumbers;

    public qa.ooredoo.selfcare.sdk.model.PostPaidNumber[] getPostPaidNumbers(){
    return postPaidNumbers;
    }

    public void setPostPaidNumbers(qa.ooredoo.selfcare.sdk.model.PostPaidNumber[] postPaidNumbers){
    this.postPaidNumbers = postPaidNumbers;
    }

    private qa.ooredoo.selfcare.sdk.model.PrePaidNumber[] prePaidNumbers;

    public qa.ooredoo.selfcare.sdk.model.PrePaidNumber[] getPrePaidNumbers(){
    return prePaidNumbers;
    }

    public void setPrePaidNumbers(qa.ooredoo.selfcare.sdk.model.PrePaidNumber[] prePaidNumbers){
    this.prePaidNumbers = prePaidNumbers;
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

public static GetCustomerServiceNumbersResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
GetCustomerServiceNumbersResponse instance = new GetCustomerServiceNumbersResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    JSONArray postPaidNumbersJsonArray = jsonObject.optJSONArray("postPaidNumbers");
    if (postPaidNumbersJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.PostPaidNumber[] postPaidNumbersArray = new qa.ooredoo.selfcare.sdk.model.PostPaidNumber[postPaidNumbersJsonArray.length()];
    for (int i = 0; i < postPaidNumbersJsonArray.length(); i++) {
        postPaidNumbersArray[i] = qa.ooredoo.selfcare.sdk.model.PostPaidNumber.fromJSON(postPaidNumbersJsonArray.optString(i));
    }
    instance.setPostPaidNumbers(postPaidNumbersArray);
    }
    JSONArray prePaidNumbersJsonArray = jsonObject.optJSONArray("prePaidNumbers");
    if (prePaidNumbersJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.PrePaidNumber[] prePaidNumbersArray = new qa.ooredoo.selfcare.sdk.model.PrePaidNumber[prePaidNumbersJsonArray.length()];
    for (int i = 0; i < prePaidNumbersJsonArray.length(); i++) {
        prePaidNumbersArray[i] = qa.ooredoo.selfcare.sdk.model.PrePaidNumber.fromJSON(prePaidNumbersJsonArray.optString(i));
    }
    instance.setPrePaidNumbers(prePaidNumbersArray);
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