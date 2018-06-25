package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomPartner implements Serializable{


    private String partnerName;

    public String getPartnerName(){
    return partnerName;
    }

    public void setPartnerName(String partnerName){
    this.partnerName = partnerName;
    }

    private String imageUrl;

    public String getImageUrl(){
    return imageUrl;
    }

    public void setImageUrl(String imageUrl){
    this.imageUrl = imageUrl;
    }

    private String spend;

    public String getSpend(){
    return spend;
    }

    public void setSpend(String spend){
    this.spend = spend;
    }

    private String earn;

    public String getEarn(){
    return earn;
    }

    public void setEarn(String earn){
    this.earn = earn;
    }

    private String fullDescription;

    public String getFullDescription(){
    return fullDescription;
    }

    public void setFullDescription(String fullDescription){
    this.fullDescription = fullDescription;
    }

public static NojoomPartner fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
NojoomPartner instance = new NojoomPartner();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setPartnerName(jsonObject.optString("partnerName"));
    instance.setImageUrl(jsonObject.optString("imageUrl"));
    instance.setSpend(jsonObject.optString("spend"));
    instance.setEarn(jsonObject.optString("earn"));
    instance.setFullDescription(jsonObject.optString("fullDescription"));
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