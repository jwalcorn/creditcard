package com.ibm.dmb.creditcard.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dmb.creditcard.model.UpdateDirectDebitsTns;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class UpdateDirectDebitsInput   {
  
  private UpdateDirectDebitsTns body = null;

  /**
   **/
  public UpdateDirectDebitsInput body(UpdateDirectDebitsTns body) {
    this.body = body;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("Body")
  @NotNull
  public UpdateDirectDebitsTns getBody() {
    return body;
  }
  public void setBody(UpdateDirectDebitsTns body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDirectDebitsInput updateDirectDebitsInput = (UpdateDirectDebitsInput) o;
    return Objects.equals(body, updateDirectDebitsInput.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDirectDebitsInput {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

