package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product implements Serializable {


    private boolean shahry;

    public boolean getShahry() {
        return shahry;
    }

    public void setShahry(boolean shahry) {
        this.shahry = shahry;
    }

    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    private String tags;

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    private int order;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    private int productFamilyId;

    public int getProductFamilyId() {
        return productFamilyId;
    }

    public void setProductFamilyId(int productFamilyId) {
        this.productFamilyId = productFamilyId;
    }

    private int productSequence;

    public int getProductSequence() {
        return productSequence;
    }

    public void setProductSequence(int productSequence) {
        this.productSequence = productSequence;
    }

    private int parentProductSequence;

    public int getParentProductSequence() {
        return parentProductSequence;
    }

    public void setParentProductSequence(int parentProductSequence) {
        this.parentProductSequence = parentProductSequence;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Tariff[] availableTariffs;

    public Tariff[] getAvailableTariffs() {
        return availableTariffs;
    }

    public void setAvailableTariffs(Tariff[] availableTariffs) {
        this.availableTariffs = availableTariffs;
    }

    private Tariff subscribedTariff;

    public Tariff getSubscribedTariff() {
        return subscribedTariff;
    }

    public void setSubscribedTariff(Tariff subscribedTariff) {
        this.subscribedTariff = subscribedTariff;
    }

    private TariffGroup[] posibleGroups;

    public TariffGroup[] getPosibleGroups() {
        return posibleGroups;
    }

    public void setPosibleGroups(TariffGroup[] posibleGroups) {
        this.posibleGroups = posibleGroups;
    }

    private Tariff[] subscriubedTariffs;

    public Tariff[] getSubscriubedTariffs() {
        return subscriubedTariffs;
    }

    public void setSubscriubedTariffs(Tariff[] subscriubedTariffs) {
        this.subscriubedTariffs = subscriubedTariffs;
    }

    private qa.ooredoo.selfcare.sdk.model.RenewalOption[] productRenewalOptions;

    public qa.ooredoo.selfcare.sdk.model.RenewalOption[] getProductRenewalOptions() {
        return productRenewalOptions;
    }

    public void setProductRenewalOptions(qa.ooredoo.selfcare.sdk.model.RenewalOption[] productRenewalOptions) {
        this.productRenewalOptions = productRenewalOptions;
    }

    private boolean mainProduct;

    public boolean getMainProduct() {
        return mainProduct;
    }

    public void setMainProduct(boolean mainProduct) {
        this.mainProduct = mainProduct;
    }

    public static Product fromJSON(String jsonString) {
        if (jsonString == null || jsonString.length() < 1) return null;
        Product instance = new Product();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setShahry(jsonObject.optBoolean("shahry"));
            instance.setProductName(jsonObject.optString("productName"));
            instance.setProductId(jsonObject.optString("productId"));
            instance.setTags(jsonObject.optString("tags"));
            instance.setOrder(jsonObject.optInt("order"));
            instance.setProductFamilyId(jsonObject.optInt("productFamilyId"));
            instance.setProductSequence(jsonObject.optInt("productSequence"));
            instance.setParentProductSequence(jsonObject.optInt("parentProductSequence"));
            instance.setDescription(jsonObject.optString("description"));
            JSONArray availableTariffsJsonArray = jsonObject.optJSONArray("availableTariffs");
            if (availableTariffsJsonArray != null) {
                Tariff[] availableTariffsArray = new Tariff[availableTariffsJsonArray.length()];
                for (int i = 0; i < availableTariffsJsonArray.length(); i++) {
                    availableTariffsArray[i] = Tariff.fromJSON(availableTariffsJsonArray.optString(i));
                }
                instance.setAvailableTariffs(availableTariffsArray);
            }
            instance.setSubscribedTariff(Tariff.fromJSON(jsonObject.optString("subscribedTariff")));
            JSONArray posibleGroupsJsonArray = jsonObject.optJSONArray("posibleGroups");
            if (posibleGroupsJsonArray != null) {
                TariffGroup[] posibleGroupsArray = new TariffGroup[posibleGroupsJsonArray.length()];
                for (int i = 0; i < posibleGroupsJsonArray.length(); i++) {
                    posibleGroupsArray[i] = TariffGroup.fromJSON(posibleGroupsJsonArray.optString(i));
                }
                instance.setPosibleGroups(posibleGroupsArray);
            }
            JSONArray subscriubedTariffsJsonArray = jsonObject.optJSONArray("subscriubedTariffs");
            if (subscriubedTariffsJsonArray != null) {
                Tariff[] subscriubedTariffsArray = new Tariff[subscriubedTariffsJsonArray.length()];
                for (int i = 0; i < subscriubedTariffsJsonArray.length(); i++) {
                    subscriubedTariffsArray[i] = Tariff.fromJSON(subscriubedTariffsJsonArray.optString(i));
                }
                instance.setSubscriubedTariffs(subscriubedTariffsArray);
            }
            JSONArray productRenewalOptionsJsonArray = jsonObject.optJSONArray("productRenewalOptions");
            if (productRenewalOptionsJsonArray != null) {
                qa.ooredoo.selfcare.sdk.model.RenewalOption[] productRenewalOptionsArray = new qa.ooredoo.selfcare.sdk.model.RenewalOption[productRenewalOptionsJsonArray.length()];
                for (int i = 0; i < productRenewalOptionsJsonArray.length(); i++) {
                    productRenewalOptionsArray[i] = qa.ooredoo.selfcare.sdk.model.RenewalOption.fromJSON(productRenewalOptionsJsonArray.optString(i));
                }
                instance.setProductRenewalOptions(productRenewalOptionsArray);
            }
            instance.setMainProduct(jsonObject.optBoolean("mainProduct"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public static Date parseDate(JSONObject jsonObject, String key) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(jsonObject.optString(key));
        } catch (ParseException e) {
            return null;
        }
    }
}