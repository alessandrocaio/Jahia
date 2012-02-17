package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class NodeTypeAwareBaseActionItem_FieldSerializer {
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeAwareBaseActionItem instance) throws SerializationException {
    instance.allowedNodeTypes = (java.util.List) streamReader.readObject();
    instance.forbiddenNodeTypes = (java.util.List) streamReader.readObject();
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeAwareBaseActionItem instance) throws SerializationException {
    streamWriter.writeObject(instance.allowedNodeTypes);
    streamWriter.writeObject(instance.forbiddenNodeTypes);
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
