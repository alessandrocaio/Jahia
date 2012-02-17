package org.jahia.ajax.gwt.client.data;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaSite_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getInstalledModules(org.jahia.ajax.gwt.client.data.GWTJahiaSite instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSite::installedModules;
  }-*/;
  
  private static native void  setInstalledModules(org.jahia.ajax.gwt.client.data.GWTJahiaSite instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.GWTJahiaSite::installedModules = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.GWTJahiaSite instance) throws SerializationException {
    setInstalledModules(instance, (java.util.List) streamReader.readObject());
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.GWTJahiaSite instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.GWTJahiaSite();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.GWTJahiaSite instance) throws SerializationException {
    streamWriter.writeObject(getInstalledModules(instance));
    
    com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.GWTJahiaSite_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaSite_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.GWTJahiaSite)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.GWTJahiaSite_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.GWTJahiaSite)object);
  }
  
}
