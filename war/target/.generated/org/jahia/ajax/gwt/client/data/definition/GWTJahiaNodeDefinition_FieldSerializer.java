package org.jahia.ajax.gwt.client.data.definition;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaNodeDefinition_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getAllowsSameNameSiblings(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition::allowsSameNameSiblings;
  }-*/;
  
  private static native void  setAllowsSameNameSiblings(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition::allowsSameNameSiblings = value;
  }-*/;
  
  private static native java.lang.String getDefaultPrimaryType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition::defaultPrimaryType;
  }-*/;
  
  private static native void  setDefaultPrimaryType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition::defaultPrimaryType = value;
  }-*/;
  
  private static native java.lang.String[] getRequiredPrimaryTypes(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition::requiredPrimaryTypes;
  }-*/;
  
  private static native void  setRequiredPrimaryTypes(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instance, java.lang.String[] value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition::requiredPrimaryTypes = value;
  }-*/;
  
  private static native java.lang.String getWorkflow(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition::workflow;
  }-*/;
  
  private static native void  setWorkflow(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition::workflow = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instance) throws SerializationException {
    setAllowsSameNameSiblings(instance, streamReader.readBoolean());
    setDefaultPrimaryType(instance, streamReader.readString());
    setRequiredPrimaryTypes(instance, (java.lang.String[]) streamReader.readObject());
    setWorkflow(instance, streamReader.readString());
    
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition instance) throws SerializationException {
    streamWriter.writeBoolean(getAllowsSameNameSiblings(instance));
    streamWriter.writeString(getDefaultPrimaryType(instance));
    streamWriter.writeObject(getRequiredPrimaryTypes(instance));
    streamWriter.writeString(getWorkflow(instance));
    
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition)object);
  }
  
}
