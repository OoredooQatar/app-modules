package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicOffersResponse implements Serializable{


    private String description;

    public String getDescription(){
    return description;
    }

    public void setDescription(String description){
    this.description = description;
    }

    private OffersData[] offersDataList;

    public OffersData[] getOffersDataList(){
    return offersDataList;
    }

    public void setOffersDataList(OffersData[] offersDataList){
    this.offersDataList = offersDataList;
    }

    private String totalNoOfOffers;

    public String getTotalNoOfOffers(){
    return totalNoOfOffers;
    }

    public void setTotalNoOfOffers(String totalNoOfOffers){
    this.totalNoOfOffers = totalNoOfOffers;
    }

    private String backgroundImageUrl;

    public String getBackgroundImageUrl(){
    return backgroundImageUrl;
    }

    public void setBackgroundImageUrl(String backgroundImageUrl){
    this.backgroundImageUrl = backgroundImageUrl;
    }

    private String modelTitle;

    public String getModelTitle(){
    return modelTitle;
    }

    public void setModelTitle(String modelTitle){
    this.modelTitle = modelTitle;
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

public static DynamicOffersResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
DynamicOffersResponse instance = new DynamicOffersResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setDescription(jsonObject.optString("description"));
    JSONArray offersDataListJsonArray = jsonObject.optJSONArray("offersDataList");
    if (offersDataListJsonArray != null) {
    OffersData[] offersDataListArray = new OffersData[offersDataListJsonArray.length()];
    for (int i = 0; i < offersDataListJsonArray.length(); i++) {
        offersDataListArray[i] = OffersData.fromJSON(offersDataListJsonArray.optString(i));
    }
    instance.setOffersDataList(offersDataListArray);
    }
    instance.setTotalNoOfOffers(jsonObject.optString("totalNoOfOffers"));
    instance.setBackgroundImageUrl(jsonObject.optString("backgroundImageUrl"));
    instance.setModelTitle(jsonObject.optString("modelTitle"));
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