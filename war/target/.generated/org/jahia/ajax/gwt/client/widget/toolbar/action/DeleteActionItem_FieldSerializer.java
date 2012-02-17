package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class DeleteActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getPermanentlyDelete(org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem::permanentlyDelete;
  }-*/;
  
  private static native void  setPermanentlyDelete(org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem::permanentlyDelete = value;
  }-*/;
  
  private static native java.lang.String getReferenceTitleKey(org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem::referenceTitleKey;
  }-*/;
  
  private static native void  setReferenceTitleKey(org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem::referenceTitleKey = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem instance) throws SerializationException {
    setPermanentlyDelete(instance, streamReader.readBoolean());
    setReferenceTitleKey(instance, streamReader.readString());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeAwareBaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem instance) throws SerializationException {
    streamWriter.writeBoolean(getPermanentlyDelete(instance));
    streamWriter.writeString(getReferenceTitleKey(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeAwareBaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem)object);
  }
  
}
