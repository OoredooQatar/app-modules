package qa.example.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForceBenefit implements Serializable{


    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    private String block_localUnits;

    public String getBlock_localUnits(){
        return block_localUnits;
    }

    public void setBlock_localUnits(String block_localUnits){
        this.block_localUnits = block_localUnits;
    }

    private String blockData;

    public String getBlockData(){
        return blockData;
    }

    public void setBlockData(String blockData){
        this.blockData = blockData;
    }

    private String blockIddMin;

    public String getBlockIddMin(){
        return blockIddMin;
    }

    public void setBlockIddMin(String blockIddMin){
        this.blockIddMin = blockIddMin;
    }

    private String blockRoamingData;

    public String getBlockRoamingData(){
        return blockRoamingData;
    }

    public void setBlockRoamingData(String blockRoamingData){
        this.blockRoamingData = blockRoamingData;
    }

    private String blockRoamingUnits;

    public String getBlockRoamingUnits(){
        return blockRoamingUnits;
    }

    public void setBlockRoamingUnits(String blockRoamingUnits){
        this.blockRoamingUnits = blockRoamingUnits;
    }

    private String dataUnit;

    public String getDataUnit(){
        return dataUnit;
    }

    public void setDataUnit(String dataUnit){
        this.dataUnit = dataUnit;
    }

    private int tariffId;

    public int getTariffId(){
        return tariffId;
    }

    public void setTariffId(int tariffId){
        this.tariffId = tariffId;
    }

    private String roamingData;

    public String getRoamingData(){
        return roamingData;
    }

    public void setRoamingData(String roamingData){
        this.roamingData = roamingData;
    }

    private String roamingUnits;

    public String getRoamingUnits(){
        return roamingUnits;
    }

    public void setRoamingUnits(String roamingUnits){
        this.roamingUnits = roamingUnits;
    }

    private String minimumLocalUnits;

    public String getMinimumLocalUnits(){
        return minimumLocalUnits;
    }

    public void setMinimumLocalUnits(String minimumLocalUnits){
        this.minimumLocalUnits = minimumLocalUnits;
    }

    private String minimumDataUnits;

    public String getMinimumDataUnits(){
        return minimumDataUnits;
    }

    public void setMinimumDataUnits(String minimumDataUnits){
        this.minimumDataUnits = minimumDataUnits;
    }

    private String minimumIDD;

    public String getMinimumIDD(){
        return minimumIDD;
    }

    public void setMinimumIDD(String minimumIDD){
        this.minimumIDD = minimumIDD;
    }

    private String minimumRoamingUUnit;

    public String getMinimumRoamingUUnit(){
        return minimumRoamingUUnit;
    }

    public void setMinimumRoamingUUnit(String minimumRoamingUUnit){
        this.minimumRoamingUUnit = minimumRoamingUUnit;
    }

    private String minimumRoamingData;

    public String getMinimumRoamingData(){
        return minimumRoamingData;
    }

    public void setMinimumRoamingData(String minimumRoamingData){
        this.minimumRoamingData = minimumRoamingData;
    }

    private String maxLocalUnits;

    public String getMaxLocalUnits(){
        return maxLocalUnits;
    }

    public void setMaxLocalUnits(String maxLocalUnits){
        this.maxLocalUnits = maxLocalUnits;
    }

    private String maxLocalUnitsBoosterBlocks;

    public String getMaxLocalUnitsBoosterBlocks(){
        return maxLocalUnitsBoosterBlocks;
    }

    public void setMaxLocalUnitsBoosterBlocks(String maxLocalUnitsBoosterBlocks){
        this.maxLocalUnitsBoosterBlocks = maxLocalUnitsBoosterBlocks;
    }

    private String maxDataUnits;

    public String getMaxDataUnits(){
        return maxDataUnits;
    }

    public void setMaxDataUnits(String maxDataUnits){
        this.maxDataUnits = maxDataUnits;
    }

    private String maxDataBoosterBlocks;

    public String getMaxDataBoosterBlocks(){
        return maxDataBoosterBlocks;
    }

    public void setMaxDataBoosterBlocks(String maxDataBoosterBlocks){
        this.maxDataBoosterBlocks = maxDataBoosterBlocks;
    }

    private String maxIDD;

    public String getMaxIDD(){
        return maxIDD;
    }

    public void setMaxIDD(String maxIDD){
        this.maxIDD = maxIDD;
    }

    private String maxIDDBoosterBlocks;

    public String getMaxIDDBoosterBlocks(){
        return maxIDDBoosterBlocks;
    }

    public void setMaxIDDBoosterBlocks(String maxIDDBoosterBlocks){
        this.maxIDDBoosterBlocks = maxIDDBoosterBlocks;
    }

    private String maxRoamingUUnit;

    public String getMaxRoamingUUnit(){
        return maxRoamingUUnit;
    }

    public void setMaxRoamingUUnit(String maxRoamingUUnit){
        this.maxRoamingUUnit = maxRoamingUUnit;
    }

    private String maxRoamingUnitsBoosterBlocks;

    public String getMaxRoamingUnitsBoosterBlocks(){
        return maxRoamingUnitsBoosterBlocks;
    }

    public void setMaxRoamingUnitsBoosterBlocks(String maxRoamingUnitsBoosterBlocks){
        this.maxRoamingUnitsBoosterBlocks = maxRoamingUnitsBoosterBlocks;
    }

    private String maxRoamingData;

    public String getMaxRoamingData(){
        return maxRoamingData;
    }

    public void setMaxRoamingData(String maxRoamingData){
        this.maxRoamingData = maxRoamingData;
    }

    private String maxRoamingDataBoosterBlocks;

    public String getMaxRoamingDataBoosterBlocks(){
        return maxRoamingDataBoosterBlocks;
    }

    public void setMaxRoamingDataBoosterBlocks(String maxRoamingDataBoosterBlocks){
        this.maxRoamingDataBoosterBlocks = maxRoamingDataBoosterBlocks;
    }

    private String maxNumberOfBlocks;

    public String getMaxNumberOfBlocks(){
        return maxNumberOfBlocks;
    }

    public void setMaxNumberOfBlocks(String maxNumberOfBlocks){
        this.maxNumberOfBlocks = maxNumberOfBlocks;
    }

    private String perBlockValue;

    public String getPerBlockValue(){
        return perBlockValue;
    }

    public void setPerBlockValue(String perBlockValue){
        this.perBlockValue = perBlockValue;
    }

    public static ForceBenefit fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        ForceBenefit instance = new ForceBenefit();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setId(jsonObject.optInt("id"));
            instance.setBlock_localUnits(jsonObject.optString("block_localUnits"));
            instance.setBlockData(jsonObject.optString("blockData"));
            instance.setBlockIddMin(jsonObject.optString("blockIddMin"));
            instance.setBlockRoamingData(jsonObject.optString("blockRoamingData"));
            instance.setBlockRoamingUnits(jsonObject.optString("blockRoamingUnits"));
            instance.setDataUnit(jsonObject.optString("dataUnit"));
            instance.setTariffId(jsonObject.optInt("tariffId"));
            instance.setRoamingData(jsonObject.optString("roamingData"));
            instance.setRoamingUnits(jsonObject.optString("roamingUnits"));
            instance.setMinimumLocalUnits(jsonObject.optString("minimumLocalUnits"));
            instance.setMinimumDataUnits(jsonObject.optString("minimumDataUnits"));
            instance.setMinimumIDD(jsonObject.optString("minimumIDD"));
            instance.setMinimumRoamingUUnit(jsonObject.optString("minimumRoamingUUnit"));
            instance.setMinimumRoamingData(jsonObject.optString("minimumRoamingData"));
            instance.setMaxLocalUnits(jsonObject.optString("maxLocalUnits"));
            instance.setMaxLocalUnitsBoosterBlocks(jsonObject.optString("maxLocalUnitsBoosterBlocks"));
            instance.setMaxDataUnits(jsonObject.optString("maxDataUnits"));
            instance.setMaxDataBoosterBlocks(jsonObject.optString("maxDataBoosterBlocks"));
            instance.setMaxIDD(jsonObject.optString("maxIDD"));
            instance.setMaxIDDBoosterBlocks(jsonObject.optString("maxIDDBoosterBlocks"));
            instance.setMaxRoamingUUnit(jsonObject.optString("maxRoamingUUnit"));
            instance.setMaxRoamingUnitsBoosterBlocks(jsonObject.optString("maxRoamingUnitsBoosterBlocks"));
            instance.setMaxRoamingData(jsonObject.optString("maxRoamingData"));
            instance.setMaxRoamingDataBoosterBlocks(jsonObject.optString("maxRoamingDataBoosterBlocks"));
            instance.setMaxNumberOfBlocks(jsonObject.optString("maxNumberOfBlocks"));
            instance.setPerBlockValue(jsonObject.optString("perBlockValue"));
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