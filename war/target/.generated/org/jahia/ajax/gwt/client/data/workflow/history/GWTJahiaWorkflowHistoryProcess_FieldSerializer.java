package org.jahia.ajax.gwt.client.data.workflow.history;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaWorkflowHistoryProcess_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess)object);
  }
  
}
