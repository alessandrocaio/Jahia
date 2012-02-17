package org.jahia.ajax.gwt.client.widget.contentengine;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ContentTabItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getMaxLength(org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem::maxLength;
  }-*/;
  
  private static native void  setMaxLength(org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem instance, int value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem::maxLength = value;
  }-*/;
  
  private static native boolean getNameEditable(org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem::nameEditable;
  }-*/;
  
  private static native void  setNameEditable(org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem::nameEditable = value;
  }-*/;
  
  private static native java.util.List getNameNotEditableForTypes(org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem::nameNotEditableForTypes;
  }-*/;
  
  private static native void  setNameNotEditableForTypes(org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem::nameNotEditableForTypes = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem instance) throws SerializationException {
    setMaxLength(instance, streamReader.readInt());
    setNameEditable(instance, streamReader.readBoolean());
    setNameNotEditableForTypes(instance, (java.util.List) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem instance) throws SerializationException {
    streamWriter.writeInt(getMaxLength(instance));
    streamWriter.writeBoolean(getNameEditable(instance));
    streamWriter.writeObject(getNameNotEditableForTypes(instance));
    
    org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem)object);
  }
  
}
