package qa.example.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DirectoryResult implements Serializable{


    private DirectoryEntity[] directoryEntity;

    public DirectoryEntity[] getDirectoryEntity(){
        return directoryEntity;
    }

    public void setDirectoryEntity(DirectoryEntity[] directoryEntity){
        this.directoryEntity = directoryEntity;
    }

    private DirectoryCategory[] directoryCategory;

    public DirectoryCategory[] getDirectoryCategory(){
        return directoryCategory;
    }

    public void setDirectoryCategory(DirectoryCategory[] directoryCategory){
        this.directoryCategory = directoryCategory;
    }

    public static DirectoryResult fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        DirectoryResult instance = new DirectoryResult();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray directoryEntityJsonArray = jsonObject.optJSONArray("directoryEntity");
            if (directoryEntityJsonArray != null) {
                DirectoryEntity[] directoryEntityArray = new DirectoryEntity[directoryEntityJsonArray.length()];
                for (int i = 0; i < directoryEntityJsonArray.length(); i++) {
                    directoryEntityArray[i] = DirectoryEntity.fromJSON(directoryEntityJsonArray.optString(i));
                }
                instance.setDirectoryEntity(directoryEntityArray);
            }
            JSONArray directoryCategoryJsonArray = jsonObject.optJSONArray("directoryCategory");
            if (directoryCategoryJsonArray != null) {
                DirectoryCategory[] directoryCategoryArray = new DirectoryCategory[directoryCategoryJsonArray.length()];
                for (int i = 0; i < directoryCategoryJsonArray.length(); i++) {
                    directoryCategoryArray[i] = DirectoryCategory.fromJSON(directoryCategoryJsonArray.optString(i));
                }
                instance.setDirectoryCategory(directoryCategoryArray);
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