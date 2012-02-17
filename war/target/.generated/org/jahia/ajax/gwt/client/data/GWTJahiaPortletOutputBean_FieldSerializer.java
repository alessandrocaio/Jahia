package org.jahia.ajax.gwt.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaPortletOutputBean_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getDelayedIFrameResizeTime(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::delayedIFrameResizeTime;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void  setDelayedIFrameResizeTime(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance, long value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::delayedIFrameResizeTime = value;
  }-*/;
  
  private static native java.lang.String getHtmlOutput(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::htmlOutput;
  }-*/;
  
  private static native void  setHtmlOutput(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::htmlOutput = value;
  }-*/;
  
  private static native java.lang.String getIFrameHeight(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::iFrameHeight;
  }-*/;
  
  private static native void  setIFrameHeight(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::iFrameHeight = value;
  }-*/;
  
  private static native java.lang.String getIFrameWidth(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::iFrameWidth;
  }-*/;
  
  private static native void  setIFrameWidth(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::iFrameWidth = value;
  }-*/;
  
  private static native boolean getInContentPortlet(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::inContentPortlet;
  }-*/;
  
  private static native void  setInContentPortlet(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::inContentPortlet = value;
  }-*/;
  
  private static native boolean getInIFrame(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::inIFrame;
  }-*/;
  
  private static native void  setInIFrame(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::inIFrame = value;
  }-*/;
  
  private static native java.util.List getScriptsWithCode(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::scriptsWithCode;
  }-*/;
  
  private static native void  setScriptsWithCode(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::scriptsWithCode = value;
  }-*/;
  
  private static native java.util.List getScriptsWithSrc(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::scriptsWithSrc;
  }-*/;
  
  private static native void  setScriptsWithSrc(org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::scriptsWithSrc = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance) throws SerializationException {
    setDelayedIFrameResizeTime(instance, streamReader.readLong());
    setHtmlOutput(instance, streamReader.readString());
    setIFrameHeight(instance, streamReader.readString());
    setIFrameWidth(instance, streamReader.readString());
    setInContentPortlet(instance, streamReader.readBoolean());
    setInIFrame(instance, streamReader.readBoolean());
    setScriptsWithCode(instance, (java.util.List) streamReader.readObject());
    setScriptsWithSrc(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean instance) throws SerializationException {
    streamWriter.writeLong(getDelayedIFrameResizeTime(instance));
    streamWriter.writeString(getHtmlOutput(instance));
    streamWriter.writeString(getIFrameHeight(instance));
    streamWriter.writeString(getIFrameWidth(instance));
    streamWriter.writeBoolean(getInContentPortlet(instance));
    streamWriter.writeBoolean(getInIFrame(instance));
    streamWriter.writeObject(getScriptsWithCode(instance));
    streamWriter.writeObject(getScriptsWithSrc(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean)object);
  }
  
}
