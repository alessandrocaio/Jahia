package org.jahia.ajax.gwt.client.data.toolbar;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTConfiguration_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getEngineTabs(org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration::engineTabs;
  }-*/;
  
  private static native void  setEngineTabs(org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration::engineTabs = value;
  }-*/;
  
  private static native java.util.List getPermissions(org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration::permissions;
  }-*/;
  
  private static native void  setPermissions(org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration::permissions = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.node.GWTJahiaNode getSiteNode(org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration::siteNode;
  }-*/;
  
  private static native void  setSiteNode(org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance, org.jahia.ajax.gwt.client.data.node.GWTJahiaNode value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration::siteNode = value;
  }-*/;
  
  private static native java.lang.String getSitesLocation(org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration::sitesLocation;
  }-*/;
  
  private static native void  setSitesLocation(org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration::sitesLocation = value;
  }-*/;
  
  private static native java.util.Map getSitesMap(org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration::sitesMap;
  }-*/;
  
  private static native void  setSitesMap(org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration::sitesMap = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance) throws SerializationException {
    setEngineTabs(instance, (java.util.List) streamReader.readObject());
    instance.name = streamReader.readString();
    setPermissions(instance, (java.util.List) streamReader.readObject());
    setSiteNode(instance, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNode) streamReader.readObject());
    setSitesLocation(instance, streamReader.readString());
    setSitesMap(instance, (java.util.Map) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration instance) throws SerializationException {
    streamWriter.writeObject(getEngineTabs(instance));
    streamWriter.writeString(instance.name);
    streamWriter.writeObject(getPermissions(instance));
    streamWriter.writeObject(getSiteNode(instance));
    streamWriter.writeString(getSitesLocation(instance));
    streamWriter.writeObject(getSitesMap(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration)object);
  }
  
}
