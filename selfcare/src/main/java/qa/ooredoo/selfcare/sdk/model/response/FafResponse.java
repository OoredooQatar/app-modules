package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FafResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.FaFNumber[] fafNumbers;

    public qa.ooredoo.selfcare.sdk.model.FaFNumber[] getFafNumbers(){
        return fafNumbers;
    }

    public void setFafNumbers(qa.ooredoo.selfcare.sdk.model.FaFNumber[] fafNumbers){
        this.fafNumbers = fafNumbers;
    }

    private String resultCode;

    public String getResultCode(){
        return resultCode;
    }

    public void setResultCode(String resultCode){
        this.resultCode = resultCode;
    }

    private String noOfFreeNumbers;

    public String getNoOfFreeNumbers(){
        return noOfFreeNumbers;
    }

    public void setNoOfFreeNumbers(String noOfFreeNumbers){
        this.noOfFreeNumbers = noOfFreeNumbers;
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

    public static FafResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        FafResponse instance = new FafResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray fafNumbersJsonArray = jsonObject.optJSONArray("fafNumbers");
            if (fafNumbersJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.FaFNumber[] fafNumbersArray = new qa.ooredoo.selfcare.sdk.model.FaFNumber[fafNumbersJsonArray.length()];
                for (int i = 0; i < fafNumbersJsonArray.length(); i++) {
                    fafNumbersArray[i] = qa.ooredoo.selfcare.sdk.model.FaFNumber.fromJSON(fafNumbersJsonArray.optString(i));
                }
                instance.setFafNumbers(fafNumbersArray);
            }
            instance.setResultCode(jsonObject.optString("resultCode"));
            instance.setNoOfFreeNumbers(jsonObject.optString("noOfFreeNumbers"));
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