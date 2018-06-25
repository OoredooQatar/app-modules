package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tariff implements Serializable{


    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    private String price;

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    private int crmTariffId;

    public int getCrmTariffId(){
        return crmTariffId;
    }

    public void setCrmTariffId(int crmTariffId){
        this.crmTariffId = crmTariffId;
    }

    private int order;

    public int getOrder(){
        return order;
    }

    public void setOrder(int order){
        this.order = order;
    }

    private boolean subscribed;

    public boolean getSubscribed(){
        return subscribed;
    }

    public void setSubscribed(boolean subscribed){
        this.subscribed = subscribed;
    }

    private String subscriptionHandle;

    public String getSubscriptionHandle(){
        return subscriptionHandle;
    }

    public void setSubscriptionHandle(String subscriptionHandle){
        this.subscriptionHandle = subscriptionHandle;
    }

    private String subscriptionCode;

    public String getSubscriptionCode(){
        return subscriptionCode;
    }

    public void setSubscriptionCode(String subscriptionCode){
        this.subscriptionCode = subscriptionCode;
    }

    private String[] availableActions;

    public String[] getAvailableActions(){
        return availableActions;
    }

    public void setAvailableActions(String[] availableActions){
        this.availableActions = availableActions;
    }

    private boolean available;

    public boolean getAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    private qa.ooredoo.selfcare.sdk.model.TariffBenefit[] benefits;

    public qa.ooredoo.selfcare.sdk.model.TariffBenefit[] getBenefits(){
        return benefits;
    }

    public void setBenefits(qa.ooredoo.selfcare.sdk.model.TariffBenefit[] benefits){
        this.benefits = benefits;
    }

    private String remainingBalance;

    public String getRemainingBalance(){
        return remainingBalance;
    }

    public void setRemainingBalance(String remainingBalance){
        this.remainingBalance = remainingBalance;
    }

    private String balanceExpiryDate;

    public String getBalanceExpiryDate(){
        return balanceExpiryDate;
    }

    public void setBalanceExpiryDate(String balanceExpiryDate){
        this.balanceExpiryDate = balanceExpiryDate;
    }

    private String tags;

    public String getTags(){
        return tags;
    }

    public void setTags(String tags){
        this.tags = tags;
    }

    private String note;

    public String getNote(){
        return note;
    }

    public void setNote(String note){
        this.note = note;
    }

    private qa.ooredoo.selfcare.sdk.model.TariffGroup tariffGroup;

    public qa.ooredoo.selfcare.sdk.model.TariffGroup getTariffGroup(){
        return tariffGroup;
    }

    public void setTariffGroup(qa.ooredoo.selfcare.sdk.model.TariffGroup tariffGroup){
        this.tariffGroup = tariffGroup;
    }

    private String futureTarriffID;

    public String getFutureTarriffID(){
        return futureTarriffID;
    }

    public void setFutureTarriffID(String futureTarriffID){
        this.futureTarriffID = futureTarriffID;
    }

    private String currentTariffExpiryDate;

    public String getCurrentTariffExpiryDate(){
        return currentTariffExpiryDate;
    }

    public void setCurrentTariffExpiryDate(String currentTariffExpiryDate){
        this.currentTariffExpiryDate = currentTariffExpiryDate;
    }

    private boolean terminationFlag;

    public boolean getTerminationFlag(){
        return terminationFlag;
    }

    public void setTerminationFlag(boolean terminationFlag){
        this.terminationFlag = terminationFlag;
    }

    private boolean isSuspended;

    public boolean getIsSuspended(){
        return isSuspended;
    }

    public void setIsSuspended(boolean isSuspended){
        this.isSuspended = isSuspended;
    }

    private String packStatusText;

    public String getPackStatusText(){
        return packStatusText;
    }

    public void setPackStatusText(String packStatusText){
        this.packStatusText = packStatusText;
    }

    private String suspendedMessage;

    public String getSuspendedMessage(){
        return suspendedMessage;
    }

    public void setSuspendedMessage(String suspendedMessage){
        this.suspendedMessage = suspendedMessage;
    }

    private String serviceGroup;

    public String getServiceGroup(){
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup){
        this.serviceGroup = serviceGroup;
    }

    private String status;

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    private String promptMessage;

    public String getPromptMessage(){
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage){
        this.promptMessage = promptMessage;
    }

    private boolean showPromptMessage;

    public boolean getShowPromptMessage(){
        return showPromptMessage;
    }

    public void setShowPromptMessage(boolean showPromptMessage){
        this.showPromptMessage = showPromptMessage;
    }

    public static Tariff fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        Tariff instance = new Tariff();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setName(jsonObject.optString("name"));
            instance.setDescription(jsonObject.optString("description"));
            instance.setPrice(jsonObject.optString("price"));
            instance.setCrmTariffId(jsonObject.optInt("crmTariffId"));
            instance.setOrder(jsonObject.optInt("order"));
            instance.setSubscribed(jsonObject.optBoolean("subscribed"));
            instance.setSubscriptionHandle(jsonObject.optString("subscriptionHandle"));
            instance.setSubscriptionCode(jsonObject.optString("subscriptionCode"));
            JSONArray availableActionsJsonArray = jsonObject.optJSONArray("availableActions");
            if (availableActionsJsonArray != null) {
                String[] availableActionsArray = new String[availableActionsJsonArray.length()];
                for (int i = 0; i < availableActionsJsonArray.length(); i++) {
                    availableActionsArray[i] = availableActionsJsonArray.optString(i);
                }
                instance.setAvailableActions(availableActionsArray);
            }
            instance.setAvailable(jsonObject.optBoolean("available"));
            JSONArray benefitsJsonArray = jsonObject.optJSONArray("benefits");
            if (benefitsJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.TariffBenefit[] benefitsArray = new qa.ooredoo.selfcare.sdk.model.TariffBenefit[benefitsJsonArray.length()];
                for (int i = 0; i < benefitsJsonArray.length(); i++) {
                    benefitsArray[i] = qa.ooredoo.selfcare.sdk.model.TariffBenefit.fromJSON(benefitsJsonArray.optString(i));
                }
                instance.setBenefits(benefitsArray);
            }
            instance.setRemainingBalance(jsonObject.optString("remainingBalance"));
            instance.setBalanceExpiryDate(jsonObject.optString("balanceExpiryDate"));
            instance.setTags(jsonObject.optString("tags"));
            instance.setNote(jsonObject.optString("note"));
            instance.setTariffGroup(qa.ooredoo.selfcare.sdk.model.TariffGroup.fromJSON(jsonObject.optString("tariffGroup")));
            instance.setFutureTarriffID(jsonObject.optString("futureTarriffID"));
            instance.setCurrentTariffExpiryDate(jsonObject.optString("currentTariffExpiryDate"));
            instance.setTerminationFlag(jsonObject.optBoolean("terminationFlag"));
            instance.setIsSuspended(jsonObject.optBoolean("isSuspended"));
            instance.setPackStatusText(jsonObject.optString("packStatusText"));
            instance.setSuspendedMessage(jsonObject.optString("suspendedMessage"));
            instance.setServiceGroup(jsonObject.optString("serviceGroup"));
            instance.setStatus(jsonObject.optString("status"));
            instance.setPromptMessage(jsonObject.optString("promptMessage"));
            instance.setShowPromptMessage(jsonObject.optBoolean("showPromptMessage"));
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
