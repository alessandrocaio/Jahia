package org.jahia.ajax.gwt.client.data.workflow;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaWorkflowType_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType)object);
  }
  
}
