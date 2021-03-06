package com.ibm.dmb.creditcard.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dmb.creditcard.model.ErrorWithHeaderNs1;
import com.ibm.dmb.creditcard.model.GetCardAccountEnquiryResponseXsd4;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class GetCardAccountEnquiryResponseTns   {
  
  private ErrorWithHeaderNs1 exception = null;
  private GetCardAccountEnquiryResponseXsd4 response = null;

  /**
   **/
  public GetCardAccountEnquiryResponseTns exception(ErrorWithHeaderNs1 exception) {
    this.exception = exception;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exception")
  public ErrorWithHeaderNs1 getException() {
    return exception;
  }
  public void setException(ErrorWithHeaderNs1 exception) {
    this.exception = exception;
  }

  /**
   **/
  public GetCardAccountEnquiryResponseTns response(GetCardAccountEnquiryResponseXsd4 response) {
    this.response = response;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("response")
  public GetCardAccountEnquiryResponseXsd4 getResponse() {
    return response;
  }
  public void setResponse(GetCardAccountEnquiryResponseXsd4 response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCardAccountEnquiryResponseTns getCardAccountEnquiryResponseTns = (GetCardAccountEnquiryResponseTns) o;
    return Objects.equals(exception, getCardAccountEnquiryResponseTns.exception) &&
        Objects.equals(response, getCardAccountEnquiryResponseTns.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardAccountEnquiryResponseTns {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

