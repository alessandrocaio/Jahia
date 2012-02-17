package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class SiteSwitcherActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDefaultModuleType(org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem::defaultModuleType;
  }-*/;
  
  private static native void  setDefaultModuleType(org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem::defaultModuleType = value;
  }-*/;
  
  private static native java.util.Map getModulesTypes(org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem::modulesTypes;
  }-*/;
  
  private static native void  setModulesTypes(org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem::modulesTypes = value;
  }-*/;
  
  private static native java.util.List getRoot(org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem::root;
  }-*/;
  
  private static native void  setRoot(org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem::root = value;
  }-*/;
  
  private static native boolean getUseModuleType(org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem::useModuleType;
  }-*/;
  
  private static native void  setUseModuleType(org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem::useModuleType = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instance) throws SerializationException {
    setDefaultModuleType(instance, streamReader.readString());
    setModulesTypes(instance, (java.util.Map) streamReader.readObject());
    setRoot(instance, (java.util.List) streamReader.readObject());
    setUseModuleType(instance, streamReader.readBoolean());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem instance) throws SerializationException {
    streamWriter.writeString(getDefaultModuleType(instance));
    streamWriter.writeObject(getModulesTypes(instance));
    streamWriter.writeObject(getRoot(instance));
    streamWriter.writeBoolean(getUseModuleType(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.BaseActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem)object);
  }
  
}
