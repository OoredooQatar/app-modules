package qa.example.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Country implements Serializable{


    private String country;

    public String getCountry(){
    return country;
    }

    public void setCountry(String country){
    this.country = country;
    }

    private String isoCode;

    public String getIsoCode(){
    return isoCode;
    }

    public void setIsoCode(String isoCode){
    this.isoCode = isoCode;
    }

    private String flag;

    public String getFlag(){
    return flag;
    }

    public void setFlag(String flag){
    this.flag = flag;
    }

    private qa.ooredoo.selfcare.sdk.model.response.RoamingRates standardRates;

    public qa.ooredoo.selfcare.sdk.model.response.RoamingRates getStandardRates(){
    return standardRates;
    }

    public void setStandardRates(qa.ooredoo.selfcare.sdk.model.response.RoamingRates standardRates){
    this.standardRates = standardRates;
    }

    private qa.ooredoo.selfcare.sdk.model.response.RoamingRates opRates;

    public qa.ooredoo.selfcare.sdk.model.response.RoamingRates getOpRates(){
    return opRates;
    }

    public void setOpRates(qa.ooredoo.selfcare.sdk.model.response.RoamingRates opRates){
    this.opRates = opRates;
    }

    private qa.ooredoo.selfcare.sdk.model.CountryState[] states;

    public qa.ooredoo.selfcare.sdk.model.CountryState[] getStates(){
    return states;
    }

    public void setStates(qa.ooredoo.selfcare.sdk.model.CountryState[] states){
    this.states = states;
    }

    private qa.ooredoo.selfcare.sdk.model.CountryOperator[] countryOperators;

    public qa.ooredoo.selfcare.sdk.model.CountryOperator[] getCountryOperators(){
    return countryOperators;
    }

    public void setCountryOperators(qa.ooredoo.selfcare.sdk.model.CountryOperator[] countryOperators){
    this.countryOperators = countryOperators;
    }

public static Country fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
Country instance = new Country();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setCountry(jsonObject.optString("country"));
    instance.setIsoCode(jsonObject.optString("isoCode"));
    instance.setFlag(jsonObject.optString("flag"));
    instance.setStandardRates(qa.ooredoo.selfcare.sdk.model.response.RoamingRates.fromJSON(jsonObject.optString("standardRates")));
    instance.setOpRates(qa.ooredoo.selfcare.sdk.model.response.RoamingRates.fromJSON(jsonObject.optString("opRates")));
    JSONArray statesJsonArray = jsonObject.optJSONArray("states");
    if (statesJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.CountryState[] statesArray = new qa.ooredoo.selfcare.sdk.model.CountryState[statesJsonArray.length()];
    for (int i = 0; i < statesJsonArray.length(); i++) {
        statesArray[i] = qa.ooredoo.selfcare.sdk.model.CountryState.fromJSON(statesJsonArray.optString(i));
    }
    instance.setStates(statesArray);
    }
    JSONArray countryOperatorsJsonArray = jsonObject.optJSONArray("countryOperators");
    if (countryOperatorsJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.CountryOperator[] countryOperatorsArray = new qa.ooredoo.selfcare.sdk.model.CountryOperator[countryOperatorsJsonArray.length()];
    for (int i = 0; i < countryOperatorsJsonArray.length(); i++) {
        countryOperatorsArray[i] = qa.ooredoo.selfcare.sdk.model.CountryOperator.fromJSON(countryOperatorsJsonArray.optString(i));
    }
    instance.setCountryOperators(countryOperatorsArray);
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