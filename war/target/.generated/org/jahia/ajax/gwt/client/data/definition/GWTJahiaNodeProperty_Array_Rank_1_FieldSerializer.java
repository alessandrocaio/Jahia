package org.jahia.ajax.gwt.client.data.definition;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaNodeProperty_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_Array_Rank_1_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_Array_Rank_1_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty[])object);
  }
  
}
