package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AuthenticatedSubscriberAccount implements Serializable{


    private boolean prepaid;

    public boolean getPrepaid(){
        return prepaid;
    }

    public void setPrepaid(boolean prepaid){
        this.prepaid = prepaid;
    }

    private String accountNumber;

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    private String accountStatus;

    public String getAccountStatus(){
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus){
        this.accountStatus = accountStatus;
    }

    private String userType;

    public String getUserType(){
        return userType;
    }

    public void setUserType(String userType){
        this.userType = userType;
    }

    private Service[] services;

    public Service[] getServices(){
        return services;
    }

    public void setServices(Service[] services){
        this.services = services;
    }

    public static AuthenticatedSubscriberAccount fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        AuthenticatedSubscriberAccount instance = new AuthenticatedSubscriberAccount();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setPrepaid(jsonObject.optBoolean("prepaid"));
            instance.setAccountNumber(jsonObject.optString("accountNumber"));
            instance.setAccountStatus(jsonObject.optString("accountStatus"));
            instance.setUserType(jsonObject.optString("userType"));
            JSONArray servicesJsonArray = jsonObject.optJSONArray("services");
            if (servicesJsonArray != null) {
                Service[] servicesArray = new Service[servicesJsonArray.length()];
                for (int i = 0; i < servicesJsonArray.length(); i++) {
                    servicesArray[i] = Service.fromJSON(servicesJsonArray.optString(i));
                }
                instance.setServices(servicesArray);
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