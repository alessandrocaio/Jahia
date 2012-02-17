package com.google.gwt.user.client.ui;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ClickListenerCollection_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.google.gwt.user.client.ui.ClickListenerCollection instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.google.gwt.user.client.ui.ClickListenerCollection instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.google.gwt.user.client.ui.ClickListenerCollection();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.google.gwt.user.client.ui.ClickListenerCollection instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer.deserialize(reader, (com.google.gwt.user.client.ui.ClickListenerCollection)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer.serialize(writer, (com.google.gwt.user.client.ui.ClickListenerCollection)object);
  }
  
}
