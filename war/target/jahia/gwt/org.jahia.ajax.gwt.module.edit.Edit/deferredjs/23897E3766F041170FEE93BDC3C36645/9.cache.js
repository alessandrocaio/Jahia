var $intern_6252 = 'AsyncLoader9', $intern_6251 = 'runCallbacks9';
function com_google_gwt_lang_asyncloaders_AsyncLoader9_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader9_2V(){
  var next;
  while (com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksHead) {
    next = com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksHead;
    com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksHead = com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksHead.com_google_gwt_lang_asyncloaders_AsyncLoader9_1_1Callback_next;
    !com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksHead && (com_google_gwt_lang_asyncloaders_AsyncLoader9_callbacksTail = null);
    org_jahia_ajax_gwt_client_widget_toolbar_action_TranslateActionItem$1_$onSuccess__Lorg_jahia_ajax_gwt_client_widget_toolbar_action_TranslateActionItem$1_2V(next.com_google_gwt_lang_asyncloaders_AsyncLoader9_1_1Callback_callback);
  }
}

function com_google_gwt_lang_asyncloaders_AsyncLoader9_AsyncLoader9__V(){
}

function com_google_gwt_lang_asyncloaders_AsyncLoader9_onLoad__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader9_instance = new com_google_gwt_lang_asyncloaders_AsyncLoader9_AsyncLoader9__V;
  com_google_gwt_core_client_impl_AsyncFragmentLoader_$fragmentHasLoaded__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader_2IV((com_google_gwt_core_client_impl_AsyncFragmentLoader_$clinit__V() , com_google_gwt_core_client_impl_AsyncFragmentLoader_BROWSER_1LOADER), 9);
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_6251, $intern_1678, -1, -1));
  com_google_gwt_lang_asyncloaders_AsyncLoader9_instance.runCallbacks__V();
  !!$stats && $stats(com_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_$createStatsEvent__Lcom_google_gwt_core_client_impl_AsyncFragmentLoader$StandardLogger_2Ljava_lang_String_2Ljava_lang_String_2IILcom_google_gwt_core_client_JavaScriptObject_2($intern_6251, $intern_1928, -1, -1));
}

function com_google_gwt_lang_asyncloaders_AsyncLoader9(){
}

_ = com_google_gwt_lang_asyncloaders_AsyncLoader9_AsyncLoader9__V.prototype = com_google_gwt_lang_asyncloaders_AsyncLoader9.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function com_google_gwt_lang_asyncloaders_AsyncLoader9_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader9_12_1classLit;
}
;
_.runCallbacks__V = function com_google_gwt_lang_asyncloaders_AsyncLoader9_runCallbacks__V(){
  com_google_gwt_lang_asyncloaders_AsyncLoader9_$runCallbacks__Lcom_google_gwt_lang_asyncloaders_AsyncLoader9_2V();
}
;
_.java_lang_Object_castableTypeMap$ = {};
function org_jahia_ajax_gwt_client_widget_toolbar_action_TranslateActionItem$1_$onSuccess__Lorg_jahia_ajax_gwt_client_widget_toolbar_action_TranslateActionItem$1_2V(this$static){
  var lh;
  lh = this$static.org_jahia_ajax_gwt_client_widget_toolbar_action_TranslateActionItem$1_this$0.org_jahia_ajax_gwt_client_widget_toolbar_action_BaseActionItem_linker.getSelectionContext__Lorg_jahia_ajax_gwt_client_widget_LinkerSelectionContext_2();
  !!lh.org_jahia_ajax_gwt_client_widget_LinkerSelectionContext_singleSelection && com_extjs_gxt_ui_client_widget_Window_$show__Lcom_extjs_gxt_ui_client_widget_Window_2V(new org_jahia_ajax_gwt_client_widget_contentengine_TranslateContentEngine_TranslateContentEngine__Lorg_jahia_ajax_gwt_client_data_node_GWTJahiaNode_2Lorg_jahia_ajax_gwt_client_widget_Linker_2Lorg_jahia_ajax_gwt_client_data_GWTJahiaLanguage_2Lorg_jahia_ajax_gwt_client_data_GWTJahiaLanguage_2V(lh.org_jahia_ajax_gwt_client_widget_LinkerSelectionContext_singleSelection, this$static.org_jahia_ajax_gwt_client_widget_toolbar_action_TranslateActionItem$1_this$0.org_jahia_ajax_gwt_client_widget_toolbar_action_BaseActionItem_linker, null, null));
}

var com_google_gwt_lang_ClassLiteralHolder_Lcom_1google_1gwt_1lang_1asyncloaders_1AsyncLoader9_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_4588, $intern_6252);
$entry(com_google_gwt_lang_asyncloaders_AsyncLoader9_onLoad__V)();
