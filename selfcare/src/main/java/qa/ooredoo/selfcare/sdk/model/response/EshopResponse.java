package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EshopResponse implements Serializable{


    private EshopProduct[] products;

    public EshopProduct[] getProducts(){
    return products;
    }

    public void setProducts(EshopProduct[] products){
    this.products = products;
    }

    private BasketItem[] basketItems;

    public BasketItem[] getBasketItems(){
    return basketItems;
    }

    public void setBasketItems(BasketItem[] basketItems){
    this.basketItems = basketItems;
    }

    private String maxQuantity;

    public String getMaxQuantity(){
    return maxQuantity;
    }

    public void setMaxQuantity(String maxQuantity){
    this.maxQuantity = maxQuantity;
    }

    private boolean success;

    public boolean getSuccess(){
    return success;
    }

    public void setSuccess(boolean success){
    this.success = success;
    }

    private String transactionUniqueId;

    public String getTransactionUniqueId(){
    return transactionUniqueId;
    }

    public void setTransactionUniqueId(String transactionUniqueId){
    this.transactionUniqueId = transactionUniqueId;
    }

    private String amount;

    public String getAmount(){
    return amount;
    }

    public void setAmount(String amount){
    this.amount = amount;
    }

    private String city;

    public String getCity(){
    return city;
    }

    public void setCity(String city){
    this.city = city;
    }

    private String address;

    public String getAddress(){
    return address;
    }

    public void setAddress(String address){
    this.address = address;
    }

    private String poBox;

    public String getPoBox(){
    return poBox;
    }

    public void setPoBox(String poBox){
    this.poBox = poBox;
    }

    private String estimatedDeliveryDate;

    public String getEstimatedDeliveryDate(){
    return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(String estimatedDeliveryDate){
    this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    private String orderNumber;

    public String getOrderNumber(){
    return orderNumber;
    }

    public void setOrderNumber(String orderNumber){
    this.orderNumber = orderNumber;
    }

    private String email;

    public String getEmail(){
    return email;
    }

    public void setEmail(String email){
    this.email = email;
    }

    private String error;

    public String getError(){
    return error;
    }

    public void setError(String error){
    this.error = error;
    }

    private String imageBaseURL;

    public String getImageBaseURL(){
    return imageBaseURL;
    }

    public void setImageBaseURL(String imageBaseURL){
    this.imageBaseURL = imageBaseURL;
    }

    private String eshopBaseUrl;

    public String getEshopBaseUrl(){
    return eshopBaseUrl;
    }

    public void setEshopBaseUrl(String eshopBaseUrl){
    this.eshopBaseUrl = eshopBaseUrl;
    }

    private long basketTotal;

    public long getBasketTotal(){
    return basketTotal;
    }

    public void setBasketTotal(long basketTotal){
    this.basketTotal = basketTotal;
    }

    private boolean result;

    public boolean getResult(){
    return result;
    }

    public void setResult(boolean result){
    this.result = result;
    }

    private String operationResult;

    public String getOperationResult(){
    return operationResult;
    }

    public void setOperationResult(String operationResult){
    this.operationResult = operationResult;
    }

    private String operationCode;

    public String getOperationCode(){
    return operationCode;
    }

    public void setOperationCode(String operationCode){
    this.operationCode = operationCode;
    }

    private boolean hasAlert;

    public boolean getHasAlert(){
    return hasAlert;
    }

    public void setHasAlert(boolean hasAlert){
    this.hasAlert = hasAlert;
    }

    private String alertMessage;

    public String getAlertMessage(){
    return alertMessage;
    }

    public void setAlertMessage(String alertMessage){
    this.alertMessage = alertMessage;
    }

public static EshopResponse fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
EshopResponse instance = new EshopResponse();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    JSONArray productsJsonArray = jsonObject.optJSONArray("products");
    if (productsJsonArray != null) {
    EshopProduct[] productsArray = new EshopProduct[productsJsonArray.length()];
    for (int i = 0; i < productsJsonArray.length(); i++) {
        productsArray[i] = EshopProduct.fromJSON(productsJsonArray.optString(i));
    }
    instance.setProducts(productsArray);
    }
    JSONArray basketItemsJsonArray = jsonObject.optJSONArray("basketItems");
    if (basketItemsJsonArray != null) {
    BasketItem[] basketItemsArray = new BasketItem[basketItemsJsonArray.length()];
    for (int i = 0; i < basketItemsJsonArray.length(); i++) {
        basketItemsArray[i] = BasketItem.fromJSON(basketItemsJsonArray.optString(i));
    }
    instance.setBasketItems(basketItemsArray);
    }
    instance.setMaxQuantity(jsonObject.optString("maxQuantity"));
    instance.setSuccess(jsonObject.optBoolean("success"));
    instance.setTransactionUniqueId(jsonObject.optString("transactionUniqueId"));
    instance.setAmount(jsonObject.optString("amount"));
    instance.setCity(jsonObject.optString("city"));
    instance.setAddress(jsonObject.optString("address"));
    instance.setPoBox(jsonObject.optString("poBox"));
    instance.setEstimatedDeliveryDate(jsonObject.optString("estimatedDeliveryDate"));
    instance.setOrderNumber(jsonObject.optString("orderNumber"));
    instance.setEmail(jsonObject.optString("email"));
    instance.setError(jsonObject.optString("error"));
    instance.setImageBaseURL(jsonObject.optString("imageBaseURL"));
    instance.setEshopBaseUrl(jsonObject.optString("eshopBaseUrl"));
    instance.setBasketTotal(jsonObject.optLong("basketTotal"));
    instance.setResult(jsonObject.optBoolean("result"));
    instance.setOperationResult(jsonObject.optString("operationResult"));
    instance.setOperationCode(jsonObject.optString("operationCode"));
    instance.setHasAlert(jsonObject.optBoolean("hasAlert"));
    instance.setAlertMessage(jsonObject.optString("alertMessage"));
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