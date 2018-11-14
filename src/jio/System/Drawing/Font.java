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
import jio.System.Runtime.Serialization.*;

public class Font extends MarshalByRefObject implements ICloneable, ISerializable, IDisposable {
  protected NObject javonetHandle;

  public Font(Font prototype, FontStyle newStyle) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Font", prototype, NEnum.fromJavaEnum(newStyle));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(FontFamily family, java.lang.Float emSize, FontStyle style, GraphicsUnit unit) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Font", family, emSize, NEnum.fromJavaEnum(style), NEnum.fromJavaEnum(unit));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(
      FontFamily family,
      java.lang.Float emSize,
      FontStyle style,
      GraphicsUnit unit,
      java.lang.Byte gdiCharSet) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Font",
              family,
              emSize,
              NEnum.fromJavaEnum(style),
              NEnum.fromJavaEnum(unit),
              gdiCharSet);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(
      FontFamily family,
      java.lang.Float emSize,
      FontStyle style,
      GraphicsUnit unit,
      java.lang.Byte gdiCharSet,
      java.lang.Boolean gdiVerticalFont) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Font",
              family,
              emSize,
              NEnum.fromJavaEnum(style),
              NEnum.fromJavaEnum(unit),
              gdiCharSet,
              gdiVerticalFont);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(
      java.lang.String familyName,
      java.lang.Float emSize,
      FontStyle style,
      GraphicsUnit unit,
      java.lang.Byte gdiCharSet) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Font",
              familyName,
              emSize,
              NEnum.fromJavaEnum(style),
              NEnum.fromJavaEnum(unit),
              gdiCharSet);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(
      java.lang.String familyName,
      java.lang.Float emSize,
      FontStyle style,
      GraphicsUnit unit,
      java.lang.Byte gdiCharSet,
      java.lang.Boolean gdiVerticalFont) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Font",
              familyName,
              emSize,
              NEnum.fromJavaEnum(style),
              NEnum.fromJavaEnum(unit),
              gdiCharSet,
              gdiVerticalFont);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(FontFamily family, java.lang.Float emSize, FontStyle style) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Font", family, emSize, NEnum.fromJavaEnum(style));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(FontFamily family, java.lang.Float emSize, GraphicsUnit unit) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Font", family, emSize, NEnum.fromJavaEnum(unit));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(FontFamily family, java.lang.Float emSize) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Font", family, emSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(
      java.lang.String familyName, java.lang.Float emSize, FontStyle style, GraphicsUnit unit) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Font", familyName, emSize, NEnum.fromJavaEnum(style), NEnum.fromJavaEnum(unit));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(java.lang.String familyName, java.lang.Float emSize, FontStyle style) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Font", familyName, emSize, NEnum.fromJavaEnum(style));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(java.lang.String familyName, java.lang.Float emSize, GraphicsUnit unit) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Font", familyName, emSize, NEnum.fromJavaEnum(unit));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(java.lang.String familyName, java.lang.Float emSize) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Font", familyName, emSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Font(NObject handle) {
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
