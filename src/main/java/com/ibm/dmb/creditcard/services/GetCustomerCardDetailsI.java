package com.ibm.dmb.creditcard.services;

import com.ibm.dmb.creditcard.model.GetCustomerCardDetailsRequest;
import javax.ws.rs.core.Response;

public interface GetCustomerCardDetailsI {

    public Response invoke(GetCustomerCardDetailsRequest requestParams);

}
