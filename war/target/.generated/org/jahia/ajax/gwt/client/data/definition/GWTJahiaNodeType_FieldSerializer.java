package org.jahia.ajax.gwt.client.data.definition;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaNodeType_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getInheritedItems(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType::inheritedItems;
  }-*/;
  
  private static native void  setInheritedItems(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType::inheritedItems = value;
  }-*/;
  
  private static native java.util.List getItems(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType::items;
  }-*/;
  
  private static native void  setItems(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType::items = value;
  }-*/;
  
  private static native java.util.List getSuperTypes(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType::superTypes;
  }-*/;
  
  private static native void  setSuperTypes(org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType::superTypes = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType instance) throws SerializationException {
    setInheritedItems(instance, (java.util.List) streamReader.readObject());
    setItems(instance, (java.util.List) streamReader.readObject());
    setSuperTypes(instance, (java.util.List) streamReader.readObject());
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType instance) throws SerializationException {
    streamWriter.writeObject(getInheritedItems(instance));
    streamWriter.writeObject(getItems(instance));
    streamWriter.writeObject(getSuperTypes(instance));
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType)object);
  }
  
}
