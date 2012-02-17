package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ClearAllLocksActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getDoSubNodes(org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem::doSubNodes;
  }-*/;
  
  private static native void  setDoSubNodes(org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem::doSubNodes = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem instance) throws SerializationException {
    setDoSubNodes(instance, streamReader.readBoolean());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem instance) throws SerializationException {
    streamWriter.writeBoolean(getDoSubNodes(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem)object);
  }
  
}
