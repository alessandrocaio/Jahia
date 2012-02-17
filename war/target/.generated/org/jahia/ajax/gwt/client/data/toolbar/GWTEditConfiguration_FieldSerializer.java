package org.jahia.ajax.gwt.client.data.toolbar;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTEditConfiguration_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar getContextMenu(org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::contextMenu;
  }-*/;
  
  private static native void  setContextMenu(org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::contextMenu = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar getMainModuleToolbar(org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::mainModuleToolbar;
  }-*/;
  
  private static native void  setMainModuleToolbar(org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::mainModuleToolbar = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar getSidePanelToolbar(org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::sidePanelToolbar;
  }-*/;
  
  private static native void  setSidePanelToolbar(org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::sidePanelToolbar = value;
  }-*/;
  
  private static native java.util.List getTabs(org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::tabs;
  }-*/;
  
  private static native void  setTabs(org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::tabs = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar getTopToolbar(org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::topToolbar;
  }-*/;
  
  private static native void  setTopToolbar(org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::topToolbar = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance) throws SerializationException {
    setContextMenu(instance, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar) streamReader.readObject());
    setMainModuleToolbar(instance, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar) streamReader.readObject());
    setSidePanelToolbar(instance, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar) streamReader.readObject());
    setTabs(instance, (java.util.List) streamReader.readObject());
    setTopToolbar(instance, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration instance) throws SerializationException {
    streamWriter.writeObject(getContextMenu(instance));
    streamWriter.writeObject(getMainModuleToolbar(instance));
    streamWriter.writeObject(getSidePanelToolbar(instance));
    streamWriter.writeObject(getTabs(instance));
    streamWriter.writeObject(getTopToolbar(instance));
    
    org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration)object);
  }
  
}
