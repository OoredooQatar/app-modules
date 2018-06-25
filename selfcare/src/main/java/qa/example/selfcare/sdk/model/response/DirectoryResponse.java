package qa.example.selfcare.sdk.model.response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DirectoryResponse implements Serializable{


    private String searchKey;

    public String getSearchKey(){
        return searchKey;
    }

    public void setSearchKey(String searchKey){
        this.searchKey = searchKey;
    }

    private String recordType;

    public String getRecordType(){
        return recordType;
    }

    public void setRecordType(String recordType){
        this.recordType = recordType;
    }

    private String category;

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    private String returnCode;

    public String getReturnCode(){
        return returnCode;
    }

    public void setReturnCode(String returnCode){
        this.returnCode = returnCode;
    }

    private String nextPageQuery;

    public String getNextPageQuery(){
        return nextPageQuery;
    }

    public void setNextPageQuery(String nextPageQuery){
        this.nextPageQuery = nextPageQuery;
    }

    private boolean moreRecords;

    public boolean getMoreRecords(){
        return moreRecords;
    }

    public void setMoreRecords(boolean moreRecords){
        this.moreRecords = moreRecords;
    }

    private int totalEntriesFound;

    public int getTotalEntriesFound(){
        return totalEntriesFound;
    }

    public void setTotalEntriesFound(int totalEntriesFound){
        this.totalEntriesFound = totalEntriesFound;
    }

    private int noOfListingsReturned;

    public int getNoOfListingsReturned(){
        return noOfListingsReturned;
    }

    public void setNoOfListingsReturned(int noOfListingsReturned){
        this.noOfListingsReturned = noOfListingsReturned;
    }

    private qa.ooredoo.selfcare.sdk.model.DirectoryResult directoryResult;

    public qa.ooredoo.selfcare.sdk.model.DirectoryResult getDirectoryResult(){
        return directoryResult;
    }

    public void setDirectoryResult(qa.ooredoo.selfcare.sdk.model.DirectoryResult directoryResult){
        this.directoryResult = directoryResult;
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

    public static DirectoryResponse fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        DirectoryResponse instance = new DirectoryResponse();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setSearchKey(jsonObject.optString("searchKey"));
            instance.setRecordType(jsonObject.optString("recordType"));
            instance.setCategory(jsonObject.optString("category"));
            instance.setReturnCode(jsonObject.optString("returnCode"));
            instance.setNextPageQuery(jsonObject.optString("nextPageQuery"));
            instance.setMoreRecords(jsonObject.optBoolean("moreRecords"));
            instance.setTotalEntriesFound(jsonObject.optInt("totalEntriesFound"));
            instance.setNoOfListingsReturned(jsonObject.optInt("noOfListingsReturned"));
            instance.setDirectoryResult(qa.ooredoo.selfcare.sdk.model.DirectoryResult.fromJSON(jsonObject.optString("directoryResult")));
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