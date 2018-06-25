package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction implements Serializable{


    private String customerRef;

    public String getCustomerRef(){
        return customerRef;
    }

    public void setCustomerRef(String customerRef){
        this.customerRef = customerRef;
    }

    private String qid;

    public String getQid(){
        return qid;
    }

    public void setQid(String qid){
        this.qid = qid;
    }

    private String accountNumber;

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    private String serviceNumber;

    public String getServiceNumber(){
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber){
        this.serviceNumber = serviceNumber;
    }

    private String dataUnits;

    public String getDataUnits(){
        return dataUnits;
    }

    public void setDataUnits(String dataUnits){
        this.dataUnits = dataUnits;
    }

    private String localUnits;

    public String getLocalUnits(){
        return localUnits;
    }

    public void setLocalUnits(String localUnits){
        this.localUnits = localUnits;
    }

    private String internationalUnits;

    public String getInternationalUnits(){
        return internationalUnits;
    }

    public void setInternationalUnits(String internationalUnits){
        this.internationalUnits = internationalUnits;
    }

    private String lockedUnits;

    public String getLockedUnits(){
        return lockedUnits;
    }

    public void setLockedUnits(String lockedUnits){
        this.lockedUnits = lockedUnits;
    }

    private String iSKCode;

    public String getISKCode(){
        return iSKCode;
    }

    public void setISKCode(String iSKCode){
        this.iSKCode = iSKCode;
    }

    private String deliveryOption;

    public String getDeliveryOption(){
        return deliveryOption;
    }

    public void setDeliveryOption(String deliveryOption){
        this.deliveryOption = deliveryOption;
    }

    private String buildingNo;

    public String getBuildingNo(){
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo){
        this.buildingNo = buildingNo;
    }

    private String street;

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    private String zone;

    public String getZone(){
        return zone;
    }

    public void setZone(String zone){
        this.zone = zone;
    }

    private String transactionType;

    public String getTransactionType(){
        return transactionType;
    }

    public void setTransactionType(String transactionType){
        this.transactionType = transactionType;
    }

    private String appOrderNumber;

    public String getAppOrderNumber(){
        return appOrderNumber;
    }

    public void setAppOrderNumber(String appOrderNumber){
        this.appOrderNumber = appOrderNumber;
    }

    private String productName;

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    private String pricePlane;

    public String getPricePlane(){
        return pricePlane;
    }

    public void setPricePlane(String pricePlane){
        this.pricePlane = pricePlane;
    }

    private String orderStatus;

    public String getOrderStatus(){
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }

    private String crmTransID;

    public String getCrmTransID(){
        return crmTransID;
    }

    public void setCrmTransID(String crmTransID){
        this.crmTransID = crmTransID;
    }

    private String tibcoTrackingID;

    public String getTibcoTrackingID(){
        return tibcoTrackingID;
    }

    public void setTibcoTrackingID(String tibcoTrackingID){
        this.tibcoTrackingID = tibcoTrackingID;
    }

    private String roamingData;

    public String getRoamingData(){
        return roamingData;
    }

    public void setRoamingData(String roamingData){
        this.roamingData = roamingData;
    }

    private String roamingUnit;

    public String getRoamingUnit(){
        return roamingUnit;
    }

    public void setRoamingUnit(String roamingUnit){
        this.roamingUnit = roamingUnit;
    }

    public static Transaction fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        Transaction instance = new Transaction();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setCustomerRef(jsonObject.optString("customerRef"));
            instance.setQid(jsonObject.optString("qid"));
            instance.setAccountNumber(jsonObject.optString("accountNumber"));
            instance.setServiceNumber(jsonObject.optString("serviceNumber"));
            instance.setDataUnits(jsonObject.optString("dataUnits"));
            instance.setLocalUnits(jsonObject.optString("localUnits"));
            instance.setInternationalUnits(jsonObject.optString("internationalUnits"));
            instance.setLockedUnits(jsonObject.optString("lockedUnits"));
            instance.setISKCode(jsonObject.optString("iSKCode"));
            instance.setDeliveryOption(jsonObject.optString("deliveryOption"));
            instance.setBuildingNo(jsonObject.optString("buildingNo"));
            instance.setStreet(jsonObject.optString("street"));
            instance.setZone(jsonObject.optString("zone"));
            instance.setTransactionType(jsonObject.optString("transactionType"));
            instance.setAppOrderNumber(jsonObject.optString("appOrderNumber"));
            instance.setProductName(jsonObject.optString("productName"));
            instance.setPricePlane(jsonObject.optString("pricePlane"));
            instance.setOrderStatus(jsonObject.optString("orderStatus"));
            instance.setCrmTransID(jsonObject.optString("crmTransID"));
            instance.setTibcoTrackingID(jsonObject.optString("tibcoTrackingID"));
            instance.setRoamingData(jsonObject.optString("roamingData"));
            instance.setRoamingUnit(jsonObject.optString("roamingUnit"));
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