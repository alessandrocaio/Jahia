package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class BaseActionItem_FieldSerializer {
  private static native org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem getGwtToolbarItem(org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem::gwtToolbarItem;
  }-*/;
  
  private static native void  setGwtToolbarItem(org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem instance, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem::gwtToolbarItem = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem instance) throws SerializationException {
    setGwtToolbarItem(instance, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem) streamReader.readObject());
    
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem instance) throws SerializationException {
    streamWriter.writeObject(getGwtToolbarItem(instance));
    
  }
  
}
