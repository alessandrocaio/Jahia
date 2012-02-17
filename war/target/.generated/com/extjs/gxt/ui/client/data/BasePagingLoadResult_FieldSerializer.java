package com.extjs.gxt.ui.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class BasePagingLoadResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.extjs.gxt.ui.client.data.BasePagingLoadResult instance) throws SerializationException {
    instance.offset = streamReader.readInt();
    instance.totalLength = streamReader.readInt();
    
    com.extjs.gxt.ui.client.data.BaseListLoadResult_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.extjs.gxt.ui.client.data.BasePagingLoadResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.data.BasePagingLoadResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.extjs.gxt.ui.client.data.BasePagingLoadResult instance) throws SerializationException {
    streamWriter.writeInt(instance.offset);
    streamWriter.writeInt(instance.totalLength);
    
    com.extjs.gxt.ui.client.data.BaseListLoadResult_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.data.BasePagingLoadResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.data.BasePagingLoadResult)object);
  }
  
}
