package org.jahia.ajax.gwt.client.data.node;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaPortletDefinition_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL getBaseAcl(org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition::baseAcl;
  }-*/;
  
  private static native void  setBaseAcl(org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition instance, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition::baseAcl = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition instance) throws SerializationException {
    setBaseAcl(instance, (org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL) streamReader.readObject());
    
    com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition instance) throws SerializationException {
    streamWriter.writeObject(getBaseAcl(instance));
    
    com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition)object);
  }
  
}
