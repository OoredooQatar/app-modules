package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EshopProductsDetails implements Serializable{


    private String priceExTax;

    public String getPriceExTax(){
    return priceExTax;
    }

    public void setPriceExTax(String priceExTax){
    this.priceExTax = priceExTax;
    }

    private String manufacturer;

    public String getManufacturer(){
    return manufacturer;
    }

    public void setManufacturer(String manufacturer){
    this.manufacturer = manufacturer;
    }

    private String quantity;

    public String getQuantity(){
    return quantity;
    }

    public void setQuantity(String quantity){
    this.quantity = quantity;
    }

    private String capacity;

    public String getCapacity(){
    return capacity;
    }

    public void setCapacity(String capacity){
    this.capacity = capacity;
    }

    private String priceIncTax;

    public String getPriceIncTax(){
    return priceIncTax;
    }

    public void setPriceIncTax(String priceIncTax){
    this.priceIncTax = priceIncTax;
    }

    private String color;

    public String getColor(){
    return color;
    }

    public void setColor(String color){
    this.color = color;
    }

    private String colorHex;

    public String getColorHex(){
    return colorHex;
    }

    public void setColorHex(String colorHex){
    this.colorHex = colorHex;
    }

    private String id;

    public String getId(){
    return id;
    }

    public void setId(String id){
    this.id = id;
    }

    private String[] productImageNames;

    public String[] getProductImageNames(){
    return productImageNames;
    }

    public void setProductImageNames(String[] productImageNames){
    this.productImageNames = productImageNames;
    }

    private ProductSpecs[] productSpecs;

    public ProductSpecs[] getProductSpecs(){
    return productSpecs;
    }

    public void setProductSpecs(ProductSpecs[] productSpecs){
    this.productSpecs = productSpecs;
    }

    private String unit;

    public String getUnit(){
    return unit;
    }

    public void setUnit(String unit){
    this.unit = unit;
    }

    private String url;

    public String getUrl(){
    return url;
    }

    public void setUrl(String url){
    this.url = url;
    }

public static EshopProductsDetails fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
EshopProductsDetails instance = new EshopProductsDetails();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setPriceExTax(jsonObject.optString("priceExTax"));
    instance.setManufacturer(jsonObject.optString("manufacturer"));
    instance.setQuantity(jsonObject.optString("quantity"));
    instance.setCapacity(jsonObject.optString("capacity"));
    instance.setPriceIncTax(jsonObject.optString("priceIncTax"));
    instance.setColor(jsonObject.optString("color"));
    instance.setColorHex(jsonObject.optString("colorHex"));
    instance.setId(jsonObject.optString("id"));
    JSONArray productImageNamesJsonArray = jsonObject.optJSONArray("productImageNames");
    if (productImageNamesJsonArray != null) {
    String[] productImageNamesArray = new String[productImageNamesJsonArray.length()];
    for (int i = 0; i < productImageNamesJsonArray.length(); i++) {
        productImageNamesArray[i] = productImageNamesJsonArray.optString(i);
    }
    instance.setProductImageNames(productImageNamesArray);
    }
    JSONArray productSpecsJsonArray = jsonObject.optJSONArray("productSpecs");
    if (productSpecsJsonArray != null) {
    ProductSpecs[] productSpecsArray = new ProductSpecs[productSpecsJsonArray.length()];
    for (int i = 0; i < productSpecsJsonArray.length(); i++) {
        productSpecsArray[i] = ProductSpecs.fromJSON(productSpecsJsonArray.optString(i));
    }
    instance.setProductSpecs(productSpecsArray);
    }
    instance.setUnit(jsonObject.optString("unit"));
    instance.setUrl(jsonObject.optString("url"));
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