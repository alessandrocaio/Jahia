package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class NewContentActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getIncludeSubTypes(org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::includeSubTypes;
  }-*/;
  
  private static native void  setIncludeSubTypes(org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::includeSubTypes = value;
  }-*/;
  
  private static native java.lang.String getLabel(org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::label;
  }-*/;
  
  private static native void  setLabel(org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::label = value;
  }-*/;
  
  private static native java.lang.String getNodeTypes(org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::nodeTypes;
  }-*/;
  
  private static native void  setNodeTypes(org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::nodeTypes = value;
  }-*/;
  
  private static native boolean getUseEngine(org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::useEngine;
  }-*/;
  
  private static native void  setUseEngine(org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::useEngine = value;
  }-*/;
  
  private static native boolean getUseMainNode(org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::useMainNode;
  }-*/;
  
  private static native void  setUseMainNode(org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::useMainNode = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance) throws SerializationException {
    setIncludeSubTypes(instance, streamReader.readBoolean());
    setLabel(instance, streamReader.readString());
    setNodeTypes(instance, streamReader.readString());
    instance.parentTypes = streamReader.readString();
    instance.parentTypesAsList = (java.util.List) streamReader.readObject();
    setUseEngine(instance, streamReader.readBoolean());
    setUseMainNode(instance, streamReader.readBoolean());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem instance) throws SerializationException {
    streamWriter.writeBoolean(getIncludeSubTypes(instance));
    streamWriter.writeString(getLabel(instance));
    streamWriter.writeString(getNodeTypes(instance));
    streamWriter.writeString(instance.parentTypes);
    streamWriter.writeObject(instance.parentTypesAsList);
    streamWriter.writeBoolean(getUseEngine(instance));
    streamWriter.writeBoolean(getUseMainNode(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem)object);
  }
  
}
