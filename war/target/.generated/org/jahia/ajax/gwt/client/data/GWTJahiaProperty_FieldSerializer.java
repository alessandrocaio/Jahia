package org.jahia.ajax.gwt.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaProperty_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getName(org.jahia.ajax.gwt.client.data.GWTJahiaProperty instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaProperty::name;
  }-*/;
  
  private static native void  setName(org.jahia.ajax.gwt.client.data.GWTJahiaProperty instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaProperty::name = value;
  }-*/;
  
  private static native java.lang.String getValue(org.jahia.ajax.gwt.client.data.GWTJahiaProperty instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaProperty::value;
  }-*/;
  
  private static native void  setValue(org.jahia.ajax.gwt.client.data.GWTJahiaProperty instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaProperty::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.GWTJahiaProperty instance) throws SerializationException {
    setName(instance, streamReader.readString());
    setValue(instance, streamReader.readString());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.GWTJahiaProperty instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.GWTJahiaProperty();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.GWTJahiaProperty instance) throws SerializationException {
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getValue(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.GWTJahiaProperty_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaProperty_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.GWTJahiaProperty)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaProperty_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.GWTJahiaProperty)object);
  }
  
}
