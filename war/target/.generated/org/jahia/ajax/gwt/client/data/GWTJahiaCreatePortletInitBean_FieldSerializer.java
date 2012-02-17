package org.jahia.ajax.gwt.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaCreatePortletInitBean_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType getNodeType(org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean::nodeType;
  }-*/;
  
  private static native void  setNodeType(org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean instance, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean::nodeType = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean instance) throws SerializationException {
    setNodeType(instance, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean instance) throws SerializationException {
    streamWriter.writeObject(getNodeType(instance));
    
    org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean)object);
  }
  
}
