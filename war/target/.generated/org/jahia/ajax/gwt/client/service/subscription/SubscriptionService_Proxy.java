package org.jahia.ajax.gwt.client.service.subscription;

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

public class SubscriptionService_Proxy extends RemoteServiceProxy implements org.jahia.ajax.gwt.client.service.subscription.SubscriptionServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.jahia.ajax.gwt.client.service.subscription.SubscriptionService";
  private static final String SERIALIZATION_POLICY ="8B2414A32F04B5E96499177A370D0956";
  private static final org.jahia.ajax.gwt.client.service.subscription.SubscriptionService_TypeSerializer SERIALIZER = new org.jahia.ajax.gwt.client.service.subscription.SubscriptionService_TypeSerializer();
  
  public SubscriptionService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void cancel(java.util.List subscriptions, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.cancel", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cancel");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(subscriptions);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.cancel",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "SubscriptionService_Proxy.cancel", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getSubscriptions(java.lang.String uuid, com.extjs.gxt.ui.client.data.PagingLoadConfig pagingConfig, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.getSubscriptions", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getSubscriptions");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("com.extjs.gxt.ui.client.data.PagingLoadConfig");
      streamWriter.writeString(uuid);
      streamWriter.writeObject(pagingConfig);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.getSubscriptions",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "SubscriptionService_Proxy.getSubscriptions", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void resume(java.util.List subscriptions, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.resume", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("resume");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(subscriptions);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.resume",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "SubscriptionService_Proxy.resume", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void subscribe(java.lang.String uuid, java.lang.String subscribersFile, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.subscribe", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("subscribe");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(uuid);
      streamWriter.writeString(subscribersFile);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.subscribe",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "SubscriptionService_Proxy.subscribe", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void subscribe(java.lang.String uuid, java.util.List subscribers, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.subscribe", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("subscribe");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString(uuid);
      streamWriter.writeObject(subscribers);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.subscribe",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "SubscriptionService_Proxy.subscribe", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void suspend(java.util.List subscriptions, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.suspend", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("suspend");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(subscriptions);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SubscriptionService_Proxy.suspend",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "SubscriptionService_Proxy.suspend", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
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
