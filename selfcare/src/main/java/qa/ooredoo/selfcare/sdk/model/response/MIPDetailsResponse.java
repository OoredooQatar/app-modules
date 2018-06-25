package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MIPDetailsResponse implements Serializable{


    private String totalMIPBalanace;

    public String getTotalMIPBalanace(){
        return totalMIPBalanace;
    }

    public void setTotalMIPBalanace(String totalMIPBalanace){
        this.totalMIPBalanace = totalMIPBalanace;
    }

    private String maxMIPBalance;

    public String getMaxMIPBalance(){
        return maxMIPBalance;
    }

    public void setMaxMIPBalance(String maxMIPBalance){
        this.maxMIPBalance = maxMIPBalance;
    }

    private qa.ooredoo.selfcare.sdk.model.MIPPackDetails mipPackDetails;

    public qa.ooredoo.selfcare.sdk.model.MIPPackDetails getMipPackDetails(){
        return mipPackDetails;
    }

    public void setMipPackDetails(qa.ooredoo.selfcare.sdk.model.MIPPackDetails mipPackDetails){
        this.mipPackDetails = mipPackDetails;
    }

    private qa.ooredoo.selfcare.sdk.model.MIPPackDetails[] mipPackDetailsList;

    public qa.ooredoo.selfcare.sdk.model.MIPPackDetails[] getMipPackDetailsList(){
        return mipPackDetailsList;
    }

    public void setMipPackDetailsList(qa.ooredoo.selfcare.sdk.model.MIPPackDetails[] mipPackDetailsList){
        this.mipPackDetailsList = mipPackDetailsList;
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

    public static MIPDetailsResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        MIPDetailsResponse instance = new MIPDetailsResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setTotalMIPBalanace(jsonObject.optString("totalMIPBalanace"));
            instance.setMaxMIPBalance(jsonObject.optString("maxMIPBalance"));
            instance.setMipPackDetails(qa.ooredoo.selfcare.sdk.model.MIPPackDetails.fromJSON(jsonObject.optString("mipPackDetails")));
            JSONArray mipPackDetailsListJsonArray = jsonObject.optJSONArray("mipPackDetailsList");
            if (mipPackDetailsListJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.MIPPackDetails[] mipPackDetailsListArray = new qa.ooredoo.selfcare.sdk.model.MIPPackDetails[mipPackDetailsListJsonArray.length()];
                for (int i = 0; i < mipPackDetailsListJsonArray.length(); i++) {
                    mipPackDetailsListArray[i] = qa.ooredoo.selfcare.sdk.model.MIPPackDetails.fromJSON(mipPackDetailsListJsonArray.optString(i));
                }
                instance.setMipPackDetailsList(mipPackDetailsListArray);
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