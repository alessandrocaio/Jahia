package org.jahia.ajax.gwt.client.widget.contentengine;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class LayoutTabItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCssWrapper(org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem::cssWrapper;
  }-*/;
  
  private static native void  setCssWrapper(org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem::cssWrapper = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem instance) throws SerializationException {
    setCssWrapper(instance, streamReader.readString());
    
    org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem instance) throws SerializationException {
    streamWriter.writeString(getCssWrapper(instance));
    
    org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem)object);
  }
  
}
