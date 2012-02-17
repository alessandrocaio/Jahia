package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class NewTemplatesSetActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getSiteType(org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem::siteType;
  }-*/;
  
  private static native void  setSiteType(org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem::siteType = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem instance) throws SerializationException {
    setSiteType(instance, streamReader.readString());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem instance) throws SerializationException {
    streamWriter.writeString(getSiteType(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem)object);
  }
  
}
