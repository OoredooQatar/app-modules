package qa.example.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Label implements Serializable{


    private String code;

    public String getCode(){
    return code;
    }

    public void setCode(String code){
    this.code = code;
    }

    private LabelLanguage[] values;

    public LabelLanguage[] getValues(){
    return values;
    }

    public void setValues(LabelLanguage[] values){
    this.values = values;
    }

public static Label fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
Label instance = new Label();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setCode(jsonObject.optString("code"));
    JSONArray valuesJsonArray = jsonObject.optJSONArray("values");
    if (valuesJsonArray != null) {
    LabelLanguage[] valuesArray = new LabelLanguage[valuesJsonArray.length()];
    for (int i = 0; i < valuesJsonArray.length(); i++) {
        valuesArray[i] = LabelLanguage.fromJSON(valuesJsonArray.optString(i));
    }
    instance.setValues(valuesArray);
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