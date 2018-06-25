package qa.ooredoo.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SurveyDetails implements Serializable{


    private String questionsID;

    public String getQuestionsID(){
        return questionsID;
    }

    public void setQuestionsID(String questionsID){
        this.questionsID = questionsID;
    }

    private String surveyID;

    public String getSurveyID(){
        return surveyID;
    }

    public void setSurveyID(String surveyID){
        this.surveyID = surveyID;
    }

    private String surveyName;

    public String getSurveyName(){
        return surveyName;
    }

    public void setSurveyName(String surveyName){
        this.surveyName = surveyName;
    }

    private String englishQuestion;

    public String getEnglishQuestion(){
        return englishQuestion;
    }

    public void setEnglishQuestion(String englishQuestion){
        this.englishQuestion = englishQuestion;
    }

    private String arabicQuestion;

    public String getArabicQuestion(){
        return arabicQuestion;
    }

    public void setArabicQuestion(String arabicQuestion){
        this.arabicQuestion = arabicQuestion;
    }

    private boolean isActive;

    public boolean getIsActive(){
        return isActive;
    }

    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

    private String htmlInputType;

    public String getHtmlInputType(){
        return htmlInputType;
    }

    public void setHtmlInputType(String htmlInputType){
        this.htmlInputType = htmlInputType;
    }

    private String description_en;

    public String getDescription_en(){
        return description_en;
    }

    public void setDescription_en(String description_en){
        this.description_en = description_en;
    }

    private String description_ar;

    public String getDescription_ar(){
        return description_ar;
    }

    public void setDescription_ar(String description_ar){
        this.description_ar = description_ar;
    }

    private String customerResponse;

    public String getCustomerResponse(){
        return customerResponse;
    }

    public void setCustomerResponse(String customerResponse){
        this.customerResponse = customerResponse;
    }

    private qa.ooredoo.selfcare.sdk.backend.services.cms.SurveyAnswers[] surveyAnswerList;

    public qa.ooredoo.selfcare.sdk.backend.services.cms.SurveyAnswers[] getSurveyAnswerList(){
        return surveyAnswerList;
    }

    public void setSurveyAnswerList(qa.ooredoo.selfcare.sdk.backend.services.cms.SurveyAnswers[] surveyAnswerList){
        this.surveyAnswerList = surveyAnswerList;
    }

    private String language;

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    private String channelType;

    public String getChannelType(){
        return channelType;
    }

    public void setChannelType(String channelType){
        this.channelType = channelType;
    }

    private String transactionType;

    public String getTransactionType(){
        return transactionType;
    }

    public void setTransactionType(String transactionType){
        this.transactionType = transactionType;
    }

    public static SurveyDetails fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        SurveyDetails instance = new SurveyDetails();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setQuestionsID(jsonObject.optString("questionsID"));
            instance.setSurveyID(jsonObject.optString("surveyID"));
            instance.setSurveyName(jsonObject.optString("surveyName"));
            instance.setEnglishQuestion(jsonObject.optString("englishQuestion"));
            instance.setArabicQuestion(jsonObject.optString("arabicQuestion"));
            instance.setIsActive(jsonObject.optBoolean("isActive"));
            instance.setHtmlInputType(jsonObject.optString("htmlInputType"));
            instance.setDescription_en(jsonObject.optString("description_en"));
            instance.setDescription_ar(jsonObject.optString("description_ar"));
            instance.setCustomerResponse(jsonObject.optString("customerResponse"));
            JSONArray surveyAnswerListJsonArray = jsonObject.optJSONArray("surveyAnswerList");
            if (surveyAnswerListJsonArray != null) {
                qa.ooredoo.selfcare.sdk.backend.services.cms.SurveyAnswers[] surveyAnswerListArray = new qa.ooredoo.selfcare.sdk.backend.services.cms.SurveyAnswers[surveyAnswerListJsonArray.length()];
                for (int i = 0; i < surveyAnswerListJsonArray.length(); i++) {
                    surveyAnswerListArray[i] = qa.ooredoo.selfcare.sdk.backend.services.cms.SurveyAnswers.fromJSON(surveyAnswerListJsonArray.optString(i));
                }
                instance.setSurveyAnswerList(surveyAnswerListArray);
            }
            instance.setLanguage(jsonObject.optString("language"));
            instance.setChannelType(jsonObject.optString("channelType"));
            instance.setTransactionType(jsonObject.optString("transactionType"));
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