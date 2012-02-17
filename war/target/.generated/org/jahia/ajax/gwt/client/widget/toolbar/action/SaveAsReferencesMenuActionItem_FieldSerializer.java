package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class SaveAsReferencesMenuActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.jahia.ajax.gwt.client.data.GWTJahiaProperty getAllowedNodeType(org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem::allowedNodeType;
  }-*/;
  
  private static native void  setAllowedNodeType(org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem instance, org.jahia.ajax.gwt.client.data.GWTJahiaProperty value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem::allowedNodeType = value;
  }-*/;
  
  private static native boolean getMenuItemsCount(org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem::menuItemsCount;
  }-*/;
  
  private static native void  setMenuItemsCount(org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem::menuItemsCount = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.GWTJahiaProperty getTargetName(org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem::targetName;
  }-*/;
  
  private static native void  setTargetName(org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem instance, org.jahia.ajax.gwt.client.data.GWTJahiaProperty value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem::targetName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem instance) throws SerializationException {
    setAllowedNodeType(instance, (org.jahia.ajax.gwt.client.data.GWTJahiaProperty) streamReader.readObject());
    setMenuItemsCount(instance, streamReader.readBoolean());
    setTargetName(instance, (org.jahia.ajax.gwt.client.data.GWTJahiaProperty) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem instance) throws SerializationException {
    streamWriter.writeObject(getAllowedNodeType(instance));
    streamWriter.writeBoolean(getMenuItemsCount(instance));
    streamWriter.writeObject(getTargetName(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem)object);
  }
  
}
