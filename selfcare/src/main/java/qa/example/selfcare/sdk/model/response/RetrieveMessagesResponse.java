package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RetrieveMessagesResponse implements Serializable{


    private String blockSmsText;

    public String getBlockSmsText(){
        return blockSmsText;
    }

    public void setBlockSmsText(String blockSmsText){
        this.blockSmsText = blockSmsText;
    }

    private String genericMessage;

    public String getGenericMessage(){
        return genericMessage;
    }

    public void setGenericMessage(String genericMessage){
        this.genericMessage = genericMessage;
    }

    private qa.ooredoo.selfcare.sdk.model.AppMessage[] messageList;

    public qa.ooredoo.selfcare.sdk.model.AppMessage[] getMessageList(){
        return messageList;
    }

    public void setMessageList(qa.ooredoo.selfcare.sdk.model.AppMessage[] messageList){
        this.messageList = messageList;
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

    public static RetrieveMessagesResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        RetrieveMessagesResponse instance = new RetrieveMessagesResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setBlockSmsText(jsonObject.optString("blockSmsText"));
            instance.setGenericMessage(jsonObject.optString("genericMessage"));
            JSONArray messageListJsonArray = jsonObject.optJSONArray("messageList");
            if (messageListJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.AppMessage[] messageListArray = new qa.ooredoo.selfcare.sdk.model.AppMessage[messageListJsonArray.length()];
                for (int i = 0; i < messageListJsonArray.length(); i++) {
                    messageListArray[i] = qa.ooredoo.selfcare.sdk.model.AppMessage.fromJSON(messageListJsonArray.optString(i));
                }
                instance.setMessageList(messageListArray);
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