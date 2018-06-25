package qa.example.selfcare.sdk;

import java.io.Serializable;

/**
 * User: Emre
 * Date: 17/02/14
 * Time: 15:19
 */
public interface Transporter extends Serializable{

    public String dispatch(ApiRequest request);

}
