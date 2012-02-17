package org.jahia.ajax.gwt.client.data.toolbar;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTColumn_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getKey(org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::key;
  }-*/;
  
  private static native void  setKey(org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::key = value;
  }-*/;
  
  private static native boolean getResizable(org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::resizable;
  }-*/;
  
  private static native void  setResizable(org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::resizable = value;
  }-*/;
  
  private static native int getSize(org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::size;
  }-*/;
  
  private static native void  setSize(org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance, int value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::size = value;
  }-*/;
  
  private static native boolean getSortable(org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::sortable;
  }-*/;
  
  private static native void  setSortable(org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::sortable = value;
  }-*/;
  
  private static native java.lang.String getTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::title;
  }-*/;
  
  private static native void  setTitle(org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::title = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance) throws SerializationException {
    setKey(instance, streamReader.readString());
    setResizable(instance, streamReader.readBoolean());
    setSize(instance, streamReader.readInt());
    setSortable(instance, streamReader.readBoolean());
    setTitle(instance, streamReader.readString());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.toolbar.GWTColumn();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.toolbar.GWTColumn instance) throws SerializationException {
    streamWriter.writeString(getKey(instance));
    streamWriter.writeBoolean(getResizable(instance));
    streamWriter.writeInt(getSize(instance));
    streamWriter.writeBoolean(getSortable(instance));
    streamWriter.writeString(getTitle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.toolbar.GWTColumn_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTColumn_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.toolbar.GWTColumn)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTColumn_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.toolbar.GWTColumn)object);
  }
  
}
