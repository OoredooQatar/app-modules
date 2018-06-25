package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomRewardGroupsResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.NojoomGroup[] nojoomGroups;

    public qa.ooredoo.selfcare.sdk.model.NojoomGroup[] getNojoomGroups(){
    return nojoomGroups;
    }

    public void setNojoomGroups(qa.ooredoo.selfcare.sdk.model.NojoomGroup[] nojoomGroups){
    this.nojoomGroups = nojoomGroups;
    }

    private qa.ooredoo.selfcare.sdk.model.NojoomPartner[] nojoomEarningPartners;

    public qa.ooredoo.selfcare.sdk.model.NojoomPartner[] getNojoomEarningPartners(){
    return nojoomEarningPartners;
    }

    public void setNojoomEarningPartners(qa.ooredoo.selfcare.sdk.model.NojoomPartner[] nojoomEarningPartners){
    this.nojoomEarningPartners = nojoomEarningPartners;
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

public static NojoomRewardGroupsResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
NojoomRewardGroupsResponse instance = new NojoomRewardGroupsResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    JSONArray nojoomGroupsJsonArray = jsonObject.optJSONArray("nojoomGroups");
    if (nojoomGroupsJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.NojoomGroup[] nojoomGroupsArray = new qa.ooredoo.selfcare.sdk.model.NojoomGroup[nojoomGroupsJsonArray.length()];
    for (int i = 0; i < nojoomGroupsJsonArray.length(); i++) {
        nojoomGroupsArray[i] = qa.ooredoo.selfcare.sdk.model.NojoomGroup.fromJSON(nojoomGroupsJsonArray.optString(i));
    }
    instance.setNojoomGroups(nojoomGroupsArray);
    }
    JSONArray nojoomEarningPartnersJsonArray = jsonObject.optJSONArray("nojoomEarningPartners");
    if (nojoomEarningPartnersJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.NojoomPartner[] nojoomEarningPartnersArray = new qa.ooredoo.selfcare.sdk.model.NojoomPartner[nojoomEarningPartnersJsonArray.length()];
    for (int i = 0; i < nojoomEarningPartnersJsonArray.length(); i++) {
        nojoomEarningPartnersArray[i] = qa.ooredoo.selfcare.sdk.model.NojoomPartner.fromJSON(nojoomEarningPartnersJsonArray.optString(i));
    }
    instance.setNojoomEarningPartners(nojoomEarningPartnersArray);
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