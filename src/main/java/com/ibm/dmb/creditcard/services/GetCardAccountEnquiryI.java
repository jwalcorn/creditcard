package com.ibm.dmb.creditcard.services;

import com.ibm.dmb.creditcard.model.GetCardAccountEnquiryRequest;
import javax.ws.rs.core.Response;

public interface GetCardAccountEnquiryI {

    public Response invoke(GetCardAccountEnquiryRequest requestParams);

}
