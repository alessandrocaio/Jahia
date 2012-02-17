package org.jahia.ajax.gwt.client.data.node;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTBitSet_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native long[] getWords(org.jahia.ajax.gwt.client.data.node.GWTBitSet instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTBitSet::words;
  }-*/;
  
  private static native void  setWords(org.jahia.ajax.gwt.client.data.node.GWTBitSet instance, long[] value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTBitSet::words = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.node.GWTBitSet instance) throws SerializationException {
    setWords(instance, (long[]) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.node.GWTBitSet instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.node.GWTBitSet();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.node.GWTBitSet instance) throws SerializationException {
    streamWriter.writeObject(getWords(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.node.GWTBitSet_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTBitSet_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.node.GWTBitSet)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTBitSet_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.node.GWTBitSet)object);
  }
  
}
