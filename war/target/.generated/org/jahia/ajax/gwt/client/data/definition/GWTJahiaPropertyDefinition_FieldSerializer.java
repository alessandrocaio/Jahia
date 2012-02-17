package org.jahia.ajax.gwt.client.data.definition;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaPropertyDefinition_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getConstrained(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::constrained;
  }-*/;
  
  private static native void  setConstrained(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::constrained = value;
  }-*/;
  
  private static native java.lang.String getConstraintErrorMessage(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::constraintErrorMessage;
  }-*/;
  
  private static native void  setConstraintErrorMessage(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::constraintErrorMessage = value;
  }-*/;
  
  private static native java.util.List getDefaultValues(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::defaultValues;
  }-*/;
  
  private static native void  setDefaultValues(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::defaultValues = value;
  }-*/;
  
  private static native boolean getInternationalized(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::internationalized;
  }-*/;
  
  private static native void  setInternationalized(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::internationalized = value;
  }-*/;
  
  private static native java.lang.String getMaxValue(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::maxValue;
  }-*/;
  
  private static native void  setMaxValue(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::maxValue = value;
  }-*/;
  
  private static native java.lang.String getMinValue(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::minValue;
  }-*/;
  
  private static native void  setMinValue(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::minValue = value;
  }-*/;
  
  private static native boolean getMultiple(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::multiple;
  }-*/;
  
  private static native void  setMultiple(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::multiple = value;
  }-*/;
  
  private static native int getRequiredType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::requiredType;
  }-*/;
  
  private static native void  setRequiredType(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance, int value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::requiredType = value;
  }-*/;
  
  private static native java.util.List getValueConstraints(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::valueConstraints;
  }-*/;
  
  private static native void  setValueConstraints(org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::valueConstraints = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) throws SerializationException {
    setConstrained(instance, streamReader.readBoolean());
    setConstraintErrorMessage(instance, streamReader.readString());
    setDefaultValues(instance, (java.util.List) streamReader.readObject());
    setInternationalized(instance, streamReader.readBoolean());
    setMaxValue(instance, streamReader.readString());
    setMinValue(instance, streamReader.readString());
    setMultiple(instance, streamReader.readBoolean());
    setRequiredType(instance, streamReader.readInt());
    setValueConstraints(instance, (java.util.List) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition instance) throws SerializationException {
    streamWriter.writeBoolean(getConstrained(instance));
    streamWriter.writeString(getConstraintErrorMessage(instance));
    streamWriter.writeObject(getDefaultValues(instance));
    streamWriter.writeBoolean(getInternationalized(instance));
    streamWriter.writeString(getMaxValue(instance));
    streamWriter.writeString(getMinValue(instance));
    streamWriter.writeBoolean(getMultiple(instance));
    streamWriter.writeInt(getRequiredType(instance));
    streamWriter.writeObject(getValueConstraints(instance));
    
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition)object);
  }
  
}
