package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomGroup implements Serializable{


    private String awardGroupID;

    public String getAwardGroupID(){
        return awardGroupID;
    }

    public void setAwardGroupID(String awardGroupID){
        this.awardGroupID = awardGroupID;
    }

    private String awardGroupName;

    public String getAwardGroupName(){
        return awardGroupName;
    }

    public void setAwardGroupName(String awardGroupName){
        this.awardGroupName = awardGroupName;
    }

    private String imageData;

    public String getImageData(){
        return imageData;
    }

    public void setImageData(String imageData){
        this.imageData = null;
    }

    private int awardSubgroupID;

    public int getAwardSubgroupID(){
        return awardSubgroupID;
    }

    public void setAwardSubgroupID(int awardSubgroupID){
        this.awardSubgroupID = awardSubgroupID;
    }

    private String awardSubgroupName;

    public String getAwardSubgroupName(){
        return awardSubgroupName;
    }

    public void setAwardSubgroupName(String awardSubgroupName){
        this.awardSubgroupName = awardSubgroupName;
    }

    private String imageUrl;

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    private String shortDescription;

    public String getShortDescription(){
        return shortDescription;
    }

    public void setShortDescription(String shortDescription){
        this.shortDescription = shortDescription;
    }

    private String descriptionLink;

    public String getDescriptionLink(){
        return descriptionLink;
    }

    public void setDescriptionLink(String descriptionLink){
        this.descriptionLink = descriptionLink;
    }

    private String tag;

    public String getTag(){
        return tag;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    public static NojoomGroup fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NojoomGroup instance = new NojoomGroup();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setAwardGroupID(jsonObject.optString("awardGroupID"));
            instance.setAwardGroupName(jsonObject.optString("awardGroupName"));
           // instance.setImageData(jsonObject.optString("imageData"));
            instance.setAwardSubgroupID(jsonObject.optInt("awardSubgroupID"));
            instance.setAwardSubgroupName(jsonObject.optString("awardSubgroupName"));
            instance.setImageUrl(jsonObject.optString("imageUrl"));
            instance.setShortDescription(jsonObject.optString("shortDescription"));
            instance.setDescriptionLink(jsonObject.optString("descriptionLink"));
            instance.setTag(jsonObject.optString("tag"));
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