package lk.open.beanmaputils.example;

public enum ContactEnum {
    /**   cotactId ("InstallationContact:contactId"),*/
    TITLE ("InstallationContact:title"),
    BRN_NUMBER ("InstallationContact:idNumber"),
    CONTACT_MOBILE_NO ("InstallationContact:mobile"),
    CONTACT_OTHER ("InstallationContact:contactOther"),
    FAX_NUMBER ("InstallationContact:faxNumber"),
    DESIGNATION ("InstallationContact:designation"),
    EMAIL_ADDRESS ("InstallationContact:email"),
    PREFERRED_COMM_ID ("InstallationContact:commId"),
    CONTACT_TYPE ("InstallationContact:contactType"),
    REMARKS ("InstallationContact:remarks"),
    IS_DEFAULT ("InstallationContact:isDefault"),
    FIRST_NAME ("InstallationContact:firstName"),
    LAST_NAME ("InstallationContact:lastName"),
    SUBSCRIBER_SEQ_NO("InstallationContact:customerProfileId");

    /* Important Note: Must have semicolon at
     * the end when there is a enum field or method
     */
    private final String value;

    ContactEnum(String code) {
        this.value = code;
    }

    public String getValue() {
        return this.value;
    }
}
