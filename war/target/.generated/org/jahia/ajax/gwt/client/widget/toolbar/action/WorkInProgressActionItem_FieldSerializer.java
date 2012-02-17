package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class WorkInProgressActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getAdminMode(org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem::adminMode;
  }-*/;
  
  private static native void  setAdminMode(org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem::adminMode = value;
  }-*/;
  
  private static native java.util.List getProcesses(org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem::processes;
  }-*/;
  
  private static native void  setProcesses(org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem::processes = value;
  }-*/;
  
  private static native java.util.List getStatuses(org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem::statuses;
  }-*/;
  
  private static native void  setStatuses(org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem::statuses = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem instance) throws SerializationException {
    setAdminMode(instance, streamReader.readBoolean());
    setProcesses(instance, (java.util.List) streamReader.readObject());
    setStatuses(instance, (java.util.List) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem instance) throws SerializationException {
    streamWriter.writeBoolean(getAdminMode(instance));
    streamWriter.writeObject(getProcesses(instance));
    streamWriter.writeObject(getStatuses(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem)object);
  }
  
}
