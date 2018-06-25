package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EshopProductsResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.backend.services.crm.EshopProduct[] products;

    public qa.ooredoo.selfcare.sdk.backend.services.crm.EshopProduct[] getProducts(){
        return products;
    }

    public void setProducts(qa.ooredoo.selfcare.sdk.backend.services.crm.EshopProduct[] products){
        this.products = products;
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

    public static EshopProductsResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        EshopProductsResponse instance = new EshopProductsResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray productsJsonArray = jsonObject.optJSONArray("products");
            if (productsJsonArray != null) {
                qa.ooredoo.selfcare.sdk.backend.services.crm.EshopProduct[] productsArray = new qa.ooredoo.selfcare.sdk.backend.services.crm.EshopProduct[productsJsonArray.length()];
                for (int i = 0; i < productsJsonArray.length(); i++) {
                    productsArray[i] = qa.ooredoo.selfcare.sdk.backend.services.crm.EshopProduct.fromJSON(productsJsonArray.optString(i));
                }
                instance.setProducts(productsArray);
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