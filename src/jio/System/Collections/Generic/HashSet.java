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
import jio.System.Collections.Generic.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;
import jio.System.Collections.*;

public class HashSet<T>
    implements jio.System.Collections.IEnumerable, ISerializable, IDeserializationCallback {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getCount() {
    try {
      return javonetHandle.get("Count");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEqualityComparer<T> getComparer() {
    try {
      return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Comparer"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public HashSet() {
    try {
      javonetHandle = Javonet.New("HashSet");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HashSet(java.lang.Integer capacity) {
    try {
      javonetHandle = Javonet.New("HashSet", capacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HashSet(jio.System.Collections.Generic.IEqualityComparer<T> comparer) {
    try {
      javonetHandle = Javonet.New("HashSet", comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HashSet(jio.System.Collections.Generic.IEnumerable<T> collection) {
    try {
      javonetHandle = Javonet.New("HashSet", collection);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HashSet(
      jio.System.Collections.Generic.IEnumerable<T> collection,
      jio.System.Collections.Generic.IEqualityComparer<T> comparer) {
    try {
      javonetHandle = Javonet.New("HashSet", collection, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HashSet(
      java.lang.Integer capacity, jio.System.Collections.Generic.IEqualityComparer<T> comparer) {
    try {
      javonetHandle = Javonet.New("HashSet", capacity, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HashSet(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Contains(T item) {
    try {
      return javonetHandle.generic(getGetObjectName(item)).invoke("Contains", item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(T[] array, java.lang.Integer arrayIndex) {
    try {
      javonetHandle
          .generic(getGetObjectName(array))
          .invoke("CopyTo", new Object[] {array}, arrayIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Remove(T item) {
    try {
      return javonetHandle.generic(getGetObjectName(item)).invoke("Remove", item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public Enumerator<T> GetEnumerator() {
    try {
      return javonetHandle.invoke("GetEnumerator");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle.invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void OnDeserialization(NObject sender) {
    try {
      javonetHandle.invoke("OnDeserialization", sender);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Add(T item) {
    try {
      return javonetHandle.generic(getGetObjectName(item)).invoke("Add", item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean TryGetValue(T equalValue, T actualValue) {
    try {
      return javonetHandle
          .generic(getGetObjectName(equalValue), getGetObjectName(actualValue))
          .invoke("TryGetValue", equalValue, actualValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void UnionWith(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      javonetHandle.invoke("UnionWith", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IntersectWith(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      javonetHandle.invoke("IntersectWith", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ExceptWith(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      javonetHandle.invoke("ExceptWith", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SymmetricExceptWith(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      javonetHandle.invoke("SymmetricExceptWith", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IsSubsetOf(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      return javonetHandle.invoke("IsSubsetOf", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsProperSubsetOf(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      return javonetHandle.invoke("IsProperSubsetOf", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsSupersetOf(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      return javonetHandle.invoke("IsSupersetOf", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsProperSupersetOf(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      return javonetHandle.invoke("IsProperSupersetOf", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean Overlaps(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      return javonetHandle.invoke("Overlaps", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean SetEquals(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      return javonetHandle.invoke("SetEquals", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(T[] array) {
    try {
      javonetHandle.generic(getGetObjectName(array)).invoke("CopyTo", new Object[] {array});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CopyTo(T[] array, java.lang.Integer arrayIndex, java.lang.Integer count) {
    try {
      javonetHandle
          .generic(getGetObjectName(array))
          .invoke("CopyTo", new Object[] {array}, arrayIndex, count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer RemoveWhere(Predicate<T> match) {
    try {
      return javonetHandle.invoke("RemoveWhere", match);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void TrimExcess() {
    try {
      javonetHandle.invoke("TrimExcess");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static <T>
      jio.System.Collections.Generic.IEqualityComparer<HashSet<T>> CreateSetComparer() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) Javonet.getType("HashSet").invoke("CreateSetComparer"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.invoke("IEnumerable_GetEnumerator"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public static class Enumerator<T> extends ValueType
      implements IDisposable, jio.System.Collections.IEnumerator {
    protected NObject javonetHandle;
    /** GetProperty */
    public T get_Current(Class<?> returnType) {
      try {
        return (T)
            Convert(
                javonetHandle.generic(getReturnObjectName(returnType)).invoke("get_Current"),
                returnType);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public Enumerator(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public void Dispose() {
      try {
        javonetHandle.invoke("Dispose");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public java.lang.Boolean MoveNext() {
      try {
        return javonetHandle.invoke("MoveNext");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public NObject get_Current() {
      try {
        return (NObject) javonetHandle.invoke("get_Current");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void Reset() {
      try {
        javonetHandle.invoke("Reset");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
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
