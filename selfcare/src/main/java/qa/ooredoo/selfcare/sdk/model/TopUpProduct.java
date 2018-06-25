package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TopUpProduct implements Serializable{


    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    private TopUpTariff[] tariffs;

    public TopUpTariff[] getTariffs(){
        return tariffs;
    }

    public void setTariffs(TopUpTariff[] tariffs){
        this.tariffs = tariffs;
    }

    public static TopUpProduct fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        TopUpProduct instance = new TopUpProduct();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optInt("id"));
            instance.setName(jsonObject.optString("name"));
            instance.setDescription(jsonObject.optString("description"));
            JSONArray tariffsJsonArray = jsonObject.optJSONArray("tariffs");
            if (tariffsJsonArray != null) {
                TopUpTariff[] tariffsArray = new TopUpTariff[tariffsJsonArray.length()];
                for (int i = 0; i < tariffsJsonArray.length(); i++) {
                    tariffsArray[i] = TopUpTariff.fromJSON(tariffsJsonArray.optString(i));
                }
                instance.setTariffs(tariffsArray);
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