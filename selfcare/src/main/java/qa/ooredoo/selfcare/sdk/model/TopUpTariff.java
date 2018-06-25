package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TopUpTariff implements Serializable{


    private TopUpService[] availableServices;

    public TopUpService[] getAvailableServices(){
        return availableServices;
    }

    public void setAvailableServices(TopUpService[] availableServices){
        this.availableServices = availableServices;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String price;

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    private String tags;

    public String getTags(){
        return tags;
    }

    public void setTags(String tags){
        this.tags = tags;
    }

    private String note;

    public String getNote(){
        return note;
    }

    public void setNote(String note){
        this.note = note;
    }

    private int order;

    public int getOrder(){
        return order;
    }

    public void setOrder(int order){
        this.order = order;
    }

    private TopUpBenefit[] benefits;

    public TopUpBenefit[] getBenefits(){
        return benefits;
    }

    public void setBenefits(TopUpBenefit[] benefits){
        this.benefits = benefits;
    }

    public static TopUpTariff fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        TopUpTariff instance = new TopUpTariff();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray availableServicesJsonArray = jsonObject.optJSONArray("availableServices");
            if (availableServicesJsonArray != null) {
                TopUpService[] availableServicesArray = new TopUpService[availableServicesJsonArray.length()];
                for (int i = 0; i < availableServicesJsonArray.length(); i++) {
                    availableServicesArray[i] = TopUpService.fromJSON(availableServicesJsonArray.optString(i));
                }
                instance.setAvailableServices(availableServicesArray);
            }
            instance.setName(jsonObject.optString("name"));
            instance.setPrice(jsonObject.optString("price"));
            instance.setTags(jsonObject.optString("tags"));
            instance.setNote(jsonObject.optString("note"));
            instance.setOrder(jsonObject.optInt("order"));
            JSONArray benefitsJsonArray = jsonObject.optJSONArray("benefits");
            if (benefitsJsonArray != null) {
                TopUpBenefit[] benefitsArray = new TopUpBenefit[benefitsJsonArray.length()];
                for (int i = 0; i < benefitsJsonArray.length(); i++) {
                    benefitsArray[i] = TopUpBenefit.fromJSON(benefitsJsonArray.optString(i));
                }
                instance.setBenefits(benefitsArray);
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