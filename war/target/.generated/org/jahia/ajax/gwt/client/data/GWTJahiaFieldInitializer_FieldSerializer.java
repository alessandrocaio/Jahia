package org.jahia.ajax.gwt.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaFieldInitializer_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDefaultProperty(org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer::defaultProperty;
  }-*/;
  
  private static native void  setDefaultProperty(org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer::defaultProperty = value;
  }-*/;
  
  private static native java.util.List getDependentProperties(org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer::dependentProperties;
  }-*/;
  
  private static native void  setDependentProperties(org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer::dependentProperties = value;
  }-*/;
  
  private static native java.util.List getDisplayValues(org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer::displayValues;
  }-*/;
  
  private static native void  setDisplayValues(org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer::displayValues = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer instance) throws SerializationException {
    setDefaultProperty(instance, streamReader.readString());
    setDependentProperties(instance, (java.util.List) streamReader.readObject());
    setDisplayValues(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer instance) throws SerializationException {
    streamWriter.writeString(getDefaultProperty(instance));
    streamWriter.writeObject(getDependentProperties(instance));
    streamWriter.writeObject(getDisplayValues(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer)object);
  }
  
}
