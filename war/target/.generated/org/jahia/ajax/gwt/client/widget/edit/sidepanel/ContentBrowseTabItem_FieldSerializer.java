package org.jahia.ajax.gwt.client.widget.edit.sidepanel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ContentBrowseTabItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.BrowseTabItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.BrowseTabItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem)object);
  }
  
}