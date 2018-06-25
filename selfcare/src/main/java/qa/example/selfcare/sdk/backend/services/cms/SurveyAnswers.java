package qa.example.selfcare.sdk.backend.services.cms;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SurveyAnswers implements Serializable{


    private String answersID;

    public String getAnswersID(){
        return answersID;
    }

    public void setAnswersID(String answersID){
        this.answersID = answersID;
    }

    private String questionsID;

    public String getQuestionsID(){
        return questionsID;
    }

    public void setQuestionsID(String questionsID){
        this.questionsID = questionsID;
    }

    private String englishAnswer;

    public String getEnglishAnswer(){
        return englishAnswer;
    }

    public void setEnglishAnswer(String englishAnswer){
        this.englishAnswer = englishAnswer;
    }

    private String arabicAnswer;

    public String getArabicAnswer(){
        return arabicAnswer;
    }

    public void setArabicAnswer(String arabicAnswer){
        this.arabicAnswer = arabicAnswer;
    }

    public static SurveyAnswers fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        SurveyAnswers instance = new SurveyAnswers();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setAnswersID(jsonObject.optString("answersID"));
            instance.setQuestionsID(jsonObject.optString("questionsID"));
            instance.setEnglishAnswer(jsonObject.optString("englishAnswer"));
            instance.setArabicAnswer(jsonObject.optString("arabicAnswer"));
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