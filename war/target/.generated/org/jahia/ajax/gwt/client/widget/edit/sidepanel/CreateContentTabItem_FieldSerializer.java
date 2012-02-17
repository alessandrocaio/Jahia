package org.jahia.ajax.gwt.client.widget.edit.sidepanel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class CreateContentTabItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getBaseType(org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem::baseType;
  }-*/;
  
  private static native void  setBaseType(org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem::baseType = value;
  }-*/;
  
  private static native java.util.List getPaths(org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem::paths;
  }-*/;
  
  private static native void  setPaths(org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem::paths = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem instance) throws SerializationException {
    setBaseType(instance, streamReader.readString());
    setPaths(instance, (java.util.List) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem instance) throws SerializationException {
    streamWriter.writeString(getBaseType(instance));
    streamWriter.writeObject(getPaths(instance));
    
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem)object);
  }
  
}
