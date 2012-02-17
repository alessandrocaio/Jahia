package org.jahia.ajax.gwt.client.data.definition;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaNodePropertyValue_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.jahia.ajax.gwt.client.data.node.GWTJahiaNode getLinkNode(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue::linkNode;
  }-*/;
  
  private static native void  setLinkNode(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instance, org.jahia.ajax.gwt.client.data.node.GWTJahiaNode value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue::linkNode = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.node.GWTJahiaNode getReference(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue::reference;
  }-*/;
  
  private static native void  setReference(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instance, org.jahia.ajax.gwt.client.data.node.GWTJahiaNode value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue::reference = value;
  }-*/;
  
  private static native int getType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue::type;
  }-*/;
  
  private static native void  setType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instance, int value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue::type = value;
  }-*/;
  
  private static native java.lang.String getValue(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue::value;
  }-*/;
  
  private static native void  setValue(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instance) throws SerializationException {
    setLinkNode(instance, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNode) streamReader.readObject());
    setReference(instance, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNode) streamReader.readObject());
    setType(instance, streamReader.readInt());
    setValue(instance, streamReader.readString());
    
    com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue instance) throws SerializationException {
    streamWriter.writeObject(getLinkNode(instance));
    streamWriter.writeObject(getReference(instance));
    streamWriter.writeInt(getType(instance));
    streamWriter.writeString(getValue(instance));
    
    com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue)object);
  }
  
}
