package org.jahia.ajax.gwt.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTRenderResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getName(org.jahia.ajax.gwt.client.data.GWTRenderResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTRenderResult::name;
  }-*/;
  
  private static native void  setName(org.jahia.ajax.gwt.client.data.GWTRenderResult instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTRenderResult::name = value;
  }-*/;
  
  private static native java.lang.String getNodeTypes(org.jahia.ajax.gwt.client.data.GWTRenderResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTRenderResult::nodeTypes;
  }-*/;
  
  private static native void  setNodeTypes(org.jahia.ajax.gwt.client.data.GWTRenderResult instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTRenderResult::nodeTypes = value;
  }-*/;
  
  private static native java.lang.String getResult(org.jahia.ajax.gwt.client.data.GWTRenderResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTRenderResult::result;
  }-*/;
  
  private static native void  setResult(org.jahia.ajax.gwt.client.data.GWTRenderResult instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTRenderResult::result = value;
  }-*/;
  
  private static native java.util.Map getStaticAssets(org.jahia.ajax.gwt.client.data.GWTRenderResult instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTRenderResult::staticAssets;
  }-*/;
  
  private static native void  setStaticAssets(org.jahia.ajax.gwt.client.data.GWTRenderResult instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTRenderResult::staticAssets = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.GWTRenderResult instance) throws SerializationException {
    setName(instance, streamReader.readString());
    setNodeTypes(instance, streamReader.readString());
    setResult(instance, streamReader.readString());
    setStaticAssets(instance, (java.util.Map) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.GWTRenderResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.GWTRenderResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.GWTRenderResult instance) throws SerializationException {
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getNodeTypes(instance));
    streamWriter.writeString(getResult(instance));
    streamWriter.writeObject(getStaticAssets(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.GWTRenderResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTRenderResult_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.GWTRenderResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTRenderResult_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.GWTRenderResult)object);
  }
  
}
