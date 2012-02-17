package org.jahia.ajax.gwt.client.data.toolbar;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTRepository_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getKey(org.jahia.ajax.gwt.client.data.toolbar.GWTRepository instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTRepository::key;
  }-*/;
  
  private static native void  setKey(org.jahia.ajax.gwt.client.data.toolbar.GWTRepository instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTRepository::key = value;
  }-*/;
  
  private static native java.util.List getPaths(org.jahia.ajax.gwt.client.data.toolbar.GWTRepository instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTRepository::paths;
  }-*/;
  
  private static native void  setPaths(org.jahia.ajax.gwt.client.data.toolbar.GWTRepository instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTRepository::paths = value;
  }-*/;
  
  private static native java.lang.String getTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTRepository instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTRepository::title;
  }-*/;
  
  private static native void  setTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTRepository instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTRepository::title = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.toolbar.GWTRepository instance) throws SerializationException {
    setKey(instance, streamReader.readString());
    setPaths(instance, (java.util.List) streamReader.readObject());
    setTitle(instance, streamReader.readString());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.toolbar.GWTRepository instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.toolbar.GWTRepository();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.toolbar.GWTRepository instance) throws SerializationException {
    streamWriter.writeString(getKey(instance));
    streamWriter.writeObject(getPaths(instance));
    streamWriter.writeString(getTitle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.toolbar.GWTRepository_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTRepository_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.toolbar.GWTRepository)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTRepository_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.toolbar.GWTRepository)object);
  }
  
}
