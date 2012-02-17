package com.extjs.gxt.ui.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class SortInfo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.extjs.gxt.ui.client.Style.SortDir getSortDir(com.extjs.gxt.ui.client.data.SortInfo instance) /*-{
    return instance.@com.extjs.gxt.ui.client.data.SortInfo::sortDir;
  }-*/;
  
  private static native void  setSortDir(com.extjs.gxt.ui.client.data.SortInfo instance, com.extjs.gxt.ui.client.Style.SortDir value) /*-{
    instance.@com.extjs.gxt.ui.client.data.SortInfo::sortDir = value;
  }-*/;
  
  private static native java.lang.String getSortField(com.extjs.gxt.ui.client.data.SortInfo instance) /*-{
    return instance.@com.extjs.gxt.ui.client.data.SortInfo::sortField;
  }-*/;
  
  private static native void  setSortField(com.extjs.gxt.ui.client.data.SortInfo instance, java.lang.String value) /*-{
    instance.@com.extjs.gxt.ui.client.data.SortInfo::sortField = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.extjs.gxt.ui.client.data.SortInfo instance) throws SerializationException {
    setSortDir(instance, (com.extjs.gxt.ui.client.Style.SortDir) streamReader.readObject());
    setSortField(instance, streamReader.readString());
    
  }
  
  public static com.extjs.gxt.ui.client.data.SortInfo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.extjs.gxt.ui.client.data.SortInfo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.extjs.gxt.ui.client.data.SortInfo instance) throws SerializationException {
    streamWriter.writeObject(getSortDir(instance));
    streamWriter.writeString(getSortField(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.extjs.gxt.ui.client.data.SortInfo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.SortInfo_FieldSerializer.deserialize(reader, (com.extjs.gxt.ui.client.data.SortInfo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.extjs.gxt.ui.client.data.SortInfo_FieldSerializer.serialize(writer, (com.extjs.gxt.ui.client.data.SortInfo)object);
  }
  
}
