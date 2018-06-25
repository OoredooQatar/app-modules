package qa.example.selfcare.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * User: Emre
 * Date: 17/02/14
 * Time: 15:19
 */
public class ApiRequest {

    private String operation;
    private String[] parameters;
    private String sessionKey;
    private String language;
    public static String VERSION = "2.0.0";


    public ApiRequest() {
    }

    public ApiRequest(String operation, String[] parameters, String sessionKey, String language) {
        this.operation = operation;
        this.parameters = parameters;
        this.sessionKey = sessionKey;
        this.language = language;
    }

    @Override
    public String toString() {
        JSONObject inner = new JSONObject();
        try {
            JSONArray vector = new JSONArray();
            for (int i = 0; i < parameters.length; i++) {
                vector.put(i, parameters[i]);
            }
            inner.put("operation", operation);
            inner.put("parameters", vector);
            inner.put("version", VERSION);
            inner.put("sessionKey", sessionKey);
            inner.put("language", language);
        } catch (JSONException ex) {
            ex.printStackTrace();
        }
        return inner.toString();

    }

    public String[] getParameters() {
        return parameters;
    }

    public void setParameters(String[] parameters) {
        this.parameters = parameters;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String method) {
        this.operation = method;
    }

}
