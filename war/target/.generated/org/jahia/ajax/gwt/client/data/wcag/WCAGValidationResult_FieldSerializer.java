package org.jahia.ajax.gwt.client.data.wcag;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class WCAGValidationResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getErrors(org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult::errors;
  }-*/;
  
  private static native void  setErrors(org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult::errors = value;
  }-*/;
  
  private static native java.util.List getInfos(org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult::infos;
  }-*/;
  
  private static native void  setInfos(org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult::infos = value;
  }-*/;
  
  private static native java.util.List getWarnings(org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult::warnings;
  }-*/;
  
  private static native void  setWarnings(org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult::warnings = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult instance) throws SerializationException {
    setErrors(instance, (java.util.List) streamReader.readObject());
    setInfos(instance, (java.util.List) streamReader.readObject());
    setWarnings(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult instance) throws SerializationException {
    streamWriter.writeObject(getErrors(instance));
    streamWriter.writeObject(getInfos(instance));
    streamWriter.writeObject(getWarnings(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult)object);
  }
  
}
