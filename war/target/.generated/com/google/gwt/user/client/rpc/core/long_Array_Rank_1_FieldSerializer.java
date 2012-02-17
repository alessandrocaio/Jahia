package com.google.gwt.user.client.rpc.core;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class long_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, long[] instance) throws SerializationException {
    for (int i = 0, n = instance.length; i < n; ++i) {
      instance[i] = streamReader.readLong();
    }
  }
  
  public static long[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new long[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, long[] instance) throws SerializationException {
    streamWriter.writeInt(instance.length);
    
    for (int i = 0, n = instance.length; i < n; ++i) {
      streamWriter.writeLong(instance[i]);
    }
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.user.client.rpc.core.long_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.long_Array_Rank_1_FieldSerializer.deserialize(reader, (long[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.user.client.rpc.core.long_Array_Rank_1_FieldSerializer.serialize(writer, (long[])object);
  }
  
}
