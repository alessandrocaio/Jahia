package org.jahia.ajax.gwt.client.data.definition;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaNodeProperty_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getMultiple(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty::multiple;
  }-*/;
  
  private static native void  setMultiple(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty::multiple = value;
  }-*/;
  
  private static native java.lang.String getName(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty::name;
  }-*/;
  
  private static native void  setName(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty::name = value;
  }-*/;
  
  private static native java.util.List getValues(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty::values;
  }-*/;
  
  private static native void  setValues(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty::values = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty instance) throws SerializationException {
    setMultiple(instance, streamReader.readBoolean());
    setName(instance, streamReader.readString());
    setValues(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty instance) throws SerializationException {
    streamWriter.writeBoolean(getMultiple(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getValues(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty)object);
  }
  
}
