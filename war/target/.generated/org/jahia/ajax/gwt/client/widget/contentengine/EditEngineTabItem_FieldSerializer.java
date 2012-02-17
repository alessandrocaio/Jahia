package org.jahia.ajax.gwt.client.widget.contentengine;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class EditEngineTabItem_FieldSerializer {
  private static native java.util.List getHideForTypes(org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem::hideForTypes;
  }-*/;
  
  private static native void  setHideForTypes(org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem::hideForTypes = value;
  }-*/;
  
  private static native java.util.List getShowForTypes(org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem::showForTypes;
  }-*/;
  
  private static native void  setShowForTypes(org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem::showForTypes = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem instance) throws SerializationException {
    instance.gwtEngineTab = (org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab) streamReader.readObject();
    instance.handleCreate = streamReader.readBoolean();
    setHideForTypes(instance, (java.util.List) streamReader.readObject());
    setShowForTypes(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem instance) throws SerializationException {
    streamWriter.writeObject(instance.gwtEngineTab);
    streamWriter.writeBoolean(instance.handleCreate);
    streamWriter.writeObject(getHideForTypes(instance));
    streamWriter.writeObject(getShowForTypes(instance));
    
  }
  
}
