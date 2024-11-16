package javaLU.fileIO.SoftUniEx.Serializition;

import java.io.Serializable;
import java.util.List;

public interface SerializableOnly {
    List<? extends Serializable> printMyAdress(List<? extends Serializable> a);
}
