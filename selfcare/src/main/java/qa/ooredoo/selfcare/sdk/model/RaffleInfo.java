package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RaffleInfo implements Serializable{


    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    private String titleArabic;

    public String getTitleArabic(){
        return titleArabic;
    }

    public void setTitleArabic(String titleArabic){
        this.titleArabic = titleArabic;
    }

    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    private String descriptionArabic;

    public String getDescriptionArabic(){
        return descriptionArabic;
    }

    public void setDescriptionArabic(String descriptionArabic){
        this.descriptionArabic = descriptionArabic;
    }

    private String toc;

    public String getToc(){
        return toc;
    }

    public void setToc(String toc){
        this.toc = toc;
    }

    private String tocArabic;

    public String getTocArabic(){
        return tocArabic;
    }

    public void setTocArabic(String tocArabic){
        this.tocArabic = tocArabic;
    }

    private boolean active;

    public boolean getActive(){
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
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

    public static RaffleInfo fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        RaffleInfo instance = new RaffleInfo();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optInt("id"));
            instance.setTitle(jsonObject.optString("title"));
            instance.setTitleArabic(jsonObject.optString("titleArabic"));
            instance.setDescription(jsonObject.optString("description"));
            instance.setDescriptionArabic(jsonObject.optString("descriptionArabic"));
            instance.setToc(jsonObject.optString("toc"));
            instance.setTocArabic(jsonObject.optString("tocArabic"));
            instance.setActive(jsonObject.optBoolean("active"));
            instance.setStartDate(parseDate(jsonObject,"startDate"));
            instance.setEndDate(parseDate(jsonObject,"endDate"));
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