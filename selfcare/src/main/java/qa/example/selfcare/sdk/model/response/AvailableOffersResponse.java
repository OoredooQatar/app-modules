package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AvailableOffersResponse implements Serializable{


    private OffersData[] offersDataList;

    public OffersData[] getOffersDataList(){
        return offersDataList;
    }

    public void setOffersDataList(OffersData[] offersDataList){
        this.offersDataList = offersDataList;
    }

    private OfferCategoryResponse[] offerCategoryList;

    public OfferCategoryResponse[] getOfferCategoryList(){
        return offerCategoryList;
    }

    public void setOfferCategoryList(OfferCategoryResponse[] offerCategoryList){
        this.offerCategoryList = offerCategoryList;
    }

    private boolean isQNDActive;

    public boolean getIsQNDActive(){
        return isQNDActive;
    }

    public void setIsQNDActive(boolean isQNDActive){
        this.isQNDActive = isQNDActive;
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

    public static AvailableOffersResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        AvailableOffersResponse instance = new AvailableOffersResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray offersDataListJsonArray = jsonObject.optJSONArray("offersDataList");
            if (offersDataListJsonArray != null) {
                OffersData[] offersDataListArray = new OffersData[offersDataListJsonArray.length()];
                for (int i = 0; i < offersDataListJsonArray.length(); i++) {
                    offersDataListArray[i] = OffersData.fromJSON(offersDataListJsonArray.optString(i));
                }
                instance.setOffersDataList(offersDataListArray);
            }
            JSONArray offerCategoryListJsonArray = jsonObject.optJSONArray("offerCategoryList");
            if (offerCategoryListJsonArray != null) {
                OfferCategoryResponse[] offerCategoryListArray = new OfferCategoryResponse[offerCategoryListJsonArray.length()];
                for (int i = 0; i < offerCategoryListJsonArray.length(); i++) {
                    offerCategoryListArray[i] = OfferCategoryResponse.fromJSON(offerCategoryListJsonArray.optString(i));
                }
                instance.setOfferCategoryList(offerCategoryListArray);
            }
            instance.setIsQNDActive(jsonObject.optBoolean("isQNDActive"));
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