package RDPCrystalEDILibrary;

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
import RDPCrystalEDILibrary.*;
import jio.System.Net.*;
import jio.System.*;

public class HTTPS extends Component {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setX509CertificateFile(java.lang.String value) {
    try {
      javonetHandle.set("X509CertificateFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getX509CertificateFile() {
    try {
      return (java.lang.String) javonetHandle.get("X509CertificateFile");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setHeaders(WebHeaderCollection value) {
    try {
      javonetHandle.set("Headers", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public WebHeaderCollection getHeaders() {
    try {
      return new WebHeaderCollection((NObject) javonetHandle.get("Headers"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setUsername(java.lang.String value) {
    try {
      javonetHandle.set("Username", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getUsername() {
    try {
      return (java.lang.String) javonetHandle.get("Username");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPassword(java.lang.String value) {
    try {
      javonetHandle.set("Password", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPassword() {
    try {
      return (java.lang.String) javonetHandle.get("Password");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setHostname(java.lang.String value) {
    try {
      javonetHandle.set("Hostname", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getHostname() {
    try {
      return (java.lang.String) javonetHandle.get("Hostname");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setContentType(java.lang.String value) {
    try {
      javonetHandle.set("ContentType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getContentType() {
    try {
      return (java.lang.String) javonetHandle.get("ContentType");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public HTTPS() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("HTTPS");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "CertificateValidation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CertificateValidationDelegate handler : _CertificateValidationListeners) {
                handler.Invoke(
                    Convert(objects[0], NObject.class),
                    Convert(objects[1], CertificationEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HTTPS(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("HTTPS", container);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "CertificateValidation",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CertificateValidationDelegate handler : _CertificateValidationListeners) {
                handler.Invoke(
                    Convert(objects[0], NObject.class),
                    Convert(objects[1], CertificationEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HTTPS(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void UploadFile(java.lang.String path) {
    try {
      javonetHandle.invoke("UploadFile", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DownloadFile(java.lang.String downloadedFilePath) {
    try {
      javonetHandle.invoke("DownloadFile", downloadedFilePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<CertificateValidationDelegate> _CertificateValidationListeners =
      new java.util.ArrayList<CertificateValidationDelegate>();

  public void addCertificateValidation(CertificateValidationDelegate toAdd) {
    _CertificateValidationListeners.add(toAdd);
  }

  public void removeCertificateValidation(CertificateValidationDelegate toRemove) {
    _CertificateValidationListeners.remove(toRemove);
  }

  public interface CertificateValidationDelegate {
    public void Invoke(NObject sender, CertificationEventArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
