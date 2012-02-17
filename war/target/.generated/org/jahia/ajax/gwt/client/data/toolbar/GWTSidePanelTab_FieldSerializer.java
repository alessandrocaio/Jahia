package org.jahia.ajax.gwt.client.data.toolbar;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTSidePanelTab_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getIcon(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::icon;
  }-*/;
  
  private static native void  setIcon(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::icon = value;
  }-*/;
  
  private static native java.lang.String getName(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::name;
  }-*/;
  
  private static native void  setName(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::name = value;
  }-*/;
  
  private static native java.lang.String getRequiredPermission(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::requiredPermission;
  }-*/;
  
  private static native void  setRequiredPermission(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::requiredPermission = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem getTabItem(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::tabItem;
  }-*/;
  
  private static native void  setTabItem(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::tabItem = value;
  }-*/;
  
  private static native java.util.List getTableColumnKeys(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::tableColumnKeys;
  }-*/;
  
  private static native void  setTableColumnKeys(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::tableColumnKeys = value;
  }-*/;
  
  private static native java.util.List getTableColumns(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::tableColumns;
  }-*/;
  
  private static native void  setTableColumns(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::tableColumns = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar getTableContextMenu(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::tableContextMenu;
  }-*/;
  
  private static native void  setTableContextMenu(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::tableContextMenu = value;
  }-*/;
  
  private static native java.lang.String getTooltip(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::tooltip;
  }-*/;
  
  private static native void  setTooltip(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::tooltip = value;
  }-*/;
  
  private static native java.util.List getTreeColumnKeys(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::treeColumnKeys;
  }-*/;
  
  private static native void  setTreeColumnKeys(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::treeColumnKeys = value;
  }-*/;
  
  private static native java.util.List getTreeColumns(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::treeColumns;
  }-*/;
  
  private static native void  setTreeColumns(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::treeColumns = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar getTreeContextMenu(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::treeContextMenu;
  }-*/;
  
  private static native void  setTreeContextMenu(org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::treeContextMenu = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) throws SerializationException {
    setIcon(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setRequiredPermission(instance, streamReader.readString());
    setTabItem(instance, (org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem) streamReader.readObject());
    setTableColumnKeys(instance, (java.util.List) streamReader.readObject());
    setTableColumns(instance, (java.util.List) streamReader.readObject());
    setTableContextMenu(instance, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar) streamReader.readObject());
    setTooltip(instance, streamReader.readString());
    setTreeColumnKeys(instance, (java.util.List) streamReader.readObject());
    setTreeColumns(instance, (java.util.List) streamReader.readObject());
    setTreeContextMenu(instance, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab instance) throws SerializationException {
    streamWriter.writeString(getIcon(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getRequiredPermission(instance));
    streamWriter.writeObject(getTabItem(instance));
    streamWriter.writeObject(getTableColumnKeys(instance));
    streamWriter.writeObject(getTableColumns(instance));
    streamWriter.writeObject(getTableContextMenu(instance));
    streamWriter.writeString(getTooltip(instance));
    streamWriter.writeObject(getTreeColumnKeys(instance));
    streamWriter.writeObject(getTreeColumns(instance));
    streamWriter.writeObject(getTreeContextMenu(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab)object);
  }
  
}
