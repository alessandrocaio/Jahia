package org.jahia.ajax.gwt.client.widget.contentengine;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class PropertiesTabItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem instance) throws SerializationException {
    instance.dataType = (java.util.List) streamReader.readObject();
    instance.excludedTypes = (java.util.List) streamReader.readObject();
    
    org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem instance) throws SerializationException {
    streamWriter.writeObject(instance.dataType);
    streamWriter.writeObject(instance.excludedTypes);
    
    org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem)object);
  }
  
}
