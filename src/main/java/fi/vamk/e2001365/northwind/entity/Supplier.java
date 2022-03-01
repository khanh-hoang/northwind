package fi.vamk.e2001365.northwind.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "suppliers", indexes = {
        @Index(name = "city", columnList = "city"),
        @Index(name = "zip_postal_code", columnList = "zip_postal_code"),
        @Index(name = "last_name", columnList = "last_name"),
        @Index(name = "company", columnList = "company"),
        @Index(name = "state_province", columnList = "state_province"),
        @Index(name = "first_name", columnList = "first_name")
})
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "company", length = 50)
    private java.lang.String company;

    @Column(name = "last_name", length = 50)
    private java.lang.String lastName;

    @Column(name = "first_name", length = 50)
    private java.lang.String firstName;

    @Column(name = "email_address", length = 50)
    private java.lang.String emailAddress;

    @Column(name = "job_title", length = 50)
    private java.lang.String jobTitle;

    @Column(name = "business_phone", length = 25)
    private java.lang.String businessPhone;

    @Column(name = "home_phone", length = 25)
    private java.lang.String homePhone;

    @Column(name = "mobile_phone", length = 25)
    private java.lang.String mobilePhone;

    @Column(name = "fax_number", length = 25)
    private java.lang.String faxNumber;

    @Lob
    @Column(name = "address")
    private java.lang.String address;

    @Column(name = "city", length = 50)
    private java.lang.String city;

    @Column(name = "state_province", length = 50)
    private java.lang.String stateProvince;

    @Column(name = "zip_postal_code", length = 15)
    private java.lang.String zipPostalCode;

    @Column(name = "country_region", length = 50)
    private java.lang.String countryRegion;

    @Lob
    @Column(name = "web_page")
    private java.lang.String webPage;

    @Lob
    @Column(name = "notes")
    private java.lang.String notes;

    @Column(name = "attachments")
    private byte[] attachments;

    @OneToMany(mappedBy = "supplier")
    private Set<PurchaseOrder> purchaseOrders = new LinkedHashSet<>();

    public Set<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public byte[] getAttachments() {
        return attachments;
    }

    public void setAttachments(byte[] attachments) {
        this.attachments = attachments;
    }

    public java.lang.String getNotes() {
        return notes;
    }

    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    public java.lang.String getWebPage() {
        return webPage;
    }

    public void setWebPage(java.lang.String webPage) {
        this.webPage = webPage;
    }

    public java.lang.String getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(java.lang.String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public java.lang.String getZipPostalCode() {
        return zipPostalCode;
    }

    public void setZipPostalCode(java.lang.String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }

    public java.lang.String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(java.lang.String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public java.lang.String getCity() {
        return city;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }

    public java.lang.String getAddress() {
        return address;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public java.lang.String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(java.lang.String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public java.lang.String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }

    public java.lang.String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(java.lang.String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public java.lang.String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(java.lang.String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public java.lang.String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getCompany() {
        return company;
    }

    public void setCompany(java.lang.String company) {
        this.company = company;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}