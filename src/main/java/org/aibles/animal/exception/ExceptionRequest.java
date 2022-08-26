package org.aibles.animal.exception;

import java.util.HashMap;
import java.util.Map;


public class ExceptionRequest extends RuntimeException{


  private int status;
  private String code;

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


}
