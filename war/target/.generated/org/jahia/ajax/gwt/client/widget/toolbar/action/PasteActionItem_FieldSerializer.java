package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class PasteActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getPasteInMainNode(org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem::pasteInMainNode;
  }-*/;
  
  private static native void  setPasteInMainNode(org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem::pasteInMainNode = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem instance) throws SerializationException {
    setPasteInMainNode(instance, streamReader.readBoolean());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem instance) throws SerializationException {
    streamWriter.writeBoolean(getPasteInMainNode(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem)object);
  }
  
}
