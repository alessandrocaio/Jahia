package com.extjs.gxt.ui.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class BaseModelData_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.extjs.gxt.ui.client.data.BaseModelData instance) throws SerializationException {
    instance.allowNestedValues = streamReader.readBoolean();
    instance.map = (com.extjs.gxt.ui.client.data.RpcMap) streamReader.readObject();
    
  }
  
  public static com.extjs.gxt.ui.client.data.BaseModelData instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.data.BaseModelData();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.extjs.gxt.ui.client.data.BaseModelData instance) throws SerializationException {
    streamWriter.writeBoolean(instance.allowNestedValues);
    streamWriter.writeObject(instance.map);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.data.BaseModelData)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.data.BaseModelData)object);
  }
  
}
