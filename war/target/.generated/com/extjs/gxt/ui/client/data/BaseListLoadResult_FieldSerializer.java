package com.extjs.gxt.ui.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class BaseListLoadResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.extjs.gxt.ui.client.data.BaseListLoadResult instance) throws SerializationException {
    instance.list = (java.util.List) streamReader.readObject();
    
  }
  
  public static com.extjs.gxt.ui.client.data.BaseListLoadResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.data.BaseListLoadResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.extjs.gxt.ui.client.data.BaseListLoadResult instance) throws SerializationException {
    streamWriter.writeObject(instance.list);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.data.BaseListLoadResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseListLoadResult_FieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.data.BaseListLoadResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseListLoadResult_FieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.data.BaseListLoadResult)object);
  }
  
}
