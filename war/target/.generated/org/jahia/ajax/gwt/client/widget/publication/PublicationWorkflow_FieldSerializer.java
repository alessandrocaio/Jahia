package org.jahia.ajax.gwt.client.widget.publication;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class PublicationWorkflow_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getPublicationInfos(org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow instance) /*-{
    return instance.@org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow::publicationInfos;
  }-*/;
  
  private static native void  setPublicationInfos(org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow instance, java.util.List value) /*-{
    instance.@org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow::publicationInfos = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow instance) throws SerializationException {
    setPublicationInfos(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow instance) throws SerializationException {
    streamWriter.writeObject(getPublicationInfos(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow_FieldSerializer.deserialize(reader, (org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow_FieldSerializer.serialize(writer, (org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow)object);
  }
  
}
