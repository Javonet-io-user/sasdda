package RDPCrystalEDILibrary.Rules;

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
import RDPCrystalEDILibrary.Rules.*;

public class GeneralSelfRule extends Node {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setSymbol(java.lang.String value) {
    try {
      javonetHandle.set("Symbol", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSymbol() {
    try {
      return (java.lang.String) javonetHandle.get("Symbol");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIfStatement(IfStatement value) {
    try {
      javonetHandle.set("IfStatement", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public IfStatement getIfStatement() {
    try {
      return new IfStatement((NObject) javonetHandle.get("IfStatement"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public GeneralSelfRule(java.lang.String text, java.lang.Integer depth) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("GeneralSelfRule", text, depth);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GeneralSelfRule(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String ToRuleString() {
    try {
      return (java.lang.String) javonetHandle.invoke("ToRuleString");
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
