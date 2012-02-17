package org.jahia.ajax.gwt.client.data.node;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaGetPropertiesResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getAvailabledLanguages(org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::availabledLanguages;
  }-*/;
  
  private static native void  setAvailabledLanguages(org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::availabledLanguages = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.GWTJahiaLanguage getCurrentLocale(org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::currentLocale;
  }-*/;
  
  private static native void  setCurrentLocale(org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance, org.jahia.ajax.gwt.client.data.GWTJahiaLanguage value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::currentLocale = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.node.GWTJahiaNode getNode(org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::node;
  }-*/;
  
  private static native void  setNode(org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance, org.jahia.ajax.gwt.client.data.node.GWTJahiaNode value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::node = value;
  }-*/;
  
  private static native java.util.List getNodeTypes(org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::nodeTypes;
  }-*/;
  
  private static native void  setNodeTypes(org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::nodeTypes = value;
  }-*/;
  
  private static native java.util.Map getProperties(org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::properties;
  }-*/;
  
  private static native void  setProperties(org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::properties = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance) throws SerializationException {
    setAvailabledLanguages(instance, (java.util.List) streamReader.readObject());
    setCurrentLocale(instance, (org.jahia.ajax.gwt.client.data.GWTJahiaLanguage) streamReader.readObject());
    setNode(instance, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNode) streamReader.readObject());
    setNodeTypes(instance, (java.util.List) streamReader.readObject());
    setProperties(instance, (java.util.Map) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult instance) throws SerializationException {
    streamWriter.writeObject(getAvailabledLanguages(instance));
    streamWriter.writeObject(getCurrentLocale(instance));
    streamWriter.writeObject(getNode(instance));
    streamWriter.writeObject(getNodeTypes(instance));
    streamWriter.writeObject(getProperties(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult)object);
  }
  
}
