package jio.System.Windows.Forms;

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
import jio.System.ComponentModel.*;
import jio.System.Windows.Forms.*;

public class Control extends Component
    implements IComponent, IDropTarget, ISynchronizeInvoke, IWin32Window, IBindableComponent {
  protected NObject javonetHandle;

  public Control() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Control");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(java.lang.String text) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Control", text);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(
      java.lang.String text,
      java.lang.Integer left,
      java.lang.Integer top,
      java.lang.Integer width,
      java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Control", text, left, top, width, height);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(Control parent, java.lang.String text) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Control", parent, text);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(
      Control parent,
      java.lang.String text,
      java.lang.Integer left,
      java.lang.Integer top,
      java.lang.Integer width,
      java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Control", parent, text, left, top, width, height);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(NObject handle) {
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
