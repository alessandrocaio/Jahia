package org.jahia.ajax.gwt.client.data.acl;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaNodeACL_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getAce(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::ace;
  }-*/;
  
  private static native void  setAce(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::ace = value;
  }-*/;
  
  private static native java.util.Map getAvailablePermissions(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::availablePermissions;
  }-*/;
  
  private static native void  setAvailablePermissions(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::availablePermissions = value;
  }-*/;
  
  private static native boolean getBreakAllInheritance(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::breakAllInheritance;
  }-*/;
  
  private static native void  setBreakAllInheritance(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::breakAllInheritance = value;
  }-*/;
  
  private static native java.util.Map getPermissionLabels(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::permissionLabels;
  }-*/;
  
  private static native void  setPermissionLabels(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::permissionLabels = value;
  }-*/;
  
  private static native java.util.Map getPermissionTooltips(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::permissionTooltips;
  }-*/;
  
  private static native void  setPermissionTooltips(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::permissionTooltips = value;
  }-*/;
  
  private static native java.util.Map getPermissionsDependencies(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::permissionsDependencies;
  }-*/;
  
  private static native void  setPermissionsDependencies(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::permissionsDependencies = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance) throws SerializationException {
    setAce(instance, (java.util.List) streamReader.readObject());
    setAvailablePermissions(instance, (java.util.Map) streamReader.readObject());
    setBreakAllInheritance(instance, streamReader.readBoolean());
    setPermissionLabels(instance, (java.util.Map) streamReader.readObject());
    setPermissionTooltips(instance, (java.util.Map) streamReader.readObject());
    setPermissionsDependencies(instance, (java.util.Map) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL instance) throws SerializationException {
    streamWriter.writeObject(getAce(instance));
    streamWriter.writeObject(getAvailablePermissions(instance));
    streamWriter.writeBoolean(getBreakAllInheritance(instance));
    streamWriter.writeObject(getPermissionLabels(instance));
    streamWriter.writeObject(getPermissionTooltips(instance));
    streamWriter.writeObject(getPermissionsDependencies(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL)object);
  }
  
}
