package com.smartacademy.mvcpattern2.model.updatecustomer;

import com.fasterxml.jackson.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


/**
 * the customer updated into DB
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerId",
        "customerName",
        "dateOfBirth",
        "address",
        "email",
        "phoneNo"
})
public class UpdateCustomer {

    /**
     * Customer id.
     */
    @JsonProperty("customerId")
    @JsonPropertyDescription(" Customer id.")
    private Integer customerId;
    /**
     * Name of the customer.
     */
    @JsonProperty("customerName")
    @JsonPropertyDescription(" Name of the customer.")
    private String customerName;
    /**
     * The date of birth. Format YYYY-MM-DD.
     */
    @JsonProperty("dateOfBirth")
    @JsonPropertyDescription(" The date of birth. Format YYYY-MM-DD.")
    private LocalDate dateOfBirth;
    /**
     * The customer address.
     */
    @JsonProperty("address")
    @JsonPropertyDescription(" The customer address.")
    private String address;
    /**
     * The customer email.
     */
    @JsonProperty("email")
    @JsonPropertyDescription(" The customer email.")
    private String email;
    /**
     * The phone number of the customer.
     */
    @JsonProperty("phoneNo")
    @JsonPropertyDescription(" The phone number of the customer. ")
    private String phoneNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Customer id.
     */
    @JsonProperty("customerId")
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Customer id.
     */
    @JsonProperty("customerId")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Name of the customer.
     */
    @JsonProperty("customerName")
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Name of the customer.
     */
    @JsonProperty("customerName")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * The date of birth. Format YYYY-MM-DD.
     */
    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * The date of birth. Format YYYY-MM-DD.
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * The customer address.
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * The customer address.
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The customer email.
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * The customer email.
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The phone number of the customer.
     */
    @JsonProperty("phoneNo")
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * The phone number of the customer.
     */
    @JsonProperty("phoneNo")
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
