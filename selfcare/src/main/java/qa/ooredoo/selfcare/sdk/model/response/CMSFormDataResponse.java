package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CMSFormDataResponse implements Serializable{


    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    private String group;

    public String getGroup(){
        return group;
    }

    public void setGroup(String group){
        this.group = group;
    }

    private String formData;

    public String getFormData(){
        return formData;
    }

    public void setFormData(String formData){
        this.formData = formData;
    }

    private Date timeStamp;

    public Date getTimeStamp(){
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp){
        this.timeStamp = timeStamp;
    }

    private qa.ooredoo.selfcare.sdk.model.CMSFormData[] cmsFormData;

    public qa.ooredoo.selfcare.sdk.model.CMSFormData[] getCmsFormData(){
        return cmsFormData;
    }

    public void setCmsFormData(qa.ooredoo.selfcare.sdk.model.CMSFormData[] cmsFormData){
        this.cmsFormData = cmsFormData;
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

    public static CMSFormDataResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        CMSFormDataResponse instance = new CMSFormDataResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optInt("id"));
            instance.setGroup(jsonObject.optString("group"));
            instance.setFormData(jsonObject.optString("formData"));
            instance.setTimeStamp(parseDate(jsonObject,"timeStamp"));
            JSONArray cmsFormDataJsonArray = jsonObject.optJSONArray("cmsFormData");
            if (cmsFormDataJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.CMSFormData[] cmsFormDataArray = new qa.ooredoo.selfcare.sdk.model.CMSFormData[cmsFormDataJsonArray.length()];
                for (int i = 0; i < cmsFormDataJsonArray.length(); i++) {
                    cmsFormDataArray[i] = qa.ooredoo.selfcare.sdk.model.CMSFormData.fromJSON(cmsFormDataJsonArray.optString(i));
                }
                instance.setCmsFormData(cmsFormDataArray);
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