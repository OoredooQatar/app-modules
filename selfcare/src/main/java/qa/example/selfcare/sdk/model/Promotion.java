package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Promotion implements Serializable{


    private int promotionId;

    public int getPromotionId(){
        return promotionId;
    }

    public void setPromotionId(int promotionId){
        this.promotionId = promotionId;
    }

    private int width;

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    private int height;

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    private String category;

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    private String categoryId;

    public String getCategoryId(){
        return categoryId;
    }

    public void setCategoryId(String categoryId){
        this.categoryId = categoryId;
    }

    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    private boolean isHome;

    public boolean getIsHome(){
        return isHome;
    }

    public void setIsHome(boolean isHome){
        this.isHome = isHome;
    }

    private boolean isSpecial;

    public boolean getIsSpecial(){
        return isSpecial;
    }

    public void setIsSpecial(boolean isSpecial){
        this.isSpecial = isSpecial;
    }

    private String nojoomPartnerId;

    public String getNojoomPartnerId(){
        return nojoomPartnerId;
    }

    public void setNojoomPartnerId(String nojoomPartnerId){
        this.nojoomPartnerId = nojoomPartnerId;
    }

    private String text;

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    private String url;

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

   // private String promotionImage;

   /* public String getPromotionImage(){
        return promotionImage;
    }*/

/*
    public void setPromotionImage(String promotionImage){
        this.promotionImage = promotionImage;
    }
*/

    private String promotionImageUrl;

    public String getPromotionImageUrl(){
        return promotionImageUrl;
    }

    public void setPromotionImageUrl(String promotionImageUrl){
        this.promotionImageUrl = promotionImageUrl;
    }

    private String homeImage;

    public String getHomeImage(){
        return homeImage;
    }

    public void setHomeImage(String homeImage){
        this.homeImage = homeImage;
    }

    private String homeImageUrl;

    public String getHomeImageUrl(){
        return homeImageUrl;
    }

    public void setHomeImageUrl(String homeImageUrl){
        this.homeImageUrl = homeImageUrl;
    }

    private String specialImage;

    public String getSpecialImage(){
        return specialImage;
    }

    public void setSpecialImage(String specialImage){
        this.specialImage = specialImage;
    }

    private boolean isExternalUrl;

    public boolean getIsExternalUrl(){
        return isExternalUrl;
    }

    public void setIsExternalUrl(boolean isExternalUrl){
        this.isExternalUrl = isExternalUrl;
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

    private Date startDate;

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    private Date endDate;

    public Date getEndDate(){
        return endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    private String language;

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    private String action;

    public String getAction(){
        return action;
    }

    public void setAction(String action){
        this.action = action;
    }

    public static Promotion fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        Promotion instance = new Promotion();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPromotionId(jsonObject.optInt("promotionId"));
            instance.setWidth(jsonObject.optInt("width"));
            instance.setHeight(jsonObject.optInt("height"));
            instance.setCategory(jsonObject.optString("category"));
            instance.setCategoryId(jsonObject.optString("categoryId"));
            instance.setTitle(jsonObject.optString("title"));
            instance.setIsHome(jsonObject.optBoolean("isHome"));
            instance.setIsSpecial(jsonObject.optBoolean("isSpecial"));
            instance.setNojoomPartnerId(jsonObject.optString("nojoomPartnerId"));
            instance.setText(jsonObject.optString("text"));
            instance.setUrl(jsonObject.optString("url"));
            //instance.setPromotionImage(jsonObject.optString("promotionImage"));
            instance.setPromotionImageUrl(jsonObject.optString("promotionImageUrl"));
            instance.setHomeImage(jsonObject.optString("homeImage"));
            instance.setHomeImageUrl(jsonObject.optString("homeImageUrl"));
            instance.setSpecialImage(jsonObject.optString("specialImage"));
            instance.setIsExternalUrl(jsonObject.optBoolean("isExternalUrl"));
            instance.setScreenIdiOS(jsonObject.optString("screenIdiOS"));
            instance.setScreenIdAndroid(jsonObject.optString("screenIdAndroid"));
            instance.setStartDate(parseDate(jsonObject,"startDate"));
            instance.setEndDate(parseDate(jsonObject,"endDate"));
            instance.setLanguage(jsonObject.optString("language"));
            instance.setAction(jsonObject.optString("action"));
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