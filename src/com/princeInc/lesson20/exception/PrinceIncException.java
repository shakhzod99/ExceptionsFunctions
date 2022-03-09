package com.princeInc.lesson20.exception;

public class PrinceIncException extends RuntimeException {
  public PrinceIncException(String message) {
    super(message);
  }

  public PrinceIncException(Throwable cause) {
    super(cause);
  }
}
