package org.jahia.ajax.gwt.client.data.seo;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaUrlMapping_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping)object);
  }
  
}
