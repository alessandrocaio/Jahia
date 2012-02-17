package org.jahia.ajax.gwt.client.data.toolbar;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaToolbar_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getDisplayTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar::displayTitle;
  }-*/;
  
  private static native void  setDisplayTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar::displayTitle = value;
  }-*/;
  
  private static native java.util.List getGwtToolbarItems(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar::gwtToolbarItems;
  }-*/;
  
  private static native void  setGwtToolbarItems(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar::gwtToolbarItems = value;
  }-*/;
  
  private static native java.lang.String getName(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar::name;
  }-*/;
  
  private static native void  setName(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar::name = value;
  }-*/;
  
  private static native java.lang.String getTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar::title;
  }-*/;
  
  private static native void  setTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar::title = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instance) throws SerializationException {
    setDisplayTitle(instance, streamReader.readBoolean());
    setGwtToolbarItems(instance, (java.util.List) streamReader.readObject());
    setName(instance, streamReader.readString());
    setTitle(instance, streamReader.readString());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar instance) throws SerializationException {
    streamWriter.writeBoolean(getDisplayTitle(instance));
    streamWriter.writeObject(getGwtToolbarItems(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getTitle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar)object);
  }
  
}
