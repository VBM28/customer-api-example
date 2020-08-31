package com.smartacademy.mvcpattern2.model.addcustomer;


import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


/**
 * the customer inserted into DB
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerName",
        "dateOfBirth",
        "address",
        "email",
        "phoneNo"
})

public class AddCustomer {

    /**
     * Name of the customer.
     *
     */
    @JsonProperty("customerName")
    @JsonPropertyDescription(" Name of the customer.")
    @NotNull
    @Size(min = 10,max = 30, message = "Invalid name")
    private String customerName;
    /**
     * The date of birth. Format YYYY-MM-DD.
     *
     */
    @JsonProperty("dateOfBirth")
    @JsonPropertyDescription(" The date of birth. Format YYYY-MM-DD.")
    @NotNull
    @Past
    private LocalDate dateOfBirth;
    /**
     * The customer address.
     *
     */
    @JsonProperty("address")
    @JsonPropertyDescription(" The customer address.")
    @NotEmpty
    private String address;
    /**
     * The customer email.
     *
     */
    @JsonProperty("email")
    @JsonPropertyDescription(" The customer email.")
    @NotNull
    @Size(min = 8)
    @Pattern(regexp = "^(.+)@(.+)$")
    private String email;
    /**
     * The phone number of the customer.
     *
     */
    @JsonProperty("phoneNo")
    @JsonPropertyDescription(" The phone number of the customer. ")
    private String phoneNo;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Name of the customer.
     *
     */
    @JsonProperty("customerName")
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Name of the customer.
     *
     */
    @JsonProperty("customerName")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * The date of birth. Format YYYY-MM-DD.
     *
     */
    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * The date of birth. Format YYYY-MM-DD.
     *
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * The customer address.
     *
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * The customer address.
     *
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The customer email.
     *
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * The customer email.
     *
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The phone number of the customer.
     *
     */
    @JsonProperty("phoneNo")
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * The phone number of the customer.
     *
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