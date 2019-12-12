package com.ibm.dmb.creditcard.services;

import com.ibm.dmb.creditcard.model.CreateCardTransactionRequest;
import javax.ws.rs.core.Response;

public interface CreateCardTransactionI {

    public Response invoke(CreateCardTransactionRequest requestParams);

}
