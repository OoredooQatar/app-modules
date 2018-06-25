package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddonsListResponse implements Serializable{


    private String totalBalance;

    public String getTotalBalance(){
        return totalBalance;
    }

    public void setTotalBalance(String totalBalance){
        this.totalBalance = totalBalance;
    }

    private qa.ooredoo.selfcare.sdk.model.BonusDetails[] bonusDetails;

    public qa.ooredoo.selfcare.sdk.model.BonusDetails[] getBonusDetails(){
        return bonusDetails;
    }

    public void setBonusDetails(qa.ooredoo.selfcare.sdk.model.BonusDetails[] bonusDetails){
        this.bonusDetails = bonusDetails;
    }

    private String serviceType;

    public String getServiceType(){
        return serviceType;
    }

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    private qa.ooredoo.selfcare.sdk.model.Product[] crmProducts;

    public qa.ooredoo.selfcare.sdk.model.Product[] getCrmProducts(){
        return crmProducts;
    }

    public void setCrmProducts(qa.ooredoo.selfcare.sdk.model.Product[] crmProducts){
        this.crmProducts = crmProducts;
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

    public static AddonsListResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        AddonsListResponse instance = new AddonsListResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setTotalBalance(jsonObject.optString("totalBalance"));
            JSONArray bonusDetailsJsonArray = jsonObject.optJSONArray("bonusDetails");
            if (bonusDetailsJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.BonusDetails[] bonusDetailsArray = new qa.ooredoo.selfcare.sdk.model.BonusDetails[bonusDetailsJsonArray.length()];
                for (int i = 0; i < bonusDetailsJsonArray.length(); i++) {
                    bonusDetailsArray[i] = qa.ooredoo.selfcare.sdk.model.BonusDetails.fromJSON(bonusDetailsJsonArray.optString(i));
                }
                instance.setBonusDetails(bonusDetailsArray);
            }
            instance.setServiceType(jsonObject.optString("serviceType"));
            JSONArray crmProductsJsonArray = jsonObject.optJSONArray("crmProducts");
            if (crmProductsJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.Product[] crmProductsArray = new qa.ooredoo.selfcare.sdk.model.Product[crmProductsJsonArray.length()];
                for (int i = 0; i < crmProductsJsonArray.length(); i++) {
                    crmProductsArray[i] = qa.ooredoo.selfcare.sdk.model.Product.fromJSON(crmProductsJsonArray.optString(i));
                }
                instance.setCrmProducts(crmProductsArray);
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