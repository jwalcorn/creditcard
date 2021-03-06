package com.ibm.dmb.creditcard.api.impl;

import com.ibm.dmb.creditcard.api.*;
import com.ibm.dmb.creditcard.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import com.ibm.dmb.creditcard.model.CreateCardTransactionFault;
import com.ibm.dmb.creditcard.model.CreateCardTransactionInput;
import com.ibm.dmb.creditcard.model.CreateCardTransactionOutput;
import com.ibm.dmb.creditcard.model.GetCardAccountEnquiryFault;
import com.ibm.dmb.creditcard.model.GetCardAccountEnquiryOutput;
import com.ibm.dmb.creditcard.model.GetCustomerCardDetailsFault;
import com.ibm.dmb.creditcard.model.GetCustomerCardDetailsOutput;
import com.ibm.dmb.creditcard.model.UpdateDirectDebitsFault;
import com.ibm.dmb.creditcard.model.UpdateDirectDebitsInput;
import com.ibm.dmb.creditcard.model.UpdateDirectDebitsOutput;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-12-12T21:53:53.158Z")
public class CardsApiServiceImpl implements CardsApiService {
      @Override
      public Response createCardTransaction(CreateCardTransactionInput body, String branchId, String financialInstitution, String journeyId, String lang, String originUserId, String providerLogin, String providerPassword, String timeStamp, String correlationId, String key, String originChannelId, String originDeptId, String originEmployeeId, String originSourceId, String originTerminalId, String value, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getCardAccountEnquiry(String accountId, String branchId, String financialInstitution, String journeyId, String lang, String originUserId, String providerLogin, String providerPassword, String timeStamp, String cif, String correlationId, String key, String originChannelId, String originDeptId, String originEmployeeId, String originSourceId, String originTerminalId, String value, String cutOffDate, String cardNumber, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getCustomerCardDetails(String branchId, String financialInstitution, String journeyId, String lang, String originUserId, String providerLogin, String providerPassword, String timeStamp, String cif, String legalId, String correlationId, String key, String originChannelId, String originDeptId, String originEmployeeId, String originSourceId, String originTerminalId, String value, String accountNumber, String cardNumber, String cardStatus, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response updateDirectDebits(String branchId, String financialInstitution, String journeyId, String lang, String originUserId, String providerLogin, String providerPassword, String timeStamp, UpdateDirectDebitsInput body, String correlationId, String key, String originChannelId, String originDeptId, String originEmployeeId, String originSourceId, String originTerminalId, String value, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
