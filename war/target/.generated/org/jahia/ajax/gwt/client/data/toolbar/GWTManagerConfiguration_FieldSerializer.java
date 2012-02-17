package org.jahia.ajax.gwt.client.data.toolbar;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTManagerConfiguration_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getAllTypes(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::allTypes;
  }-*/;
  
  private static native void  setAllTypes(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::allTypes = value;
  }-*/;
  
  private static native boolean getAllowRootNodeEditing(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::allowRootNodeEditing;
  }-*/;
  
  private static native void  setAllowRootNodeEditing(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::allowRootNodeEditing = value;
  }-*/;
  
  private static native java.util.List getAllowedNodeTypesForDragAndDrop(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::allowedNodeTypesForDragAndDrop;
  }-*/;
  
  private static native void  setAllowedNodeTypesForDragAndDrop(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::allowedNodeTypesForDragAndDrop = value;
  }-*/;
  
  private static native boolean getAllowsMultipleSelection(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::allowsMultipleSelection;
  }-*/;
  
  private static native void  setAllowsMultipleSelection(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::allowsMultipleSelection = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar getContextMenu(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::contextMenu;
  }-*/;
  
  private static native void  setContextMenu(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::contextMenu = value;
  }-*/;
  
  private static native java.lang.String getDefaultView(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::defaultView;
  }-*/;
  
  private static native void  setDefaultView(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::defaultView = value;
  }-*/;
  
  private static native boolean getDisplaySearch(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearch;
  }-*/;
  
  private static native void  setDisplaySearch(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearch = value;
  }-*/;
  
  private static native boolean getDisplaySearchInContent(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearchInContent;
  }-*/;
  
  private static native void  setDisplaySearchInContent(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearchInContent = value;
  }-*/;
  
  private static native boolean getDisplaySearchInDateMeta(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearchInDateMeta;
  }-*/;
  
  private static native void  setDisplaySearchInDateMeta(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearchInDateMeta = value;
  }-*/;
  
  private static native boolean getDisplaySearchInFile(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearchInFile;
  }-*/;
  
  private static native void  setDisplaySearchInFile(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearchInFile = value;
  }-*/;
  
  private static native boolean getDisplaySearchInPage(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearchInPage;
  }-*/;
  
  private static native void  setDisplaySearchInPage(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearchInPage = value;
  }-*/;
  
  private static native boolean getDisplaySearchInTag(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearchInTag;
  }-*/;
  
  private static native void  setDisplaySearchInTag(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::displaySearchInTag = value;
  }-*/;
  
  private static native boolean getEnableDragAndDrop(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::enableDragAndDrop;
  }-*/;
  
  private static native void  setEnableDragAndDrop(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::enableDragAndDrop = value;
  }-*/;
  
  private static native boolean getEnableFileDoubleClick(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::enableFileDoubleClick;
  }-*/;
  
  private static native void  setEnableFileDoubleClick(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::enableFileDoubleClick = value;
  }-*/;
  
  private static native boolean getExpandRoot(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::expandRoot;
  }-*/;
  
  private static native void  setExpandRoot(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::expandRoot = value;
  }-*/;
  
  private static native java.util.List getFilters(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::filters;
  }-*/;
  
  private static native void  setFilters(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::filters = value;
  }-*/;
  
  private static native java.util.List getFolderTypes(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::folderTypes;
  }-*/;
  
  private static native void  setFolderTypes(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::folderTypes = value;
  }-*/;
  
  private static native java.util.List getForbiddenNodeTypesForDragAndDrop(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::forbiddenNodeTypesForDragAndDrop;
  }-*/;
  
  private static native void  setForbiddenNodeTypesForDragAndDrop(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::forbiddenNodeTypesForDragAndDrop = value;
  }-*/;
  
  private static native java.lang.String getHiddenRegex(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::hiddenRegex;
  }-*/;
  
  private static native void  setHiddenRegex(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::hiddenRegex = value;
  }-*/;
  
  private static native java.util.List getHiddenTypes(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::hiddenTypes;
  }-*/;
  
  private static native void  setHiddenTypes(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::hiddenTypes = value;
  }-*/;
  
  private static native boolean getHideLeftPanel(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::hideLeftPanel;
  }-*/;
  
  private static native void  setHideLeftPanel(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::hideLeftPanel = value;
  }-*/;
  
  private static native java.util.List getManagerEngineTabs(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::managerEngineTabs;
  }-*/;
  
  private static native void  setManagerEngineTabs(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::managerEngineTabs = value;
  }-*/;
  
  private static native java.util.List getMimeTypes(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::mimeTypes;
  }-*/;
  
  private static native void  setMimeTypes(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::mimeTypes = value;
  }-*/;
  
  private static native java.util.List getNodeTypes(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::nodeTypes;
  }-*/;
  
  private static native void  setNodeTypes(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::nodeTypes = value;
  }-*/;
  
  private static native java.util.List getRepositories(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::repositories;
  }-*/;
  
  private static native void  setRepositories(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::repositories = value;
  }-*/;
  
  private static native java.lang.String getSearchBasePath(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::searchBasePath;
  }-*/;
  
  private static native void  setSearchBasePath(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::searchBasePath = value;
  }-*/;
  
  private static native boolean getSearchInContent(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::searchInContent;
  }-*/;
  
  private static native void  setSearchInContent(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::searchInContent = value;
  }-*/;
  
  private static native boolean getSearchInCurrentSiteOnly(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::searchInCurrentSiteOnly;
  }-*/;
  
  private static native void  setSearchInCurrentSiteOnly(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::searchInCurrentSiteOnly = value;
  }-*/;
  
  private static native boolean getSearchInFile(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::searchInFile;
  }-*/;
  
  private static native void  setSearchInFile(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::searchInFile = value;
  }-*/;
  
  private static native java.lang.String getSelectedAccordion(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::selectedAccordion;
  }-*/;
  
  private static native void  setSelectedAccordion(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::selectedAccordion = value;
  }-*/;
  
  private static native boolean getShowOnlyNodesWithTemplates(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::showOnlyNodesWithTemplates;
  }-*/;
  
  private static native void  setShowOnlyNodesWithTemplates(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::showOnlyNodesWithTemplates = value;
  }-*/;
  
  private static native java.util.List getTableColumnKeys(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::tableColumnKeys;
  }-*/;
  
  private static native void  setTableColumnKeys(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::tableColumnKeys = value;
  }-*/;
  
  private static native java.util.List getTableColumns(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::tableColumns;
  }-*/;
  
  private static native void  setTableColumns(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::tableColumns = value;
  }-*/;
  
  private static native java.util.List getToolbars(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::toolbars;
  }-*/;
  
  private static native void  setToolbars(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::toolbars = value;
  }-*/;
  
  private static native java.util.List getTreeColumnKeys(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::treeColumnKeys;
  }-*/;
  
  private static native void  setTreeColumnKeys(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::treeColumnKeys = value;
  }-*/;
  
  private static native java.util.List getTreeColumns(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::treeColumns;
  }-*/;
  
  private static native void  setTreeColumns(org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::treeColumns = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) throws SerializationException {
    setAllTypes(instance, (java.util.List) streamReader.readObject());
    setAllowRootNodeEditing(instance, streamReader.readBoolean());
    setAllowedNodeTypesForDragAndDrop(instance, (java.util.List) streamReader.readObject());
    setAllowsMultipleSelection(instance, streamReader.readBoolean());
    setContextMenu(instance, (org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar) streamReader.readObject());
    setDefaultView(instance, streamReader.readString());
    setDisplaySearch(instance, streamReader.readBoolean());
    setDisplaySearchInContent(instance, streamReader.readBoolean());
    setDisplaySearchInDateMeta(instance, streamReader.readBoolean());
    setDisplaySearchInFile(instance, streamReader.readBoolean());
    setDisplaySearchInPage(instance, streamReader.readBoolean());
    setDisplaySearchInTag(instance, streamReader.readBoolean());
    setEnableDragAndDrop(instance, streamReader.readBoolean());
    setEnableFileDoubleClick(instance, streamReader.readBoolean());
    setExpandRoot(instance, streamReader.readBoolean());
    setFilters(instance, (java.util.List) streamReader.readObject());
    setFolderTypes(instance, (java.util.List) streamReader.readObject());
    setForbiddenNodeTypesForDragAndDrop(instance, (java.util.List) streamReader.readObject());
    setHiddenRegex(instance, streamReader.readString());
    setHiddenTypes(instance, (java.util.List) streamReader.readObject());
    setHideLeftPanel(instance, streamReader.readBoolean());
    setManagerEngineTabs(instance, (java.util.List) streamReader.readObject());
    setMimeTypes(instance, (java.util.List) streamReader.readObject());
    setNodeTypes(instance, (java.util.List) streamReader.readObject());
    setRepositories(instance, (java.util.List) streamReader.readObject());
    setSearchBasePath(instance, streamReader.readString());
    setSearchInContent(instance, streamReader.readBoolean());
    setSearchInCurrentSiteOnly(instance, streamReader.readBoolean());
    setSearchInFile(instance, streamReader.readBoolean());
    setSelectedAccordion(instance, streamReader.readString());
    setShowOnlyNodesWithTemplates(instance, streamReader.readBoolean());
    setTableColumnKeys(instance, (java.util.List) streamReader.readObject());
    setTableColumns(instance, (java.util.List) streamReader.readObject());
    setToolbars(instance, (java.util.List) streamReader.readObject());
    setTreeColumnKeys(instance, (java.util.List) streamReader.readObject());
    setTreeColumns(instance, (java.util.List) streamReader.readObject());
    
    org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration instance) throws SerializationException {
    streamWriter.writeObject(getAllTypes(instance));
    streamWriter.writeBoolean(getAllowRootNodeEditing(instance));
    streamWriter.writeObject(getAllowedNodeTypesForDragAndDrop(instance));
    streamWriter.writeBoolean(getAllowsMultipleSelection(instance));
    streamWriter.writeObject(getContextMenu(instance));
    streamWriter.writeString(getDefaultView(instance));
    streamWriter.writeBoolean(getDisplaySearch(instance));
    streamWriter.writeBoolean(getDisplaySearchInContent(instance));
    streamWriter.writeBoolean(getDisplaySearchInDateMeta(instance));
    streamWriter.writeBoolean(getDisplaySearchInFile(instance));
    streamWriter.writeBoolean(getDisplaySearchInPage(instance));
    streamWriter.writeBoolean(getDisplaySearchInTag(instance));
    streamWriter.writeBoolean(getEnableDragAndDrop(instance));
    streamWriter.writeBoolean(getEnableFileDoubleClick(instance));
    streamWriter.writeBoolean(getExpandRoot(instance));
    streamWriter.writeObject(getFilters(instance));
    streamWriter.writeObject(getFolderTypes(instance));
    streamWriter.writeObject(getForbiddenNodeTypesForDragAndDrop(instance));
    streamWriter.writeString(getHiddenRegex(instance));
    streamWriter.writeObject(getHiddenTypes(instance));
    streamWriter.writeBoolean(getHideLeftPanel(instance));
    streamWriter.writeObject(getManagerEngineTabs(instance));
    streamWriter.writeObject(getMimeTypes(instance));
    streamWriter.writeObject(getNodeTypes(instance));
    streamWriter.writeObject(getRepositories(instance));
    streamWriter.writeString(getSearchBasePath(instance));
    streamWriter.writeBoolean(getSearchInContent(instance));
    streamWriter.writeBoolean(getSearchInCurrentSiteOnly(instance));
    streamWriter.writeBoolean(getSearchInFile(instance));
    streamWriter.writeString(getSelectedAccordion(instance));
    streamWriter.writeBoolean(getShowOnlyNodesWithTemplates(instance));
    streamWriter.writeObject(getTableColumnKeys(instance));
    streamWriter.writeObject(getTableColumns(instance));
    streamWriter.writeObject(getToolbars(instance));
    streamWriter.writeObject(getTreeColumnKeys(instance));
    streamWriter.writeObject(getTreeColumns(instance));
    
    org.jahia.ajax.gwt.client.data.toolbar.GWTConfiguration_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration)object);
  }
  
}
