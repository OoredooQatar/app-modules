package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CallingRatesResponse implements Serializable{


    private CallingCountry[] callingCountries;

    public CallingCountry[] getCallingCountries(){
        return callingCountries;
    }

    public void setCallingCountries(CallingCountry[] callingCountries){
        this.callingCountries = callingCountries;
    }

    private CallingCountry[] localCallingRates;

    public CallingCountry[] getLocalCallingRates(){
        return localCallingRates;
    }

    public void setLocalCallingRates(CallingCountry[] localCallingRates){
        this.localCallingRates = localCallingRates;
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

    public static CallingRatesResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        CallingRatesResponse instance = new CallingRatesResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray callingCountriesJsonArray = jsonObject.optJSONArray("callingCountries");
            if (callingCountriesJsonArray != null) {
                CallingCountry[] callingCountriesArray = new CallingCountry[callingCountriesJsonArray.length()];
                for (int i = 0; i < callingCountriesJsonArray.length(); i++) {
                    callingCountriesArray[i] = CallingCountry.fromJSON(callingCountriesJsonArray.optString(i));
                }
                instance.setCallingCountries(callingCountriesArray);
            }
            JSONArray localCallingRatesJsonArray = jsonObject.optJSONArray("localCallingRates");
            if (localCallingRatesJsonArray != null) {
                CallingCountry[] localCallingRatesArray = new CallingCountry[localCallingRatesJsonArray.length()];
                for (int i = 0; i < localCallingRatesJsonArray.length(); i++) {
                    localCallingRatesArray[i] = CallingCountry.fromJSON(localCallingRatesJsonArray.optString(i));
                }
                instance.setLocalCallingRates(localCallingRatesArray);
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