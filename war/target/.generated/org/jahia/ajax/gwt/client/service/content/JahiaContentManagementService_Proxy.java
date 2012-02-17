package org.jahia.ajax.gwt.client.service.content;

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

public class JahiaContentManagementService_Proxy extends RemoteServiceProxy implements org.jahia.ajax.gwt.client.service.content.JahiaContentManagementServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.jahia.ajax.gwt.client.service.content.JahiaContentManagementService";
  private static final String SERIALIZATION_POLICY ="F86F585ABD270594C9302575DD458F1A";
  private static final org.jahia.ajax.gwt.client.service.content.JahiaContentManagementService_TypeSerializer SERIALIZER = new org.jahia.ajax.gwt.client.service.content.JahiaContentManagementService_TypeSerializer();
  
  public JahiaContentManagementService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void abortWorkflow(java.lang.String processId, java.lang.String provider, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.abortWorkflow", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("abortWorkflow");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(processId);
      streamWriter.writeString(provider);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.abortWorkflow",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.abortWorkflow", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void activateVersioning(java.util.List path, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.activateVersioning", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("activateVersioning");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.activateVersioning",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.activateVersioning", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void addCommentToWorkflow(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow task, java.lang.String comment, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.addCommentToWorkflow", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("addCommentToWorkflow");
      streamWriter.writeInt(2);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow/3965068784");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(task);
      streamWriter.writeString(comment);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.addCommentToWorkflow",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.addCommentToWorkflow", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void assignAndCompleteTask(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask task, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome outcome, java.util.List properties, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.assignAndCompleteTask", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("assignAndCompleteTask");
      streamWriter.writeInt(3);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask/2438645135");
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome/3426175649");
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(task);
      streamWriter.writeObject(outcome);
      streamWriter.writeObject(properties);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.assignAndCompleteTask",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.assignAndCompleteTask", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void checkExistence(java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.checkExistence", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("checkExistence");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.checkExistence",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.checkExistence", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void checkWriteable(java.util.List paths, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.checkWriteable", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("checkWriteable");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(paths);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.checkWriteable",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.checkWriteable", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void cleanReferences(java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.cleanReferences", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cleanReferences");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.cleanReferences",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.cleanReferences", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void clearAllLocks(java.lang.String path, boolean processChildNodes, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.clearAllLocks", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("clearAllLocks");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeString(path);
      streamWriter.writeBoolean(processChildNodes);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.clearAllLocks",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.clearAllLocks", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void closeEditEngine(java.lang.String nodepath, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.closeEditEngine", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("closeEditEngine");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(nodepath);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.closeEditEngine",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.closeEditEngine", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void compareAcl(org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL nodeAcl, java.util.List reference, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.compareAcl", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("compareAcl");
      streamWriter.writeInt(2);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL/65499619");
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(nodeAcl);
      streamWriter.writeObject(reference);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.compareAcl",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.compareAcl", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void createDefaultUsersGroupACE(java.util.List permissions, boolean grand, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createDefaultUsersGroupACE", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createDefaultUsersGroupACE");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("Z");
      streamWriter.writeObject(permissions);
      streamWriter.writeBoolean(grand);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createDefaultUsersGroupACE",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.createDefaultUsersGroupACE", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void createFolder(java.lang.String parentPath, java.lang.String name, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createFolder", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createFolder");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(parentPath);
      streamWriter.writeString(name);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createFolder",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.createFolder", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void createGoogleGadgetPortletInstance(java.lang.String path, java.lang.String name, java.lang.String script, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createGoogleGadgetPortletInstance", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createGoogleGadgetPortletInstance");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      streamWriter.writeString(name);
      streamWriter.writeString(script);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createGoogleGadgetPortletInstance",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.createGoogleGadgetPortletInstance", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void createNode(java.lang.String parentPath, java.lang.String name, java.lang.String nodeType, java.util.List mixin, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL acl, java.util.List props, java.util.Map langCodeProperties, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createNode", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createNode");
      streamWriter.writeInt(7);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL/65499619");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.Map");
      streamWriter.writeString(parentPath);
      streamWriter.writeString(name);
      streamWriter.writeString(nodeType);
      streamWriter.writeObject(mixin);
      streamWriter.writeObject(acl);
      streamWriter.writeObject(props);
      streamWriter.writeObject(langCodeProperties);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createNode",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.createNode", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void createNodeAndMoveBefore(java.lang.String path, java.lang.String name, java.lang.String nodeType, java.util.List mixin, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL acl, java.util.List properties, java.util.Map langCodeProperties, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createNodeAndMoveBefore", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createNodeAndMoveBefore");
      streamWriter.writeInt(7);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL/65499619");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.Map");
      streamWriter.writeString(path);
      streamWriter.writeString(name);
      streamWriter.writeString(nodeType);
      streamWriter.writeObject(mixin);
      streamWriter.writeObject(acl);
      streamWriter.writeObject(properties);
      streamWriter.writeObject(langCodeProperties);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createNodeAndMoveBefore",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.createNodeAndMoveBefore", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void createPortletInstance(java.lang.String path, org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance wiz, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createPortletInstance", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createPortletInstance");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance/3905935021");
      streamWriter.writeString(path);
      streamWriter.writeObject(wiz);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createPortletInstance",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.createPortletInstance", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void createRSSPortletInstance(java.lang.String path, java.lang.String name, java.lang.String url, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createRSSPortletInstance", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createRSSPortletInstance");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      streamWriter.writeString(name);
      streamWriter.writeString(url);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createRSSPortletInstance",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.createRSSPortletInstance", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void createRemotePublication(java.lang.String nodeName, java.util.Map props, boolean validateConnectionSettings, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createRemotePublication", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createRemotePublication");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Map");
      streamWriter.writeString("Z");
      streamWriter.writeString(nodeName);
      streamWriter.writeObject(props);
      streamWriter.writeBoolean(validateConnectionSettings);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createRemotePublication",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "JahiaContentManagementService_Proxy.createRemotePublication", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void createTemplateSet(java.lang.String key, java.lang.String baseSet, java.lang.String siteType, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createTemplateSet", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("createTemplateSet");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(key);
      streamWriter.writeString(baseSet);
      streamWriter.writeString(siteType);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.createTemplateSet",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.createTemplateSet", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void cropImage(java.lang.String path, java.lang.String target, int top, int left, int width, int height, boolean forceReplace, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.cropImage", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("cropImage");
      streamWriter.writeInt(7);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("Z");
      streamWriter.writeString(path);
      streamWriter.writeString(target);
      streamWriter.writeInt(top);
      streamWriter.writeInt(left);
      streamWriter.writeInt(width);
      streamWriter.writeInt(height);
      streamWriter.writeBoolean(forceReplace);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.cropImage",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.cropImage", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void deleteAllCompletedJobs(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.deleteAllCompletedJobs", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteAllCompletedJobs");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.deleteAllCompletedJobs",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.deleteAllCompletedJobs", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void deleteJob(java.lang.String jobName, java.lang.String groupName, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.deleteJob", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deleteJob");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(jobName);
      streamWriter.writeString(groupName);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.deleteJob",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.deleteJob", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void deletePaths(java.util.List paths, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.deletePaths", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deletePaths");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(paths);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.deletePaths",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.deletePaths", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void deployTemplates(java.lang.String templatesPath, java.lang.String sitePath, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.deployTemplates", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deployTemplates");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(templatesPath);
      streamWriter.writeString(sitePath);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.deployTemplates",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.deployTemplates", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void drawPortletInstanceOutput(java.lang.String windowID, java.lang.String entryPointIDStr, java.lang.String pathInfo, java.lang.String queryString, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.drawPortletInstanceOutput", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("drawPortletInstanceOutput");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(windowID);
      streamWriter.writeString(entryPointIDStr);
      streamWriter.writeString(pathInfo);
      streamWriter.writeString(queryString);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.drawPortletInstanceOutput",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.drawPortletInstanceOutput", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void flush(java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.flush", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("flush");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.flush",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.flush", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void flushAll(com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.flushAll", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("flushAll");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.flushAll",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.flushAll", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void flushSite(java.lang.String siteUUID, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.flushSite", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("flushSite");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(siteUUID);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.flushSite",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.flushSite", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void generateWar(java.lang.String moduleName, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.generateWar", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("generateWar");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(moduleName);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.generateWar",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.generateWar", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void getAbsolutePath(java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getAbsolutePath", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getAbsolutePath");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getAbsolutePath",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "JahiaContentManagementService_Proxy.getAbsolutePath", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getAllJobGroupNames(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getAllJobGroupNames", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getAllJobGroupNames");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getAllJobGroupNames",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getAllJobGroupNames", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getAvailableSites(com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getAvailableSites", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getAvailableSites");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getAvailableSites",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getAvailableSites", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void getContentHistory(java.lang.String nodeIdentifier, int offset, int limit, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getContentHistory", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getContentHistory");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString(nodeIdentifier);
      streamWriter.writeInt(offset);
      streamWriter.writeInt(limit);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getContentHistory",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getContentHistory", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getContentTypes(java.util.List baseTypes, boolean includeSubTypes, boolean displayStudioElement, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getContentTypes", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getContentTypes");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeObject(baseTypes);
      streamWriter.writeBoolean(includeSubTypes);
      streamWriter.writeBoolean(displayStudioElement);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getContentTypes",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getContentTypes", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getContentTypesAsTree(java.util.List paths, java.util.List nodeTypes, java.util.List fields, boolean includeSubTypes, boolean includeNonDependentModules, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getContentTypesAsTree", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getContentTypesAsTree");
      streamWriter.writeInt(5);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeObject(paths);
      streamWriter.writeObject(nodeTypes);
      streamWriter.writeObject(fields);
      streamWriter.writeBoolean(includeSubTypes);
      streamWriter.writeBoolean(includeNonDependentModules);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getContentTypesAsTree",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getContentTypesAsTree", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getEditConfiguration(java.lang.String path, java.lang.String name, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getEditConfiguration", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getEditConfiguration");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      streamWriter.writeString(name);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getEditConfiguration",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getEditConfiguration", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getExportUrl(java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getExportUrl", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getExportUrl");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getExportUrl",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "JahiaContentManagementService_Proxy.getExportUrl", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getFieldInitializerValues(java.lang.String typeName, java.lang.String propertyName, java.lang.String parentPath, java.util.Map dependentValues, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getFieldInitializerValues", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getFieldInitializerValues");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Map");
      streamWriter.writeString(typeName);
      streamWriter.writeString(propertyName);
      streamWriter.writeString(parentPath);
      streamWriter.writeObject(dependentValues);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getFieldInitializerValues",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getFieldInitializerValues", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getGWTToolbars(java.lang.String toolbarGroup, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getGWTToolbars", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getGWTToolbars");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(toolbarGroup);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getGWTToolbars",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getGWTToolbars", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getHighlighted(java.lang.String original, java.lang.String amendment, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getHighlighted", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getHighlighted");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(original);
      streamWriter.writeString(amendment);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getHighlighted",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "JahiaContentManagementService_Proxy.getHighlighted", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getJobs(int offset, int limit, java.lang.String sortField, java.lang.String sortDir, java.util.List groupNames, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getJobs", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getJobs");
      streamWriter.writeInt(5);
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.List");
      streamWriter.writeInt(offset);
      streamWriter.writeInt(limit);
      streamWriter.writeString(sortField);
      streamWriter.writeString(sortDir);
      streamWriter.writeObject(groupNames);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getJobs",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getJobs", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getManagerConfiguration(java.lang.String name, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getManagerConfiguration", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getManagerConfiguration");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(name);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getManagerConfiguration",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getManagerConfiguration", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getMountpoints(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getMountpoints", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getMountpoints");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getMountpoints",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getMountpoints", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getNodeType(java.lang.String names, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodeType", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getNodeType");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(names);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodeType",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getNodeType", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getNodeTypes(java.util.List names, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodeTypes", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getNodeTypes");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(names);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodeTypes",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getNodeTypes", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getNodeURL(java.lang.String servlet, java.lang.String path, java.util.Date versionDate, java.lang.String versionLabel, java.lang.String workspace, java.lang.String locale, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodeURL", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getNodeURL");
      streamWriter.writeInt(6);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Date/1659716317");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(servlet);
      streamWriter.writeString(path);
      streamWriter.writeObject(versionDate);
      streamWriter.writeString(versionLabel);
      streamWriter.writeString(workspace);
      streamWriter.writeString(locale);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodeURL",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "JahiaContentManagementService_Proxy.getNodeURL", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getNodeURLByIdentifier(java.lang.String servlet, java.lang.String identifier, java.util.Date versionDate, java.lang.String versionLabel, java.lang.String workspace, java.lang.String locale, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodeURLByIdentifier", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getNodeURLByIdentifier");
      streamWriter.writeInt(6);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Date/1659716317");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(servlet);
      streamWriter.writeString(identifier);
      streamWriter.writeObject(versionDate);
      streamWriter.writeString(versionLabel);
      streamWriter.writeString(workspace);
      streamWriter.writeString(locale);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodeURLByIdentifier",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "JahiaContentManagementService_Proxy.getNodeURLByIdentifier", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getNodes(java.util.List paths, java.util.List fields, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodes", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getNodes");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(paths);
      streamWriter.writeObject(fields);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodes",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getNodes", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getNodesAndTypes(java.util.List paths, java.util.List fields, java.util.List types, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodesAndTypes", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getNodesAndTypes");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(paths);
      streamWriter.writeObject(fields);
      streamWriter.writeObject(types);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodesAndTypes",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getNodesAndTypes", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getNodesByCategory(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode category, int offset, int limit, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodesByCategory", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getNodesByCategory");
      streamWriter.writeInt(3);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.node.GWTJahiaNode/3656480997");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeObject(category);
      streamWriter.writeInt(offset);
      streamWriter.writeInt(limit);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNodesByCategory",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getNodesByCategory", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getNumberOfTasksForUser(com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNumberOfTasksForUser", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getNumberOfTasksForUser");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getNumberOfTasksForUser",  "requestSerialized"));
      doInvoke(ResponseReader.INT, "JahiaContentManagementService_Proxy.getNumberOfTasksForUser", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void getPollData(java.util.Set keys, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getPollData", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getPollData");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.Set");
      streamWriter.writeObject(keys);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getPollData",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getPollData", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getPortalNodes(java.lang.String targetAreaName, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getPortalNodes", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getPortalNodes");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(targetAreaName);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getPortalNodes",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getPortalNodes", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void getProperties(java.lang.String path, java.lang.String langCode, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getProperties", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getProperties");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      streamWriter.writeString(langCode);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getProperties",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getProperties", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getPublicationInfo(java.util.List uuids, boolean allSubTree, boolean checkForUnpublication, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getPublicationInfo", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getPublicationInfo");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeObject(uuids);
      streamWriter.writeBoolean(allSubTree);
      streamWriter.writeBoolean(checkForUnpublication);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getPublicationInfo",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getPublicationInfo", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getRenderedContent(java.lang.String path, java.lang.String workspace, java.lang.String locale, java.lang.String template, java.lang.String configuration, java.util.Map contextParams, boolean editMode, java.lang.String configName, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getRenderedContent", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getRenderedContent");
      streamWriter.writeInt(8);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Map");
      streamWriter.writeString("Z");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      streamWriter.writeString(workspace);
      streamWriter.writeString(locale);
      streamWriter.writeString(template);
      streamWriter.writeString(configuration);
      streamWriter.writeObject(contextParams);
      streamWriter.writeBoolean(editMode);
      streamWriter.writeString(configName);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getRenderedContent",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getRenderedContent", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getRoot(java.util.List paths, java.util.List nodeTypes, java.util.List mimeTypes, java.util.List filters, java.util.List fields, java.util.List selectedNodes, java.util.List openPaths, boolean checkSubChild, boolean displayHiddenTypes, java.util.List hiddenTypes, java.lang.String hiddenRegex, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getRoot", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getRoot");
      streamWriter.writeInt(11);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeObject(nodeTypes);
      streamWriter.writeObject(mimeTypes);
      streamWriter.writeObject(filters);
      streamWriter.writeObject(fields);
      streamWriter.writeObject(selectedNodes);
      streamWriter.writeObject(openPaths);
      streamWriter.writeBoolean(checkSubChild);
      streamWriter.writeBoolean(displayHiddenTypes);
      streamWriter.writeObject(hiddenTypes);
      streamWriter.writeString(hiddenRegex);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getRoot",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getRoot", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getSavedSearch(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getSavedSearch", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getSavedSearch");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getSavedSearch",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getSavedSearch", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getStoredPasswordsProviders(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getStoredPasswordsProviders", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getStoredPasswordsProviders");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getStoredPasswordsProviders",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getStoredPasswordsProviders", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getSubNodeTypes(java.util.List names, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getSubNodeTypes", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getSubNodeTypes");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(names);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getSubNodeTypes",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getSubNodeTypes", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getTagNode(java.lang.String tagName, boolean create, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getTagNode", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getTagNode");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeString(tagName);
      streamWriter.writeBoolean(create);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getTagNode",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getTagNode", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getUrlMappings(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode node, java.lang.String locale, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getUrlMappings", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getUrlMappings");
      streamWriter.writeInt(2);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.node.GWTJahiaNode/3656480997");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(node);
      streamWriter.writeString(locale);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getUrlMappings",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getUrlMappings", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getUsages(java.util.List paths, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getUsages", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getUsages");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(paths);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getUsages",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getUsages", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getVersions(java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getVersions", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getVersions");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getVersions",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getVersions", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getVersions(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode node, int limit, int offset, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getVersions", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getVersions");
      streamWriter.writeInt(3);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.node.GWTJahiaNode/3656480997");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeObject(node);
      streamWriter.writeInt(limit);
      streamWriter.writeInt(offset);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getVersions",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getVersions", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getVisibilityInformation(java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getVisibilityInformation", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getVisibilityInformation");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getVisibilityInformation",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getVisibilityInformation", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void getWFFormForNodeAndNodeType(java.lang.String formResourceName, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWFFormForNodeAndNodeType", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWFFormForNodeAndNodeType");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(formResourceName);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWFFormForNodeAndNodeType",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getWFFormForNodeAndNodeType", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void getWorkflowComments(org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow workflow, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowComments", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWorkflowComments");
      streamWriter.writeInt(1);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow/3965068784");
      streamWriter.writeObject(workflow);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowComments",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getWorkflowComments", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getWorkflowDefinitions(java.util.List workflowDefinitionIds, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowDefinitions", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWorkflowDefinitions");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(workflowDefinitionIds);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowDefinitions",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getWorkflowDefinitions", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getWorkflowHistoryForUser(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowHistoryForUser", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWorkflowHistoryForUser");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowHistoryForUser",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getWorkflowHistoryForUser", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getWorkflowHistoryProcesses(java.lang.String nodeId, java.lang.String locale, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowHistoryProcesses", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWorkflowHistoryProcesses");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(nodeId);
      streamWriter.writeString(locale);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowHistoryProcesses",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getWorkflowHistoryProcesses", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getWorkflowHistoryTasks(java.lang.String provider, java.lang.String processId, java.lang.String locale, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowHistoryTasks", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWorkflowHistoryTasks");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(provider);
      streamWriter.writeString(processId);
      streamWriter.writeString(locale);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowHistoryTasks",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getWorkflowHistoryTasks", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getWorkflowRules(java.lang.String path, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowRules", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWorkflowRules");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.getWorkflowRules",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.getWorkflowRules", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void importContent(java.lang.String parentPath, java.lang.String fileKey, java.lang.Boolean asynchronously, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.importContent", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("importContent");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.Boolean/476441737");
      streamWriter.writeString(parentPath);
      streamWriter.writeString(fileKey);
      streamWriter.writeObject(asynchronously);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.importContent",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.importContent", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void importContent(java.lang.String parentPath, java.lang.String fileKey, java.lang.Boolean asynchronously, java.lang.Boolean replaceContent, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.importContent", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("importContent");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.Boolean/476441737");
      streamWriter.writeString("java.lang.Boolean/476441737");
      streamWriter.writeString(parentPath);
      streamWriter.writeString(fileKey);
      streamWriter.writeObject(asynchronously);
      streamWriter.writeObject(replaceContent);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.importContent",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.importContent", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void initializeCreateEngine(java.lang.String typeName, java.lang.String parentPath, java.lang.String targetName, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.initializeCreateEngine", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("initializeCreateEngine");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(typeName);
      streamWriter.writeString(parentPath);
      streamWriter.writeString(targetName);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.initializeCreateEngine",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.initializeCreateEngine", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void initializeCreatePortletEngine(java.lang.String typeName, java.lang.String parentPath, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.initializeCreatePortletEngine", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("initializeCreatePortletEngine");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(typeName);
      streamWriter.writeString(parentPath);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.initializeCreatePortletEngine",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.initializeCreatePortletEngine", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void initializeEditEngine(java.lang.String nodePath, boolean tryToLockNode, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.initializeEditEngine", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("initializeEditEngine");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeString(nodePath);
      streamWriter.writeBoolean(tryToLockNode);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.initializeEditEngine",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.initializeEditEngine", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void initializeEditEngine(java.util.List paths, boolean tryToLockNode, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.initializeEditEngine", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("initializeEditEngine");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("Z");
      streamWriter.writeObject(paths);
      streamWriter.writeBoolean(tryToLockNode);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.initializeEditEngine",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.initializeEditEngine", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void isValidSession(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.isValidSession", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("isValidSession");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.isValidSession",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.isValidSession", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void lsLoad(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode folder, java.util.List nodeTypes, java.util.List mimeTypes, java.util.List filters, java.util.List fields, boolean checkSubChild, int limit, int offset, boolean displayHiddenTypes, java.util.List hiddenTypes, java.lang.String hiddenRegex, boolean showOnlyNodesWithTemplates, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.lsLoad", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("lsLoad");
      streamWriter.writeInt(12);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.node.GWTJahiaNode/3656480997");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("Z");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("Z");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeObject(folder);
      streamWriter.writeObject(nodeTypes);
      streamWriter.writeObject(mimeTypes);
      streamWriter.writeObject(filters);
      streamWriter.writeObject(fields);
      streamWriter.writeBoolean(checkSubChild);
      streamWriter.writeInt(limit);
      streamWriter.writeInt(offset);
      streamWriter.writeBoolean(displayHiddenTypes);
      streamWriter.writeObject(hiddenTypes);
      streamWriter.writeString(hiddenRegex);
      streamWriter.writeBoolean(showOnlyNodesWithTemplates);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.lsLoad",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.lsLoad", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void markForDeletion(java.util.List paths, java.lang.String comment, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.markForDeletion", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("markForDeletion");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeString(comment);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.markForDeletion",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.markForDeletion", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void mount(java.lang.String path, java.lang.String target, java.lang.String root, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.mount", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("mount");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      streamWriter.writeString(target);
      streamWriter.writeString(root);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.mount",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.mount", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void move(java.lang.String sourcePath, java.lang.String targetPath, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.move", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("move");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(sourcePath);
      streamWriter.writeString(targetPath);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.move",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.move", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void moveAtEnd(java.lang.String sourcePath, java.lang.String targetPath, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.moveAtEnd", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("moveAtEnd");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(sourcePath);
      streamWriter.writeString(targetPath);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.moveAtEnd",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.moveAtEnd", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void moveOnTopOf(java.lang.String sourcePath, java.lang.String targetPath, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.moveOnTopOf", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("moveOnTopOf");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(sourcePath);
      streamWriter.writeString(targetPath);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.moveOnTopOf",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.moveOnTopOf", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void paste(java.util.List pathsToCopy, java.lang.String destinationPath, java.lang.String newName, boolean cut, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.paste", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("paste");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeObject(pathsToCopy);
      streamWriter.writeString(destinationPath);
      streamWriter.writeString(newName);
      streamWriter.writeBoolean(cut);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.paste",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.paste", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void pasteReferences(java.util.List pathsToCopy, java.lang.String destinationPath, java.lang.String newName, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.pasteReferences", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("pasteReferences");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(pathsToCopy);
      streamWriter.writeString(destinationPath);
      streamWriter.writeString(newName);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.pasteReferences",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.pasteReferences", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void publish(java.util.List uuids, java.util.List properties, java.util.List comments, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.publish", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("publish");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(uuids);
      streamWriter.writeObject(properties);
      streamWriter.writeObject(comments);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.publish",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.publish", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void rename(java.lang.String path, java.lang.String newName, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.rename", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("rename");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(path);
      streamWriter.writeString(newName);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.rename",  "requestSerialized"));
      doInvoke(ResponseReader.STRING, "JahiaContentManagementService_Proxy.rename", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void resizeImage(java.lang.String path, java.lang.String target, int width, int height, boolean forceReplace, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.resizeImage", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("resizeImage");
      streamWriter.writeInt(5);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("Z");
      streamWriter.writeString(path);
      streamWriter.writeString(target);
      streamWriter.writeInt(width);
      streamWriter.writeInt(height);
      streamWriter.writeBoolean(forceReplace);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.resizeImage",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.resizeImage", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void restoreNode(org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion gwtJahiaNodeVersion, boolean allSubTree, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.restoreNode", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("restoreNode");
      streamWriter.writeInt(2);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion/2787906897");
      streamWriter.writeString("Z");
      streamWriter.writeObject(gwtJahiaNodeVersion);
      streamWriter.writeBoolean(allSubTree);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.restoreNode",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.restoreNode", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void restoreNodeByIdentifierAndDate(java.lang.String identifier, java.util.Date versionDate, java.lang.String versionLabel, boolean allSubTree, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.restoreNodeByIdentifierAndDate", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("restoreNodeByIdentifierAndDate");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.Date/1659716317");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeString(identifier);
      streamWriter.writeObject(versionDate);
      streamWriter.writeString(versionLabel);
      streamWriter.writeBoolean(allSubTree);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.restoreNodeByIdentifierAndDate",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.restoreNodeByIdentifierAndDate", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void rotateImage(java.lang.String path, java.lang.String target, boolean clockwise, boolean forceReplace, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.rotateImage", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("rotateImage");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeString("Z");
      streamWriter.writeString(path);
      streamWriter.writeString(target);
      streamWriter.writeBoolean(clockwise);
      streamWriter.writeBoolean(forceReplace);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.rotateImage",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.rotateImage", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void saveNode(org.jahia.ajax.gwt.client.data.node.GWTJahiaNode node, java.util.List orderedChilden, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL acl, java.util.Map langCodeProperties, java.util.List sharedProperties, java.util.Set removedTypes, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.saveNode", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("saveNode");
      streamWriter.writeInt(6);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.node.GWTJahiaNode/3656480997");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL/65499619");
      streamWriter.writeString("java.util.Map");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.Set");
      streamWriter.writeObject(node);
      streamWriter.writeObject(orderedChilden);
      streamWriter.writeObject(acl);
      streamWriter.writeObject(langCodeProperties);
      streamWriter.writeObject(sharedProperties);
      streamWriter.writeObject(removedTypes);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.saveNode",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.saveNode", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void saveOpenPathsForRepository(java.lang.String repositoryType, java.util.List paths, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.saveOpenPathsForRepository", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("saveOpenPathsForRepository");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString(repositoryType);
      streamWriter.writeObject(paths);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.saveOpenPathsForRepository",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.saveOpenPathsForRepository", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void saveProperties(java.util.List nodes, java.util.List newProps, java.util.Set removedTypes, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.saveProperties", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("saveProperties");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.Set");
      streamWriter.writeObject(nodes);
      streamWriter.writeObject(newProps);
      streamWriter.writeObject(removedTypes);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.saveProperties",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.saveProperties", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void savePropertiesAndACL(java.util.List nodes, org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL acl, java.util.Map langCodeProperties, java.util.List sharedProperties, java.util.Set removedTypes, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.savePropertiesAndACL", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("savePropertiesAndACL");
      streamWriter.writeInt(5);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL/65499619");
      streamWriter.writeString("java.util.Map");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.Set");
      streamWriter.writeObject(nodes);
      streamWriter.writeObject(acl);
      streamWriter.writeObject(langCodeProperties);
      streamWriter.writeObject(sharedProperties);
      streamWriter.writeObject(removedTypes);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.savePropertiesAndACL",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.savePropertiesAndACL", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void saveSearch(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery searchQuery, java.lang.String path, java.lang.String name, boolean onTopOf, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.saveSearch", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("saveSearch");
      streamWriter.writeInt(4);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery/1764725974");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("Z");
      streamWriter.writeObject(searchQuery);
      streamWriter.writeString(path);
      streamWriter.writeString(name);
      streamWriter.writeBoolean(onTopOf);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.saveSearch",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.saveSearch", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void search(java.lang.String searchString, int limit, java.util.List nodeTypes, java.util.List mimeTypes, java.util.List filters, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.search", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("search");
      streamWriter.writeInt(5);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("I");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString(searchString);
      streamWriter.writeInt(limit);
      streamWriter.writeObject(nodeTypes);
      streamWriter.writeObject(mimeTypes);
      streamWriter.writeObject(filters);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.search",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.search", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void search(org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery search, int limit, int offset, boolean showOnlyNodesWithTemplates, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.search", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("search");
      streamWriter.writeInt(4);
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery/1764725974");
      streamWriter.writeString("I");
      streamWriter.writeString("I");
      streamWriter.writeString("Z");
      streamWriter.writeObject(search);
      streamWriter.writeInt(limit);
      streamWriter.writeInt(offset);
      streamWriter.writeBoolean(showOnlyNodesWithTemplates);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.search",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.search", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void searchPortlets(java.lang.String match, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.searchPortlets", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("searchPortlets");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(match);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.searchPortlets",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.searchPortlets", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void searchSQL(java.lang.String searchString, int limit, java.util.List nodeTypes, java.util.List mimeTypes, java.util.List filters, java.util.List fields, boolean sortOnDisplayName, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.searchSQL", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("searchSQL");
      streamWriter.writeInt(7);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("I");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("Z");
      streamWriter.writeString(searchString);
      streamWriter.writeInt(limit);
      streamWriter.writeObject(nodeTypes);
      streamWriter.writeObject(mimeTypes);
      streamWriter.writeObject(filters);
      streamWriter.writeObject(fields);
      streamWriter.writeBoolean(sortOnDisplayName);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.searchSQL",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.searchSQL", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void setLock(java.util.List paths, boolean locked, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.setLock", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("setLock");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("Z");
      streamWriter.writeObject(paths);
      streamWriter.writeBoolean(locked);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.setLock",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.setLock", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void startWorkflow(java.lang.String path, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition workflowDefinition, java.util.List properties, java.util.List comments, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.startWorkflow", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("startWorkflow");
      streamWriter.writeInt(4);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition/3723077732");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString(path);
      streamWriter.writeObject(workflowDefinition);
      streamWriter.writeObject(properties);
      streamWriter.writeObject(comments);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.startWorkflow",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.startWorkflow", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void startWorkflow(java.util.List uuids, org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition def, java.util.List properties, java.util.List comments, java.util.Map args, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.startWorkflow", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("startWorkflow");
      streamWriter.writeInt(5);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition/3723077732");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.Map");
      streamWriter.writeObject(uuids);
      streamWriter.writeObject(def);
      streamWriter.writeObject(properties);
      streamWriter.writeObject(comments);
      streamWriter.writeObject(args);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.startWorkflow",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.startWorkflow", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void storePasswordForProvider(java.lang.String providerKey, java.lang.String username, java.lang.String password, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.storePasswordForProvider", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("storePasswordForProvider");
      streamWriter.writeInt(3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(providerKey);
      streamWriter.writeString(username);
      streamWriter.writeString(password);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.storePasswordForProvider",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.storePasswordForProvider", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void undeletePaths(java.util.List path, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.undeletePaths", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("undeletePaths");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(path);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.undeletePaths",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.undeletePaths", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void unpublish(java.util.List uuids, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.unpublish", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("unpublish");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(uuids);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.unpublish",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.unpublish", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void unzip(java.util.List paths, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.unzip", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("unzip");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(paths);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.unzip",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.unzip", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void uploadedFile(java.util.List uploadeds, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.uploadedFile", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("uploadedFile");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(uploadeds);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.uploadedFile",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.uploadedFile", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void validateWCAG(java.util.Map richTexts, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.validateWCAG", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("validateWCAG");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.Map");
      streamWriter.writeObject(richTexts);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.validateWCAG",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "JahiaContentManagementService_Proxy.validateWCAG", statsContext, payload, asyncCallback);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void zip(java.util.List paths, java.lang.String archiveName, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.zip", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("zip");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(paths);
      streamWriter.writeString(archiveName);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("JahiaContentManagementService_Proxy.zip",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "JahiaContentManagementService_Proxy.zip", statsContext, payload, async);
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
