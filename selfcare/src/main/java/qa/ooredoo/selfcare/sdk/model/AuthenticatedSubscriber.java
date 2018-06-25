package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AuthenticatedSubscriber implements Serializable{


    private AuthenticatedSubscriberAccount[] accounts;

    public AuthenticatedSubscriberAccount[] getAccounts(){
        return accounts;
    }

    public void setAccounts(AuthenticatedSubscriberAccount[] accounts){
        this.accounts = accounts;
    }

    public static AuthenticatedSubscriber fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        AuthenticatedSubscriber instance = new AuthenticatedSubscriber();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray accountsJsonArray = jsonObject.optJSONArray("accounts");
            if (accountsJsonArray != null) {
                AuthenticatedSubscriberAccount[] accountsArray = new AuthenticatedSubscriberAccount[accountsJsonArray.length()];
                for (int i = 0; i < accountsJsonArray.length(); i++) {
                    accountsArray[i] = AuthenticatedSubscriberAccount.fromJSON(accountsJsonArray.optString(i));
                }
                instance.setAccounts(accountsArray);
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