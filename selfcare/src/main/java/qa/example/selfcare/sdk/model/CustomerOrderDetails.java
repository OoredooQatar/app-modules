package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerOrderDetails implements Serializable{


    private String orderNumber;

    public String getOrderNumber(){
    return orderNumber;
    }

    public void setOrderNumber(String orderNumber){
    this.orderNumber = orderNumber;
    }

    private String orderCreateDate;

    public String getOrderCreateDate(){
    return orderCreateDate;
    }

    public void setOrderCreateDate(String orderCreateDate){
    this.orderCreateDate = orderCreateDate;
    }

    private String orderStatus;

    public String getOrderStatus(){
    return orderStatus;
    }

    public void setOrderStatus(String orderStatus){
    this.orderStatus = orderStatus;
    }

    private String orderCompleteDate;

    public String getOrderCompleteDate(){
    return orderCompleteDate;
    }

    public void setOrderCompleteDate(String orderCompleteDate){
    this.orderCompleteDate = orderCompleteDate;
    }

public static CustomerOrderDetails fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
CustomerOrderDetails instance = new CustomerOrderDetails();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setOrderNumber(jsonObject.optString("orderNumber"));
    instance.setOrderCreateDate(jsonObject.optString("orderCreateDate"));
    instance.setOrderStatus(jsonObject.optString("orderStatus"));
    instance.setOrderCompleteDate(jsonObject.optString("orderCompleteDate"));
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