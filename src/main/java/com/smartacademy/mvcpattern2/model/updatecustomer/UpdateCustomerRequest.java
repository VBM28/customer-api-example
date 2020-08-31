package com.smartacademy.mvcpattern2.model.updatecustomer;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * updateCustomerReq
 * <p>
 * update a customer structure in DB.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customer"
})

public class UpdateCustomerRequest {

    /**
     * the customer updated into DB
     */
    @JsonProperty("customer")
    @JsonPropertyDescription(" the customer updated into DB")
    private UpdateCustomer customer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * the customer updated into DB
     */
    @JsonProperty("customer")
    public UpdateCustomer getCustomer() {
        return customer;
    }

    /**
     * the customer updated into DB
     */
    @JsonProperty("customer")
    public void setCustomer(UpdateCustomer customer) {
        this.customer = customer;
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