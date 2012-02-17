package org.jahia.ajax.gwt.client.data.workflow;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaWorkflowComment_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment instance) throws SerializationException {
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment)object);
  }
  
}
