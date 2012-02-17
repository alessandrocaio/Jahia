package org.jahia.ajax.gwt.client.data.wcag;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class WCAGViolation_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.wcag.WCAGViolation instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.wcag.WCAGViolation instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.wcag.WCAGViolation();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.wcag.WCAGViolation instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.wcag.WCAGViolation)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.wcag.WCAGViolation)object);
  }
  
}
