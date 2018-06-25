package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PromotionsResponse implements Serializable{


    private int totalPromotions;

    public int getTotalPromotions(){
        return totalPromotions;
    }

    public void setTotalPromotions(int totalPromotions){
        this.totalPromotions = totalPromotions;
    }

    private qa.ooredoo.selfcare.sdk.model.Promotion[] promotions;

    public qa.ooredoo.selfcare.sdk.model.Promotion[] getPromotions(){
        return promotions;
    }

    public void setPromotions(qa.ooredoo.selfcare.sdk.model.Promotion[] promotions){
        this.promotions = promotions;
    }

    private String[] categories;

    public String[] getCategories(){
        return categories;
    }

    public void setCategories(String[] categories){
        this.categories = categories;
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

    public static PromotionsResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        PromotionsResponse instance = new PromotionsResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setTotalPromotions(jsonObject.optInt("totalPromotions"));
            JSONArray promotionsJsonArray = jsonObject.optJSONArray("promotions");
            if (promotionsJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.Promotion[] promotionsArray = new qa.ooredoo.selfcare.sdk.model.Promotion[promotionsJsonArray.length()];
                for (int i = 0; i < promotionsJsonArray.length(); i++) {
                    promotionsArray[i] = qa.ooredoo.selfcare.sdk.model.Promotion.fromJSON(promotionsJsonArray.optString(i));
                }
                instance.setPromotions(promotionsArray);
            }
            JSONArray categoriesJsonArray = jsonObject.optJSONArray("categories");
            if (categoriesJsonArray != null) {
                String[] categoriesArray = new String[categoriesJsonArray.length()];
                for (int i = 0; i < categoriesJsonArray.length(); i++) {
                    categoriesArray[i] = categoriesJsonArray.optString(i);
                }
                instance.setCategories(categoriesArray);
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