package org.jahia.ajax.gwt.client.service.content;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ExistingFileException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.service.content.ExistingFileException instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.service.GWTJahiaServiceException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.service.content.ExistingFileException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.service.content.ExistingFileException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.service.content.ExistingFileException instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.service.GWTJahiaServiceException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.service.content.ExistingFileException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.service.content.ExistingFileException_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.service.content.ExistingFileException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.service.content.ExistingFileException_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.service.content.ExistingFileException)object);
  }
  
}
