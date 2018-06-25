package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DashboardUsageResponse implements Serializable{


    private String shahryVP;

    public String getShahryVP(){
        return shahryVP;
    }

    public void setShahryVP(String shahryVP){
        this.shahryVP = shahryVP;
    }

    private String roamRcvdCalls;

    public String getRoamRcvdCalls(){
        return roamRcvdCalls;
    }

    public void setRoamRcvdCalls(String roamRcvdCalls){
        this.roamRcvdCalls = roamRcvdCalls;
    }

    private String roammaxCalls;

    public String getRoammaxCalls(){
        return roammaxCalls;
    }

    public void setRoammaxCalls(String roammaxCalls){
        this.roammaxCalls = roammaxCalls;
    }

    private String internationalFreeMinutes;

    public String getInternationalFreeMinutes(){
        return internationalFreeMinutes;
    }

    public void setInternationalFreeMinutes(String internationalFreeMinutes){
        this.internationalFreeMinutes = internationalFreeMinutes;
    }

    private boolean isRoaming;

    public boolean getIsRoaming(){
        return isRoaming;
    }

    public void setIsRoaming(boolean isRoaming){
        this.isRoaming = isRoaming;
    }

    private boolean hasInternationalFreeMinutes;

    public boolean getHasInternationalFreeMinutes(){
        return hasInternationalFreeMinutes;
    }

    public void setHasInternationalFreeMinutes(boolean hasInternationalFreeMinutes){
        this.hasInternationalFreeMinutes = hasInternationalFreeMinutes;
    }

    private int tariffId;

    public int getTariffId(){
        return tariffId;
    }

    public void setTariffId(int tariffId){
        this.tariffId = tariffId;
    }

    private int productId;

    public int getProductId(){
        return productId;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    private qa.ooredoo.selfcare.sdk.model.Tile[] tiles;

    public qa.ooredoo.selfcare.sdk.model.Tile[] getTiles(){
        return tiles;
    }

    public void setTiles(qa.ooredoo.selfcare.sdk.model.Tile[] tiles){
        this.tiles = tiles;
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

    public static DashboardUsageResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        DashboardUsageResponse instance = new DashboardUsageResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setShahryVP(jsonObject.optString("shahryVP"));
            instance.setRoamRcvdCalls(jsonObject.optString("roamRcvdCalls"));
            instance.setRoammaxCalls(jsonObject.optString("roammaxCalls"));
            instance.setInternationalFreeMinutes(jsonObject.optString("internationalFreeMinutes"));
            instance.setIsRoaming(jsonObject.optBoolean("isRoaming"));
            instance.setHasInternationalFreeMinutes(jsonObject.optBoolean("hasInternationalFreeMinutes"));
            instance.setTariffId(jsonObject.optInt("tariffId"));
            instance.setProductId(jsonObject.optInt("productId"));
            JSONArray tilesJsonArray = jsonObject.optJSONArray("tiles");
            if (tilesJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.Tile[] tilesArray = new qa.ooredoo.selfcare.sdk.model.Tile[tilesJsonArray.length()];
                for (int i = 0; i < tilesJsonArray.length(); i++) {
                    tilesArray[i] = qa.ooredoo.selfcare.sdk.model.Tile.fromJSON(tilesJsonArray.optString(i));
                }
                instance.setTiles(tilesArray);
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