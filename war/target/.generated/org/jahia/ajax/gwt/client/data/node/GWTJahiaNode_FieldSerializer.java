package org.jahia.ajax.gwt.client.data.node;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTJahiaNode_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getDisplayable(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::displayable;
  }-*/;
  
  private static native void  setDisplayable(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::displayable = value;
  }-*/;
  
  private static native boolean getExpandOnLoad(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::expandOnLoad;
  }-*/;
  
  private static native void  setExpandOnLoad(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::expandOnLoad = value;
  }-*/;
  
  private static native java.util.Map getFullPublicationInfos(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::fullPublicationInfos;
  }-*/;
  
  private static native void  setFullPublicationInfos(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::fullPublicationInfos = value;
  }-*/;
  
  private static native boolean getHasChildren(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::hasChildren;
  }-*/;
  
  private static native void  setHasChildren(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::hasChildren = value;
  }-*/;
  
  private static native boolean getIsShared(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::isShared;
  }-*/;
  
  private static native void  setIsShared(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::isShared = value;
  }-*/;
  
  private static native java.lang.String getLanguageCode(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::languageCode;
  }-*/;
  
  private static native void  setLanguageCode(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::languageCode = value;
  }-*/;
  
  private static native java.util.Map getLanguageLocked(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::languageLocked;
  }-*/;
  
  private static native void  setLanguageLocked(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::languageLocked = value;
  }-*/;
  
  private static native boolean getMatchFilters(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::matchFilters;
  }-*/;
  
  private static native void  setMatchFilters(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::matchFilters = value;
  }-*/;
  
  private static native java.lang.String getNormalizedName(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::normalizedName;
  }-*/;
  
  private static native void  setNormalizedName(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::normalizedName = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.node.GWTBitSet getPermissions(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::permissions;
  }-*/;
  
  private static native void  setPermissions(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, org.jahia.ajax.gwt.client.data.node.GWTBitSet value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::permissions = value;
  }-*/;
  
  private static native boolean getPortlet(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::portlet;
  }-*/;
  
  private static native void  setPortlet(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::portlet = value;
  }-*/;
  
  private static native java.util.Map getPublicationInfos(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::publicationInfos;
  }-*/;
  
  private static native void  setPublicationInfos(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::publicationInfos = value;
  }-*/;
  
  private static native boolean getReference(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::reference;
  }-*/;
  
  private static native void  setReference(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::reference = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.node.GWTJahiaNode getReferencedNode(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::referencedNode;
  }-*/;
  
  private static native void  setReferencedNode(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, org.jahia.ajax.gwt.client.data.node.GWTJahiaNode value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::referencedNode = value;
  }-*/;
  
  private static native boolean getSelectedOnLoad(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::selectedOnLoad;
  }-*/;
  
  private static native void  setSelectedOnLoad(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::selectedOnLoad = value;
  }-*/;
  
  private static native java.lang.String getSelectedVersion(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::selectedVersion;
  }-*/;
  
  private static native void  setSelectedVersion(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::selectedVersion = value;
  }-*/;
  
  private static native com.extjs.gxt.ui.client.data.SortInfo getSortInfo(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::sortInfo;
  }-*/;
  
  private static native void  setSortInfo(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, com.extjs.gxt.ui.client.data.SortInfo value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::sortInfo = value;
  }-*/;
  
  private static native java.lang.String getUrl(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::url;
  }-*/;
  
  private static native void  setUrl(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, java.lang.String value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::url = value;
  }-*/;
  
  private static native boolean getVersioned(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::versioned;
  }-*/;
  
  private static native void  setVersioned(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::versioned = value;
  }-*/;
  
  private static native java.util.List getVersions(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::versions;
  }-*/;
  
  private static native void  setVersions(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::versions = value;
  }-*/;
  
  private static native boolean getWcagCompliance(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::wcagCompliance;
  }-*/;
  
  private static native void  setWcagCompliance(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, boolean value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::wcagCompliance = value;
  }-*/;
  
  private static native org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo getWorkflowInfo(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::workflowInfo;
  }-*/;
  
  private static native void  setWorkflowInfo(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::workflowInfo = value;
  }-*/;
  
  private static native java.util.Map getWorkflowInfos(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::workflowInfos;
  }-*/;
  
  private static native void  setWorkflowInfos(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance, java.util.Map value) /*-{
    instance.@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::workflowInfos = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) throws SerializationException {
    setDisplayable(instance, streamReader.readBoolean());
    setExpandOnLoad(instance, streamReader.readBoolean());
    setFullPublicationInfos(instance, (java.util.Map) streamReader.readObject());
    setHasChildren(instance, streamReader.readBoolean());
    setIsShared(instance, streamReader.readBoolean());
    setLanguageCode(instance, streamReader.readString());
    setLanguageLocked(instance, (java.util.Map) streamReader.readObject());
    setMatchFilters(instance, streamReader.readBoolean());
    setNormalizedName(instance, streamReader.readString());
    setPermissions(instance, (org.jahia.ajax.gwt.client.data.node.GWTBitSet) streamReader.readObject());
    setPortlet(instance, streamReader.readBoolean());
    setPublicationInfos(instance, (java.util.Map) streamReader.readObject());
    setReference(instance, streamReader.readBoolean());
    setReferencedNode(instance, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNode) streamReader.readObject());
    setSelectedOnLoad(instance, streamReader.readBoolean());
    setSelectedVersion(instance, streamReader.readString());
    setSortInfo(instance, (com.extjs.gxt.ui.client.data.SortInfo) streamReader.readObject());
    setUrl(instance, streamReader.readString());
    setVersioned(instance, streamReader.readBoolean());
    setVersions(instance, (java.util.List) streamReader.readObject());
    setWcagCompliance(instance, streamReader.readBoolean());
    setWorkflowInfo(instance, (org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo) streamReader.readObject());
    setWorkflowInfos(instance, (java.util.Map) streamReader.readObject());
    
    com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.data.node.GWTJahiaNode();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.data.node.GWTJahiaNode instance) throws SerializationException {
    streamWriter.writeBoolean(getDisplayable(instance));
    streamWriter.writeBoolean(getExpandOnLoad(instance));
    streamWriter.writeObject(getFullPublicationInfos(instance));
    streamWriter.writeBoolean(getHasChildren(instance));
    streamWriter.writeBoolean(getIsShared(instance));
    streamWriter.writeString(getLanguageCode(instance));
    streamWriter.writeObject(getLanguageLocked(instance));
    streamWriter.writeBoolean(getMatchFilters(instance));
    streamWriter.writeString(getNormalizedName(instance));
    streamWriter.writeObject(getPermissions(instance));
    streamWriter.writeBoolean(getPortlet(instance));
    streamWriter.writeObject(getPublicationInfos(instance));
    streamWriter.writeBoolean(getReference(instance));
    streamWriter.writeObject(getReferencedNode(instance));
    streamWriter.writeBoolean(getSelectedOnLoad(instance));
    streamWriter.writeString(getSelectedVersion(instance));
    streamWriter.writeObject(getSortInfo(instance));
    streamWriter.writeString(getUrl(instance));
    streamWriter.writeBoolean(getVersioned(instance));
    streamWriter.writeObject(getVersions(instance));
    streamWriter.writeBoolean(getWcagCompliance(instance));
    streamWriter.writeObject(getWorkflowInfo(instance));
    streamWriter.writeObject(getWorkflowInfos(instance));
    
    com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNode)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.data.node.GWTJahiaNode)object);
  }
  
}
