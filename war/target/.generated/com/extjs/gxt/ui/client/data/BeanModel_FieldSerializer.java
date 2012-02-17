package com.extjs.gxt.ui.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class BeanModel_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.extjs.gxt.ui.client.data.BeanModel instance) throws SerializationException {
    instance.beanProperties = (java.util.List) streamReader.readObject();
    instance.nestedModels = (java.util.Map) streamReader.readObject();
    
    com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.extjs.gxt.ui.client.data.BeanModel instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.data.BeanModel();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.extjs.gxt.ui.client.data.BeanModel instance) throws SerializationException {
    streamWriter.writeObject(instance.beanProperties);
    streamWriter.writeObject(instance.nestedModels);
    
    com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.data.BeanModel)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.data.BeanModel)object);
  }
  
}
