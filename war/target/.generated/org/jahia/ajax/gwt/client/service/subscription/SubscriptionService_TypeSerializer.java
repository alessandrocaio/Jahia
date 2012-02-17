package org.jahia.ajax.gwt.client.service.subscription;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class SubscriptionService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final MethodMap methodMapNative;
  private static final Map<String, String> signatureMapJava;
  private static final JsArrayString signatureMapNative;
  
  static {
    if (GWT.isScript()) {
      methodMapJava = null;
      methodMapNative = loadMethodsNative();
      signatureMapJava = null;
      signatureMapNative = loadSignaturesNative();
    } else {
      methodMapJava = loadMethodsJava();
      methodMapNative = null;
      signatureMapJava = loadSignaturesJava();
      signatureMapNative = null;
    }
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.extjs.gxt.ui.client.Style$SortDir/640452531", "com.extjs.gxt.ui.client.Style_SortDir_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.core.FastMap/3488076414", "com.extjs.gxt.ui.client.core.FastMap_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.core.FastSet/2139705081", "com.extjs.gxt.ui.client.core.FastSet_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig/47114578", "com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseBooleanFilterConfig;/1642589127", "com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseDateFilterConfig/4013643245", "com.extjs.gxt.ui.client.data.BaseDateFilterConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseDateFilterConfig;/2667437259", "com.extjs.gxt.ui.client.data.BaseDateFilterConfig_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseFilterConfig;/3740213292", "com.extjs.gxt.ui.client.data.BaseFilterConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig/2138211457", "com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418", "com.extjs.gxt.ui.client.data.BaseListFilterConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626", "com.extjs.gxt.ui.client.data.BaseListFilterConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159", "com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402", "com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567", "com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394", "com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562", "com.extjs.gxt.ui.client.data.BaseStringFilterConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225", "com.extjs.gxt.ui.client.data.BaseStringFilterConfig_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560", "com.extjs.gxt.ui.client.data.FilterConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.RpcMap/3441186752", "com.extjs.gxt.ui.client.data.RpcMap_FieldSerializer");
    result.put("com.google.gwt.i18n.client.impl.DateRecord/112389920", "com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer");
    result.put("[Lcom.google.gwt.i18n.client.impl.DateRecord;/2823890031", "com.google.gwt.i18n.client.impl.DateRecord_Array_Rank_1_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.ChangeListenerCollection/687647911", "com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.ClickListenerCollection/3821115695", "com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.FocusListenerCollection/666063950", "com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.FormHandlerCollection/917012841", "com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.KeyboardListenerCollection/1999488875", "com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.LoadListenerCollection/3375237009", "com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.MouseListenerCollection/3197118915", "com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.MouseWheelListenerCollection/3231183817", "com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.PopupListenerCollection/3060919138", "com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.ScrollListenerCollection/295710993", "com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.TabListenerCollection/2392296549", "com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.TableListenerCollection/285369783", "com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer");
    result.put("com.google.gwt.user.client.ui.TreeListenerCollection/449704629", "com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer");
    result.put("java.lang.Boolean/476441737", "com.google.gwt.user.client.rpc.core.java.lang.Boolean_FieldSerializer");
    result.put("[Ljava.lang.Boolean;/2507200464", "com.google.gwt.user.client.rpc.core.java.lang.Boolean_Array_Rank_1_FieldSerializer");
    result.put("java.lang.Byte/1571082439", "com.google.gwt.user.client.rpc.core.java.lang.Byte_FieldSerializer");
    result.put("[Ljava.lang.Byte;/3053163818", "com.google.gwt.user.client.rpc.core.java.lang.Byte_Array_Rank_1_FieldSerializer");
    result.put("java.lang.Double/858496421", "com.google.gwt.user.client.rpc.core.java.lang.Double_FieldSerializer");
    result.put("[Ljava.lang.Double;/2857560407", "com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer");
    result.put("java.lang.Float/1718559123", "com.google.gwt.user.client.rpc.core.java.lang.Float_FieldSerializer");
    result.put("[Ljava.lang.Float;/3956181278", "com.google.gwt.user.client.rpc.core.java.lang.Float_Array_Rank_1_FieldSerializer");
    result.put("java.lang.Integer/3438268394", "com.google.gwt.user.client.rpc.core.java.lang.Integer_FieldSerializer");
    result.put("[Ljava.lang.Integer;/1574882222", "com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer");
    result.put("java.lang.Long/4227064769", "com.google.gwt.user.client.rpc.core.java.lang.Long_FieldSerializer");
    result.put("[Ljava.lang.Long;/97727328", "com.google.gwt.user.client.rpc.core.java.lang.Long_Array_Rank_1_FieldSerializer");
    result.put("java.lang.Short/551743396", "com.google.gwt.user.client.rpc.core.java.lang.Short_FieldSerializer");
    result.put("[Ljava.lang.Short;/3779901635", "com.google.gwt.user.client.rpc.core.java.lang.Short_Array_Rank_1_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("[Ljava.lang.String;/2600011424", "com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer");
    result.put("java.sql.Date/3996530531", "com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer");
    result.put("[Ljava.sql.Date;/773242198", "com.google.gwt.user.client.rpc.core.java.sql.Date_Array_Rank_1_FieldSerializer");
    result.put("java.sql.Time/831929183", "com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer");
    result.put("[Ljava.sql.Time;/3521163259", "com.google.gwt.user.client.rpc.core.java.sql.Time_Array_Rank_1_FieldSerializer");
    result.put("java.sql.Timestamp/1769758459", "com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer");
    result.put("[Ljava.sql.Timestamp;/1267684111", "com.google.gwt.user.client.rpc.core.java.sql.Timestamp_Array_Rank_1_FieldSerializer");
    result.put("java.util.ArrayList/3821976829", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer");
    result.put("java.util.Arrays$ArrayList/1243019747", "com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer");
    result.put("java.util.Collections$EmptyList/3012082351", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer");
    result.put("java.util.Collections$EmptyMap/2636129644", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyMap_FieldSerializer");
    result.put("java.util.Collections$EmptySet/3150696644", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptySet_FieldSerializer");
    result.put("java.util.Collections$SingletonList/833432284", "com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer");
    result.put("java.util.Date/1659716317", "com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer");
    result.put("[Ljava.util.Date;/3828292433", "com.google.gwt.user.client.rpc.core.java.util.Date_Array_Rank_1_FieldSerializer");
    result.put("java.util.HashMap/962170901", "com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer");
    result.put("java.util.HashSet/1594477813", "com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer");
    result.put("java.util.IdentityHashMap/3881143367", "com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer");
    result.put("java.util.LinkedHashMap/1551059846", "com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_FieldSerializer");
    result.put("java.util.LinkedHashSet/3628722029", "com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer");
    result.put("java.util.LinkedList/1060625595", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer");
    result.put("java.util.Stack/1031431137", "com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer");
    result.put("java.util.TreeMap/1575826026", "com.google.gwt.user.client.rpc.core.java.util.TreeMap_FieldSerializer");
    result.put("java.util.TreeSet/1002270346", "com.google.gwt.user.client.rpc.core.java.util.TreeSet_FieldSerializer");
    result.put("java.util.Vector/3125574444", "com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.core.SessionExpirationException/393293680", "org.jahia.ajax.gwt.client.core.SessionExpirationException_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaUser/848623473", "org.jahia.ajax.gwt.client.data.GWTJahiaUser_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaUser;/2598410512", "org.jahia.ajax.gwt.client.data.GWTJahiaUser_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.service.GWTJahiaServiceException/1749529410", "org.jahia.ajax.gwt.client.service.GWTJahiaServiceException_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.service.content.ExistingFileException/4216580985", "org.jahia.ajax.gwt.client.service.content.ExistingFileException_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription/3953111335", "org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.widget.subscription.GWTSubscription;/3360068089", "org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription_Array_Rank_1_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.extjs.gxt.ui.client.Style$SortDir/640452531"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.Style_SortDir_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/Style$SortDir;)
      ];
    
    result["com.extjs.gxt.ui.client.core.FastMap/3488076414"] = [
        @com.extjs.gxt.ui.client.core.FastMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.core.FastMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/core/FastMap;),
        @com.extjs.gxt.ui.client.core.FastMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/core/FastMap;)
      ];
    
    result["com.extjs.gxt.ui.client.core.FastSet/2139705081"] = [
        @com.extjs.gxt.ui.client.core.FastSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.core.FastSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/core/FastSet;),
        @com.extjs.gxt.ui.client.core.FastSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/core/FastSet;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig/47114578"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseBooleanFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseBooleanFilterConfig;/1642589127"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseBooleanFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseDateFilterConfig/4013643245"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseDateFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseDateFilterConfig;/2667437259"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseDateFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseFilterConfig;/3740213292"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig/2138211457"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseFilterPagingLoadConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseListFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseListFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseNumericFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseNumericFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BasePagingLoadConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394"] = [
        @com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BasePagingLoadResult;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseStringFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseStringFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560"] = [
        ,
        ,
        @com.extjs.gxt.ui.client.data.FilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/FilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.RpcMap/3441186752"] = [
        @com.extjs.gxt.ui.client.data.RpcMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.RpcMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/RpcMap;),
        @com.extjs.gxt.ui.client.data.RpcMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/RpcMap;)
      ];
    
    result["com.google.gwt.i18n.client.impl.DateRecord/112389920"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ];
    
    result["[Lcom.google.gwt.i18n.client.impl.DateRecord;/2823890031"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.ui.ChangeListenerCollection/687647911"] = [
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ChangeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ChangeListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.ClickListenerCollection/3821115695"] = [
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ClickListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ClickListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.FocusListenerCollection/666063950"] = [
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.FocusListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/FocusListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.FormHandlerCollection/917012841"] = [
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.FormHandlerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/FormHandlerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.KeyboardListenerCollection/1999488875"] = [
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.KeyboardListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/KeyboardListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.LoadListenerCollection/3375237009"] = [
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.LoadListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/LoadListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.MouseListenerCollection/3197118915"] = [
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MouseListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MouseListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.MouseWheelListenerCollection/3231183817"] = [
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.MouseWheelListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/MouseWheelListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.PopupListenerCollection/3060919138"] = [
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.PopupListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/PopupListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.ScrollListenerCollection/295710993"] = [
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.ScrollListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/ScrollListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TabListenerCollection/2392296549"] = [
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TabListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TabListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TableListenerCollection/285369783"] = [
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TableListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TableListenerCollection;),
      ];
    
    result["com.google.gwt.user.client.ui.TreeListenerCollection/449704629"] = [
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.ui.TreeListenerCollection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/ui/TreeListenerCollection;),
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["[Ljava.lang.Boolean;/2507200464"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Byte/1571082439"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Byte;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Byte;)
      ];
    
    result["[Ljava.lang.Byte;/3053163818"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Byte;),
        @com.google.gwt.user.client.rpc.core.java.lang.Byte_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Byte;)
      ];
    
    result["java.lang.Double/858496421"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Double;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Double;)
      ];
    
    result["[Ljava.lang.Double;/2857560407"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Double;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Double;)
      ];
    
    result["java.lang.Float/1718559123"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Float;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Float;)
      ];
    
    result["[Ljava.lang.Float;/3956181278"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Float_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Float;),
        @com.google.gwt.user.client.rpc.core.java.lang.Float_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Float;)
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["[Ljava.lang.Integer;/1574882222"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Integer;)
      ];
    
    result["java.lang.Long/4227064769"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Long;)
      ];
    
    result["[Ljava.lang.Long;/97727328"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Long;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Long;)
      ];
    
    result["java.lang.Short/551743396"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Short;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Short;)
      ];
    
    result["[Ljava.lang.Short;/3779901635"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Short_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Short;),
        @com.google.gwt.user.client.rpc.core.java.lang.Short_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Short;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/String;)
      ];
    
    result["java.sql.Date/3996530531"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ];
    
    result["[Ljava.sql.Date;/773242198"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/sql/Date;)
      ];
    
    result["java.sql.Time/831929183"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ];
    
    result["[Ljava.sql.Time;/3521163259"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/sql/Time;)
      ];
    
    result["java.sql.Timestamp/1769758459"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ];
    
    result["[Ljava.sql.Timestamp;/1267684111"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/sql/Timestamp;)
      ];
    
    result["java.util.ArrayList/3821976829"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.Arrays$ArrayList/1243019747"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/3012082351"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyMap/2636129644"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Map;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Map;)
      ];
    
    result["java.util.Collections$EmptySet/3150696644"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Set;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Set;)
      ];
    
    result["java.util.Collections$SingletonList/833432284"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Date/1659716317"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
      ];
    
    result["[Ljava.util.Date;/3828292433"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/util/Date;)
      ];
    
    result["java.util.HashMap/962170901"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ];
    
    result["java.util.HashSet/1594477813"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashSet;)
      ];
    
    result["java.util.IdentityHashMap/3881143367"] = [
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/IdentityHashMap;)
      ];
    
    result["java.util.LinkedHashMap/1551059846"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ];
    
    result["java.util.LinkedHashSet/3628722029"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashSet;)
      ];
    
    result["java.util.LinkedList/1060625595"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["java.util.Stack/1031431137"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["java.util.TreeMap/1575826026"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.TreeSet/1002270346"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeSet;)
      ];
    
    result["java.util.Vector/3125574444"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    result["org.jahia.ajax.gwt.client.core.SessionExpirationException/393293680"] = [
        @org.jahia.ajax.gwt.client.core.SessionExpirationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.core.SessionExpirationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/core/SessionExpirationException;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaUser/848623473"] = [
        ,
        ,
        @org.jahia.ajax.gwt.client.data.GWTJahiaUser_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/GWTJahiaUser;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.GWTJahiaUser;/2598410512"] = [
        ,
        ,
        @org.jahia.ajax.gwt.client.data.GWTJahiaUser_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaUser;)
      ];
    
    result["org.jahia.ajax.gwt.client.service.GWTJahiaServiceException/1749529410"] = [
        @org.jahia.ajax.gwt.client.service.GWTJahiaServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.service.GWTJahiaServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/service/GWTJahiaServiceException;),
      ];
    
    result["org.jahia.ajax.gwt.client.service.content.ExistingFileException/4216580985"] = [
        @org.jahia.ajax.gwt.client.service.content.ExistingFileException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.service.content.ExistingFileException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/service/content/ExistingFileException;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription/3953111335"] = [
        @org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/subscription/GWTSubscription;),
        @org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/widget/subscription/GWTSubscription;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.widget.subscription.GWTSubscription;/3360068089"] = [
        @org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/widget/subscription/GWTSubscription;),
        @org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/widget/subscription/GWTSubscription;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.extjs.gxt.ui.client.Style$SortDir", "com.extjs.gxt.ui.client.Style$SortDir/640452531");
    result.put("com.extjs.gxt.ui.client.core.FastMap", "com.extjs.gxt.ui.client.core.FastMap/3488076414");
    result.put("com.extjs.gxt.ui.client.core.FastSet", "com.extjs.gxt.ui.client.core.FastSet/2139705081");
    result.put("com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig", "com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig/47114578");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseBooleanFilterConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseBooleanFilterConfig;/1642589127");
    result.put("com.extjs.gxt.ui.client.data.BaseDateFilterConfig", "com.extjs.gxt.ui.client.data.BaseDateFilterConfig/4013643245");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseDateFilterConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseDateFilterConfig;/2667437259");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseFilterConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseFilterConfig;/3740213292");
    result.put("com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig", "com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig/2138211457");
    result.put("com.extjs.gxt.ui.client.data.BaseListFilterConfig", "com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626");
    result.put("com.extjs.gxt.ui.client.data.BaseNumericFilterConfig", "com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402");
    result.put("com.extjs.gxt.ui.client.data.BasePagingLoadConfig", "com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567");
    result.put("com.extjs.gxt.ui.client.data.BasePagingLoadResult", "com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394");
    result.put("com.extjs.gxt.ui.client.data.BaseStringFilterConfig", "com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225");
    result.put("[Lcom.extjs.gxt.ui.client.data.FilterConfig;", "[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560");
    result.put("com.extjs.gxt.ui.client.data.RpcMap", "com.extjs.gxt.ui.client.data.RpcMap/3441186752");
    result.put("com.google.gwt.i18n.client.impl.DateRecord", "com.google.gwt.i18n.client.impl.DateRecord/112389920");
    result.put("[Lcom.google.gwt.i18n.client.impl.DateRecord;", "[Lcom.google.gwt.i18n.client.impl.DateRecord;/2823890031");
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.ui.ChangeListenerCollection", "com.google.gwt.user.client.ui.ChangeListenerCollection/687647911");
    result.put("com.google.gwt.user.client.ui.ClickListenerCollection", "com.google.gwt.user.client.ui.ClickListenerCollection/3821115695");
    result.put("com.google.gwt.user.client.ui.FocusListenerCollection", "com.google.gwt.user.client.ui.FocusListenerCollection/666063950");
    result.put("com.google.gwt.user.client.ui.FormHandlerCollection", "com.google.gwt.user.client.ui.FormHandlerCollection/917012841");
    result.put("com.google.gwt.user.client.ui.KeyboardListenerCollection", "com.google.gwt.user.client.ui.KeyboardListenerCollection/1999488875");
    result.put("com.google.gwt.user.client.ui.LoadListenerCollection", "com.google.gwt.user.client.ui.LoadListenerCollection/3375237009");
    result.put("com.google.gwt.user.client.ui.MouseListenerCollection", "com.google.gwt.user.client.ui.MouseListenerCollection/3197118915");
    result.put("com.google.gwt.user.client.ui.MouseWheelListenerCollection", "com.google.gwt.user.client.ui.MouseWheelListenerCollection/3231183817");
    result.put("com.google.gwt.user.client.ui.PopupListenerCollection", "com.google.gwt.user.client.ui.PopupListenerCollection/3060919138");
    result.put("com.google.gwt.user.client.ui.ScrollListenerCollection", "com.google.gwt.user.client.ui.ScrollListenerCollection/295710993");
    result.put("com.google.gwt.user.client.ui.TabListenerCollection", "com.google.gwt.user.client.ui.TabListenerCollection/2392296549");
    result.put("com.google.gwt.user.client.ui.TableListenerCollection", "com.google.gwt.user.client.ui.TableListenerCollection/285369783");
    result.put("com.google.gwt.user.client.ui.TreeListenerCollection", "com.google.gwt.user.client.ui.TreeListenerCollection/449704629");
    result.put("java.lang.Boolean", "java.lang.Boolean/476441737");
    result.put("[Ljava.lang.Boolean;", "[Ljava.lang.Boolean;/2507200464");
    result.put("java.lang.Byte", "java.lang.Byte/1571082439");
    result.put("[Ljava.lang.Byte;", "[Ljava.lang.Byte;/3053163818");
    result.put("java.lang.Double", "java.lang.Double/858496421");
    result.put("[Ljava.lang.Double;", "[Ljava.lang.Double;/2857560407");
    result.put("java.lang.Float", "java.lang.Float/1718559123");
    result.put("[Ljava.lang.Float;", "[Ljava.lang.Float;/3956181278");
    result.put("java.lang.Integer", "java.lang.Integer/3438268394");
    result.put("[Ljava.lang.Integer;", "[Ljava.lang.Integer;/1574882222");
    result.put("java.lang.Long", "java.lang.Long/4227064769");
    result.put("[Ljava.lang.Long;", "[Ljava.lang.Long;/97727328");
    result.put("java.lang.Short", "java.lang.Short/551743396");
    result.put("[Ljava.lang.Short;", "[Ljava.lang.Short;/3779901635");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("[Ljava.lang.String;", "[Ljava.lang.String;/2600011424");
    result.put("java.sql.Date", "java.sql.Date/3996530531");
    result.put("[Ljava.sql.Date;", "[Ljava.sql.Date;/773242198");
    result.put("java.sql.Time", "java.sql.Time/831929183");
    result.put("[Ljava.sql.Time;", "[Ljava.sql.Time;/3521163259");
    result.put("java.sql.Timestamp", "java.sql.Timestamp/1769758459");
    result.put("[Ljava.sql.Timestamp;", "[Ljava.sql.Timestamp;/1267684111");
    result.put("java.util.ArrayList", "java.util.ArrayList/3821976829");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/1243019747");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/3012082351");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyMap/2636129644");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptySet/3150696644");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/833432284");
    result.put("java.util.Date", "java.util.Date/1659716317");
    result.put("[Ljava.util.Date;", "[Ljava.util.Date;/3828292433");
    result.put("java.util.HashMap", "java.util.HashMap/962170901");
    result.put("java.util.HashSet", "java.util.HashSet/1594477813");
    result.put("java.util.IdentityHashMap", "java.util.IdentityHashMap/3881143367");
    result.put("java.util.LinkedHashMap", "java.util.LinkedHashMap/1551059846");
    result.put("java.util.LinkedHashSet", "java.util.LinkedHashSet/3628722029");
    result.put("java.util.LinkedList", "java.util.LinkedList/1060625595");
    result.put("java.util.Stack", "java.util.Stack/1031431137");
    result.put("java.util.TreeMap", "java.util.TreeMap/1575826026");
    result.put("java.util.TreeSet", "java.util.TreeSet/1002270346");
    result.put("java.util.Vector", "java.util.Vector/3125574444");
    result.put("org.jahia.ajax.gwt.client.core.SessionExpirationException", "org.jahia.ajax.gwt.client.core.SessionExpirationException/393293680");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaUser", "org.jahia.ajax.gwt.client.data.GWTJahiaUser/848623473");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaUser;", "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaUser;/2598410512");
    result.put("org.jahia.ajax.gwt.client.service.GWTJahiaServiceException", "org.jahia.ajax.gwt.client.service.GWTJahiaServiceException/1749529410");
    result.put("org.jahia.ajax.gwt.client.service.content.ExistingFileException", "org.jahia.ajax.gwt.client.service.content.ExistingFileException/4216580985");
    result.put("org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription", "org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription/3953111335");
    result.put("[Lorg.jahia.ajax.gwt.client.widget.subscription.GWTSubscription;", "[Lorg.jahia.ajax.gwt.client.widget.subscription.GWTSubscription;/3360068089");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.Style$SortDir::class)] = "com.extjs.gxt.ui.client.Style$SortDir/640452531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.core.FastMap::class)] = "com.extjs.gxt.ui.client.core.FastMap/3488076414";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.core.FastSet::class)] = "com.extjs.gxt.ui.client.core.FastSet/2139705081";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig/47114578";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseBooleanFilterConfig;/1642589127";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseDateFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseDateFilterConfig/4013643245";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseDateFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseDateFilterConfig;/2667437259";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseFilterConfig;/3740213292";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig/2138211457";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseNumericFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseNumericFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BasePagingLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BasePagingLoadResult::class)] = "com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseStringFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseStringFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.FilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.RpcMap::class)] = "com.extjs.gxt.ui.client.data.RpcMap/3441186752";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord::class)] = "com.google.gwt.i18n.client.impl.DateRecord/112389920";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord[]::class)] = "[Lcom.google.gwt.i18n.client.impl.DateRecord;/2823890031";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ChangeListenerCollection::class)] = "com.google.gwt.user.client.ui.ChangeListenerCollection/687647911";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ClickListenerCollection::class)] = "com.google.gwt.user.client.ui.ClickListenerCollection/3821115695";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FocusListenerCollection::class)] = "com.google.gwt.user.client.ui.FocusListenerCollection/666063950";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.FormHandlerCollection::class)] = "com.google.gwt.user.client.ui.FormHandlerCollection/917012841";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.KeyboardListenerCollection::class)] = "com.google.gwt.user.client.ui.KeyboardListenerCollection/1999488875";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.LoadListenerCollection::class)] = "com.google.gwt.user.client.ui.LoadListenerCollection/3375237009";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseListenerCollection/3197118915";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.MouseWheelListenerCollection::class)] = "com.google.gwt.user.client.ui.MouseWheelListenerCollection/3231183817";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.PopupListenerCollection::class)] = "com.google.gwt.user.client.ui.PopupListenerCollection/3060919138";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.ScrollListenerCollection::class)] = "com.google.gwt.user.client.ui.ScrollListenerCollection/295710993";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TabListenerCollection::class)] = "com.google.gwt.user.client.ui.TabListenerCollection/2392296549";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TableListenerCollection::class)] = "com.google.gwt.user.client.ui.TableListenerCollection/285369783";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.ui.TreeListenerCollection::class)] = "com.google.gwt.user.client.ui.TreeListenerCollection/449704629";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean[]::class)] = "[Ljava.lang.Boolean;/2507200464";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Byte::class)] = "java.lang.Byte/1571082439";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Byte[]::class)] = "[Ljava.lang.Byte;/3053163818";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double::class)] = "java.lang.Double/858496421";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double[]::class)] = "[Ljava.lang.Double;/2857560407";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Float::class)] = "java.lang.Float/1718559123";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Float[]::class)] = "[Ljava.lang.Float;/3956181278";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer[]::class)] = "[Ljava.lang.Integer;/1574882222";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long::class)] = "java.lang.Long/4227064769";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long[]::class)] = "[Ljava.lang.Long;/97727328";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Short::class)] = "java.lang.Short/551743396";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Short[]::class)] = "[Ljava.lang.Short;/3779901635";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[]::class)] = "[Ljava.lang.String;/2600011424";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/3996530531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date[]::class)] = "[Ljava.sql.Date;/773242198";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/831929183";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time[]::class)] = "[Ljava.sql.Time;/3521163259";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/1769758459";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp[]::class)] = "[Ljava.sql.Timestamp;/1267684111";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/3821976829";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays$ArrayList::class)] = "java.util.Arrays$ArrayList/1243019747";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptyList::class)] = "java.util.Collections$EmptyList/3012082351";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptyMap::class)] = "java.util.Collections$EmptyMap/2636129644";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptySet::class)] = "java.util.Collections$EmptySet/3150696644";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$SingletonList::class)] = "java.util.Collections$SingletonList/833432284";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/1659716317";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date[]::class)] = "[Ljava.util.Date;/3828292433";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashMap::class)] = "java.util.HashMap/962170901";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashSet::class)] = "java.util.HashSet/1594477813";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.IdentityHashMap::class)] = "java.util.IdentityHashMap/3881143367";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashMap::class)] = "java.util.LinkedHashMap/1551059846";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/3628722029";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/1060625595";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1031431137";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1575826026";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeSet::class)] = "java.util.TreeSet/1002270346";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3125574444";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.core.SessionExpirationException::class)] = "org.jahia.ajax.gwt.client.core.SessionExpirationException/393293680";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaUser::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaUser/848623473";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaUser[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaUser;/2598410512";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.service.GWTJahiaServiceException::class)] = "org.jahia.ajax.gwt.client.service.GWTJahiaServiceException/1749529410";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.service.content.ExistingFileException::class)] = "org.jahia.ajax.gwt.client.service.content.ExistingFileException/4216580985";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription::class)] = "org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription/3953111335";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription[]::class)] = "[Lorg.jahia.ajax.gwt.client.widget.subscription.GWTSubscription;/3360068089";
    return result;
  }-*/;
  
  public SubscriptionService_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}
