package org.jahia.ajax.gwt.client.data.workflow;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaWorkflowInfo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Map getActiveWorkflows(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo::activeWorkflows;
  }-*/;
  
  private static native void  setActiveWorkflows(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo::activeWorkflows = value;
  }-*/;
  
  private static native java.util.Map getPossibleWorkflows(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo::possibleWorkflows;
  }-*/;
  
  private static native void  setPossibleWorkflows(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo::possibleWorkflows = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo instance) throws SerializationException {
    setActiveWorkflows(instance, (java.util.Map) streamReader.readObject());
    setPossibleWorkflows(instance, (java.util.Map) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo instance) throws SerializationException {
    streamWriter.writeObject(getActiveWorkflows(instance));
    streamWriter.writeObject(getPossibleWorkflows(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo)object);
  }
  
}
