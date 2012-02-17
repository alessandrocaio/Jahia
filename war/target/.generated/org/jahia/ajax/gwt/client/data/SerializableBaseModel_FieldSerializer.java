package org.jahia.ajax.gwt.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class SerializableBaseModel_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Map getBooleans(org.jahia.ajax.gwt.client.data.SerializableBaseModel instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.SerializableBaseModel::booleans;
  }-*/;
  
  private static native void  setBooleans(org.jahia.ajax.gwt.client.data.SerializableBaseModel instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.SerializableBaseModel::booleans = value;
  }-*/;
  
  private static native java.util.Map getIntegers(org.jahia.ajax.gwt.client.data.SerializableBaseModel instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.SerializableBaseModel::integers;
  }-*/;
  
  private static native void  setIntegers(org.jahia.ajax.gwt.client.data.SerializableBaseModel instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.SerializableBaseModel::integers = value;
  }-*/;
  
  private static native java.util.Map getStrings(org.jahia.ajax.gwt.client.data.SerializableBaseModel instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.SerializableBaseModel::strings;
  }-*/;
  
  private static native void  setStrings(org.jahia.ajax.gwt.client.data.SerializableBaseModel instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.SerializableBaseModel::strings = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.SerializableBaseModel instance) throws SerializationException {
    setBooleans(instance, (java.util.Map) streamReader.readObject());
    setIntegers(instance, (java.util.Map) streamReader.readObject());
    setStrings(instance, (java.util.Map) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.SerializableBaseModel instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.SerializableBaseModel();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.SerializableBaseModel instance) throws SerializationException {
    streamWriter.writeObject(getBooleans(instance));
    streamWriter.writeObject(getIntegers(instance));
    streamWriter.writeObject(getStrings(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.SerializableBaseModel_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.SerializableBaseModel_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.SerializableBaseModel)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.SerializableBaseModel_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.SerializableBaseModel)object);
  }
  
}
