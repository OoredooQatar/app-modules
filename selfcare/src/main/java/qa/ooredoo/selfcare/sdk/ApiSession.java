package qa.ooredoo.selfcare.sdk;

import java.io.Serializable;

import qa.ooredoo.selfcare.sdk.model.response.*;

public class ApiSession implements Serializable {

    private String sessionKey;
    private String language = "ENGLISH";

    public ApiSession(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public String sendRequest(String operation, String[] parameters) {
        ApiRequest ar = new ApiRequest(operation, parameters, sessionKey, language);
        return SessionFactory.factory().sendRequest(ar);
    }


    public AccountDetailResponse postpaidAccountDetailByUserIdentifierAndServiceIdentifier(String userIdentifier, String serviceIdentifier) {
        String response = sendRequest("PostpaidAccountDetailByUserIdentifierAndServiceIdentifier", new String[]{userIdentifier, serviceIdentifier});
        return AccountDetailResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFASendETASMS(String workOrderId, String eta, String siebelTicketFlag, String latitude, String longitude) {
        String response = sendRequest("FFASendETASMS", new String[]{workOrderId, eta, siebelTicketFlag, latitude, longitude});
        return FFAGeneralResponse.fromJSON(response);
    }

    public AuthenticationResponse b2CAuthenticate(String userId, String password) {
        String response = sendRequest("B2CAuthenticate", new String[]{userId, password});
        return AuthenticationResponse.fromJSON(response);
    }

    public AddonsListResponse retrieveSubscriptions(String serviceNumber, String serviceId) {
        String response = sendRequest("RetrieveSubscriptions", new String[]{serviceNumber, serviceId});
        return AddonsListResponse.fromJSON(response);
    }

    public RadioStationsResponse radioStations(){
        String response = sendRequest("RadioStations",new String []{});
        return RadioStationsResponse.fromJSON(response);
    }

    public InitiateLoginResponse initiateLogin(String userId) {
        String response = sendRequest("InitiateLogin", new String[]{userId});
        return InitiateLoginResponse.fromJSON(response);
    }


    public AddonsListResponse retrieveHBBOTVLandlineSubscriptions(String serviceNumber, String serviceId) {
        String response = sendRequest("RetrieveHBBOTVLandlineSubscriptions", new String[]{serviceNumber, serviceId});
        return AddonsListResponse.fromJSON(response);
    }


    public UniversalUsageResponse universalUsage(String serviceNumber) {
        String response = sendRequest("UniversalUsage", new String[]{serviceNumber});
        return UniversalUsageResponse.fromJSON(response);
    }

    public AuthenticationScoreCardResponse authenticateScoreCard(String userId, String password) {
        String response = sendRequest("AuthenticateScoreCard", new String[]{userId, password});
        return AuthenticationScoreCardResponse.fromJSON(response);
    }

    public ETRListResponse freeNumbers(String count) {
        String response = sendRequest("FreeNumbers", new String[]{count});
        return ETRListResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFAReleaseWO(String workOrderId, String woStatus, String documentContent, String rating, String xCoordinate, String yCoordinate, String siebelTicketFlag) {
        String response = sendRequest("FFAReleaseWO", new String[]{workOrderId, woStatus, documentContent, rating, xCoordinate, yCoordinate, siebelTicketFlag});
        return FFAGeneralResponse.fromJSON(response);
    }

    public AccountBillStatusResponse switchAccountToEBill(String accountNumber, String email) {
        String response = sendRequest("SwitchAccountToEBill", new String[]{accountNumber, email});
        return AccountBillStatusResponse.fromJSON(response);
    }

    public PaymentFinalizationResponse finalizePayment(String queryString, String merchTxnRef) {
        String response = sendRequest("FinalizePayment", new String[]{queryString, merchTxnRef});
        return PaymentFinalizationResponse.fromJSON(response);
    }

    public Response mBBPlanChange(String serviceId, String tariffId) {
        String response = sendRequest("MBBPlanChange", new String[]{serviceId, tariffId});
        return Response.fromJSON(response);
    }

    public AddonsListResponse postpaidSubscriptions(String serviceNumber) {
        String response = sendRequest("PostpaidSubscriptions", new String[]{serviceNumber});
        return AddonsListResponse.fromJSON(response);
    }


    public ProvisionServiceResponse provisionToOTVHBBLandlineServices(String serviceNumber, String productId, String subscriptionHandle, String tariffId, String subscribe, String keepFreePack){
        String response = sendRequest("ProvisionToOTVHBBLandlineServices",new String []{serviceNumber, productId, subscriptionHandle, tariffId, subscribe, keepFreePack});
        return ProvisionServiceResponse.fromJSON(response);
    }

    public ProductTypeResponse productType(String productName) {
        String response = sendRequest("ProductType", new String[]{productName});
        return ProductTypeResponse.fromJSON(response);
    }

    public HRPerformanceResponse hRPerformance(String email, String password) {
        String response = sendRequest("HRPerformance", new String[]{email, password});
        return HRPerformanceResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFAEventsLogger(String workOrderId, String auditEventType, String auditEventValue, String latitude, String longitude) {
        String response = sendRequest("FFAEventsLogger", new String[]{workOrderId, auditEventType, auditEventValue, latitude, longitude});
        return FFAGeneralResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFAGetWOList(String startDate, String endDate, String latitude, String longitude) {
        String response = sendRequest("FFAGetWOList", new String[]{startDate, endDate, latitude, longitude});
        return FFAGeneralResponse.fromJSON(response);
    }

    public B2CAccountBillingInfoResponse b2CAccountBillingInfo(String accountNo, String downloadDataIncluded) {
        String response = sendRequest("B2CAccountBillingInfo", new String[]{accountNo, downloadDataIncluded});
        return B2CAccountBillingInfoResponse.fromJSON(response);
    }

    public NojoomStatementDetailResponse nojoomStatementDetail(String statementId) {
        String response = sendRequest("NojoomStatementDetail", new String[]{statementId});
        return NojoomStatementDetailResponse.fromJSON(response);
    }

    public FindUserTypeResponse findUserType(String idNumber, String idType) {
        String response = sendRequest("FindUserType", new String[]{idNumber, idType});
        return FindUserTypeResponse.fromJSON(response);
    }

    public MBBBalanceResponse dCBalance(String serviceNumber) {
        String response = sendRequest("DCBalance", new String[]{serviceNumber});
        return MBBBalanceResponse.fromJSON(response);
    }

    public PromotionsResponse promotions(String category, String width) {
        String response = sendRequest("Promotions", new String[]{category, width});
        return PromotionsResponse.fromJSON(response);
    }

    public AuthenticationTokenResponse generateAuthenticationToken(String serviceNumber) {
        String response = sendRequest("GenerateAuthenticationToken", new String[]{serviceNumber});
        return AuthenticationTokenResponse.fromJSON(response);
    }

    public VerifyResponse verifyCaptcha(String captcha) {
        String response = sendRequest("VerifyCaptcha", new String[]{captcha});
        return VerifyResponse.fromJSON(response);
    }

    public AccountBillStatusResponse paperBillStatus(String accountNumber) {
        String response = sendRequest("PaperBillStatus", new String[]{accountNumber});
        return AccountBillStatusResponse.fromJSON(response);
    }



    public PaymentHistoryBySequenceNumResponse paymentHistoryBySequenceNum(String sequenceNumber, String totalAccountCount, String selectedPageNumber){
        String response = sendRequest("PaymentHistoryBySequenceNum",new String []{sequenceNumber, totalAccountCount, selectedPageNumber});
        return PaymentHistoryBySequenceNumResponse.fromJSON(response);
    }


    public SendEmailResponse paymentHistorySendPdfEmail(String custRefOrAccountNumber, String startDate, String endDate){
        String response = sendRequest("PaymentHistorySendPdfEmail",new String []{custRefOrAccountNumber, startDate, endDate});
        return SendEmailResponse.fromJSON(response);
    }

    public PaymentHistoryResponse paymentHistoryByAccountOrService(String accountOrServiceNumber, String startDate, String endDate){
        String response = sendRequest("PaymentHistoryByAccountOrService",new String []{accountOrServiceNumber, startDate, endDate});
        return PaymentHistoryResponse.fromJSON(response);
    }

    public Response setAppEnv(String updatingTokenId, String deviceId, String tokenId, String isRoaming, String preferredNumber, String currentNetwork, String locationName, String latitude, String longitude) {
        String response = sendRequest("SetAppEnv", new String[]{updatingTokenId, deviceId, tokenId, isRoaming, preferredNumber, currentNetwork, locationName, latitude, longitude});
        return Response.fromJSON(response);
    }

    public EnquireAppointmentResponse enquireAppointment(String storeId, String appointmentId) {
        String response = sendRequest("EnquireAppointment", new String[]{storeId, appointmentId});
        return EnquireAppointmentResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFAActivateSTD(String workOrderId, String siebelTicketFlag, String rgID, String stbNo, String loginID, String latitude, String longitude) {
        String response = sendRequest("FFAActivateSTD", new String[]{workOrderId, siebelTicketFlag, rgID, stbNo, loginID, latitude, longitude});
        return FFAGeneralResponse.fromJSON(response);
    }

    public NeedfulThingsResponse needfulThings() {
        String response = sendRequest("NeedfulThings", new String[]{});
        return NeedfulThingsResponse.fromJSON(response);
    }

    public Response logout() {
        String response = sendRequest("Logout", new String[]{});
        return Response.fromJSON(response);
    }

    public TopUpServicesResponse topUpServices() {
        String response = sendRequest("TopUpServices", new String[]{});
        return TopUpServicesResponse.fromJSON(response);
    }

    public NojoomRewardGroupsResponse nojoomGroupsNonLoggedIn() {
        String response = sendRequest("NojoomGroupsNonLoggedIn", new String[]{});
        return NojoomRewardGroupsResponse.fromJSON(response);
    }

    public FafResponse manageFriendsAndFamily(String serviceNumber, String action, String fafNumber, String newFafNumber) {
        String response = sendRequest("ManageFriendsAndFamily", new String[]{serviceNumber, action, fafNumber, newFafNumber});
        return FafResponse.fromJSON(response);
    }

    public VerifyPinResponse verifyPin(String serviceNumber, String pin) {
        String response = sendRequest("VerifyPin", new String[]{serviceNumber, pin});
        return VerifyPinResponse.fromJSON(response);
    }

    public NojoomUpdateSubscriptionListResponse nojoomUpdateSubscriptionList(String serviceIdList, String serviceNumberList, String serviceUserList, String canCollectPointsList) {
        String response = sendRequest("NojoomUpdateSubscriptionList", new String[]{serviceIdList, serviceNumberList, serviceUserList, canCollectPointsList});
        return NojoomUpdateSubscriptionListResponse.fromJSON(response);
    }

    public RegistrationValidationResponse registrationCheckSubscriber(String serviceNumber, String idNumber, String idType, String countyCode) {
        String response = sendRequest("RegistrationCheckSubscriber", new String[]{serviceNumber, idNumber, idType, countyCode});
        return RegistrationValidationResponse.fromJSON(response);
    }

    public ForceTransactionsHistoryResponse forceTransactionsHistory(String serviceNumber, String accountNumber) {
        String response = sendRequest("ForceTransactionsHistory", new String[]{serviceNumber, accountNumber});
        return ForceTransactionsHistoryResponse.fromJSON(response);
    }

    public RegistrationValidationResponse validateNonOoredooCustomer(String qid, String birthDate, String expiryDate) {
        String response = sendRequest("ValidateNonOoredooCustomer", new String[]{qid, birthDate, expiryDate});
        return RegistrationValidationResponse.fromJSON(response);
    }

    public DigitalForceResponse deprovisionFromDigitalForce(String accountNumber, String msisdn) {
        String response = sendRequest("DeprovisionFromDigitalForce", new String[]{accountNumber, msisdn});
        return DigitalForceResponse.fromJSON(response);
    }

    public ReportIssueResponse reportIssue(String serviceNumber, String documentId, String productLabel, String area, String complaintProblem, String additionalDetails, String preferredContactMethod, String contactNumber, String email) {
        String response = sendRequest("ReportIssue", new String[]{serviceNumber, documentId, productLabel, area, complaintProblem, additionalDetails, preferredContactMethod, contactNumber, email});
        return ReportIssueResponse.fromJSON(response);
    }

    public AuthenticationResponse b2CAuthenticateByUId(String userId) {
        String response = sendRequest("B2CAuthenticateByUId", new String[]{userId});
        return AuthenticationResponse.fromJSON(response);
    }

    public DashboardUsageResponse viewUsageinDashboard(String serviceNumber, String type) {
        String response = sendRequest("ViewUsageinDashboard", new String[]{serviceNumber, type});
        return DashboardUsageResponse.fromJSON(response);
    }

    public AddonsListResponse availableForcePlans() {
        String response = sendRequest("AvailableForcePlans", new String[]{});
        return AddonsListResponse.fromJSON(response);
    }

    public Response resetPasswordWithToken(String token, String newPassword) {
        String response = sendRequest("ResetPasswordWithToken", new String[]{token, newPassword});
        return Response.fromJSON(response);
    }

    public VerifyAssociationResponse verifyAssociation(String serviceNumber, String documentId) {
        String response = sendRequest("VerifyAssociation", new String[]{serviceNumber, documentId});
        return VerifyAssociationResponse.fromJSON(response);
    }

    public IssueResponse issue(String productLabel, String productType) {
        String response = sendRequest("Issue", new String[]{productLabel, productType});
        return IssueResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFAUpdateTransparency(String workOrderId, String issueDescription, String siebelTicketFlag, String loginId, String comments, String latitude, String longitude) {
        String response = sendRequest("FFAUpdateTransparency", new String[]{workOrderId, issueDescription, siebelTicketFlag, loginId, comments, latitude, longitude});
        return FFAGeneralResponse.fromJSON(response);
    }

    public Response saveCMSRegistrationData(String data, String group, String formType) {
        String response = sendRequest("SaveCMSRegistrationData", new String[]{data, group, formType});
        return Response.fromJSON(response);
    }

    public CMSFormGroupResponse retrieveCMSFormGroups(String formType) {
        String response = sendRequest("RetrieveCMSFormGroups", new String[]{formType});
        return CMSFormGroupResponse.fromJSON(response);
    }

    public ETRListResponse searchReserveNumber(String prefix, String number) {
        String response = sendRequest("SearchReserveNumber", new String[]{prefix, number});
        return ETRListResponse.fromJSON(response);
    }

    public SubscriberQueryResponse detailedSubscriber() {
        String response = sendRequest("DetailedSubscriber", new String[]{});
        return SubscriberQueryResponse.fromJSON(response);
    }

    public ChangeTransferLimitOperationResponse changeTransferLimit(String serviceNumber, String transferLimit) {
        String response = sendRequest("ChangeTransferLimit", new String[]{serviceNumber, transferLimit});
        return ChangeTransferLimitOperationResponse.fromJSON(response);
    }

    public LastReshuffledValuesResponse lastReshuffledValues(String serviceNumber) {
        String response = sendRequest("LastReshuffledValues", new String[]{serviceNumber});
        return LastReshuffledValuesResponse.fromJSON(response);
    }

    public OoredooPassportStatusResponse ooredooPassportStatus() {
        String response = sendRequest("OoredooPassportStatus", new String[]{});
        return OoredooPassportStatusResponse.fromJSON(response);
    }

    public AuthenticationResponse authenticate(String userId, String password) {
        String response = sendRequest("Authenticate", new String[]{userId, password});
        return AuthenticationResponse.fromJSON(response);
    }

    public SubscriberQueryResponse subscriber() {
        String response = sendRequest("Subscriber", new String[]{});
        return SubscriberQueryResponse.fromJSON(response);
    }

    public ProvisionServiceResponse provisionToPostpaidService(String serviceNumber, String subscriptionHandle, String subscriptionCode) {
        String response = sendRequest("ProvisionToPostpaidService", new String[]{serviceNumber, subscriptionHandle, subscriptionCode});
        return ProvisionServiceResponse.fromJSON(response);
    }

    public Response registerSubscriberWithToken(String token, String firstName, String lastName, String companyName, String gender, String nationality, String jobTitle, String jobFunction, String language, String industryType, String industrySize, String birthDate) {
        String response = sendRequest("RegisterSubscriberWithToken", new String[]{token, firstName, lastName, companyName, gender, nationality, jobTitle, jobFunction, language, industryType, industrySize, birthDate});
        return Response.fromJSON(response);
    }

    public PaymentInitiationResponse initiatePortalPayment(String accountNumber, String amount, String idNumber, String returnUrl) {
        String response = sendRequest("InitiatePortalPayment", new String[]{accountNumber, amount, idNumber, returnUrl});
        return PaymentInitiationResponse.fromJSON(response);
    }

    public NojoomGroupRewardsResponse nojoomRewards(String awardGroupId, String awardSubGroupId) {
        String response = sendRequest("NojoomRewards", new String[]{awardGroupId, awardSubGroupId});
        return NojoomGroupRewardsResponse.fromJSON(response);
    }

    public SSMInfoResponse sSMInfo(String id) {
        String response = sendRequest("SSMInfo", new String[]{id});
        return SSMInfoResponse.fromJSON(response);
    }

    public OoredooPassportTelecomAvailabilityListResponse prepaidOoredooPassportAvailability(String serviceNumber) {
        String response = sendRequest("PrepaidOoredooPassportAvailability", new String[]{serviceNumber});
        return OoredooPassportTelecomAvailabilityListResponse.fromJSON(response);
    }

    public ETRReservationResponse reserveNumber(String serviceNumber) {
        String response = sendRequest("ReserveNumber", new String[]{serviceNumber});
        return ETRReservationResponse.fromJSON(response);
    }

    public SystemTimeResponse systemTime() {
        String response = sendRequest("SystemTime", new String[]{});
        return SystemTimeResponse.fromJSON(response);
    }

    public CheckVerificationTokenResponse checkVerificationToken(String token) {
        String response = sendRequest("CheckVerificationToken", new String[]{token});
        return CheckVerificationTokenResponse.fromJSON(response);
    }

    public RaffleResponse anyRafflesForDevice(String uuid) {
        String response = sendRequest("AnyRafflesForDevice", new String[]{uuid});
        return RaffleResponse.fromJSON(response);
    }

    public StoreListResponse storeLocations() {
        String response = sendRequest("StoreLocations", new String[]{});
        return StoreListResponse.fromJSON(response);
    }

    public TopUpResponse addToBillNonLoggedIn(String serviceNumber, String subscriptionHandle, String subscriptionCode) {
        String response = sendRequest("AddToBillNonLoggedIn", new String[]{serviceNumber, subscriptionHandle, subscriptionCode});
        return TopUpResponse.fromJSON(response);
    }

    public AuthenticationResponse authenticateForServiceNumber(String serviceNumber) {
        String response = sendRequest("AuthenticateForServiceNumber", new String[]{serviceNumber});
        return AuthenticationResponse.fromJSON(response);
    }

    public TitlesAndDescriptionsListResponse titlesAndDescriptionsUIConfig() {
        String response = sendRequest("TitlesAndDescriptionsUIConfig", new String[]{});
        return TitlesAndDescriptionsListResponse.fromJSON(response);
    }

    public RoamingDetailsResponse roamingDetails(String serviceNumber) {
        String response = sendRequest("RoamingDetails", new String[]{serviceNumber});
        return RoamingDetailsResponse.fromJSON(response);
    }

    public SubscriberQueryResponse b2CAccounts() {
        String response = sendRequest("B2CAccounts", new String[]{});
        return SubscriberQueryResponse.fromJSON(response);
    }

    public NojoomSubscriptionListResponse nojoomViewSubscriptionList() {
        String response = sendRequest("NojoomViewSubscriptionList", new String[]{});
        return NojoomSubscriptionListResponse.fromJSON(response);
    }

    public NojoomInfoResponse nojoomInfo() {
        String response = sendRequest("NojoomInfo", new String[]{});
        return NojoomInfoResponse.fromJSON(response);
    }

    public CustomerInfoResponse customerInfo(String serviceNumber, String accountNumber, String idNumber) {
        String response = sendRequest("CustomerInfo", new String[]{serviceNumber, accountNumber, idNumber});
        return CustomerInfoResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFAAuthenticate(String username, String password, String version, String latitude, String longitude) {
        String response = sendRequest("FFAAuthenticate", new String[]{username, password, version, latitude, longitude});
        return FFAGeneralResponse.fromJSON(response);
    }

    public SubscriberQueryResponse updateSubscriber(String userID, String title, String email, String city, String poBox, String notificationFlag) {
        String response = sendRequest("UpdateSubscriber", new String[]{userID, title, email, city, poBox, notificationFlag});
        return SubscriberQueryResponse.fromJSON(response);
    }

    public ETRListResponse reservedNumbers() {
        String response = sendRequest("ReservedNumbers", new String[]{});
        return ETRListResponse.fromJSON(response);
    }

    public Response authenticateStaff(String email, String password) {
        String response = sendRequest("AuthenticateStaff", new String[]{email, password});
        return Response.fromJSON(response);
    }

    public ResetPasswordResponse resetPassword(String userId, String primaryNumber, String email) {
        String response = sendRequest("ResetPassword", new String[]{userId, primaryNumber, email});
        return ResetPasswordResponse.fromJSON(response);
    }

    public AvailableOffersResponse availableOffers(String type, String serviceNumber) {
        String response = sendRequest("AvailableOffers", new String[]{type, serviceNumber});
        return AvailableOffersResponse.fromJSON(response);
    }

    public VerifyServiceNumberResponse verifyServiceNumber(String serviceNumber) {
        String response = sendRequest("VerifyServiceNumber", new String[]{serviceNumber});
        return VerifyServiceNumberResponse.fromJSON(response);
    }

    public TrackIssueResponse trackIssue(String serviceNumber, String ticketNumber) {
        String response = sendRequest("TrackIssue", new String[]{serviceNumber, ticketNumber});
        return TrackIssueResponse.fromJSON(response);
    }

    public Response sendPush(String message, String mobileNumber, String idNumber) {
        String response = sendRequest("SendPush", new String[]{message, mobileNumber, idNumber});
        return Response.fromJSON(response);
    }

    public Response checkDataCapStatus(String serviceNumber) {
        String response = sendRequest("CheckDataCapStatus", new String[]{serviceNumber});
        return Response.fromJSON(response);
    }

    public CMSFormDataResponse displayCMSRegistrationData(String group, String formType) {
        String response = sendRequest("DisplayCMSRegistrationData", new String[]{group, formType});
        return CMSFormDataResponse.fromJSON(response);
    }

    public OoredooPassportTelecomAvailabilityListResponse ooredooPassportTelecomsByCountryName(String countryName) {
        String response = sendRequest("OoredooPassportTelecomsByCountryName", new String[]{countryName});
        return OoredooPassportTelecomAvailabilityListResponse.fromJSON(response);
    }

    public PaymentInitiationResponse initiatePayment(String accountNumber, String amount, String returnUrl) {
        String response = sendRequest("InitiatePayment", new String[]{accountNumber, amount, returnUrl});
        return PaymentInitiationResponse.fromJSON(response);
    }

    public Response reserveFreeNumber(String serviceNumber, String idNumber) {
        String response = sendRequest("ReserveFreeNumber", new String[]{serviceNumber, idNumber});
        return Response.fromJSON(response);
    }

    public HalaSmartBalanceResponse halaUsage(String servicenumber) {
        String response = sendRequest("HalaUsage", new String[]{servicenumber});
        return HalaSmartBalanceResponse.fromJSON(response);
    }

    public ValidateIDResponse validateID() {
        String response = sendRequest("ValidateID", new String[]{});
        return ValidateIDResponse.fromJSON(response);
    }

    public BlockSMSResponse addToBlockedSMSList(String serviceNumber, String originator) {
        String response = sendRequest("AddToBlockedSMSList", new String[]{serviceNumber, originator});
        return BlockSMSResponse.fromJSON(response);
    }

    public RamadanPromotionResponse ramadanPromotion() {
        String response = sendRequest("RamadanPromotion", new String[]{});
        return RamadanPromotionResponse.fromJSON(response);
    }

    public ETRReservationResponse rdsReserveNumber(String serviceNumber, String qid) {
        String response = sendRequest("RdsReserveNumber", new String[]{serviceNumber, qid});
        return ETRReservationResponse.fromJSON(response);
    }

    public PrepaidKeyStatusResponse prepaidKeyStatus(String serviceNumber) {
        String response = sendRequest("PrepaidKeyStatus", new String[]{serviceNumber});
        return PrepaidKeyStatusResponse.fromJSON(response);
    }

    public Response registerSubscriber(String email, String password, String idType, String idNumber, String serviceNumber, String accountNumber, String notifyThroughEmail, String notifyThroughSMS, String firstName, String lastName, String title, String poBox) {
        String response = sendRequest("RegisterSubscriber", new String[]{email, password, idType, idNumber, serviceNumber, accountNumber, notifyThroughEmail, notifyThroughSMS, firstName, lastName, title, poBox});
        return Response.fromJSON(response);
    }

    public Response saveSurveyResults(String surveyResults) {
        String response = sendRequest("SaveSurveyResults", new String[]{surveyResults});
        return Response.fromJSON(response);
    }

    public ProductNamesResponse productNames() {
        String response = sendRequest("ProductNames", new String[]{});
        return ProductNamesResponse.fromJSON(response);
    }

    public ScoreCardYearsResponse getScoreCardYears() {
        String response = sendRequest("GetScoreCardYears", new String[]{});
        return ScoreCardYearsResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFAUpdateComments(String workOrderId, String issueDescription, String siebelTicketFlag, String loginId, String latitude, String longitude, String appointmentID, String problemStatus) {
        String response = sendRequest("FFAUpdateComments", new String[]{workOrderId, issueDescription, siebelTicketFlag, loginId, latitude, longitude, appointmentID, problemStatus});
        return FFAGeneralResponse.fromJSON(response);
    }

    public NojoomRecentActivityResponse nojoomActivityForMarathon(String idNumber) {
        String response = sendRequest("NojoomActivityForMarathon", new String[]{idNumber});
        return NojoomRecentActivityResponse.fromJSON(response);
    }

    public ETRListResponse promotedReservedNumbers() {
        String response = sendRequest("PromotedReservedNumbers", new String[]{});
        return ETRListResponse.fromJSON(response);
    }

    public NojoomEnrollResponse nojoomEnroll(String prefLanguage, String birthDate) {
        String response = sendRequest("NojoomEnroll", new String[]{prefLanguage, birthDate});
        return NojoomEnrollResponse.fromJSON(response);
    }

    public Response activateQNDOffer(String serviceNumber, String type) {
        String response = sendRequest("ActivateQNDOffer", new String[]{serviceNumber, type});
        return Response.fromJSON(response);
    }

    public OoredooPassportResponse ooredooPassportUsage(String serviceNumber) {
        String response = sendRequest("OoredooPassportUsage", new String[]{serviceNumber});
        return OoredooPassportResponse.fromJSON(response);
    }

    public Response registerOnlineSubscriber(String email, String password, String idType, String idNumber, String serviceNumber, String notifyThroughEmail, String notifyThroughSMS, String firstName, String lastName, String title, String poBox) {
        String response = sendRequest("RegisterOnlineSubscriber", new String[]{email, password, idType, idNumber, serviceNumber, notifyThroughEmail, notifyThroughSMS, firstName, lastName, title, poBox});
        return Response.fromJSON(response);
    }

    public PaymentDetailsResponse paymentsDetails(String accountNumber, String startDate, String endDate) {
        String response = sendRequest("PaymentsDetails", new String[]{accountNumber, startDate, endDate});
        return PaymentDetailsResponse.fromJSON(response);
    }

    public RegistrationValidationResponse registrationCheckUserNameAvailability(String userId) {
        String response = sendRequest("RegistrationCheckUserNameAvailability", new String[]{userId});
        return RegistrationValidationResponse.fromJSON(response);
    }

    public Response rdsSmsNotification(String smsType, String params) {
        String response = sendRequest("RdsSmsNotification", new String[]{smsType, params});
        return Response.fromJSON(response);
    }

    public MIPDetailsResponse inquireMIPDetailsOperation(String serviceNumber, String packName) {
        String response = sendRequest("InquireMIPDetailsOperation", new String[]{serviceNumber, packName});
        return MIPDetailsResponse.fromJSON(response);
    }

    public AccountDetailResponse prepaidAccountDetailByServiceNumber(String serviceNumber) {
        String response = sendRequest("PrepaidAccountDetailByServiceNumber", new String[]{serviceNumber});
        return AccountDetailResponse.fromJSON(response);
    }

    public TopUpResponse orderHalaGoCredit(String serviceNumber, String amount) {
        String response = sendRequest("OrderHalaGoCredit", new String[]{serviceNumber, amount});
        return TopUpResponse.fromJSON(response);
    }

    public ForceUsageDetailsResponse forceUsageDetails(String serviceNumber) {
        String response = sendRequest("ForceUsageDetails", new String[]{serviceNumber});
        return ForceUsageDetailsResponse.fromJSON(response);
    }

    public Response castVote(String userId, String vote) {
        String response = sendRequest("CastVote", new String[]{userId, vote});
        return Response.fromJSON(response);
    }

    public TopUpResponse halaDebit(String serviceNumber, String subscriptionHandle, String subscriptionCode) {
        String response = sendRequest("HalaDebit", new String[]{serviceNumber, subscriptionHandle, subscriptionCode});
        return TopUpResponse.fromJSON(response);
    }

    public SSMListResponse sSMLocations() {
        String response = sendRequest("SSMLocations", new String[]{});
        return SSMListResponse.fromJSON(response);
    }

    public NojoomRedemptionResponse redeemNojoomReward(String rewardId, String numberOfUnits, String serviceNumber) {
        String response = sendRequest("RedeemNojoomReward", new String[]{rewardId, numberOfUnits, serviceNumber});
        return NojoomRedemptionResponse.fromJSON(response);
    }

    public ValidateNumberGetBalanceResponse validateNumberGetBalance(String serviceNumber) {
        String response = sendRequest("ValidateNumberGetBalance", new String[]{serviceNumber});
        return ValidateNumberGetBalanceResponse.fromJSON(response);
    }

    public AddonsListResponse prepaidSubscriptions(String serviceNumber) {
        String response = sendRequest("PrepaidSubscriptions", new String[]{serviceNumber});
        return AddonsListResponse.fromJSON(response);
    }

    public PaymentInitiationResponse initiatePaymentWithBillorBalance(String serviceNumber, String subscriptionHandle, String subscriptionCode, String returnUrl) {
        String response = sendRequest("InitiatePaymentWithBillorBalance", new String[]{serviceNumber, subscriptionHandle, subscriptionCode, returnUrl});
        return PaymentInitiationResponse.fromJSON(response);
    }

    public InitiateForgetPasswordResponse forgetUserIdWithMsisdn() {
        String response = sendRequest("ForgetUserIdWithMsisdn", new String[]{});
        return InitiateForgetPasswordResponse.fromJSON(response);
    }

    public EshopPaymentInitiationResponse eshopPayment(String returnUrl, String expireUrl, String deliveryAddress, String isHomeDelivery, String isGuest, String firstName, String lastName, String emailAddress, String phnNum, String idType, String customerID){
        String response = sendRequest("EshopPayment",new String []{returnUrl, expireUrl, deliveryAddress, isHomeDelivery, isGuest, firstName, lastName, emailAddress, phnNum, idType, customerID});
        return EshopPaymentInitiationResponse.fromJSON(response);
    }
    /*public EshopPaymentInitiationResponse eshopPayment(String method, String returnUrl, String expireUrl, String deliveryAddress, String isHomeDelivery, String isGuest, String title, String firstName, String lastName, String emailAddress, String phnNum, String idType, String customerID, String pobox){
        String response = sendRequest("EshopPayment",new String []{method, returnUrl, expireUrl, deliveryAddress, isHomeDelivery, isGuest, title, firstName, lastName, emailAddress, phnNum, idType, customerID, pobox});
        return EshopPaymentInitiationResponse.fromJSON(response);
    }*/

    public PaymentFinalizationResponse finazlieEshopPayment(String dataCashReference, String transactionId){
        String response = sendRequest("FinazlieEshopPayment",new String []{dataCashReference, transactionId});
        return PaymentFinalizationResponse.fromJSON(response);
    }

    public EshopResponse manageBasket(String action, String basketId, String productId, String quantity, String isGuest){
        String response = sendRequest("ManageBasket",new String []{action, basketId, productId, quantity, isGuest});
        return EshopResponse.fromJSON(response);
    }

    public EshopResponse retrieveProducts(){
        String response = sendRequest("RetrieveProducts",new String []{});
        return EshopResponse.fromJSON(response);
    }

    public EshopResponse deliveryDetails(String deliveryMethod, String storeId, String buildingNumber, String zone, String street, String details){
        String response = sendRequest("DeliveryDetails",new String []{deliveryMethod, storeId, buildingNumber, zone, street, details});
        return EshopResponse.fromJSON(response);
    }


    public AcceptOfferResponse cancelOffer(String serviceNumber, String type, String refillID, String offerId) {
        String response = sendRequest("CancelOffer", new String[]{serviceNumber, type, refillID, offerId});
        return AcceptOfferResponse.fromJSON(response);
    }

    public ForceAddonRoamingForAllResponse forceAddonRoamingForAll(String msisdn, String actionType, String roamingValue) {
        String response = sendRequest("ForceAddonRoamingForAll", new String[]{msisdn, actionType, roamingValue});
        return ForceAddonRoamingForAllResponse.fromJSON(response);
    }

    public ETRListResponse availableNumbers(String userType, String size) {
        String response = sendRequest("AvailableNumbers", new String[]{userType, size});
        return ETRListResponse.fromJSON(response);
    }

    public ProvisionServiceResponse activateiPhoneKey(String serviceNumber) {
        String response = sendRequest("ActivateiPhoneKey", new String[]{serviceNumber});
        return ProvisionServiceResponse.fromJSON(response);
    }

    public ProductTypeValidationResponse validateServiceNumber(String serviceNumber) {
        String response = sendRequest("ValidateServiceNumber", new String[]{serviceNumber});
        return ProductTypeValidationResponse.fromJSON(response);
    }

    public VerifyDocumentIdResponse verifyDocumentId(String documentId) {
        String response = sendRequest("VerifyDocumentId", new String[]{documentId});
        return VerifyDocumentIdResponse.fromJSON(response);
    }

    public ChangePasswordResponse changePassword(String userId, String oldPassword, String newPassword) {
        String response = sendRequest("ChangePassword", new String[]{userId, oldPassword, newPassword});
        return ChangePasswordResponse.fromJSON(response);
    }

    public ForceBoostResponse activateForceBoost(String serviceNumber, String dataUnits, String localUnits, String internationalUnits, String lockedUnits, String iSKCode, String roamingData, String roamingUnits) {
        String response = sendRequest("ActivateForceBoost", new String[]{serviceNumber, dataUnits, localUnits, internationalUnits, lockedUnits, iSKCode, roamingData, roamingUnits});
        return ForceBoostResponse.fromJSON(response);
    }

    public PromotionsResponse promotionCategories() {
        String response = sendRequest("PromotionCategories", new String[]{});
        return PromotionsResponse.fromJSON(response);
    }

    public InitiateForgetPasswordResponse forgetUserIdWithEmail(String emailId, String idType, String idValue) {
        String response = sendRequest("ForgetUserIdWithEmail", new String[]{emailId, idType, idValue});
        return InitiateForgetPasswordResponse.fromJSON(response);
    }

    public ProvisionServiceResponse deprovisonFromDigitalForceAddon(String serviceNumber, String subscriptionHandle) {
        String response = sendRequest("DeprovisonFromDigitalForceAddon", new String[]{serviceNumber, subscriptionHandle});
        return ProvisionServiceResponse.fromJSON(response);
    }

    public StoreInfoResponse storeInfo(String storeId) {
        String response = sendRequest("StoreInfo", new String[]{storeId});
        return StoreInfoResponse.fromJSON(response);
    }

    public ReloadCmsResponse reloadCmsContent() {
        String response = sendRequest("ReloadCmsContent", new String[]{});
        return ReloadCmsResponse.fromJSON(response);
    }

    public Response roaming(String serviceIdentifier, String actionType) {
        String response = sendRequest("Roaming", new String[]{serviceIdentifier, actionType});
        return Response.fromJSON(response);
    }

    public CancelAppointmentResponse cancelAppointment(String storeId, String appointmentId) {
        String response = sendRequest("CancelAppointment", new String[]{storeId, appointmentId});
        return CancelAppointmentResponse.fromJSON(response);
    }

    public SendEmailResponse sendEmail(String htmlEmail) {
        String response = sendRequest("SendEmail", new String[]{htmlEmail});
        return SendEmailResponse.fromJSON(response);
    }

    public AddonsListResponse digitalForceSubscriptions(String serviceNumber) {
        String response = sendRequest("DigitalForceSubscriptions", new String[]{serviceNumber});
        return AddonsListResponse.fromJSON(response);
    }

    public ProvisionServiceResponse provisionToPrepaidService(String serviceNumber, String serviceGroup, String serviceCode) {
        String response = sendRequest("ProvisionToPrepaidService", new String[]{serviceNumber, serviceGroup, serviceCode});
        return ProvisionServiceResponse.fromJSON(response);
    }

    public FafResponse friendsAndFamilyNumbers(String serviceNumber) {
        String response = sendRequest("FriendsAndFamilyNumbers", new String[]{serviceNumber});
        return FafResponse.fromJSON(response);
    }

    public TopUpProductsResponse topUpProducts() {
        String response = sendRequest("TopUpProducts", new String[]{});
        return TopUpProductsResponse.fromJSON(response);
    }

    public SubscriberQueryResponse postpaidAccountsByUserId(String userIdOrCRN, String serviceNumberOrAccountNumber) {
        String response = sendRequest("PostpaidAccountsByUserId", new String[]{userIdOrCRN, serviceNumberOrAccountNumber});
        return SubscriberQueryResponse.fromJSON(response);
    }

    public RegistrationValidationResponse registrationCheckOtherServicesSuscriber(String accountNumber, String landlineNumber, String idNumber, String idType) {
        String response = sendRequest("RegistrationCheckOtherServicesSuscriber", new String[]{accountNumber, landlineNumber, idNumber, idType});
        return RegistrationValidationResponse.fromJSON(response);
    }

    public RamadanPrayerResponse ramadanPrayerDetails() {
        String response = sendRequest("RamadanPrayerDetails", new String[]{});
        return RamadanPrayerResponse.fromJSON(response);
    }

    public DigitalForceCountriesResponse digitalForceCountries() {
        String response = sendRequest("DigitalForceCountries", new String[]{});
        return DigitalForceCountriesResponse.fromJSON(response);
    }

    public PUKRetrievalResponse pUKRetrieval(String msisdn, String qid) {
        String response = sendRequest("PUKRetrieval", new String[]{msisdn, qid});
        return PUKRetrievalResponse.fromJSON(response);
    }

    public ETRListResponse reserveNumberPrefixes() {
        String response = sendRequest("ReserveNumberPrefixes", new String[]{});
        return ETRListResponse.fromJSON(response);
    }

    public NojoomProfileResponse nojoomProfileInfo() {
        String response = sendRequest("NojoomProfileInfo", new String[]{});
        return NojoomProfileResponse.fromJSON(response);
    }

    public PostpaidKeyStatusResponse postpaidKeyStatus(String productHandle, String serviceNumber) {
        String response = sendRequest("PostpaidKeyStatus", new String[]{productHandle, serviceNumber});
        return PostpaidKeyStatusResponse.fromJSON(response);
    }

    public FFMGeneralResponse fFMService(String operation, String nameValuePairs, String latitude, String longitude) {
        String response = sendRequest("FFMService", new String[]{operation, nameValuePairs, latitude, longitude});
        return FFMGeneralResponse.fromJSON(response);
    }

    public ProvisionServiceResponse deprovisionFromPostpaidService(String serviceNumber, String subscriptionHandle) {
        String response = sendRequest("DeprovisionFromPostpaidService", new String[]{serviceNumber, subscriptionHandle});
        return ProvisionServiceResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFAGetTransparencyDetails(String latitude, String longitude) {
        String response = sendRequest("FFAGetTransparencyDetails", new String[]{latitude, longitude});
        return FFAGeneralResponse.fromJSON(response);
    }

    public NojoomUpdateProfileResponse nojoomUpdateProfileInfo(String preferredPhoneNum, String locationCity, String gender, String birthDate, String preferredLanguage, String postalAddressLine1, String postalAddressLine2, String postalAddressLine3, String postOfficeBox, String emailAddress, String jobTitle, String hobbyInterest1, String hobbyInterest2, String hobbyInterest3, String commonTravelDest, String readingInterest, String favoriteMovieGenreID, String favoriteMallID, String consentUsSMS, String consentUsEmail, String consentUsPaper, String consentUsPointsCreditedSMS, String consentPartnerSMS, String consentPartnerEmail, String consentPartnerPaper, String qtelCallCenterMayContact, String partnerCallCenterMayContact, String receiveEStatement, String receivePostStatement) {
        String response = sendRequest("NojoomUpdateProfileInfo", new String[]{preferredPhoneNum, locationCity, gender, birthDate, preferredLanguage, postalAddressLine1, postalAddressLine2, postalAddressLine3, postOfficeBox, emailAddress, jobTitle, hobbyInterest1, hobbyInterest2, hobbyInterest3, commonTravelDest, readingInterest, favoriteMovieGenreID, favoriteMallID, consentUsSMS, consentUsEmail, consentUsPaper, consentUsPointsCreditedSMS, consentPartnerSMS, consentPartnerEmail, consentPartnerPaper, qtelCallCenterMayContact, partnerCallCenterMayContact, receiveEStatement, receivePostStatement});
        return NojoomUpdateProfileResponse.fromJSON(response);
    }

    public AccountBillStatusResponse switchAccountToPaperBill(String accountNumber) {
        String response = sendRequest("SwitchAccountToPaperBill", new String[]{accountNumber});
        return AccountBillStatusResponse.fromJSON(response);
    }

    public Response changeServiceNumberWithToken(String token, String newServiceNumber) {
        String response = sendRequest("ChangeServiceNumberWithToken", new String[]{token, newServiceNumber});
        return Response.fromJSON(response);
    }

    public SubscriberQueryResponse createSubscriber(String userID, String password, String title, String firstName, String lastName, String email, String city, String poBox, String primaryNumber, String idType, String idNumber, String idCountry, String role, String userType, String responseNotificationFlag, String userPreferenceNotificationFlag) {
        String response = sendRequest("CreateSubscriber", new String[]{userID, password, title, firstName, lastName, email, city, poBox, primaryNumber, idType, idNumber, idCountry, role, userType, responseNotificationFlag, userPreferenceNotificationFlag});
        return SubscriberQueryResponse.fromJSON(response);
    }

    public OoredooPassportDetailedResponse ooredooPassportDetailedUsage(String serviceNumber) {
        String response = sendRequest("OoredooPassportDetailedUsage", new String[]{serviceNumber});
        return OoredooPassportDetailedResponse.fromJSON(response);
    }

    public NojoomRewardGroupsResponse ooredooGroups() {
        String response = sendRequest("OoredooGroups", new String[]{});
        return NojoomRewardGroupsResponse.fromJSON(response);
    }

    public BlockSMSResponse blockedSMSList(String serviceNumber) {
        String response = sendRequest("BlockedSMSList", new String[]{serviceNumber});
        return BlockSMSResponse.fromJSON(response);
    }

    public InitiateForgetPasswordResponse initiateForgetPassword(String userId, String idType, String idValue) {
        String response = sendRequest("InitiateForgetPassword", new String[]{userId, idType, idValue});
        return InitiateForgetPasswordResponse.fromJSON(response);
    }

    public OoredooFamilyResponse ooredooFamily() {
        String response = sendRequest("OoredooFamily", new String[]{});
        return OoredooFamilyResponse.fromJSON(response);
    }

    public CallingRatesResponse callingRatesByCountry() {
        String response = sendRequest("CallingRatesByCountry", new String[]{});
        return CallingRatesResponse.fromJSON(response);
    }

    public GeneratePinResponse generatePin(String serviceNumber) {
        String response = sendRequest("GeneratePin", new String[]{serviceNumber});
        return GeneratePinResponse.fromJSON(response);
    }

    public SubscriberQueryResponse postpaidAccountsByQID(String userIdOrCRN, String serviceNumberOrAccountNumber) {
        String response = sendRequest("PostpaidAccountsByQID", new String[]{userIdOrCRN, serviceNumberOrAccountNumber});
        return SubscriberQueryResponse.fromJSON(response);
    }

    public BannersResponse banners(String width, String height) {
        String response = sendRequest("Banners", new String[]{width, height});
        return BannersResponse.fromJSON(response);
    }

    public DigitalForceResponse provisionToDigitalForce(String serviceNumber, String dataUnits, String localUnits, String internationalUnits, String lockedUnits, String iskCode, String deliveryOption, String buildingNo, String street, String zone, String productName, String pricePlan, String transactionType, String roamingData, String roamingUnits, String serviceType) {
        String response = sendRequest("ProvisionToDigitalForce", new String[]{serviceNumber, dataUnits, localUnits, internationalUnits, lockedUnits, iskCode, deliveryOption, buildingNo, street, zone, productName, pricePlan, transactionType, roamingData, roamingUnits, serviceType});
        return DigitalForceResponse.fromJSON(response);
    }

    public RaffleResponse activeRaffleWithToC() {
        String response = sendRequest("ActiveRaffleWithToC", new String[]{});
        return RaffleResponse.fromJSON(response);
    }

    public NojoomRewardGroupsResponse nojoomGroups() {
        String response = sendRequest("NojoomGroups", new String[]{});
        return NojoomRewardGroupsResponse.fromJSON(response);
    }

    public UserDetailsResponse userDetails() {
        String response = sendRequest("UserDetails", new String[]{});
        return UserDetailsResponse.fromJSON(response);
    }

    public ValidateOwnerOfNumberResponse validateOwnerOfNumber(String userIdentifier, String serviceIdentifier) {
        String response = sendRequest("ValidateOwnerOfNumber", new String[]{userIdentifier, serviceIdentifier});
        return ValidateOwnerOfNumberResponse.fromJSON(response);
    }

    public PurchaseDeviceResponse purchaseDevice(String IMEINumber, String customerName, String custIdType, String custIdNum, String amount, String cardNumber, String bankTransactionId, String txnDateTime, String eShopOrderID) {
        String response = sendRequest("PurchaseDevice", new String[]{IMEINumber, customerName, custIdType, custIdNum, amount, cardNumber, bankTransactionId, txnDateTime, eShopOrderID});
        return PurchaseDeviceResponse.fromJSON(response);
    }

    public AccountDetailResponse postpaidAccountDetailByServiceNumber(String serviceNumber) {
        String response = sendRequest("PostpaidAccountDetailByServiceNumber", new String[]{serviceNumber});
        return AccountDetailResponse.fromJSON(response);
    }

    public SubscriberQueryResponse createEbillingAccount(String userID, String accountNumber) {
        String response = sendRequest("CreateEbillingAccount", new String[]{userID, accountNumber});
        return SubscriberQueryResponse.fromJSON(response);
    }

    public ProvisionServiceResponse provisonToDigitalForceAddon(String serviceNumber, String subscriptionHandle, String subscriptionCode) {
        String response = sendRequest("ProvisonToDigitalForceAddon", new String[]{serviceNumber, subscriptionHandle, subscriptionCode});
        return ProvisionServiceResponse.fromJSON(response);
    }

    public Response cliSetup() {
        String response = sendRequest("CliSetup", new String[]{});
        return Response.fromJSON(response);
    }

    public OoredooPassportTelecomAvailabilityListResponse postpaidOoredooPassportAvailability(String serviceNumber) {
        String response = sendRequest("PostpaidOoredooPassportAvailability", new String[]{serviceNumber});
        return OoredooPassportTelecomAvailabilityListResponse.fromJSON(response);
    }

    public NojoomRecentActivityResponse nojoomRecentActivity() {
        String response = sendRequest("NojoomRecentActivity", new String[]{});
        return NojoomRecentActivityResponse.fromJSON(response);
    }

    public FIberResponse fiberFeasibility(String kahramaaId) {
        String response = sendRequest("FiberFeasibility", new String[]{kahramaaId});
        return FIberResponse.fromJSON(response);
    }

    public LabelsResponse appLabels(){
        String response = sendRequest("AppLabels",new String []{});
        return LabelsResponse.fromJSON(response);
    }

    public RetrieveMessagesResponse retrieveMessages(){
        String response = sendRequest("RetrieveMessages",new String []{});
        return RetrieveMessagesResponse.fromJSON(response);
    }

    public MBBBalanceResponse mbbBalance(String serviceNumber) {
        String response = sendRequest("MbbBalance", new String[]{serviceNumber});
        return MBBBalanceResponse.fromJSON(response);
    }

    public Response initiateRegistration(String emailId) {
        String response = sendRequest("InitiateRegistration", new String[]{emailId});
        return Response.fromJSON(response);
    }

    public BlockSMSResponse removeFromBlockedSMSList(String serviceNumber, String originator) {
        String response = sendRequest("RemoveFromBlockedSMSList", new String[]{serviceNumber, originator});
        return BlockSMSResponse.fromJSON(response);
    }

    public AuthenticationResponse authenticateByMsisdn(String serviceNumber) {
        String response = sendRequest("AuthenticateByMsisdn", new String[]{serviceNumber});
        return AuthenticationResponse.fromJSON(response);
    }

    public SurveyDetailsResponse getSurveyForChannel(String channelName) {
        String response = sendRequest("GetSurveyForChannel", new String[]{channelName});
        return SurveyDetailsResponse.fromJSON(response);
    }

    public AddonsListResponse passportCompanion(String serviceNumber) {
        String response = sendRequest("PassportCompanion", new String[]{serviceNumber});
        return AddonsListResponse.fromJSON(response);
    }

    public TopUpResponse halaDebitNonLoggedIn(String serviceNumber, String subscriptionHandle, String subscriptionCode) {
        String response = sendRequest("HalaDebitNonLoggedIn", new String[]{serviceNumber, subscriptionHandle, subscriptionCode});
        return TopUpResponse.fromJSON(response);
    }

    public FindUserTypeByUserIdResponse findUserTypeByUserId() {
        String response = sendRequest("FindUserTypeByUserId", new String[]{});
        return FindUserTypeByUserIdResponse.fromJSON(response);
    }

    public DigitalForceResponse reshuffleForce(String serviceNumber, String dataUnits, String localUnits, String internationalUnits, String lockedUnits, String iSKCode, String roamingData, String roamingUnits) {
        String response = sendRequest("ReshuffleForce", new String[]{serviceNumber, dataUnits, localUnits, internationalUnits, lockedUnits, iSKCode, roamingData, roamingUnits});
        return DigitalForceResponse.fromJSON(response);
    }

    public OoredooPassportAvailabilityListResponse ooredooPassportCountries() {
        String response = sendRequest("OoredooPassportCountries", new String[]{});
        return OoredooPassportAvailabilityListResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFAAddInstallationProduct(String workOrderId, String siebelTicketFlag, String productId, String serviceIdentifier, String latitude, String longitude) {
        String response = sendRequest("FFAAddInstallationProduct", new String[]{workOrderId, siebelTicketFlag, productId, serviceIdentifier, latitude, longitude});
        return FFAGeneralResponse.fromJSON(response);
    }

    public RetrieveBillResponse retrieveBills(String numberOfBills) {
        String response = sendRequest("RetrieveBills", new String[]{numberOfBills});
        return RetrieveBillResponse.fromJSON(response);
    }

    public InitiateForgetPasswordResponse initiateChangeServiceNumber(String userId) {
        String response = sendRequest("InitiateChangeServiceNumber", new String[]{userId});
        return InitiateForgetPasswordResponse.fromJSON(response);
    }

    public MakeAppointmentResponse makeAppointment(String storeId, String delayInSeconds, String appointmentTime, String serviceNumber) {
        String response = sendRequest("MakeAppointment", new String[]{storeId, delayInSeconds, appointmentTime, serviceNumber});
        return MakeAppointmentResponse.fromJSON(response);
    }

    public GetCustomerTypeByServiceNumberResponse getCustomerTypeByServiceNumber() {
        String response = sendRequest("GetCustomerTypeByServiceNumber", new String[]{});
        return GetCustomerTypeByServiceNumberResponse.fromJSON(response);
    }

    public RoamingCountriesListResponse roamingCountries() {
        String response = sendRequest("RoamingCountries", new String[]{});
        return RoamingCountriesListResponse.fromJSON(response);
    }

    public TopUpResponse addToBill(String serviceNumber, String subscriptionHandle, String subscriptionCode) {
        String response = sendRequest("AddToBill", new String[]{serviceNumber, subscriptionHandle, subscriptionCode});
        return TopUpResponse.fromJSON(response);
    }

    public SurveyDetailsResponse getSurveyBySurveyID(String surveyID) {
        String response = sendRequest("GetSurveyBySurveyID", new String[]{surveyID});
        return SurveyDetailsResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFAAcquireWO(String workOrderId, String siebelTicketFlag, String latitude, String longitude) {
        String response = sendRequest("FFAAcquireWO", new String[]{workOrderId, siebelTicketFlag, latitude, longitude});
        return FFAGeneralResponse.fromJSON(response);
    }

    public DawliCountriesResponse dawliEligibleCountries(String denomination) {
        String response = sendRequest("DawliEligibleCountries", new String[]{denomination});
        return DawliCountriesResponse.fromJSON(response);
    }

    public NojoomGroupRewardsResponse nojoomRewardsNonLoggedIn(String groupId) {
        String response = sendRequest("NojoomRewardsNonLoggedIn", new String[]{groupId});
        return NojoomGroupRewardsResponse.fromJSON(response);
    }

    public FFAGeneralResponse fFACloseWO(String workOrderId, String comments, String siebelTicketFlag, String appointmentID, String resolutionReason, String appointmentStatus, String appointmentOutcome, String appointmentComments, String latitude, String longitude) {
        String response = sendRequest("FFACloseWO", new String[]{workOrderId, comments, siebelTicketFlag, appointmentID, resolutionReason, appointmentStatus, appointmentOutcome, appointmentComments, latitude, longitude});
        return FFAGeneralResponse.fromJSON(response);
    }

    public PaymentInitiationResponse initiateTopup(String serviceNumber, String amount, String returnUrl) {
        String response = sendRequest("InitiateTopup", new String[]{serviceNumber, amount, returnUrl});
        return PaymentInitiationResponse.fromJSON(response);
    }

    public EshopProductResponse eshopProduct(String prodId) {
        String response = sendRequest("EshopProduct", new String[]{prodId});
        return EshopProductResponse.fromJSON(response);
    }

    public DirectoryResponse directorySearch(String key, String numberOfRecords, String recordType, String category, String nextPage) {
        String response = sendRequest("DirectorySearch", new String[]{key, numberOfRecords, recordType, category, nextPage});
        return DirectoryResponse.fromJSON(response);
    }

    public ShahryBillingResponse shahryBilling(String serviceNumber) {
        String response = sendRequest("ShahryBilling", new String[]{serviceNumber});
        return ShahryBillingResponse.fromJSON(response);
    }

    public WLLBalanceResponse wLLBalance(String serviceNumber) {
        String response = sendRequest("WLLBalance", new String[]{serviceNumber});
        return WLLBalanceResponse.fromJSON(response);
    }

    public NojoomStatementListResponse nojoomStatements() {
        String response = sendRequest("NojoomStatements", new String[]{});
        return NojoomStatementListResponse.fromJSON(response);
    }

    public EshopProductsResponse eshopProducts() {
        String response = sendRequest("EshopProducts", new String[]{});
        return EshopProductsResponse.fromJSON(response);
    }

    public IssueDetailResponse issueDetail(String issue) {
        String response = sendRequest("IssueDetail", new String[]{issue});
        return IssueDetailResponse.fromJSON(response);
    }

    public ResetPasswordResponse resetPasswordByEmailOrUserId(String userIdOrEmail, String idType, String idNumber) {
        String response = sendRequest("ResetPasswordByEmailOrUserId", new String[]{userIdOrEmail, idType, idNumber});
        return ResetPasswordResponse.fromJSON(response);
    }

    public HalaSmartBalanceResponse halaSmartBalance(String servicenumber) {
        String response = sendRequest("HalaSmartBalance", new String[]{servicenumber});
        return HalaSmartBalanceResponse.fromJSON(response);
    }

    public AcceptOfferResponse acceptOffer(String serviceNumber, String type, String refillID, String offerId) {
        String response = sendRequest("AcceptOffer", new String[]{serviceNumber, type, refillID, offerId});
        return AcceptOfferResponse.fromJSON(response);
    }

    public NojoomRecentActivityResponse nojoomActivityForPeriod(String start, String end) {
        String response = sendRequest("NojoomActivityForPeriod", new String[]{start, end});
        return NojoomRecentActivityResponse.fromJSON(response);
    }

    public NotificationResponse sendLoginNotifications() {
        String response = sendRequest("SendLoginNotifications", new String[]{});
        return NotificationResponse.fromJSON(response);
    }

    public AccountDetailResponse postpaidAccountDetailByQIDAndAccountNumber(String qid, String accountNumber) {
        String response = sendRequest("PostpaidAccountDetailByQIDAndAccountNumber", new String[]{qid, accountNumber});
        return AccountDetailResponse.fromJSON(response);
    }

    public PaymentsDownloadLinkResponse paymentsDownloadLink(String startDate, String endDate, String accountNumber) {
        String response = sendRequest("PaymentsDownloadLink", new String[]{startDate, endDate, accountNumber});
        return PaymentsDownloadLinkResponse.fromJSON(response);
    }

    public ShahryValuePackDetailResponse shahryUsage(String serviceNumber) {
        String response = sendRequest("ShahryUsage", new String[]{serviceNumber});
        return ShahryValuePackDetailResponse.fromJSON(response);
    }

    public PaymentFinalizationResponse finalizeTopup(String queryString, String merchTxnRef) {
        String response = sendRequest("FinalizeTopup", new String[]{queryString, merchTxnRef});
        return PaymentFinalizationResponse.fromJSON(response);
    }

    public RaffleResponse participateToActiveRaffle(String uuid, String name, String surname, String serviceNumber, String idNumber, String email) {
        String response = sendRequest("ParticipateToActiveRaffle", new String[]{uuid, name, surname, serviceNumber, idNumber, email});
        return RaffleResponse.fromJSON(response);
    }

    public ProvisionServiceResponse deprovisionFromPrepaidService(String serviceNumber, String serviceGroup, String serviceCode) {
        String response = sendRequest("DeprovisionFromPrepaidService", new String[]{serviceNumber, serviceGroup, serviceCode});
        return ProvisionServiceResponse.fromJSON(response);
    }

    public PaymentInitiationResponse initiateAllAccountPayment(String qidcrn, String amount, String returnUrl) {
        String response = sendRequest("InitiateAllAccountPayment", new String[]{qidcrn, amount, returnUrl});
        return PaymentInitiationResponse.fromJSON(response);
    }

    public Response barring(String serviceIdentifier, String productId) {
        String response = sendRequest("Barring", new String[]{serviceIdentifier, productId});
        return Response.fromJSON(response);
    }

    public DynamicOffersResponse retrieveOffers(String serviceNumber, String type) {
        String response = sendRequest("RetrieveOffers", new String[]{serviceNumber, type});
        return DynamicOffersResponse.fromJSON(response);
    }

    public DynamicOffersResponse redeemOffer(String sender, String type, String receiver, String dynamicOfferId) {
        String response = sendRequest("RedeemOffer", new String[]{sender, type, receiver, dynamicOfferId});
        return DynamicOffersResponse.fromJSON(response);
    }

    public DynamicOffersResponse availableOptinOffers(String serviceNumber, String type) {
        String response = sendRequest("AvailableOptinOffers", new String[]{serviceNumber, type});
        return DynamicOffersResponse.fromJSON(response);

    }
    public DynamicOffersResponse optintoOffer(String serviceNumber, String type, String sender, String offerId){
        String response = sendRequest("OptintoOffer",new String []{serviceNumber, type, sender, offerId});
        return DynamicOffersResponse.fromJSON(response);
    }
    public ShahryDashboardResponse shahryDashboard(String serviceNumber){
        String response = sendRequest("ShahryDashboard",new String []{serviceNumber});
        return ShahryDashboardResponse.fromJSON(response);
    }
    public HalaDashboardResponse halaDashboard(String serviceNumber){
        String response = sendRequest("HalaDashboard",new String []{serviceNumber});
        return HalaDashboardResponse.fromJSON(response);
    }
}