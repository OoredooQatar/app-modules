package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShahryDashboardResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.response.AddonsListResponse postpaidSubscriptionsResponse;

    public qa.ooredoo.selfcare.sdk.model.response.AddonsListResponse getPostpaidSubscriptionsResponse(){
    return postpaidSubscriptionsResponse;
    }

    public void setPostpaidSubscriptionsResponse(qa.ooredoo.selfcare.sdk.model.response.AddonsListResponse postpaidSubscriptionsResponse){
    this.postpaidSubscriptionsResponse = postpaidSubscriptionsResponse;
    }

    private qa.ooredoo.selfcare.sdk.model.response.ShahryValuePackDetailResponse shahryUsageResponse;

    public qa.ooredoo.selfcare.sdk.model.response.ShahryValuePackDetailResponse getShahryUsageResponse(){
    return shahryUsageResponse;
    }

    public void setShahryUsageResponse(qa.ooredoo.selfcare.sdk.model.response.ShahryValuePackDetailResponse shahryUsageResponse){
    this.shahryUsageResponse = shahryUsageResponse;
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

public static ShahryDashboardResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
ShahryDashboardResponse instance = new ShahryDashboardResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setPostpaidSubscriptionsResponse(qa.ooredoo.selfcare.sdk.model.response.AddonsListResponse.fromJSON(jsonObject.optString("postpaidSubscriptionsResponse")));
    instance.setShahryUsageResponse(qa.ooredoo.selfcare.sdk.model.response.ShahryValuePackDetailResponse.fromJSON(jsonObject.optString("shahryUsageResponse")));
    instance.setPassportUsageResponse(qa.ooredoo.selfcare.sdk.model.response.OoredooPassportDetailedResponse.fromJSON(jsonObject.optString("passportUsageResponse")));
    instance.setRoamingDetailsResponse(qa.ooredoo.selfcare.sdk.model.response.RoamingDetailsResponse.fromJSON(jsonObject.optString("roamingDetailsResponse")));
    instance.setCheckDataCapStatusResponse(qa.ooredoo.selfcare.sdk.model.response.Response.fromJSON(jsonObject.optString("checkDataCapStatusResponse")));
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