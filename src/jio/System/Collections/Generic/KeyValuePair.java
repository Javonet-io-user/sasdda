package jio.System.Collections.Generic;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import jio.System.*;
import jio.System.Collections.Generic.*;

public class KeyValuePair<TKey, TValue> extends ValueType {
  protected NObject javonetHandle;
  /** GetProperty */
  public TKey get_Key(Class<?> returnType) {
    try {
      return (TKey)
          Convert(
              javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Key"), returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public TValue get_Value(Class<?> returnType) {
    try {
      return (TValue)
          Convert(
              javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Value"),
              returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public KeyValuePair(TKey key, TValue value) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType(this.getClass().getName(), getGetObjectName(key), getGetObjectName(value))
              .create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public KeyValuePair(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      return (java.lang.String) javonetHandle.invoke("ToString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
