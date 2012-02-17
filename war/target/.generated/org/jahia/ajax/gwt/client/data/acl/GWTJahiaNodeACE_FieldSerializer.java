package org.jahia.ajax.gwt.client.data.acl;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaNodeACE_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getHidden(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::hidden;
  }-*/;
  
  private static native void  setHidden(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::hidden = value;
  }-*/;
  
  private static native java.lang.String getInheritedFrom(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::inheritedFrom;
  }-*/;
  
  private static native void  setInheritedFrom(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::inheritedFrom = value;
  }-*/;
  
  private static native java.util.Map getInheritedPermissions(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::inheritedPermissions;
  }-*/;
  
  private static native void  setInheritedPermissions(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::inheritedPermissions = value;
  }-*/;
  
  private static native boolean getIsInherited(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::isInherited;
  }-*/;
  
  private static native void  setIsInherited(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::isInherited = value;
  }-*/;
  
  private static native java.util.Map getPermissions(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::permissions;
  }-*/;
  
  private static native void  setPermissions(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::permissions = value;
  }-*/;
  
  private static native java.lang.String getPrincipal(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::principal;
  }-*/;
  
  private static native void  setPrincipal(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::principal = value;
  }-*/;
  
  private static native java.lang.String getPrincipalDisplayName(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::principalDisplayName;
  }-*/;
  
  private static native void  setPrincipalDisplayName(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::principalDisplayName = value;
  }-*/;
  
  private static native java.lang.String getPrincipalKey(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::principalKey;
  }-*/;
  
  private static native void  setPrincipalKey(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::principalKey = value;
  }-*/;
  
  private static native char getPrincipalType(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::principalType;
  }-*/;
  
  private static native void  setPrincipalType(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance, char value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::principalType = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) throws SerializationException {
    setHidden(instance, streamReader.readBoolean());
    setInheritedFrom(instance, streamReader.readString());
    setInheritedPermissions(instance, (java.util.Map) streamReader.readObject());
    setIsInherited(instance, streamReader.readBoolean());
    setPermissions(instance, (java.util.Map) streamReader.readObject());
    setPrincipal(instance, streamReader.readString());
    setPrincipalDisplayName(instance, streamReader.readString());
    setPrincipalKey(instance, streamReader.readString());
    setPrincipalType(instance, streamReader.readChar());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE instance) throws SerializationException {
    streamWriter.writeBoolean(getHidden(instance));
    streamWriter.writeString(getInheritedFrom(instance));
    streamWriter.writeObject(getInheritedPermissions(instance));
    streamWriter.writeBoolean(getIsInherited(instance));
    streamWriter.writeObject(getPermissions(instance));
    streamWriter.writeString(getPrincipal(instance));
    streamWriter.writeString(getPrincipalDisplayName(instance));
    streamWriter.writeString(getPrincipalKey(instance));
    streamWriter.writeChar(getPrincipalType(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE)object);
  }
  
}
