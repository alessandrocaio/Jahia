package com.extjs.gxt.ui.client.core;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class FastSet_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static com.extjs.gxt.ui.client.core.FastSet instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.core.FastSet();
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.core.FastSet_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.core.FastSet_CustomFieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.core.FastSet)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.core.FastSet_CustomFieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.core.FastSet)object);
  }
  
}
