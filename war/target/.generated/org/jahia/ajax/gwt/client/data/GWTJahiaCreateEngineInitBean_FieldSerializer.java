package org.jahia.ajax.gwt.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaCreateEngineInitBean_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL getAcl(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::acl;
  }-*/;
  
  private static native void  setAcl(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::acl = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.GWTJahiaLanguage getCurrentLocale(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::currentLocale;
  }-*/;
  
  private static native void  setCurrentLocale(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance, org.jahia.ajax.gwt.client.data.GWTJahiaLanguage value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::currentLocale = value;
  }-*/;
  
  private static native java.lang.String getDefaultLanguageCode(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::defaultLanguageCode;
  }-*/;
  
  private static native void  setDefaultLanguageCode(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::defaultLanguageCode = value;
  }-*/;
  
  private static native java.lang.String getDefaultName(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::defaultName;
  }-*/;
  
  private static native void  setDefaultName(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::defaultName = value;
  }-*/;
  
  private static native java.util.Map getInitializers(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::initializers;
  }-*/;
  
  private static native void  setInitializers(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::initializers = value;
  }-*/;
  
  private static native java.util.List getLanguages(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::languages;
  }-*/;
  
  private static native void  setLanguages(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::languages = value;
  }-*/;
  
  private static native java.util.List getMixin(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::mixin;
  }-*/;
  
  private static native void  setMixin(org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::mixin = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance) throws SerializationException {
    setAcl(instance, (org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL) streamReader.readObject());
    setCurrentLocale(instance, (org.jahia.ajax.gwt.client.data.GWTJahiaLanguage) streamReader.readObject());
    setDefaultLanguageCode(instance, streamReader.readString());
    setDefaultName(instance, streamReader.readString());
    setInitializers(instance, (java.util.Map) streamReader.readObject());
    setLanguages(instance, (java.util.List) streamReader.readObject());
    setMixin(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean instance) throws SerializationException {
    streamWriter.writeObject(getAcl(instance));
    streamWriter.writeObject(getCurrentLocale(instance));
    streamWriter.writeString(getDefaultLanguageCode(instance));
    streamWriter.writeString(getDefaultName(instance));
    streamWriter.writeObject(getInitializers(instance));
    streamWriter.writeObject(getLanguages(instance));
    streamWriter.writeObject(getMixin(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean)object);
  }
  
}
