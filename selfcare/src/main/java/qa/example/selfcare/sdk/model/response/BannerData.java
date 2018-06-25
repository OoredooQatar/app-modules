package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BannerData implements Serializable{


    private String id;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    private String bannerId;

    public String getBannerId(){
        return bannerId;
    }

    public void setBannerId(String bannerId){
        this.bannerId = bannerId;
    }

    private String link;

    public String getLink(){
        return link;
    }

    public void setLink(String link){
        this.link = link;
    }

    private String html;

    public String getHtml(){
        return html;
    }

    public void setHtml(String html){
        this.html = html;
    }

    private String contentType;

    public String getContentType(){
        return contentType;
    }

    public void setContentType(String contentType){
        this.contentType = contentType;
    }

    private String imageUrl;

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    private String screenIdiOS;

    public String getScreenIdiOS(){
        return screenIdiOS;
    }

    public void setScreenIdiOS(String screenIdiOS){
        this.screenIdiOS = screenIdiOS;
    }

    private String screenIdAndroid;

    public String getScreenIdAndroid(){
        return screenIdAndroid;
    }

    public void setScreenIdAndroid(String screenIdAndroid){
        this.screenIdAndroid = screenIdAndroid;
    }

    private boolean externalLink;

    public boolean getExternalLink(){
        return externalLink;
    }

    public void setExternalLink(boolean externalLink){
        this.externalLink = externalLink;
    }

    public static BannerData fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        BannerData instance = new BannerData();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optString("id"));
            instance.setBannerId(jsonObject.optString("bannerId"));
            instance.setLink(jsonObject.optString("link"));
            instance.setHtml(jsonObject.optString("html"));
            instance.setContentType(jsonObject.optString("contentType"));
            instance.setImageUrl(jsonObject.optString("imageUrl"));
            instance.setScreenIdiOS(jsonObject.optString("screenIdiOS"));
            instance.setScreenIdAndroid(jsonObject.optString("screenIdAndroid"));
            instance.setExternalLink(jsonObject.optBoolean("externalLink"));
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