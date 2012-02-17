package org.jahia.ajax.gwt.client.widget.edit.sidepanel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class PagesTabItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getPaths(org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem::paths;
  }-*/;
  
  private static native void  setPaths(org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem::paths = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem instance) throws SerializationException {
    instance.folderTypes = (java.util.List) streamReader.readObject();
    setPaths(instance, (java.util.List) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem instance) throws SerializationException {
    streamWriter.writeObject(instance.folderTypes);
    streamWriter.writeObject(getPaths(instance));
    
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem)object);
  }
  
}
