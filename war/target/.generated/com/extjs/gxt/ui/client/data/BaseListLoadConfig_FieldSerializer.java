package com.extjs.gxt.ui.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class BaseListLoadConfig_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.extjs.gxt.ui.client.Style.SortDir getSortDir(com.extjs.gxt.ui.client.data.BaseListLoadConfig instance) /*-{
    return instance.@com.extjs.gxt.ui.client.data.BaseListLoadConfig::sortDir;
  }-*/;
  
  private static native void  setSortDir(com.extjs.gxt.ui.client.data.BaseListLoadConfig instance, com.extjs.gxt.ui.client.Style.SortDir value) /*-{
    instance.@com.extjs.gxt.ui.client.data.BaseListLoadConfig::sortDir = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.extjs.gxt.ui.client.data.BaseListLoadConfig instance) throws SerializationException {
    setSortDir(instance, (com.extjs.gxt.ui.client.Style.SortDir) streamReader.readObject());
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.extjs.gxt.ui.client.data.BaseListLoadConfig instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.data.BaseListLoadConfig();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.extjs.gxt.ui.client.data.BaseListLoadConfig instance) throws SerializationException {
    streamWriter.writeObject(getSortDir(instance));
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.data.BaseListLoadConfig)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.data.BaseListLoadConfig)object);
  }
  
}
