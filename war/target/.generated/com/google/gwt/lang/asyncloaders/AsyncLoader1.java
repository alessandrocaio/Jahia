package com.google.gwt.lang.asyncloaders;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.core.client.impl.AsyncFragmentLoader;
public class AsyncLoader1 {
// Callbacks that are pending
private static AsyncLoader1__Callback callbacksHead = null;
// The tail of the callbacks list
private static AsyncLoader1__Callback callbacksTail = null;
// A callback caller for this entry point
private static AsyncLoader1 instance = null;
public static void onLoad() {
instance = new AsyncLoader1();
AsyncFragmentLoader.BROWSER_LOADER.fragmentHasLoaded(1);
AsyncFragmentLoader.BROWSER_LOADER.logEventProgress("runCallbacks1", "begin");
instance.runCallbacks();
AsyncFragmentLoader.BROWSER_LOADER.logEventProgress("runCallbacks1", "end");
}
public static void runAsync(RunAsyncCallback callback) {
AsyncLoader1__Callback newCallback = new AsyncLoader1__Callback();
newCallback.callback = callback;
if (callbacksTail != null) {
  callbacksTail.next = newCallback;
}
callbacksTail = newCallback;
if (callbacksHead == null) {
  callbacksHead = newCallback;
}
if (instance != null) {
  instance.runCallbacks();
  return;
}
if (!AsyncFragmentLoader.BROWSER_LOADER.isLoading(1)) {
  AsyncFragmentLoader.BROWSER_LOADER.inject(1,
  new AsyncFragmentLoader.LoadTerminatedHandler() {
    public void loadTerminated(Throwable reason) {
      runCallbackOnFailures(reason);
    }
  });
}
}
public void runCallbacks() {
while (callbacksHead != null) {
  GWT.UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
  AsyncLoader1__Callback next = callbacksHead;
  callbacksHead = callbacksHead.next;
  if (callbacksHead == null) {
    callbacksTail = null;
  }
  if (handler == null) {
    next.callback.onSuccess();
  } else {
    try {
      next.callback.onSuccess();
    } catch (Throwable e) {
      handler.onUncaughtException(e);
    }
  }
}
}
private static void runCallbackOnFailures(Throwable e) {
while (callbacksHead != null) {
  callbacksHead.callback.onFailure(e);
  callbacksHead = callbacksHead.next;
}
callbacksTail = null;
}
}
