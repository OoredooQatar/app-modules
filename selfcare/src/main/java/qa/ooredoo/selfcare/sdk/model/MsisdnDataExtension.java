package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MsisdnDataExtension implements Serializable{


    private String groupName;

    public String getGroupName(){
    return groupName;
    }

    public void setGroupName(String groupName){
    this.groupName = groupName;
    }

    private String labelName;

    public String getLabelName(){
    return labelName;
    }

    public void setLabelName(String labelName){
    this.labelName = labelName;
    }

    private String tariffName;

    public String getTariffName(){
    return tariffName;
    }

    public void setTariffName(String tariffName){
    this.tariffName = tariffName;
    }

    private String productName;

    public String getProductName(){
    return productName;
    }

    public void setProductName(String productName){
    this.productName = productName;
    }

    private String idName;

    public String getIdName(){
    return idName;
    }

    public void setIdName(String idName){
    this.idName = idName;
    }

    private String deptName;

    public String getDeptName(){
    return deptName;
    }

    public void setDeptName(String deptName){
    this.deptName = deptName;
    }

public static MsisdnDataExtension fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
MsisdnDataExtension instance = new MsisdnDataExtension();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setGroupName(jsonObject.optString("groupName"));
    instance.setLabelName(jsonObject.optString("labelName"));
    instance.setTariffName(jsonObject.optString("tariffName"));
    instance.setProductName(jsonObject.optString("productName"));
    instance.setIdName(jsonObject.optString("idName"));
    instance.setDeptName(jsonObject.optString("deptName"));
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