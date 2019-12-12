package com.ibm.dmb.creditcard.services;

import com.ibm.dmb.creditcard.model.UpdateDirectDebitsRequest;
import javax.ws.rs.core.Response;

public interface UpdateDirectDebitsI {

    public Response invoke(UpdateDirectDebitsRequest requestParams);

}
