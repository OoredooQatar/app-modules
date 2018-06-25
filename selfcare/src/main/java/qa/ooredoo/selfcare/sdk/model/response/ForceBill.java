package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForceBill implements Serializable{


    private String accountNumber;

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    private int billSequence;

    public int getBillSequence(){
        return billSequence;
    }

    public void setBillSequence(int billSequence){
        this.billSequence = billSequence;
    }

    private String invoiceNetMNY;

    public String getInvoiceNetMNY(){
        return invoiceNetMNY;
    }

    public void setInvoiceNetMNY(String invoiceNetMNY){
        this.invoiceNetMNY = invoiceNetMNY;
    }

    private String creditLimitMNY;

    public String getCreditLimitMNY(){
        return creditLimitMNY;
    }

    public void setCreditLimitMNY(String creditLimitMNY){
        this.creditLimitMNY = creditLimitMNY;
    }

    public static ForceBill fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ForceBill instance = new ForceBill();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setAccountNumber(jsonObject.optString("accountNumber"));
            instance.setBillSequence(jsonObject.optInt("billSequence"));
            instance.setInvoiceNetMNY(jsonObject.optString("invoiceNetMNY"));
            instance.setCreditLimitMNY(jsonObject.optString("creditLimitMNY"));
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