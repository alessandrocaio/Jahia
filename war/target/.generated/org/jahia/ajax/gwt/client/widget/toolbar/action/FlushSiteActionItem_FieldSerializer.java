package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class FlushSiteActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem)object);
  }
  
}
