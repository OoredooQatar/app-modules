package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TitlesAndDescriptions implements Serializable{


    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    private String image;

    public String getImage(){
        return image;
    }

    public void setImage(String image){
        this.image = image;
    }

    private String color;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    private String page;

    public String getPage(){
        return page;
    }

    public void setPage(String page){
        this.page = page;
    }

    private int order;

    public int getOrder(){
        return order;
    }

    public void setOrder(int order){
        this.order = order;
    }

    private String action;

    public String getAction(){
        return action;
    }

    public void setAction(String action){
        this.action = action;
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

    private TitlesAndDescriptions[] childPages;

    public TitlesAndDescriptions[] getChildPages(){
        return childPages;
    }

    public void setChildPages(TitlesAndDescriptions[] childPages){
        this.childPages = childPages;
    }

    public static TitlesAndDescriptions fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        TitlesAndDescriptions instance = new TitlesAndDescriptions();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setTitle(jsonObject.optString("title"));
            instance.setDescription(jsonObject.optString("description"));
            instance.setImage(jsonObject.optString("image"));
            instance.setColor(jsonObject.optString("color"));
            instance.setPage(jsonObject.optString("page"));
            instance.setOrder(jsonObject.optInt("order"));
            instance.setAction(jsonObject.optString("action"));
            instance.setStartDate(parseDate(jsonObject,"startDate"));
            instance.setEndDate(parseDate(jsonObject,"endDate"));
            JSONArray childPagesJsonArray = jsonObject.optJSONArray("childPages");
            if (childPagesJsonArray != null) {
                TitlesAndDescriptions[] childPagesArray = new TitlesAndDescriptions[childPagesJsonArray.length()];
                for (int i = 0; i < childPagesJsonArray.length(); i++) {
                    childPagesArray[i] = TitlesAndDescriptions.fromJSON(childPagesJsonArray.optString(i));
                }
                instance.setChildPages(childPagesArray);
            }
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