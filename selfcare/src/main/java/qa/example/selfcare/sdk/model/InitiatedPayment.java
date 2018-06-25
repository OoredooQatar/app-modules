package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InitiatedPayment implements Serializable{


    private String merchantTxRef;

    public String getMerchantTxRef(){
        return merchantTxRef;
    }

    public void setMerchantTxRef(String merchantTxRef){
        this.merchantTxRef = merchantTxRef;
    }

    private String orderInfo;

    public String getOrderInfo(){
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo){
        this.orderInfo = orderInfo;
    }

    private String migsURL;

    public String getMigsURL(){
        return migsURL;
    }

    public void setMigsURL(String migsURL){
        this.migsURL = migsURL;
    }

    private String dataCashRef;

    public String getDataCashRef(){
        return dataCashRef;
    }

    public void setDataCashRef(String dataCashRef){
        this.dataCashRef = dataCashRef;
    }

    private String beCode;

    public String getBeCode(){
        return beCode;
    }

    public void setBeCode(String beCode){
        this.beCode = beCode;
    }

    private String uniqTransectionId;

    public String getUniqTransectionId(){
        return uniqTransectionId;
    }

    public void setUniqTransectionId(String uniqTransectionId){
        this.uniqTransectionId = uniqTransectionId;
    }

    public static InitiatedPayment fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        InitiatedPayment instance = new InitiatedPayment();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setMerchantTxRef(jsonObject.optString("merchantTxRef"));
            instance.setOrderInfo(jsonObject.optString("orderInfo"));
            instance.setMigsURL(jsonObject.optString("migsURL"));
            instance.setDataCashRef(jsonObject.optString("dataCashRef"));
            instance.setBeCode(jsonObject.optString("beCode"));
            instance.setUniqTransectionId(jsonObject.optString("uniqTransectionId"));
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