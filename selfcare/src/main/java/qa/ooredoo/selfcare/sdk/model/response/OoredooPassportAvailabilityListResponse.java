package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OoredooPassportAvailabilityListResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry[] shahry;

    public qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry[] getShahry(){
        return shahry;
    }

    public void setShahry(qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry[] shahry){
        this.shahry = shahry;
    }

    private qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry[] hala;

    public qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry[] getHala(){
        return hala;
    }

    public void setHala(qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry[] hala){
        this.hala = hala;
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

    public static OoredooPassportAvailabilityListResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        OoredooPassportAvailabilityListResponse instance = new OoredooPassportAvailabilityListResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray shahryJsonArray = jsonObject.optJSONArray("shahry");
            if (shahryJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry[] shahryArray = new qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry[shahryJsonArray.length()];
                for (int i = 0; i < shahryJsonArray.length(); i++) {
                    shahryArray[i] = qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry.fromJSON(shahryJsonArray.optString(i));
                }
                instance.setShahry(shahryArray);
            }
            JSONArray halaJsonArray = jsonObject.optJSONArray("hala");
            if (halaJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry[] halaArray = new qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry[halaJsonArray.length()];
                for (int i = 0; i < halaJsonArray.length(); i++) {
                    halaArray[i] = qa.ooredoo.selfcare.sdk.model.OoredooPassportCountry.fromJSON(halaJsonArray.optString(i));
                }
                instance.setHala(halaArray);
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