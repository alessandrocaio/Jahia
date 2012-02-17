package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class ExecuteActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAction(org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem::action;
  }-*/;
  
  private static native void  setAction(org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem::action = value;
  }-*/;
  
  private static native java.lang.String getConfirmationMessageKey(org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem::confirmationMessageKey;
  }-*/;
  
  private static native void  setConfirmationMessageKey(org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem::confirmationMessageKey = value;
  }-*/;
  
  private static native java.util.Set getRequiredNodeTypes(org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem::requiredNodeTypes;
  }-*/;
  
  private static native void  setRequiredNodeTypes(org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem instance, java.util.Set value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem::requiredNodeTypes = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem instance) throws SerializationException {
    setAction(instance, streamReader.readString());
    setConfirmationMessageKey(instance, streamReader.readString());
    setRequiredNodeTypes(instance, (java.util.Set) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem instance) throws SerializationException {
    streamWriter.writeString(getAction(instance));
    streamWriter.writeString(getConfirmationMessageKey(instance));
    streamWriter.writeObject(getRequiredNodeTypes(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem)object);
  }
  
}
