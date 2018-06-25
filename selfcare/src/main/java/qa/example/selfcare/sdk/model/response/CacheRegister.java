package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CacheRegister implements Serializable{


    private String operationName;

    public String getOperationName(){
    return operationName;
    }

    public void setOperationName(String operationName){
    this.operationName = operationName;
    }

    private Date updated;

    public Date getUpdated(){
    return updated;
    }

    public void setUpdated(Date updated){
    this.updated = updated;
    }

    private Long duration;

    public Long getDuration(){
    return duration;
    }

    public void setDuration(Long duration){
    this.duration = duration;
    }

public static CacheRegister fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
CacheRegister instance = new CacheRegister();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setOperationName(jsonObject.optString("operationName"));
    instance.setUpdated(parseDate(jsonObject,"updated"));
    instance.setDuration(jsonObject.optLong("duration"));
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