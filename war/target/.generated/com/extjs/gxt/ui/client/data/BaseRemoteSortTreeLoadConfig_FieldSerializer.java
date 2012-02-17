package com.extjs.gxt.ui.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class BaseRemoteSortTreeLoadConfig_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig instance) throws SerializationException {
    instance.parent = (com.extjs.gxt.ui.client.data.ModelData) streamReader.readObject();
    
    com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig instance) throws SerializationException {
    streamWriter.writeObject(instance.parent);
    
    com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_FieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_FieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig)object);
  }
  
}
