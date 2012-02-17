package org.jahia.ajax.gwt.client.widget.contentengine;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ListOrderingContentTabItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem)object);
  }
  
}
