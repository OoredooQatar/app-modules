package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TopUpServicesResponse implements Serializable{


    private qa.ooredoo.selfcare.sdk.model.Service[] servicesList;

    public qa.ooredoo.selfcare.sdk.model.Service[] getServicesList(){
        return servicesList;
    }

    public void setServicesList(qa.ooredoo.selfcare.sdk.model.Service[] servicesList){
        this.servicesList = servicesList;
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

    public static TopUpServicesResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        TopUpServicesResponse instance = new TopUpServicesResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray servicesListJsonArray = jsonObject.optJSONArray("servicesList");
            if (servicesListJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.Service[] servicesListArray = new qa.ooredoo.selfcare.sdk.model.Service[servicesListJsonArray.length()];
                for (int i = 0; i < servicesListJsonArray.length(); i++) {
                    servicesListArray[i] = qa.ooredoo.selfcare.sdk.model.Service.fromJSON(servicesListJsonArray.optString(i));
                }
                instance.setServicesList(servicesListArray);
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