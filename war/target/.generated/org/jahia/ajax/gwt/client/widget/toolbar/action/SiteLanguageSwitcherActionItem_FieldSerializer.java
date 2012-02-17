package org.jahia.ajax.gwt.client.widget.toolbar.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class SiteLanguageSwitcherActionItem_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getSiteKey(org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem::siteKey;
  }-*/;
  
  private static native void  setSiteKey(org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem::siteKey = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem instance) throws SerializationException {
    setSiteKey(instance, streamReader.readString());
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem instance) throws SerializationException {
    streamWriter.writeString(getSiteKey(instance));
    
    org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem)object);
  }
  
}
