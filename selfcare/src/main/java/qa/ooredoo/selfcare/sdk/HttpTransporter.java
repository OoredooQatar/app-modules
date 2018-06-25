package qa.ooredoo.selfcare.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.conn.ConnectTimeoutException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;


public class HttpTransporter implements Transporter {
    //  public static String BASE_URL = "http://dev.m.ooredoo.qa/sit/";
    //  public static String BASE_URL = "http://dev.m.ooredoo.qa/uat/";
    public static String BASE_URL = BuildConfig.SERVER_URL;//"https://mobile.ooredoo.qa/faxess/";
    //public static String BASE_URL = "http://dev.m.ooredoo.qa/uat-amali/";
//    public static String BASE_URL = "http://dev.m.ooredoo.qa/api/";
//    public static String BASE_URL = "https://m.ooredoo.qa/maxess/";
//    public static String BASE_URL = "http://dev.m.ooredoo.qa/uat2/";
//    public static String BASE_URL = "http://10.23.16.111:8080/axess-csi";
//    public static String BASE_URL = "http://dev.m.ooredoo.qa/axess_b2c";
//    public static String BASE_URL = "http://m.ooredoo.qa/migs2/";
//    public static String BASE_URL = "https://preorder.ooredoo.qa/maxess/";
//    public static String BASE_URL = "https://preorder.ooredoo.qa/faxess/";
//    public static String BASE_URL = "http://dev.m.ooredoo.qa/appsd2p/";
    //    public static String BASE_URL = "https://mobile.ooredoo.qa/faxess/";
//    public static String BASE_URL = "https://mobile.ooredoo.qa/taxess/";

    // private static String BASE_URL = "http://172.18.163.95:8080/axess/";
//    public static String BASE_URL = "https://www.ooredoo.qa/maxess/";


    //////////////////////////////////////////
//    public static String BASE_URL = "http://10.23.16.110:8000/axess/";
///////////////////////////////////////////

    // public HttpTransporter(String url) {
    // this.BASE_URL = BASE_URL;
    // }

    private String versionName;
    private String INIT_API;
    private String TIMEOUT;
    private Context context;


    public HttpTransporter(Context context, String versionName, String INIT_API, String TIMEOUT) {
        this.context = context;
        this.INIT_API = INIT_API;
        this.versionName = versionName;
        this.TIMEOUT = TIMEOUT;
    }

    private static final String TAG = "HttpTransporter";

    public String dispatch(ApiRequest request) {
        try {
//            String requestToBeSent = request.toString();
//            try {
//                JSONObject req = new JSONObject(request.toString());
//                if (req.getString("operation").equalsIgnoreCase("Initialize")) {
//                    req.put("deviceID", new SecurePreferences(context).getString(Constants.DEVICE_ID_KEY, ""));
//                    req.put("deviceName", Build.MANUFACTURER);
//                    req.put("osType", "Android");
//                    req.put("osVersion", Build.VERSION.RELEASE);
//                    req.put("appLanguage", String.valueOf(Resources.getSystem().getConfiguration().locale));
//                    req.put("preferredNumber", new SecurePreferences(context).getString(Constants.PREFERRED_NUMBER_KEY, ""));
//                    req.put("tokenID", new SecurePreferences(context).getString(Constants.TOKEN_KEY, ""));
//
//
//                    req.put("isRoaming", new SecurePreferences(context).getBoolean(Constants.IS_ROAMING_KEY, false));
//                    req.put("latitude", new SecurePreferences(context).getString(Constants.LAT_KEY, ""));
//                    req.put("longitude", new SecurePreferences(context).getString(Constants.LNG_KEY, ""));
//                    req.put("location", new SecurePreferences(context).getString(Constants.LOCATION_KEY, ""));
//
//                    requestToBeSent = req.toString();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            Log.e(TAG, "dispatch: " + requestToBeSent);

            // System.println("url  " + BASE_URL);

            // HTTP connection reuse which was buggy pre-froyo
            if (Integer.parseInt(Build.VERSION.SDK) < Build.VERSION_CODES.FROYO) {
                System.setProperty("http.keepAlive", "false");
            }
            URL url = new URL(BASE_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(60000);
            conn.setReadTimeout(60000);
            conn.setDoInput(true);
            conn.setDoOutput(true);


//            HttpParams httpParams = new BasicHttpParams();
//            ConnManagerParams.setTimeout(httpParams, 60000);
//            HttpConnectionParams.setConnectionTimeout(httpParams, 60000);
//            HttpConnectionParams.setSoTimeout(httpParams, 60000);
//
//            HttpClient httpClient = new DefaultHttpClient(httpParams);

            String myVersion = Build.VERSION.RELEASE; // e.g.
            // myVersion
            // := "1.6"
            String manufacturer = Build.MANUFACTURER; // e.g. manufacturer :=
            // "Sony"
            String model = Build.MODEL; // e.g. model := "C6602"

            String USER_AGENT = "OoredooSelfCare/" + qa.ooredoo.android.Application.versionName
                    + "(Linux; Android " + myVersion + ";" + manufacturer + " "
                    + model + ")";


            // System.println(USER_AGENT);
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Content-type", "application/json");
            conn.setRequestProperty("User-Agent", USER_AGENT);

//            HttpPost httpPost = new HttpPost(BASE_URL);
//            // add header
//            httpPost.setHeader("Accept", "application/json");
//            httpPost.setHeader("Content-type", "application/json");
//            httpPost.setHeader("User-Agent", USER_AGENT);

            DataOutputStream dataOutputStream = new DataOutputStream(
                    conn.getOutputStream());
//            dataOutputStream.writeBytes(request.toString());

            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(dataOutputStream, "UTF-8"));
            writer.write(request.toString());
            writer.flush();
            writer.close();


            dataOutputStream.close();

            conn.connect();

//            httpPost.setEntity(new ByteArrayEntity(request.toString()
//                    .getBytes()));

//            if (!NetworkUtil.isConnectingToInternet(qa.ooredoo.android.Application.application)) {
//                return "";
//            }
//            org.apache.http.HttpResponse httpResponse = httpClient.execute(httpPost);

//            StatusLine status = httpResponse.getStatusLine();
            // System.println("status >>>" + status);
            int status = conn.getResponseCode();
            String response = null;
            if (status == 200 || status == 201) {
//                HttpEntity httpEntity = httpResponse.getEntity();


                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                br.close();
                response = sb.toString();
//            Log.d("Ooredoo", BASE_URL);
                Log.e("Ooredoo", "===============================================");
                Log.e("Ooredoo", response);
                Log.e("Ooredoo", "================================================");

                int hasError = response.indexOf("operationCode\":\"1004");

                if (hasError != -1) {
                    // new HttpTransporterAsync().execute().get();
                    return null;
                }
            }
//            new SecurePreferences(this).edit().putLong("rx",rxBytes).commit();
////        Log.e(TAG, "rxBytes " + Utils.humanReadableByteCount(rxBytes,true));
//            long txBytes = TrafficStats.getTotalTxBytes();
//            new SecurePreferences(this).edit().putLong("tx",txBytes).commit();

//            long rxBytes = TrafficStats.getTotalRxBytes() - new SecurePreferences(context).getLong("rx", 0);
//            Log.e(TAG, "rxBytes " + Utils.humanReadableByteCount(rxBytes / 1000, true) + " " + request.getOperation());
//            long txBytes = TrafficStats.getTotalTxBytes() - new SecurePreferences(context).getLong("tx", 0);
//            Log.e(TAG, "txBytes " + Utils.humanReadableByteCount(txBytes / 1000, true));
//            Log.e("Ooredoo", "================================================");
//            Log.e("Ooredoo", "================================================");


            return response;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            // System.println("UnsupportedEncodingException >>>>>>> "
            // + e.getMessage());
        } catch (ClientProtocolException e) {
            e.printStackTrace();
            // System.println("Client Protocol Exception >>>>>>> "
            // + e.getMessage());
        } catch (ConnectTimeoutException e) {
            e.printStackTrace();
            //Log.e("CONN TIMEOUT EXCEPTION", e.getMessage() != null ? e.getMessage() : "error");
            Intent i = new Intent(qa.ooredoo.android.Application.TIMEOUT);
            qa.ooredoo.android.Application.application.sendBroadcast(i);
        } catch (SocketException e) {
            e.printStackTrace();
            //Log.e("SOCKET EXCEPTION", e.getMessage() != null ? e.getMessage() : "error");
            Intent i = new Intent(qa.ooredoo.android.Application.TIMEOUT);
            qa.ooredoo.android.Application.application.sendBroadcast(i);
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            //Log.e("TIMEOUT EXCEPTION", e.getMessage() != null ? e.getMessage() : "error");
            Intent i = new Intent(qa.ooredoo.android.Application.TIMEOUT);
            qa.ooredoo.android.Application.application.sendBroadcast(i);
        } catch (IOException e) {
            e.printStackTrace();
            // System.println("IOException >>>>>>> " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            //Log.e("OTHER EXCEPTIONS", e.toString());
            // System.println("Exception >>>>>>> " + e.getMessage());
        }

        return null;
    }

}
