package org.jahia.ajax.gwt.client.data.node;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaNodeVersion_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getUuid(org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion::uuid;
  }-*/;
  
  private static native void  setUuid(org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion::uuid = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion instance) throws SerializationException {
    setUuid(instance, streamReader.readString());
    
    com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion instance) throws SerializationException {
    streamWriter.writeString(getUuid(instance));
    
    com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion)object);
  }
  
}
