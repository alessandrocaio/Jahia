package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class NewFolderActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeAwareBaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem instance) throws SerializationException {
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeAwareBaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem)object);
  }
  
}
