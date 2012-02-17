package org.jahia.ajax.gwt.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaEditEngineInitBean_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL getAcl(org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::acl;
  }-*/;
  
  private static native void  setAcl(org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::acl = value;
  }-*/;
  
  private static native java.lang.String getDefaultLanguageCode(org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::defaultLanguageCode;
  }-*/;
  
  private static native void  setDefaultLanguageCode(org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::defaultLanguageCode = value;
  }-*/;
  
  private static native java.util.Map getInitializersValues(org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::initializersValues;
  }-*/;
  
  private static native void  setInitializersValues(org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::initializersValues = value;
  }-*/;
  
  private static native java.util.List getMixin(org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::mixin;
  }-*/;
  
  private static native void  setMixin(org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::mixin = value;
  }-*/;
  
  private static native java.util.Map getReferencesWarnings(org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::referencesWarnings;
  }-*/;
  
  private static native void  setReferencesWarnings(org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::referencesWarnings = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance) throws SerializationException {
    setAcl(instance, (org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL) streamReader.readObject());
    setDefaultLanguageCode(instance, streamReader.readString());
    setInitializersValues(instance, (java.util.Map) streamReader.readObject());
    setMixin(instance, (java.util.List) streamReader.readObject());
    setReferencesWarnings(instance, (java.util.Map) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean instance) throws SerializationException {
    streamWriter.writeObject(getAcl(instance));
    streamWriter.writeString(getDefaultLanguageCode(instance));
    streamWriter.writeObject(getInitializersValues(instance));
    streamWriter.writeObject(getMixin(instance));
    streamWriter.writeObject(getReferencesWarnings(instance));
    
    org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean)object);
  }
  
}
