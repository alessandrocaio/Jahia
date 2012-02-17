package com.extjs.gxt.ui.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class BaseGroupingLoadConfig_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_FieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_FieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig)object);
  }
  
}
