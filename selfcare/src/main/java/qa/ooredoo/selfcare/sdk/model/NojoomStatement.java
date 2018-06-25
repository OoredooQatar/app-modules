package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NojoomStatement implements Serializable{


    private String statementId;

    public String getStatementId(){
        return statementId;
    }

    public void setStatementId(String statementId){
        this.statementId = statementId;
    }

    private Date statementDate;

    public Date getStatementDate(){
        return statementDate;
    }

    public void setStatementDate(Date statementDate){
        this.statementDate = statementDate;
    }

    private int openingPointsBalance;

    public int getOpeningPointsBalance(){
        return openingPointsBalance;
    }

    public void setOpeningPointsBalance(int openingPointsBalance){
        this.openingPointsBalance = openingPointsBalance;
    }

    private int closingPointsBalance;

    public int getClosingPointsBalance(){
        return closingPointsBalance;
    }

    public void setClosingPointsBalance(int closingPointsBalance){
        this.closingPointsBalance = closingPointsBalance;
    }

    private int accumulatedPoints;

    public int getAccumulatedPoints(){
        return accumulatedPoints;
    }

    public void setAccumulatedPoints(int accumulatedPoints){
        this.accumulatedPoints = accumulatedPoints;
    }

    private int spentPoints;

    public int getSpentPoints(){
        return spentPoints;
    }

    public void setSpentPoints(int spentPoints){
        this.spentPoints = spentPoints;
    }

    private int expiringPoints;

    public int getExpiringPoints(){
        return expiringPoints;
    }

    public void setExpiringPoints(int expiringPoints){
        this.expiringPoints = expiringPoints;
    }

    private NojoomStatementDetail[] statementDetails;

    public NojoomStatementDetail[] getStatementDetails(){
        return statementDetails;
    }

    public void setStatementDetails(NojoomStatementDetail[] statementDetails){
        this.statementDetails = statementDetails;
    }

    public static NojoomStatement fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        NojoomStatement instance = new NojoomStatement();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setStatementId(jsonObject.optString("statementId"));
            instance.setStatementDate(parseDate(jsonObject,"statementDate"));
            instance.setOpeningPointsBalance(jsonObject.optInt("openingPointsBalance"));
            instance.setClosingPointsBalance(jsonObject.optInt("closingPointsBalance"));
            instance.setAccumulatedPoints(jsonObject.optInt("accumulatedPoints"));
            instance.setSpentPoints(jsonObject.optInt("spentPoints"));
            instance.setExpiringPoints(jsonObject.optInt("expiringPoints"));
            JSONArray statementDetailsJsonArray = jsonObject.optJSONArray("statementDetails");
            if (statementDetailsJsonArray != null) {
                NojoomStatementDetail[] statementDetailsArray = new NojoomStatementDetail[statementDetailsJsonArray.length()];
                for (int i = 0; i < statementDetailsJsonArray.length(); i++) {
                    statementDetailsArray[i] = NojoomStatementDetail.fromJSON(statementDetailsJsonArray.optString(i));
                }
                instance.setStatementDetails(statementDetailsArray);
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