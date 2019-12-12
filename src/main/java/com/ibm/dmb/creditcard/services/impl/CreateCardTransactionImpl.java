package com.ibm.dmb.creditcard.services.impl;
import javax.inject.Inject;
import com.ibm.dmb.creditcard.logging.LoggingUtilI;  
import com.ibm.dmb.creditcard.model.CreateCardTransactionRequest;
import com.ibm.dmb.creditcard.services.CreateCardTransactionI;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;
import org.eclipse.microprofile.metrics.annotation.Counted;

 
@RequestScoped
public class CreateCardTransactionImpl implements CreateCardTransactionI, FallbackHandler<Response> {

    @Inject
    LoggingUtilI util;
   
    @Override
	 public Response handle(ExecutionContext context){ 
 		 long startTime = util.startLog(CreateCardTransactionImpl.class.getName(), "handle"); 
		 //TODO
		 util.endLog(startTime,CreateCardTransactionImpl.class.getName(), "handle"); 
		 return null;
	 }
	@Override
    @Fallback(CreateCardTransactionImpl.class)
	@Counted
	public Response invoke(CreateCardTransactionRequest requestParams){
   		long startTime = util.startLog(CreateCardTransactionImpl.class.getName(), "invoke");
		//TODO
    	util.endLog(startTime, CreateCardTransactionImpl.class.getName(), "invoke");
		return null;
    }
              
  }
