package org.jahia.ajax.gwt.client.widget.edit.sidepanel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class LastContentBrowseTabItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCssWrapper(org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem::cssWrapper;
  }-*/;
  
  private static native void  setCssWrapper(org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem::cssWrapper = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem instance) throws SerializationException {
    setCssWrapper(instance, streamReader.readString());
    instance.limit = streamReader.readInt();
    instance.search = streamReader.readString();
    
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem instance) throws SerializationException {
    streamWriter.writeString(getCssWrapper(instance));
    streamWriter.writeInt(instance.limit);
    streamWriter.writeString(instance.search);
    
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem)object);
  }
  
}
