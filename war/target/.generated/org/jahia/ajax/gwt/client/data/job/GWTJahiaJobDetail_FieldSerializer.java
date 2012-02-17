package org.jahia.ajax.gwt.client.data.job;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaJobDetail_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail)object);
  }
  
}
