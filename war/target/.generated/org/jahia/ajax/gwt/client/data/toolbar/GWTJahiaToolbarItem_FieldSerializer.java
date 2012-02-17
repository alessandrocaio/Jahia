package org.jahia.ajax.gwt.client.data.toolbar;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaToolbarItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.jahia.ajax.gwt.client.widget.toolbar.action.ActionItem getActionItem(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::actionItem;
  }-*/;
  
  private static native void  setActionItem(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance, org.jahia.ajax.gwt.client.widget.toolbar.action.ActionItem value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::actionItem = value;
  }-*/;
  
  private static native java.lang.String getDescription(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::description;
  }-*/;
  
  private static native void  setDescription(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::description = value;
  }-*/;
  
  private static native boolean getDisplayTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::displayTitle;
  }-*/;
  
  private static native void  setDisplayTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::displayTitle = value;
  }-*/;
  
  private static native java.lang.String getIcon(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::icon;
  }-*/;
  
  private static native void  setIcon(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::icon = value;
  }-*/;
  
  private static native java.lang.String getId(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::id;
  }-*/;
  
  private static native void  setId(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::id = value;
  }-*/;
  
  private static native int getLayout(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::layout;
  }-*/;
  
  private static native void  setLayout(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance, int value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::layout = value;
  }-*/;
  
  private static native java.util.List getProcesses(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::processes;
  }-*/;
  
  private static native void  setProcesses(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::processes = value;
  }-*/;
  
  private static native java.util.Map getProperties(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::properties;
  }-*/;
  
  private static native void  setProperties(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::properties = value;
  }-*/;
  
  private static native boolean getSelected(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::selected;
  }-*/;
  
  private static native void  setSelected(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::selected = value;
  }-*/;
  
  private static native java.lang.String getTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::title;
  }-*/;
  
  private static native void  setTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::title = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) throws SerializationException {
    setActionItem(instance, (org.jahia.ajax.gwt.client.widget.toolbar.action.ActionItem) streamReader.readObject());
    setDescription(instance, streamReader.readString());
    setDisplayTitle(instance, streamReader.readBoolean());
    setIcon(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setLayout(instance, streamReader.readInt());
    setProcesses(instance, (java.util.List) streamReader.readObject());
    setProperties(instance, (java.util.Map) streamReader.readObject());
    setSelected(instance, streamReader.readBoolean());
    setTitle(instance, streamReader.readString());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem instance) throws SerializationException {
    streamWriter.writeObject(getActionItem(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeBoolean(getDisplayTitle(instance));
    streamWriter.writeString(getIcon(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeInt(getLayout(instance));
    streamWriter.writeObject(getProcesses(instance));
    streamWriter.writeObject(getProperties(instance));
    streamWriter.writeBoolean(getSelected(instance));
    streamWriter.writeString(getTitle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem)object);
  }
  
}
