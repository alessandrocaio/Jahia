package org.jahia.ajax.gwt.client.data.workflow;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaWorkflowTask_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getComments(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask::comments;
  }-*/;
  
  private static native void  setComments(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask::comments = value;
  }-*/;
  
  private static native java.util.List getOutcomes(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask::outcomes;
  }-*/;
  
  private static native void  setOutcomes(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask::outcomes = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask instance) throws SerializationException {
    setComments(instance, (java.util.List) streamReader.readObject());
    setOutcomes(instance, (java.util.List) streamReader.readObject());
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask instance) throws SerializationException {
    streamWriter.writeObject(getComments(instance));
    streamWriter.writeObject(getOutcomes(instance));
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask)object);
  }
  
}
