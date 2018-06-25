package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BlockSMSResponse implements Serializable{


    private boolean allBlocked;

    public boolean getAllBlocked(){
        return allBlocked;
    }

    public void setAllBlocked(boolean allBlocked){
        this.allBlocked = allBlocked;
    }

    private String[] blockedOriginators;

    public String[] getBlockedOriginators(){
        return blockedOriginators;
    }

    public void setBlockedOriginators(String[] blockedOriginators){
        this.blockedOriginators = blockedOriginators;
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

    public static BlockSMSResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        BlockSMSResponse instance = new BlockSMSResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setAllBlocked(jsonObject.optBoolean("allBlocked"));
            JSONArray blockedOriginatorsJsonArray = jsonObject.optJSONArray("blockedOriginators");
            if (blockedOriginatorsJsonArray != null) {
                String[] blockedOriginatorsArray = new String[blockedOriginatorsJsonArray.length()];
                for (int i = 0; i < blockedOriginatorsJsonArray.length(); i++) {
                    blockedOriginatorsArray[i] = blockedOriginatorsJsonArray.optString(i);
                }
                instance.setBlockedOriginators(blockedOriginatorsArray);
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