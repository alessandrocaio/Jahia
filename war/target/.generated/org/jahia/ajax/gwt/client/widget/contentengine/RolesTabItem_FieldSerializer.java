package org.jahia.ajax.gwt.client.widget.contentengine;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class RolesTabItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getCanBreakInheritance(org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem::canBreakInheritance;
  }-*/;
  
  private static native void  setCanBreakInheritance(org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem::canBreakInheritance = value;
  }-*/;
  
  private static native java.util.Set getRoleGroups(org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem::roleGroups;
  }-*/;
  
  private static native void  setRoleGroups(org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem instance, java.util.Set value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem::roleGroups = value;
  }-*/;
  
  private static native java.util.Set getRoles(org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem::roles;
  }-*/;
  
  private static native void  setRoles(org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem instance, java.util.Set value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem::roles = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem instance) throws SerializationException {
    setCanBreakInheritance(instance, streamReader.readBoolean());
    setRoleGroups(instance, (java.util.Set) streamReader.readObject());
    setRoles(instance, (java.util.Set) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem instance) throws SerializationException {
    streamWriter.writeBoolean(getCanBreakInheritance(instance));
    streamWriter.writeObject(getRoleGroups(instance));
    streamWriter.writeObject(getRoles(instance));
    
    org.jahia.ajax.gwt.client.widget.contentengine.EditEngineTabItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem)object);
  }
  
}
