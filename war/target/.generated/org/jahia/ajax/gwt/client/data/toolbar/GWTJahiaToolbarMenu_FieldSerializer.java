package org.jahia.ajax.gwt.client.data.toolbar;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaToolbarMenu_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getGwtToolbarItems(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu::gwtToolbarItems;
  }-*/;
  
  private static native void  setGwtToolbarItems(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu::gwtToolbarItems = value;
  }-*/;
  
  private static native java.lang.String getItemsGroupTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu::itemsGroupTitle;
  }-*/;
  
  private static native void  setItemsGroupTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu::itemsGroupTitle = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu instance) throws SerializationException {
    setGwtToolbarItems(instance, (java.util.List) streamReader.readObject());
    setItemsGroupTitle(instance, streamReader.readString());
    
    org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu instance) throws SerializationException {
    streamWriter.writeObject(getGwtToolbarItems(instance));
    streamWriter.writeString(getItemsGroupTitle(instance));
    
    org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu)object);
  }
  
}
