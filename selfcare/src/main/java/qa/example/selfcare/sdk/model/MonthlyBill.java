package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MonthlyBill implements Serializable{


    private String month;

    public String getMonth(){
    return month;
    }

    public void setMonth(String month){
    this.month = month;
    }

    private String billAmount;

    public String getBillAmount(){
    return billAmount;
    }

    public void setBillAmount(String billAmount){
    this.billAmount = billAmount;
    }

public static MonthlyBill fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
MonthlyBill instance = new MonthlyBill();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setMonth(jsonObject.optString("month"));
    instance.setBillAmount(jsonObject.optString("billAmount"));
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