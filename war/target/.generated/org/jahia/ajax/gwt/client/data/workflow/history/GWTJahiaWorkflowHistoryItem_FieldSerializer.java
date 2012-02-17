package org.jahia.ajax.gwt.client.data.workflow.history;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaWorkflowHistoryItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getAvailableTasks(org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem::availableTasks;
  }-*/;
  
  private static native void  setAvailableTasks(org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem::availableTasks = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem instance) throws SerializationException {
    setAvailableTasks(instance, (java.util.List) streamReader.readObject());
    
    com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem instance) throws SerializationException {
    streamWriter.writeObject(getAvailableTasks(instance));
    
    com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem)object);
  }
  
}
