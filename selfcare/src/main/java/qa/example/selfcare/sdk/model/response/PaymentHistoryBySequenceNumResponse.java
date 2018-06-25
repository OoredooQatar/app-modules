package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentHistoryBySequenceNumResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.Payment[] paymentList;

    public qa.ooredoo.selfcare.sdk.model.Payment[] getPaymentList(){
    return paymentList;
    }

    public void setPaymentList(qa.ooredoo.selfcare.sdk.model.Payment[] paymentList){
    this.paymentList = paymentList;
    }

    private String totalPageNumber;

    public String getTotalPageNumber(){
    return totalPageNumber;
    }

    public void setTotalPageNumber(String totalPageNumber){
    this.totalPageNumber = totalPageNumber;
    }

    private String downloadUrl;

    public String getDownloadUrl(){
    return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl){
    this.downloadUrl = downloadUrl;
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

public static PaymentHistoryBySequenceNumResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
PaymentHistoryBySequenceNumResponse instance = new PaymentHistoryBySequenceNumResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    JSONArray paymentListJsonArray = jsonObject.optJSONArray("paymentList");
    if (paymentListJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.Payment[] paymentListArray = new qa.ooredoo.selfcare.sdk.model.Payment[paymentListJsonArray.length()];
    for (int i = 0; i < paymentListJsonArray.length(); i++) {
        paymentListArray[i] = qa.ooredoo.selfcare.sdk.model.Payment.fromJSON(paymentListJsonArray.optString(i));
    }
    instance.setPaymentList(paymentListArray);
    }
    instance.setTotalPageNumber(jsonObject.optString("totalPageNumber"));
    instance.setDownloadUrl(jsonObject.optString("downloadUrl"));
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