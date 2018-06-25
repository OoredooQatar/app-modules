package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Issue implements Serializable{


    private String serviceNumber;

    public String getServiceNumber(){
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber){
        this.serviceNumber = serviceNumber;
    }

    private String productLabel;

    public String getProductLabel(){
        return productLabel;
    }

    public void setProductLabel(String productLabel){
        this.productLabel = productLabel;
    }

    private String area;

    public String getArea(){
        return area;
    }

    public void setArea(String area){
        this.area = area;
    }

    private String problem;

    public String getProblem(){
        return problem;
    }

    public void setProblem(String problem){
        this.problem = problem;
    }

    private String ticketNumber;

    public String getTicketNumber(){
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber){
        this.ticketNumber = ticketNumber;
    }

    private String ticketCreationDate;

    public String getTicketCreationDate(){
        return ticketCreationDate;
    }

    public void setTicketCreationDate(String ticketCreationDate){
        this.ticketCreationDate = ticketCreationDate;
    }

    private String ticketStatus;

    public String getTicketStatus(){
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus){
        this.ticketStatus = ticketStatus;
    }

    public static Issue fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        Issue instance = new Issue();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setServiceNumber(jsonObject.optString("serviceNumber"));
            instance.setProductLabel(jsonObject.optString("productLabel"));
            instance.setArea(jsonObject.optString("area"));
            instance.setProblem(jsonObject.optString("problem"));
            instance.setTicketNumber(jsonObject.optString("ticketNumber"));
            instance.setTicketCreationDate(jsonObject.optString("ticketCreationDate"));
            instance.setTicketStatus(jsonObject.optString("ticketStatus"));
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