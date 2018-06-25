package qa.example.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tile implements Serializable{


    private String tileTitle;

    public String getTileTitle(){
        return tileTitle;
    }

    public void setTileTitle(String tileTitle){
        this.tileTitle = tileTitle;
    }

    private String titleValue;

    public String getTitleValue(){
        return titleValue;
    }

    public void setTitleValue(String titleValue){
        this.titleValue = titleValue;
    }

    private String tileDescription;

    public String getTileDescription(){
        return tileDescription;
    }

    public void setTileDescription(String tileDescription){
        this.tileDescription = tileDescription;
    }

    private String tileDescriptionColor;

    public String getTileDescriptionColor(){
        return tileDescriptionColor;
    }

    public void setTileDescriptionColor(String tileDescriptionColor){
        this.tileDescriptionColor = tileDescriptionColor;
    }

    private String tileIconURL;

    public String getTileIconURL(){
        return tileIconURL;
    }

    public void setTileIconURL(String tileIconURL){
        this.tileIconURL = tileIconURL;
    }

    private String tileMainIconURL;

    public String getTileMainIconURL(){
        return tileMainIconURL;
    }

    public void setTileMainIconURL(String tileMainIconURL){
        this.tileMainIconURL = tileMainIconURL;
    }

    private String titleColor;

    public String getTitleColor(){
        return titleColor;
    }

    public void setTitleColor(String titleColor){
        this.titleColor = titleColor;
    }

    private boolean hasSecondIcon;

    public boolean getHasSecondIcon(){
        return hasSecondIcon;
    }

    public void setHasSecondIcon(boolean hasSecondIcon){
        this.hasSecondIcon = hasSecondIcon;
    }

    private String secondIconURL;

    public String getSecondIconURL(){
        return secondIconURL;
    }

    public void setSecondIconURL(String secondIconURL){
        this.secondIconURL = secondIconURL;
    }

    private String secondIconDescription;

    public String getSecondIconDescription(){
        return secondIconDescription;
    }

    public void setSecondIconDescription(String secondIconDescription){
        this.secondIconDescription = secondIconDescription;
    }

    private boolean hasBreakdown;

    public boolean getHasBreakdown(){
        return hasBreakdown;
    }

    public void setHasBreakdown(boolean hasBreakdown){
        this.hasBreakdown = hasBreakdown;
    }

    private String total;

    public String getTotal(){
        return total;
    }

    public void setTotal(String total){
        this.total = total;
    }

    private String remaining;

    public String getRemaining(){
        return remaining;
    }

    public void setRemaining(String remaining){
        this.remaining = remaining;
    }

    private String unitTotal;

    public String getUnitTotal(){
        return unitTotal;
    }

    public void setUnitTotal(String unitTotal){
        this.unitTotal = unitTotal;
    }

    private String unitRemaining;

    public String getUnitRemaining(){
        return unitRemaining;
    }

    public void setUnitRemaining(String unitRemaining){
        this.unitRemaining = unitRemaining;
    }

    private boolean isUnlimited;

    public boolean getIsUnlimited(){
        return isUnlimited;
    }

    public void setIsUnlimited(boolean isUnlimited){
        this.isUnlimited = isUnlimited;
    }

    private boolean displayGadget;

    public boolean getDisplayGadget(){
        return displayGadget;
    }

    public void setDisplayGadget(boolean displayGadget){
        this.displayGadget = displayGadget;
    }

    private TileItems[] tileItemsList;

    public TileItems[] getTileItemsList(){
        return tileItemsList;
    }

    public void setTileItemsList(TileItems[] tileItemsList){
        this.tileItemsList = tileItemsList;
    }

    private Tile[] subTileList;

    public Tile[] getSubTileList(){
        return subTileList;
    }

    public void setSubTileList(Tile[] subTileList){
        this.subTileList = subTileList;
    }

    private qa.ooredoo.selfcare.sdk.model.response.OoredooPassportDetailedResponse ooredooPassportDetailedResponse;

    public qa.ooredoo.selfcare.sdk.model.response.OoredooPassportDetailedResponse getOoredooPassportDetailedResponse(){
        return ooredooPassportDetailedResponse;
    }

    public void setOoredooPassportDetailedResponse(qa.ooredoo.selfcare.sdk.model.response.OoredooPassportDetailedResponse ooredooPassportDetailedResponse){
        this.ooredooPassportDetailedResponse = ooredooPassportDetailedResponse;
    }

    private String roamingMinutes;

    public String getRoamingMinutes(){
        return roamingMinutes;
    }

    public void setRoamingMinutes(String roamingMinutes){
        this.roamingMinutes = roamingMinutes;
    }

    private String roamingReceiveMinutes;

    public String getRoamingReceiveMinutes(){
        return roamingReceiveMinutes;
    }

    public void setRoamingReceiveMinutes(String roamingReceiveMinutes){
        this.roamingReceiveMinutes = roamingReceiveMinutes;
    }

    private String tileType;

    public String getTileType(){
        return tileType;
    }

    public void setTileType(String tileType){
        this.tileType = tileType;
    }

    private String tag;

    public String getTag(){
        return tag;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    public static Tile fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        Tile instance = new Tile();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setTileTitle(jsonObject.optString("tileTitle"));
            instance.setTitleValue(jsonObject.optString("titleValue"));
            instance.setTileDescription(jsonObject.optString("tileDescription"));
            instance.setTileDescriptionColor(jsonObject.optString("tileDescriptionColor"));
            instance.setTileIconURL(jsonObject.optString("tileIconURL"));
            instance.setTileMainIconURL(jsonObject.optString("tileMainIconURL"));
            instance.setTitleColor(jsonObject.optString("titleColor"));
            instance.setHasSecondIcon(jsonObject.optBoolean("hasSecondIcon"));
            instance.setSecondIconURL(jsonObject.optString("secondIconURL"));
            instance.setSecondIconDescription(jsonObject.optString("secondIconDescription"));
            instance.setHasBreakdown(jsonObject.optBoolean("hasBreakdown"));
            instance.setTotal(jsonObject.optString("total"));
            instance.setRemaining(jsonObject.optString("remaining"));
            instance.setUnitTotal(jsonObject.optString("unitTotal"));
            instance.setUnitRemaining(jsonObject.optString("unitRemaining"));
            instance.setIsUnlimited(jsonObject.optBoolean("isUnlimited"));
            instance.setDisplayGadget(jsonObject.optBoolean("displayGadget"));
            JSONArray tileItemsListJsonArray = jsonObject.optJSONArray("tileItemsList");
            if (tileItemsListJsonArray != null) {
                TileItems[] tileItemsListArray = new TileItems[tileItemsListJsonArray.length()];
                for (int i = 0; i < tileItemsListJsonArray.length(); i++) {
                    tileItemsListArray[i] = TileItems.fromJSON(tileItemsListJsonArray.optString(i));
                }
                instance.setTileItemsList(tileItemsListArray);
            }
            JSONArray subTileListJsonArray = jsonObject.optJSONArray("subTileList");
            if (subTileListJsonArray != null) {
                Tile[] subTileListArray = new Tile[subTileListJsonArray.length()];
                for (int i = 0; i < subTileListJsonArray.length(); i++) {
                    subTileListArray[i] = Tile.fromJSON(subTileListJsonArray.optString(i));
                }
                instance.setSubTileList(subTileListArray);
            }
            instance.setOoredooPassportDetailedResponse(qa.ooredoo.selfcare.sdk.model.response.OoredooPassportDetailedResponse.fromJSON(jsonObject.optString("ooredooPassportDetailedResponse")));
            instance.setRoamingMinutes(jsonObject.optString("roamingMinutes"));
            instance.setRoamingReceiveMinutes(jsonObject.optString("roamingReceiveMinutes"));
            instance.setTileType(jsonObject.optString("tileType"));
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