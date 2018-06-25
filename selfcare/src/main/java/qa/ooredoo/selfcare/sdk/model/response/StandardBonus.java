package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StandardBonus implements Serializable{


    private String bonusId;

    public String getBonusId(){
        return bonusId;
    }

    public void setBonusId(String bonusId){
        this.bonusId = bonusId;
    }

    private String bonusValue;

    public String getBonusValue(){
        return bonusValue;
    }

    public void setBonusValue(String bonusValue){
        this.bonusValue = bonusValue;
    }

    private String bonusExpiry;

    public String getBonusExpiry(){
        return bonusExpiry;
    }

    public void setBonusExpiry(String bonusExpiry){
        this.bonusExpiry = bonusExpiry;
    }

    private String bonusTypeDesc;

    public String getBonusTypeDesc(){
        return bonusTypeDesc;
    }

    public void setBonusTypeDesc(String bonusTypeDesc){
        this.bonusTypeDesc = bonusTypeDesc;
    }

    public static StandardBonus fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        StandardBonus instance = new StandardBonus();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setBonusId(jsonObject.optString("bonusId"));
            instance.setBonusValue(jsonObject.optString("bonusValue"));
            instance.setBonusExpiry(jsonObject.optString("bonusExpiry"));
            instance.setBonusTypeDesc(jsonObject.optString("bonusTypeDesc"));
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