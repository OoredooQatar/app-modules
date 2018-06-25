package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GroupInfo implements Serializable{


    private long count;

    public long getCount(){
    return count;
    }

    public void setCount(long count){
    this.count = count;
    }

    private String groupName;

    public String getGroupName(){
    return groupName;
    }

    public void setGroupName(String groupName){
    this.groupName = groupName;
    }

public static GroupInfo fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
GroupInfo instance = new GroupInfo();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setCount(jsonObject.optLong("count"));
    instance.setGroupName(jsonObject.optString("groupName"));
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