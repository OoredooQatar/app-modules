package qa.ooredoo.selfcare.sdk;

import android.util.Log;


/**
 * User: Emre
 * Date: 24/02/14
 * Time: 21:22
 */
public class SessionFactory {

    private String apiKey;
    private Transporter transporter;
    private static volatile boolean initialized = false;

    private static SessionFactory instance;
    private static final String TAG = "SessionFactory";

    public static SessionFactory factory() {
        if (!initialized) {
            throw new IllegalStateException("SessionFactory not initialized");
        }
        return instance;
    }

    private SessionFactory(String apiKey, Transporter transporter) {
        this.apiKey = apiKey;
        this.transporter = transporter;
    }

    public String sendRequest(ApiRequest ar) {
        Log.e(TAG, "sendRequest: " + ar.toString());

        return transporter.dispatch(ar);
    }

    public ApiSession newSession(String language) {
        String[] parameters = new String[]{apiKey};

        ApiRequest ar = new ApiRequest("Initialize", parameters, null, language);

        Log.e(TAG, "sendRequest: " + ar.toString());

        String response = transporter.dispatch(ar);
        if (response != null) {
            return new ApiSession(response);
        }
        return new ApiSession("");
    }

    public static void init(String _apiKey, Transporter _transporter) {
        instance = new SessionFactory(_apiKey, _transporter);
        initialized = true;
    }
}
