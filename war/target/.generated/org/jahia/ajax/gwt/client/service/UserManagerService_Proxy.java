package org.jahia.ajax.gwt.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class UserManagerService_Proxy extends RemoteServiceProxy implements org.jahia.ajax.gwt.client.service.UserManagerServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.jahia.ajax.gwt.client.service.UserManagerService";
  private static final String SERIALIZATION_POLICY ="33DB41C0BDAB220D7D6B0E38AE95AD8E";
  private static final org.jahia.ajax.gwt.client.service.UserManagerService_TypeSerializer SERIALIZER = new org.jahia.ajax.gwt.client.service.UserManagerService_TypeSerializer();
  
  public UserManagerService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getFormattedPrincipal(java.lang.String userkey, char type, java.lang.String[] textpattern, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UserManagerService_Proxy.getFormattedPrincipal", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getFormattedPrincipal");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("C");
      streamWriter.writeString("[Ljava.lang.String;/2600011424");
      streamWriter.writeString(userkey);
      streamWriter.writeChar(type);
      streamWriter.writeObject(textpattern);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UserManagerService_Proxy.getFormattedPrincipal",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "UserManagerService_Proxy.getFormattedPrincipal", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void searchGroups(java.lang.String match, int offset, int limit, java.util.List siteIds, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UserManagerService_Proxy.searchGroups", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("searchGroups");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString(match);
      streamWriter.writeInt(offset);
      streamWriter.writeInt(limit);
      streamWriter.writeObject(siteIds);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UserManagerService_Proxy.searchGroups",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "UserManagerService_Proxy.searchGroups", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void searchGroupsInContext(java.lang.String match, int offset, int limit, java.lang.String context, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UserManagerService_Proxy.searchGroupsInContext", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("searchGroupsInContext");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(match);
      streamWriter.writeInt(offset);
      streamWriter.writeInt(limit);
      streamWriter.writeString(context);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UserManagerService_Proxy.searchGroupsInContext",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "UserManagerService_Proxy.searchGroupsInContext", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void searchUsers(java.lang.String match, int offset, int limit, java.util.List siteIds, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UserManagerService_Proxy.searchUsers", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("searchUsers");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString(match);
      streamWriter.writeInt(offset);
      streamWriter.writeInt(limit);
      streamWriter.writeObject(siteIds);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UserManagerService_Proxy.searchUsers",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "UserManagerService_Proxy.searchUsers", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void searchUsersInContext(java.lang.String match, int offset, int limit, java.lang.String context, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UserManagerService_Proxy.searchUsersInContext", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("searchUsersInContext");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(match);
      streamWriter.writeInt(offset);
      streamWriter.writeInt(limit);
      streamWriter.writeString(context);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("UserManagerService_Proxy.searchUsersInContext",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "UserManagerService_Proxy.searchUsersInContext", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
}
