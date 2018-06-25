package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HalaDashboardResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.response.AddonsListResponse prepaidSubscriptionsResponse;

    public qa.ooredoo.selfcare.sdk.model.response.AddonsListResponse getPrepaidSubscriptionsResponse(){
    return prepaidSubscriptionsResponse;
    }

    public void setPrepaidSubscriptionsResponse(qa.ooredoo.selfcare.sdk.model.response.AddonsListResponse prepaidSubscriptionsResponse){
    this.prepaidSubscriptionsResponse = prepaidSubscriptionsResponse;
    }

    private qa.ooredoo.selfcare.sdk.model.response.HalaSmartBalanceResponse halaUsageResponse;

    public qa.ooredoo.selfcare.sdk.model.response.HalaSmartBalanceResponse getHalaUsageResponse(){
    return halaUsageResponse;
    }

    public void setHalaUsageResponse(qa.ooredoo.selfcare.sdk.model.response.HalaSmartBalanceResponse halaUsageResponse){
    this.halaUsageResponse = halaUsageResponse;
    }

    private qa.ooredoo.selfcare.sdk.model.response.OoredooPassportDetailedResponse passportUsageResponse;

    public qa.ooredoo.selfcare.sdk.model.response.OoredooPassportDetailedResponse getPassportUsageResponse(){
    return passportUsageResponse;
    }

    public void setPassportUsageResponse(qa.ooredoo.selfcare.sdk.model.response.OoredooPassportDetailedResponse passportUsageResponse){
    this.passportUsageResponse = passportUsageResponse;
    }

    private qa.ooredoo.selfcare.sdk.model.response.RoamingDetailsResponse roamingDetailsResponse;

    public qa.ooredoo.selfcare.sdk.model.response.RoamingDetailsResponse getRoamingDetailsResponse(){
    return roamingDetailsResponse;
    }

    public void setRoamingDetailsResponse(qa.ooredoo.selfcare.sdk.model.response.RoamingDetailsResponse roamingDetailsResponse){
    this.roamingDetailsResponse = roamingDetailsResponse;
    }

    private qa.ooredoo.selfcare.sdk.model.response.Response checkDataCapStatusResponse;

    public qa.ooredoo.selfcare.sdk.model.response.Response getCheckDataCapStatusResponse(){
    return checkDataCapStatusResponse;
    }

    public void setCheckDataCapStatusResponse(qa.ooredoo.selfcare.sdk.model.response.Response checkDataCapStatusResponse){
    this.checkDataCapStatusResponse = checkDataCapStatusResponse;
    }

    private qa.ooredoo.selfcare.sdk.model.response.ValidateNumberGetBalanceResponse validateNumberGetBalanceResponse;

    public qa.ooredoo.selfcare.sdk.model.response.ValidateNumberGetBalanceResponse getValidateNumberGetBalanceResponse(){
    return validateNumberGetBalanceResponse;
    }

    public void setValidateNumberGetBalanceResponse(qa.ooredoo.selfcare.sdk.model.response.ValidateNumberGetBalanceResponse validateNumberGetBalanceResponse){
    this.validateNumberGetBalanceResponse = validateNumberGetBalanceResponse;
    }

    private qa.ooredoo.selfcare.sdk.model.response.AvailableOffersResponse availableOffersResponse;

    public qa.ooredoo.selfcare.sdk.model.response.AvailableOffersResponse getAvailableOffersResponse(){
    return availableOffersResponse;
    }

    public void setAvailableOffersResponse(qa.ooredoo.selfcare.sdk.model.response.AvailableOffersResponse availableOffersResponse){
    this.availableOffersResponse = availableOffersResponse;
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

public static HalaDashboardResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
HalaDashboardResponse instance = new HalaDashboardResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setPrepaidSubscriptionsResponse(qa.ooredoo.selfcare.sdk.model.response.AddonsListResponse.fromJSON(jsonObject.optString("prepaidSubscriptionsResponse")));
    instance.setHalaUsageResponse(qa.ooredoo.selfcare.sdk.model.response.HalaSmartBalanceResponse.fromJSON(jsonObject.optString("halaUsageResponse")));
    instance.setPassportUsageResponse(qa.ooredoo.selfcare.sdk.model.response.OoredooPassportDetailedResponse.fromJSON(jsonObject.optString("passportUsageResponse")));
    instance.setRoamingDetailsResponse(qa.ooredoo.selfcare.sdk.model.response.RoamingDetailsResponse.fromJSON(jsonObject.optString("roamingDetailsResponse")));
    instance.setCheckDataCapStatusResponse(qa.ooredoo.selfcare.sdk.model.response.Response.fromJSON(jsonObject.optString("checkDataCapStatusResponse")));
    instance.setValidateNumberGetBalanceResponse(qa.ooredoo.selfcare.sdk.model.response.ValidateNumberGetBalanceResponse.fromJSON(jsonObject.optString("validateNumberGetBalanceResponse")));
    instance.setAvailableOffersResponse(qa.ooredoo.selfcare.sdk.model.response.AvailableOffersResponse.fromJSON(jsonObject.optString("availableOffersResponse")));
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