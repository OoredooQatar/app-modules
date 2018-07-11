package qa.ooredoo.selfcare.sdk.model.response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EshopProduct implements Serializable{


    private String name;

    public String getName(){
    return name;
    }

    public void setName(String name){
    this.name = name;
    }

    private String image;

    public String getImage(){
    return image;
    }

    public void setImage(String image){
    this.image = image;
    }

    private qa.ooredoo.selfcare.sdk.model.response.EshopProductsDetails[] productsDetails;

    public qa.ooredoo.selfcare.sdk.model.response.EshopProductsDetails[] getProductsDetails(){
    return productsDetails;
    }

    public void setProductsDetails(qa.ooredoo.selfcare.sdk.model.response.EshopProductsDetails[] productsDetails){
    this.productsDetails = productsDetails;
    }

public static EshopProduct fromJSON(String jsonString){
if(jsonString == null || jsonString.length() < 1) return null;
EshopProduct instance = new EshopProduct();
try {
JSONObject jsonObject = new JSONObject(jsonString);
    instance.setName(jsonObject.optString("name"));
    instance.setImage(jsonObject.optString("image"));
    JSONArray productsDetailsJsonArray = jsonObject.optJSONArray("productsDetails");
    if (productsDetailsJsonArray != null) {
    qa.ooredoo.selfcare.sdk.model.response.EshopProductsDetails[] productsDetailsArray = new qa.ooredoo.selfcare.sdk.model.response.EshopProductsDetails[productsDetailsJsonArray.length()];
    for (int i = 0; i < productsDetailsJsonArray.length(); i++) {
        productsDetailsArray[i] = qa.ooredoo.selfcare.sdk.model.response.EshopProductsDetails.fromJSON(productsDetailsJsonArray.optString(i));
    }
    instance.setProductsDetails(productsDetailsArray);
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