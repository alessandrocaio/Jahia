package org.jahia.ajax.gwt.client.data.toolbar;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTEngineTab_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getRequiredPermission(org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab::requiredPermission;
  }-*/;
  
  private static native void  setRequiredPermission(org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab::requiredPermission = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem getTabItem(org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab::tabItem;
  }-*/;
  
  private static native void  setTabItem(org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab instance, org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab::tabItem = value;
  }-*/;
  
  private static native java.lang.String getTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab::title;
  }-*/;
  
  private static native void  setTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab::title = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab instance) throws SerializationException {
    setRequiredPermission(instance, streamReader.readString());
    setTabItem(instance, (org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem) streamReader.readObject());
    setTitle(instance, streamReader.readString());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab instance) throws SerializationException {
    streamWriter.writeString(getRequiredPermission(instance));
    streamWriter.writeObject(getTabItem(instance));
    streamWriter.writeString(getTitle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab)object);
  }
  
}
