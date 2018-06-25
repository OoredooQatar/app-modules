package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DwhKPIMonthly implements Serializable{


    private String kpiDesc;

    public String getKpiDesc(){
        return kpiDesc;
    }

    public void setKpiDesc(String kpiDesc){
        this.kpiDesc = kpiDesc;
    }

    private int yearMonth;

    public int getYearMonth(){
        return yearMonth;
    }

    public void setYearMonth(int yearMonth){
        this.yearMonth = yearMonth;
    }

    private String level1;

    public String getLevel1(){
        return level1;
    }

    public void setLevel1(String level1){
        this.level1 = level1;
    }

    private String level2;

    public String getLevel2(){
        return level2;
    }

    public void setLevel2(String level2){
        this.level2 = level2;
    }

    private String level3;

    public String getLevel3(){
        return level3;
    }

    public void setLevel3(String level3){
        this.level3 = level3;
    }

    private String level4;

    public String getLevel4(){
        return level4;
    }

    public void setLevel4(String level4){
        this.level4 = level4;
    }

    private String kpiValue;

    public String getKpiValue(){
        return kpiValue;
    }

    public void setKpiValue(String kpiValue){
        this.kpiValue = kpiValue;
    }

    private String kpiUOM;

    public String getKpiUOM(){
        return kpiUOM;
    }

    public void setKpiUOM(String kpiUOM){
        this.kpiUOM = kpiUOM;
    }

    private String accessLevelBUNm;

    public String getAccessLevelBUNm(){
        return accessLevelBUNm;
    }

    public void setAccessLevelBUNm(String accessLevelBUNm){
        this.accessLevelBUNm = accessLevelBUNm;
    }

    public static DwhKPIMonthly fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        DwhKPIMonthly instance = new DwhKPIMonthly();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setKpiDesc(jsonObject.optString("kpiDesc"));
            instance.setYearMonth(jsonObject.optInt("yearMonth"));
            instance.setLevel1(jsonObject.optString("level1"));
            instance.setLevel2(jsonObject.optString("level2"));
            instance.setLevel3(jsonObject.optString("level3"));
            instance.setLevel4(jsonObject.optString("level4"));
            instance.setKpiValue(jsonObject.optString("kpiValue"));
            instance.setKpiUOM(jsonObject.optString("kpiUOM"));
            instance.setAccessLevelBUNm(jsonObject.optString("accessLevelBUNm"));
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