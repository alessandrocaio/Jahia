package org.jahia.ajax.gwt.client.widget.edit.sidepanel;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class SidePanelTabItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem instance) throws SerializationException {
    instance.config = (org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab) streamReader.readObject();
    
  }
  
  public static org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem instance) throws SerializationException {
    streamWriter.writeObject(instance.config);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem)object);
  }
  
}
