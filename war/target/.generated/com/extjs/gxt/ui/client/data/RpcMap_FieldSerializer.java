package com.extjs.gxt.ui.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class RpcMap_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static com.extjs.gxt.ui.client.data.RpcMap instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.data.RpcMap();
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.data.RpcMap_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.RpcMap_CustomFieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.data.RpcMap)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.RpcMap_CustomFieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.data.RpcMap)object);
  }
  
}
