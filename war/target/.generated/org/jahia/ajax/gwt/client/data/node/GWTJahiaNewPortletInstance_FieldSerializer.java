package org.jahia.ajax.gwt.client.data.node;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaNewPortletInstance_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition getGwtJahiaPortletDefinition(org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::gwtJahiaPortletDefinition;
  }-*/;
  
  private static native void  setGwtJahiaPortletDefinition(org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance, org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::gwtJahiaPortletDefinition = value;
  }-*/;
  
  private static native java.lang.String getInstanceName(org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::instanceName;
  }-*/;
  
  private static native void  setInstanceName(org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::instanceName = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL getModes(org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::modes;
  }-*/;
  
  private static native void  setModes(org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::modes = value;
  }-*/;
  
  private static native java.util.List getProperties(org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::properties;
  }-*/;
  
  private static native void  setProperties(org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::properties = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL getRoles(org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::roles;
  }-*/;
  
  private static native void  setRoles(org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::roles = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance) throws SerializationException {
    setGwtJahiaPortletDefinition(instance, (org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition) streamReader.readObject());
    setInstanceName(instance, streamReader.readString());
    setModes(instance, (org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL) streamReader.readObject());
    setProperties(instance, (java.util.List) streamReader.readObject());
    setRoles(instance, (org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance instance) throws SerializationException {
    streamWriter.writeObject(getGwtJahiaPortletDefinition(instance));
    streamWriter.writeString(getInstanceName(instance));
    streamWriter.writeObject(getModes(instance));
    streamWriter.writeObject(getProperties(instance));
    streamWriter.writeObject(getRoles(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance)object);
  }
  
}
