package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OoredooRoamingCountriesResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.Country[] countries;

    public qa.ooredoo.selfcare.sdk.model.Country[] getCountries(){
    return countries;
    }

    public void setCountries(qa.ooredoo.selfcare.sdk.model.Country[] countries){
    this.countries = countries;
    }

    private qa.ooredoo.selfcare.sdk.model.OperatorService[] services;

    public qa.ooredoo.selfcare.sdk.model.OperatorService[] getServices(){
    return services;
    }

    public void setServices(qa.ooredoo.selfcare.sdk.model.OperatorService[] services){
    this.services = services;
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

public static OoredooRoamingCountriesResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
OoredooRoamingCountriesResponse instance = new OoredooRoamingCountriesResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    JSONArray countriesJsonArray = jsonObject.optJSONArray("countries");
    if (countriesJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.Country[] countriesArray = new qa.ooredoo.selfcare.sdk.model.Country[countriesJsonArray.length()];
    for (int i = 0; i < countriesJsonArray.length(); i++) {
        countriesArray[i] = qa.ooredoo.selfcare.sdk.model.Country.fromJSON(countriesJsonArray.optString(i));
    }
    instance.setCountries(countriesArray);
    }
    JSONArray servicesJsonArray = jsonObject.optJSONArray("services");
    if (servicesJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.OperatorService[] servicesArray = new qa.ooredoo.selfcare.sdk.model.OperatorService[servicesJsonArray.length()];
    for (int i = 0; i < servicesJsonArray.length(); i++) {
        servicesArray[i] = qa.ooredoo.selfcare.sdk.model.OperatorService.fromJSON(servicesJsonArray.optString(i));
    }
    instance.setServices(servicesArray);
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