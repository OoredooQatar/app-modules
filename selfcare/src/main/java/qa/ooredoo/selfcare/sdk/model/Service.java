package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Service implements Serializable{


    private String serviceId;

    public String getServiceId(){
        return serviceId;
    }

    public void setServiceId(String serviceId){
        this.serviceId = serviceId;
    }

    private double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    private Date balanceValidity;

    public Date getBalanceValidity(){
        return balanceValidity;
    }

    public void setBalanceValidity(Date balanceValidity){
        this.balanceValidity = balanceValidity;
    }

    private String monthlyFee;

    public String getMonthlyFee(){
        return monthlyFee;
    }

    public void setMonthlyFee(String monthlyFee){
        this.monthlyFee = monthlyFee;
    }

    private boolean prepaid;

    public boolean getPrepaid(){
        return prepaid;
    }

    public void setPrepaid(boolean prepaid){
        this.prepaid = prepaid;
    }

    private Date fullfillmentDate;

    public Date getFullfillmentDate(){
        return fullfillmentDate;
    }

    public void setFullfillmentDate(Date fullfillmentDate){
        this.fullfillmentDate = fullfillmentDate;
    }

    private Date startDate;

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    private String status;

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    private String statusReason;

    public String getStatusReason(){
        return statusReason;
    }

    public void setStatusReason(String statusReason){
        this.statusReason = statusReason;
    }

    private boolean hasOffers;

    public boolean getHasOffers(){
        return hasOffers;
    }

    public void setHasOffers(boolean hasOffers){
        this.hasOffers = hasOffers;
    }

    private String serviceName;

    public String getServiceName(){
        return serviceName;
    }

    public void setServiceName(String serviceName){
        this.serviceName = serviceName;
    }

    private String serviceNumber;

    public String getServiceNumber(){
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber){
        this.serviceNumber = serviceNumber;
    }

    private String lineServiceNumber;

    public String getLineServiceNumber(){
        return lineServiceNumber;
    }

    public void setLineServiceNumber(String lineServiceNumber){
        this.lineServiceNumber = lineServiceNumber;
    }

    private String serviceDescription;

    public String getServiceDescription(){
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription){
        this.serviceDescription = serviceDescription;
    }

    private boolean showDetails;

    public boolean getShowDetails(){
        return showDetails;
    }

    public void setShowDetails(boolean showDetails){
        this.showDetails = showDetails;
    }

    private qa.ooredoo.selfcare.sdk.model.Product[] products;

    public qa.ooredoo.selfcare.sdk.model.Product[] getProducts(){
        return products;
    }

    public void setProducts(qa.ooredoo.selfcare.sdk.model.Product[] products){
        this.products = products;
    }

    private boolean hasUsage;

    public boolean getHasUsage(){
        return hasUsage;
    }

    public void setHasUsage(boolean hasUsage){
        this.hasUsage = hasUsage;
    }

    private String maxCreditAllowance;

    public String getMaxCreditAllowance(){
        return maxCreditAllowance;
    }

    public void setMaxCreditAllowance(String maxCreditAllowance){
        this.maxCreditAllowance = maxCreditAllowance;
    }

    private String remainingCreditAllowance;

    public String getRemainingCreditAllowance(){
        return remainingCreditAllowance;
    }

    public void setRemainingCreditAllowance(String remainingCreditAllowance){
        this.remainingCreditAllowance = remainingCreditAllowance;
    }

    private boolean hasDynamicOffer;

    public boolean getHasDynamicOffer(){
        return hasDynamicOffer;
    }

    public void setHasDynamicOffer(boolean hasDynamicOffer){
        this.hasDynamicOffer = hasDynamicOffer;
    }

    public static Service fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        Service instance = new Service();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setServiceId(jsonObject.optString("serviceId"));
            instance.setBalance(jsonObject.optDouble("balance"));
            instance.setBalanceValidity(parseDate(jsonObject,"balanceValidity"));
            instance.setMonthlyFee(jsonObject.optString("monthlyFee"));
            instance.setPrepaid(jsonObject.optBoolean("prepaid"));
            instance.setFullfillmentDate(parseDate(jsonObject,"fullfillmentDate"));
            instance.setStartDate(parseDate(jsonObject,"startDate"));
            instance.setStatus(jsonObject.optString("status"));
            instance.setStatusReason(jsonObject.optString("statusReason"));
            instance.setHasOffers(jsonObject.optBoolean("hasOffers"));
            instance.setServiceName(jsonObject.optString("serviceName"));
            instance.setServiceNumber(jsonObject.optString("serviceNumber"));
            instance.setLineServiceNumber(jsonObject.optString("lineServiceNumber"));

            instance.setServiceDescription(jsonObject.optString("serviceDescription"));
            instance.setShowDetails(jsonObject.optBoolean("showDetails"));
            JSONArray productsJsonArray = jsonObject.optJSONArray("products");
            if (productsJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.Product[] productsArray = new qa.ooredoo.selfcare.sdk.model.Product[productsJsonArray.length()];
                for (int i = 0; i < productsJsonArray.length(); i++) {
                    productsArray[i] = qa.ooredoo.selfcare.sdk.model.Product.fromJSON(productsJsonArray.optString(i));
                }
                instance.setProducts(productsArray);
            }
            instance.setHasUsage(jsonObject.optBoolean("hasUsage"));
            instance.setMaxCreditAllowance(jsonObject.optString("maxCreditAllowance"));
            instance.setRemainingCreditAllowance(jsonObject.optString("remainingCreditAllowance"));
            instance.setHasDynamicOffer(jsonObject.optBoolean("hasDynamicOffer"));
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