package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ViewIconStatusActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getChecked(org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem::checked;
  }-*/;
  
  private static native void  setChecked(org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem::checked = value;
  }-*/;
  
  private static native java.lang.String getType(org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem::type;
  }-*/;
  
  private static native void  setType(org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem::type = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem instance) throws SerializationException {
    setChecked(instance, streamReader.readBoolean());
    setType(instance, streamReader.readString());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem instance) throws SerializationException {
    streamWriter.writeBoolean(getChecked(instance));
    streamWriter.writeString(getType(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem)object);
  }
  
}
