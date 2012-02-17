package com.extjs.gxt.ui.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class BaseFilterPagingLoadConfig_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig instance) throws SerializationException {
    instance.ignore = (java.util.List) streamReader.readObject();
    
    com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig instance) throws SerializationException {
    streamWriter.writeObject(instance.ignore);
    
    com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig)object);
  }
  
}
