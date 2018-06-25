package qa.example.selfcare.sdk.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DirectoryEntity implements Serializable{


    private String fax;

    public String getFax(){
        return fax;
    }

    public void setFax(String fax){
        this.fax = fax;
    }

    private DirectoryEntity[] children;

    public DirectoryEntity[] getChildren(){
        return children;
    }

    public void setChildren(DirectoryEntity[] children){
        this.children = children;
    }

    private String listingType;

    public String getListingType(){
        return listingType;
    }

    public void setListingType(String listingType){
        this.listingType = listingType;
    }

    private String index;

    public String getIndex(){
        return index;
    }

    public void setIndex(String index){
        this.index = index;
    }

    private String familyNameAR;

    public String getFamilyNameAR(){
        return familyNameAR;
    }

    public void setFamilyNameAR(String familyNameAR){
        this.familyNameAR = familyNameAR;
    }

    private String firstNameAR;

    public String getFirstNameAR(){
        return firstNameAR;
    }

    public void setFirstNameAR(String firstNameAR){
        this.firstNameAR = firstNameAR;
    }

    private String secondNameAR;

    public String getSecondNameAR(){
        return secondNameAR;
    }

    public void setSecondNameAR(String secondNameAR){
        this.secondNameAR = secondNameAR;
    }

    private String thirdNameAR;

    public String getThirdNameAR(){
        return thirdNameAR;
    }

    public void setThirdNameAR(String thirdNameAR){
        this.thirdNameAR = thirdNameAR;
    }

    private String fourthNameAR;

    public String getFourthNameAR(){
        return fourthNameAR;
    }

    public void setFourthNameAR(String fourthNameAR){
        this.fourthNameAR = fourthNameAR;
    }

    private String familyNameEN;

    public String getFamilyNameEN(){
        return familyNameEN;
    }

    public void setFamilyNameEN(String familyNameEN){
        this.familyNameEN = familyNameEN;
    }

    private String firstNameEN;

    public String getFirstNameEN(){
        return firstNameEN;
    }

    public void setFirstNameEN(String firstNameEN){
        this.firstNameEN = firstNameEN;
    }

    private String secondNameEN;

    public String getSecondNameEN(){
        return secondNameEN;
    }

    public void setSecondNameEN(String secondNameEN){
        this.secondNameEN = secondNameEN;
    }

    private String thirdNameEN;

    public String getThirdNameEN(){
        return thirdNameEN;
    }

    public void setThirdNameEN(String thirdNameEN){
        this.thirdNameEN = thirdNameEN;
    }

    private String fourthNameEN;

    public String getFourthNameEN(){
        return fourthNameEN;
    }

    public void setFourthNameEN(String fourthNameEN){
        this.fourthNameEN = fourthNameEN;
    }

    private String streetNameAR;

    public String getStreetNameAR(){
        return streetNameAR;
    }

    public void setStreetNameAR(String streetNameAR){
        this.streetNameAR = streetNameAR;
    }

    private String streetNameEN;

    public String getStreetNameEN(){
        return streetNameEN;
    }

    public void setStreetNameEN(String streetNameEN){
        this.streetNameEN = streetNameEN;
    }

    private String postBox;

    public String getPostBox(){
        return postBox;
    }

    public void setPostBox(String postBox){
        this.postBox = postBox;
    }

    private String zipCode;

    public String getZipCode(){
        return zipCode;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    private String localityNameAR;

    public String getLocalityNameAR(){
        return localityNameAR;
    }

    public void setLocalityNameAR(String localityNameAR){
        this.localityNameAR = localityNameAR;
    }

    private String localityNameEN;

    public String getLocalityNameEN(){
        return localityNameEN;
    }

    public void setLocalityNameEN(String localityNameEN){
        this.localityNameEN = localityNameEN;
    }

    private String areaZoneEN;

    public String getAreaZoneEN(){
        return areaZoneEN;
    }

    public void setAreaZoneEN(String areaZoneEN){
        this.areaZoneEN = areaZoneEN;
    }

    private String areaZoneAR;

    public String getAreaZoneAR(){
        return areaZoneAR;
    }

    public void setAreaZoneAR(String areaZoneAR){
        this.areaZoneAR = areaZoneAR;
    }

    private String stateNameAR;

    public String getStateNameAR(){
        return stateNameAR;
    }

    public void setStateNameAR(String stateNameAR){
        this.stateNameAR = stateNameAR;
    }

    private String stateNameEN;

    public String getStateNameEN(){
        return stateNameEN;
    }

    public void setStateNameEN(String stateNameEN){
        this.stateNameEN = stateNameEN;
    }

    private String telephone;

    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    private String telephoneExtension;

    public String getTelephoneExtension(){
        return telephoneExtension;
    }

    public void setTelephoneExtension(String telephoneExtension){
        this.telephoneExtension = telephoneExtension;
    }

    private String countryCode;

    public String getCountryCode(){
        return countryCode;
    }

    public void setCountryCode(String countryCode){
        this.countryCode = countryCode;
    }

    private String areaCode;

    public String getAreaCode(){
        return areaCode;
    }

    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }

    private String houseNumber;

    public String getHouseNumber(){
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber){
        this.houseNumber = houseNumber;
    }

    private String buildingInfo;

    public String getBuildingInfo(){
        return buildingInfo;
    }

    public void setBuildingInfo(String buildingInfo){
        this.buildingInfo = buildingInfo;
    }

    private String additionalInfo;

    public String getAdditionalInfo(){
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo){
        this.additionalInfo = additionalInfo;
    }

    private String freeText;

    public String getFreeText(){
        return freeText;
    }

    public void setFreeText(String freeText){
        this.freeText = freeText;
    }

    private String freeTextAR;

    public String getFreeTextAR(){
        return freeTextAR;
    }

    public void setFreeTextAR(String freeTextAR){
        this.freeTextAR = freeTextAR;
    }

    private String freeTextEN;

    public String getFreeTextEN(){
        return freeTextEN;
    }

    public void setFreeTextEN(String freeTextEN){
        this.freeTextEN = freeTextEN;
    }

    private String email;

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    private String url;

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    private String legalForm;

    public String getLegalForm(){
        return legalForm;
    }

    public void setLegalForm(String legalForm){
        this.legalForm = legalForm;
    }

    private String organisationNumber;

    public String getOrganisationNumber(){
        return organisationNumber;
    }

    public void setOrganisationNumber(String organisationNumber){
        this.organisationNumber = organisationNumber;
    }

    private String directiveTextEN;

    public String getDirectiveTextEN(){
        return directiveTextEN;
    }

    public void setDirectiveTextEN(String directiveTextEN){
        this.directiveTextEN = directiveTextEN;
    }

    private String directiveTextAR;

    public String getDirectiveTextAR(){
        return directiveTextAR;
    }

    public void setDirectiveTextAR(String directiveTextAR){
        this.directiveTextAR = directiveTextAR;
    }

    private String secretValues;

    public String getSecretValues(){
        return secretValues;
    }

    public void setSecretValues(String secretValues){
        this.secretValues = secretValues;
    }

    private String externalID;

    public String getExternalID(){
        return externalID;
    }

    public void setExternalID(String externalID){
        this.externalID = externalID;
    }

    private String mainCategoryEN;

    public String getMainCategoryEN(){
        return mainCategoryEN;
    }

    public void setMainCategoryEN(String mainCategoryEN){
        this.mainCategoryEN = mainCategoryEN;
    }

    private String categoriesEN;

    public String getCategoriesEN(){
        return categoriesEN;
    }

    public void setCategoriesEN(String categoriesEN){
        this.categoriesEN = categoriesEN;
    }

    private String mainCategoryAR;

    public String getMainCategoryAR(){
        return mainCategoryAR;
    }

    public void setMainCategoryAR(String mainCategoryAR){
        this.mainCategoryAR = mainCategoryAR;
    }

    private String categoriesAR;

    public String getCategoriesAR(){
        return categoriesAR;
    }

    public void setCategoriesAR(String categoriesAR){
        this.categoriesAR = categoriesAR;
    }

    private String customerNo;

    public String getCustomerNo(){
        return customerNo;
    }

    public void setCustomerNo(String customerNo){
        this.customerNo = customerNo;
    }

    private String logoLink;

    public String getLogoLink(){
        return logoLink;
    }

    public void setLogoLink(String logoLink){
        this.logoLink = logoLink;
    }

    private String familyName;

    public String getFamilyName(){
        return familyName;
    }

    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }

    public static DirectoryEntity fromJSON(String jsonString){
        if(jsonString == null || jsonString.length() < 1) return null;
        DirectoryEntity instance = new DirectoryEntity();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            instance.setFax(jsonObject.optString("fax"));
            JSONArray childrenJsonArray = jsonObject.optJSONArray("children");
            if (childrenJsonArray != null) {
                DirectoryEntity[] childrenArray = new DirectoryEntity[childrenJsonArray.length()];
                for (int i = 0; i < childrenJsonArray.length(); i++) {
                    childrenArray[i] = DirectoryEntity.fromJSON(childrenJsonArray.optString(i));
                }
                instance.setChildren(childrenArray);
            }
            instance.setListingType(jsonObject.optString("listingType"));
            instance.setIndex(jsonObject.optString("index"));
            instance.setFamilyNameAR(jsonObject.optString("familyNameAR"));
            instance.setFirstNameAR(jsonObject.optString("firstNameAR"));
            instance.setSecondNameAR(jsonObject.optString("secondNameAR"));
            instance.setThirdNameAR(jsonObject.optString("thirdNameAR"));
            instance.setFourthNameAR(jsonObject.optString("fourthNameAR"));
            instance.setFamilyNameEN(jsonObject.optString("familyNameEN"));
            instance.setFirstNameEN(jsonObject.optString("firstNameEN"));
            instance.setSecondNameEN(jsonObject.optString("secondNameEN"));
            instance.setThirdNameEN(jsonObject.optString("thirdNameEN"));
            instance.setFourthNameEN(jsonObject.optString("fourthNameEN"));
            instance.setStreetNameAR(jsonObject.optString("streetNameAR"));
            instance.setStreetNameEN(jsonObject.optString("streetNameEN"));
            instance.setPostBox(jsonObject.optString("postBox"));
            instance.setZipCode(jsonObject.optString("zipCode"));
            instance.setLocalityNameAR(jsonObject.optString("localityNameAR"));
            instance.setLocalityNameEN(jsonObject.optString("localityNameEN"));
            instance.setAreaZoneEN(jsonObject.optString("areaZoneEN"));
            instance.setAreaZoneAR(jsonObject.optString("areaZoneAR"));
            instance.setStateNameAR(jsonObject.optString("stateNameAR"));
            instance.setStateNameEN(jsonObject.optString("stateNameEN"));
            instance.setTelephone(jsonObject.optString("telephone"));
            instance.setTelephoneExtension(jsonObject.optString("telephoneExtension"));
            instance.setCountryCode(jsonObject.optString("countryCode"));
            instance.setAreaCode(jsonObject.optString("areaCode"));
            instance.setHouseNumber(jsonObject.optString("houseNumber"));
            instance.setBuildingInfo(jsonObject.optString("buildingInfo"));
            instance.setAdditionalInfo(jsonObject.optString("additionalInfo"));
            instance.setFreeText(jsonObject.optString("freeText"));
            instance.setFreeTextAR(jsonObject.optString("freeTextAR"));
            instance.setFreeTextEN(jsonObject.optString("freeTextEN"));
            instance.setEmail(jsonObject.optString("email"));
            instance.setUrl(jsonObject.optString("url"));
            instance.setLegalForm(jsonObject.optString("legalForm"));
            instance.setOrganisationNumber(jsonObject.optString("organisationNumber"));
            instance.setDirectiveTextEN(jsonObject.optString("directiveTextEN"));
            instance.setDirectiveTextAR(jsonObject.optString("directiveTextAR"));
            instance.setSecretValues(jsonObject.optString("secretValues"));
            instance.setExternalID(jsonObject.optString("externalID"));
            instance.setMainCategoryEN(jsonObject.optString("mainCategoryEN"));
            instance.setCategoriesEN(jsonObject.optString("categoriesEN"));
            instance.setMainCategoryAR(jsonObject.optString("mainCategoryAR"));
            instance.setCategoriesAR(jsonObject.optString("categoriesAR"));
            instance.setCustomerNo(jsonObject.optString("customerNo"));
            instance.setLogoLink(jsonObject.optString("logoLink"));
            instance.setFamilyName(jsonObject.optString("familyName"));
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