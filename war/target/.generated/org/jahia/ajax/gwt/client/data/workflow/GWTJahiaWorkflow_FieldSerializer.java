package org.jahia.ajax.gwt.client.data.workflow;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaWorkflow_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getAvailableTasks(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow::availableTasks;
  }-*/;
  
  private static native void  setAvailableTasks(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow::availableTasks = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.widget.workflow.CustomWorkflow getCustomWorkflowInfo(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow::customWorkflowInfo;
  }-*/;
  
  private static native void  setCustomWorkflowInfo(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow instance, org.jahia.ajax.gwt.client.widget.workflow.CustomWorkflow value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow::customWorkflowInfo = value;
  }-*/;
  
  private static native java.util.Map getVariables(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow::variables;
  }-*/;
  
  private static native void  setVariables(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow::variables = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow instance) throws SerializationException {
    setAvailableTasks(instance, (java.util.List) streamReader.readObject());
    setCustomWorkflowInfo(instance, (org.jahia.ajax.gwt.client.widget.workflow.CustomWorkflow) streamReader.readObject());
    setVariables(instance, (java.util.Map) streamReader.readObject());
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow instance) throws SerializationException {
    streamWriter.writeObject(getAvailableTasks(instance));
    streamWriter.writeObject(getCustomWorkflowInfo(instance));
    streamWriter.writeObject(getVariables(instance));
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow)object);
  }
  
}
