package jio.System.Drawing;

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
import jio.System.Drawing.*;
import jio.System.Drawing.Text.*;

public class FontFamily extends MarshalByRefObject implements IDisposable {
  protected NObject javonetHandle;

  public FontFamily(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("FontFamily", name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FontFamily(java.lang.String name, FontCollection fontCollection) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("FontFamily", name, fontCollection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FontFamily(GenericFontFamilies genericFamily) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("FontFamily", NEnum.fromJavaEnum(genericFamily));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FontFamily(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
