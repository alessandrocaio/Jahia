package org.jahia.ajax.gwt.client.data.definition;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaItemDefinition_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getAutoCreated(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::autoCreated;
  }-*/;
  
  private static native void  setAutoCreated(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::autoCreated = value;
  }-*/;
  
  private static native java.lang.String getDataType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::dataType;
  }-*/;
  
  private static native void  setDataType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::dataType = value;
  }-*/;
  
  private static native java.lang.String getDeclaringNodeType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::declaringNodeType;
  }-*/;
  
  private static native void  setDeclaringNodeType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::declaringNodeType = value;
  }-*/;
  
  private static native java.lang.String getDeclaringNodeTypeLabel(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::declaringNodeTypeLabel;
  }-*/;
  
  private static native void  setDeclaringNodeTypeLabel(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::declaringNodeTypeLabel = value;
  }-*/;
  
  private static native boolean getHidden(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::hidden;
  }-*/;
  
  private static native void  setHidden(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::hidden = value;
  }-*/;
  
  private static native boolean getIsProtected(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::isProtected;
  }-*/;
  
  private static native void  setIsProtected(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::isProtected = value;
  }-*/;
  
  private static native java.lang.String getLabel(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::label;
  }-*/;
  
  private static native void  setLabel(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::label = value;
  }-*/;
  
  private static native boolean getMandatory(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::mandatory;
  }-*/;
  
  private static native void  setMandatory(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::mandatory = value;
  }-*/;
  
  private static native java.lang.String getName(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::name;
  }-*/;
  
  private static native void  setName(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::name = value;
  }-*/;
  
  private static native java.lang.String getOverrideDeclaringNodeType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::overrideDeclaringNodeType;
  }-*/;
  
  private static native void  setOverrideDeclaringNodeType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::overrideDeclaringNodeType = value;
  }-*/;
  
  private static native int getSelector(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::selector;
  }-*/;
  
  private static native void  setSelector(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, int value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::selector = value;
  }-*/;
  
  private static native java.util.Map getSelectorOptions(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::selectorOptions;
  }-*/;
  
  private static native void  setSelectorOptions(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::selectorOptions = value;
  }-*/;
  
  private static native java.lang.String getTooltip(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::tooltip;
  }-*/;
  
  private static native void  setTooltip(org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::tooltip = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) throws SerializationException {
    setAutoCreated(instance, streamReader.readBoolean());
    setDataType(instance, streamReader.readString());
    setDeclaringNodeType(instance, streamReader.readString());
    setDeclaringNodeTypeLabel(instance, streamReader.readString());
    setHidden(instance, streamReader.readBoolean());
    setIsProtected(instance, streamReader.readBoolean());
    setLabel(instance, streamReader.readString());
    setMandatory(instance, streamReader.readBoolean());
    setName(instance, streamReader.readString());
    setOverrideDeclaringNodeType(instance, streamReader.readString());
    setSelector(instance, streamReader.readInt());
    setSelectorOptions(instance, (java.util.Map) streamReader.readObject());
    setTooltip(instance, streamReader.readString());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition instance) throws SerializationException {
    streamWriter.writeBoolean(getAutoCreated(instance));
    streamWriter.writeString(getDataType(instance));
    streamWriter.writeString(getDeclaringNodeType(instance));
    streamWriter.writeString(getDeclaringNodeTypeLabel(instance));
    streamWriter.writeBoolean(getHidden(instance));
    streamWriter.writeBoolean(getIsProtected(instance));
    streamWriter.writeString(getLabel(instance));
    streamWriter.writeBoolean(getMandatory(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getOverrideDeclaringNodeType(instance));
    streamWriter.writeInt(getSelector(instance));
    streamWriter.writeObject(getSelectorOptions(instance));
    streamWriter.writeString(getTooltip(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition)object);
  }
  
}
