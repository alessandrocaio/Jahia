package org.jahia.ajax.gwt.client.widget.edit.sidepanel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class BrowseTabItem_FieldSerializer {
  private static native java.util.List getPaths(org.jahia.ajax.gwt.client.widget.edit.sidepanel.BrowseTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.edit.sidepanel.BrowseTabItem::paths;
  }-*/;
  
  private static native void  setPaths(org.jahia.ajax.gwt.client.widget.edit.sidepanel.BrowseTabItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.edit.sidepanel.BrowseTabItem::paths = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.edit.sidepanel.BrowseTabItem instance) throws SerializationException {
    instance.folderTypes = (java.util.List) streamReader.readObject();
    setPaths(instance, (java.util.List) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.edit.sidepanel.BrowseTabItem instance) throws SerializationException {
    streamWriter.writeObject(instance.folderTypes);
    streamWriter.writeObject(getPaths(instance));
    
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
