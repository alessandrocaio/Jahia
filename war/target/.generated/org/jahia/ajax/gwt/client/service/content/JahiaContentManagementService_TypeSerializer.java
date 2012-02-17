package org.jahia.ajax.gwt.client.service.content;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class JahiaContentManagementService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
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
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig;/34593227", "com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig/12264880", "com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseGroupingLoadConfig;/937164088", "com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418", "com.extjs.gxt.ui.client.data.BaseListFilterConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626", "com.extjs.gxt.ui.client.data.BaseListFilterConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseListLoadConfig/2201172752", "com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseListLoadConfig;/3974160532", "com.extjs.gxt.ui.client.data.BaseListLoadConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseModel/405059268", "com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseModelData/3541881726", "com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseModelData;/1474801170", "com.extjs.gxt.ui.client.data.BaseModelData_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseModel;/2011808370", "com.extjs.gxt.ui.client.data.BaseModel_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159", "com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402", "com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567", "com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BasePagingLoadConfig;/2317712753", "com.extjs.gxt.ui.client.data.BasePagingLoadConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394", "com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig/312164525", "com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig;/3584703654", "com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562", "com.extjs.gxt.ui.client.data.BaseStringFilterConfig_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225", "com.extjs.gxt.ui.client.data.BaseStringFilterConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BaseTreeModel/629153380", "com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseTreeModel;/3798848776", "com.extjs.gxt.ui.client.data.BaseTreeModel_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.BeanModel/158346479", "com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.BeanModel;/1738188982", "com.extjs.gxt.ui.client.data.BeanModel_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560", "com.extjs.gxt.ui.client.data.FilterConfig_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.FilterPagingLoadConfig;/764130373", "com.extjs.gxt.ui.client.data.FilterPagingLoadConfig_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.GroupingLoadConfig;/2566816166", "com.extjs.gxt.ui.client.data.GroupingLoadConfig_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.ListLoadConfig;/4056684818", "com.extjs.gxt.ui.client.data.ListLoadConfig_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.LoadConfig;/305088416", "com.extjs.gxt.ui.client.data.LoadConfig_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.ModelData;/1278407794", "com.extjs.gxt.ui.client.data.ModelData_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.Model;/2864064799", "com.extjs.gxt.ui.client.data.Model_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.PagingLoadConfig;/3362861869", "com.extjs.gxt.ui.client.data.PagingLoadConfig_Array_Rank_1_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig;/837711618", "com.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.RpcMap/3441186752", "com.extjs.gxt.ui.client.data.RpcMap_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.data.SortInfo/1143517771", "com.extjs.gxt.ui.client.data.SortInfo_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.data.TreeModel;/4230972141", "com.extjs.gxt.ui.client.data.TreeModel_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.util.Theme/903569106", "com.extjs.gxt.ui.client.util.Theme_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.util.Theme;/2769591727", "com.extjs.gxt.ui.client.util.Theme_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.widget.form.SimpleComboValue/150969862", "com.extjs.gxt.ui.client.widget.form.SimpleComboValue_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.widget.form.SimpleComboValue;/2952812979", "com.extjs.gxt.ui.client.widget.form.SimpleComboValue_Array_Rank_1_FieldSerializer");
    result.put("com.extjs.gxt.ui.client.widget.form.Time/415600523", "com.extjs.gxt.ui.client.widget.form.Time_FieldSerializer");
    result.put("[Lcom.extjs.gxt.ui.client.widget.form.Time;/3588548357", "com.extjs.gxt.ui.client.widget.form.Time_Array_Rank_1_FieldSerializer");
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
    result.put("[[Ljava.lang.String;/4182515373", "com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer");
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
    result.put("[J/53942082", "com.google.gwt.user.client.rpc.core.long_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.core.SessionExpirationException/393293680", "org.jahia.ajax.gwt.client.core.SessionExpirationException_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean/240799174", "org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean;/3424400174", "org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry/3903149692", "org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry;/1760956560", "org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean/339348539", "org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean/4220957974", "org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean/979792120", "org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer/3645589140", "org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaGroup/2288036138", "org.jahia.ajax.gwt.client.data.GWTJahiaGroup_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaGroup;/663718150", "org.jahia.ajax.gwt.client.data.GWTJahiaGroup_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaLanguage/2570574484", "org.jahia.ajax.gwt.client.data.GWTJahiaLanguage_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaLanguage;/2845507214", "org.jahia.ajax.gwt.client.data.GWTJahiaLanguage_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean/1075615865", "org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaPrincipal;/293685660", "org.jahia.ajax.gwt.client.data.GWTJahiaPrincipal_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaProperty/1173953330", "org.jahia.ajax.gwt.client.data.GWTJahiaProperty_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase/2285712303", "org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase;/1797353467", "org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery/1764725974", "org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaSite/3769976405", "org.jahia.ajax.gwt.client.data.GWTJahiaSite_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaSite;/4230977654", "org.jahia.ajax.gwt.client.data.GWTJahiaSite_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaUser/848623473", "org.jahia.ajax.gwt.client.data.GWTJahiaUser_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaUser;/2598410512", "org.jahia.ajax.gwt.client.data.GWTJahiaUser_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean/3299436324", "org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean;/3707572674", "org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.GWTRenderResult/1320889043", "org.jahia.ajax.gwt.client.data.GWTRenderResult_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.SerializableBaseModel/3106002308", "org.jahia.ajax.gwt.client.data.SerializableBaseModel_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.SerializableBaseModel;/603082059", "org.jahia.ajax.gwt.client.data.SerializableBaseModel_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE/2325491209", "org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE;/1343520823", "org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL/65499619", "org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition/2779735320", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition;/2033195064", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition/3058226338", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition;/4214281171", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty/3461251655", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue/2699023724", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue;/2710462433", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_Array_Rank_1_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty;/670559118", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType/872566806", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType;/2632164710", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition/506217201", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition;/3582191288", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail/800041659", "org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail;/1032322537", "org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTBitSet/1207593675", "org.jahia.ajax.gwt.client.data.node.GWTBitSet_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult/4147396572", "org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance/3905935021", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaNode/3656480997", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage/2390203779", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage;/3782408302", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion/2787906897", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion;/3000930272", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_Array_Rank_1_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNode;/811873210", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition/1299303684", "org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition;/2494202527", "org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo/1630255428", "org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo;/4276086825", "org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping/3813412003", "org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping;/396244820", "org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTColumn/504799770", "org.jahia.ajax.gwt.client.data.toolbar.GWTColumn_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTColumn;/355365718", "org.jahia.ajax.gwt.client.data.toolbar.GWTColumn_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration/270552710", "org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab/1422002046", "org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab;/2101651470", "org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar/2275563968", "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem/550923180", "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem;/1088348224", "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu/985578135", "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu;/1195443599", "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu_Array_Rank_1_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar;/3016177145", "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration/4146945601", "org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTRepository/3923971869", "org.jahia.ajax.gwt.client.data.toolbar.GWTRepository_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTRepository;/4013274454", "org.jahia.ajax.gwt.client.data.toolbar.GWTRepository_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab/3058110275", "org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab;/758643499", "org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult/1488102128", "org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.wcag.WCAGViolation/2818457669", "org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.wcag.WCAGViolation;/1311567025", "org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow/3965068784", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment/3877903601", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment;/3080838422", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition/3723077732", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition;/3443310125", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo/1250493874", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome/3426175649", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome;/3565140722", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask/2438645135", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask;/384819417", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType/3680752569", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType;/222554869", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_Array_Rank_1_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow;/1063690934", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem/318217452", "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem;/3081001293", "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess/3575110589", "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess;/3626830995", "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask/4153298318", "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask;/2300412773", "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.service.GWTJahiaServiceException/1749529410", "org.jahia.ajax.gwt.client.service.GWTJahiaServiceException_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.service.content.ExistingFileException/4216580985", "org.jahia.ajax.gwt.client.service.content.ExistingFileException_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.content.InfoTabItem/667480788", "org.jahia.ajax.gwt.client.widget.content.InfoTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.CategoriesTabItem/2426149929", "org.jahia.ajax.gwt.client.widget.contentengine.CategoriesTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem/1569090106", "org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.HistoryTabItem/4191222864", "org.jahia.ajax.gwt.client.widget.contentengine.HistoryTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem/776869795", "org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem/1410485593", "org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.PortletsTabItem/1777359406", "org.jahia.ajax.gwt.client.widget.contentengine.PortletsTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem/629873488", "org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.RolePermissionsTabItem/2691873343", "org.jahia.ajax.gwt.client.widget.contentengine.RolePermissionsTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem/2799501076", "org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.SeoTabItem/1715114128", "org.jahia.ajax.gwt.client.widget.contentengine.SeoTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.TagsTabItem/463028688", "org.jahia.ajax.gwt.client.widget.contentengine.TagsTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.UsagesTabItem/395646046", "org.jahia.ajax.gwt.client.widget.contentengine.UsagesTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.VersioningTabItem/1181920889", "org.jahia.ajax.gwt.client.widget.contentengine.VersioningTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.VisibilityTabItem/1457074498", "org.jahia.ajax.gwt.client.widget.contentengine.VisibilityTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.WorkflowTabItem/532861348", "org.jahia.ajax.gwt.client.widget.contentengine.WorkflowTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.CategoryBrowseTabItem/687731884", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.CategoryBrowseTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem/2436047628", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem/2366637751", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.FileImagesBrowseTabItem/400394362", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.FileImagesBrowseTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem/304499426", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem/2353730947", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.PortletBrowseTabItem/77222914", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.PortletBrowseTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.SearchTabItem/138295418", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.SearchTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem/643517159", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.TemplatesTabItem/3999357778", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.TemplatesTabItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow/2249416204", "org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.publication.UnpublicationWorkflow/497234572", "org.jahia.ajax.gwt.client.widget.publication.UnpublicationWorkflow_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription/3953111335", "org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription_FieldSerializer");
    result.put("[Lorg.jahia.ajax.gwt.client.widget.subscription.GWTSubscription;/3360068089", "org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription_Array_Rank_1_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.subscription.SendNewsletterActionItem/3841347550", "org.jahia.ajax.gwt.client.widget.subscription.SendNewsletterActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.subscription.SubscriptionManagerActionItem/1469646957", "org.jahia.ajax.gwt.client.widget.subscription.SubscriptionManagerActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.subscription.TestNewsletterActionItem/2477504329", "org.jahia.ajax.gwt.client.widget.subscription.TestNewsletterActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem/156946072", "org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ClipboardActionItem/521655179", "org.jahia.ajax.gwt.client.widget.toolbar.action.ClipboardActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.CopyActionItem/3820802802", "org.jahia.ajax.gwt.client.widget.toolbar.action.CopyActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.CropActionItem/48120417", "org.jahia.ajax.gwt.client.widget.toolbar.action.CropActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.CustomWorkflowMenuActionItem/2964791552", "org.jahia.ajax.gwt.client.widget.toolbar.action.CustomWorkflowMenuActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.CustomizedPreviewActionItem/3958858945", "org.jahia.ajax.gwt.client.widget.toolbar.action.CustomizedPreviewActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.CutActionItem/2706972636", "org.jahia.ajax.gwt.client.widget.toolbar.action.CutActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem/1978142810", "org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.DeployPortletDefinitionActionItem/787558709", "org.jahia.ajax.gwt.client.widget.toolbar.action.DeployPortletDefinitionActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.DeployTemplatesActionItem/2042484811", "org.jahia.ajax.gwt.client.widget.toolbar.action.DeployTemplatesActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.DownloadActionItem/2261430491", "org.jahia.ajax.gwt.client.widget.toolbar.action.DownloadActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.DuplicateTemplatesSetActionItem/2607567705", "org.jahia.ajax.gwt.client.widget.toolbar.action.DuplicateTemplatesSetActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.EditContentActionItem/3837381882", "org.jahia.ajax.gwt.client.widget.toolbar.action.EditContentActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.EditSourceContentActionItem/1627436972", "org.jahia.ajax.gwt.client.widget.toolbar.action.EditSourceContentActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem/1630743886", "org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ExportActionItem/3027148335", "org.jahia.ajax.gwt.client.widget.toolbar.action.ExportActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ExportTemplateActionItem/2376496783", "org.jahia.ajax.gwt.client.widget.toolbar.action.ExportTemplateActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.FillActionItem/2458105339", "org.jahia.ajax.gwt.client.widget.toolbar.action.FillActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.FlushActionItem/896055322", "org.jahia.ajax.gwt.client.widget.toolbar.action.FlushActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.FlushAllActionItem/2773864846", "org.jahia.ajax.gwt.client.widget.toolbar.action.FlushAllActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem/3535509054", "org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.GenerateWarActionItem/612826555", "org.jahia.ajax.gwt.client.widget.toolbar.action.GenerateWarActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ImportActionItem/915876751", "org.jahia.ajax.gwt.client.widget.toolbar.action.ImportActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem/668913029", "org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.LockActionItem/883538842", "org.jahia.ajax.gwt.client.widget.toolbar.action.LockActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.MountActionItem/2648446527", "org.jahia.ajax.gwt.client.widget.toolbar.action.MountActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem/3238070399", "org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem/3614582521", "org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NewPortletActionItem/340111801", "org.jahia.ajax.gwt.client.widget.toolbar.action.NewPortletActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NewRemotePublicationActionItem/3373801263", "org.jahia.ajax.gwt.client.widget.toolbar.action.NewRemotePublicationActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem/3869538254", "org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeTableViewFiltering/3714521818", "org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeTableViewFiltering_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NumberOfTasksWorkflowMenuActionItem/3944807176", "org.jahia.ajax.gwt.client.widget.toolbar.action.NumberOfTasksWorkflowMenuActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.OpenHTMLWindowActionItem/1481813685", "org.jahia.ajax.gwt.client.widget.toolbar.action.OpenHTMLWindowActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem/735003262", "org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem$OpenWindowForSingleFileActionItem/1858031597", "org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem_OpenWindowForSingleFileActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem/3270806622", "org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PasteReferenceActionItem/1002441281", "org.jahia.ajax.gwt.client.widget.toolbar.action.PasteReferenceActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PreviewActionItem/222472983", "org.jahia.ajax.gwt.client.widget.toolbar.action.PreviewActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PublicationManagerActionItem/2894184277", "org.jahia.ajax.gwt.client.widget.toolbar.action.PublicationManagerActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PublishActionItem/4110276634", "org.jahia.ajax.gwt.client.widget.toolbar.action.PublishActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PublishAllActionItem/1780606001", "org.jahia.ajax.gwt.client.widget.toolbar.action.PublishAllActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PublishSiteActionItem/1112258252", "org.jahia.ajax.gwt.client.widget.toolbar.action.PublishSiteActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectOrOpenWindowActionItem/3581928489", "org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectOrOpenWindowActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectWindowActionItem/3724826245", "org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectWindowActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.RefreshActionItem/3445219948", "org.jahia.ajax.gwt.client.widget.toolbar.action.RefreshActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.RenameActionItem/2840380010", "org.jahia.ajax.gwt.client.widget.toolbar.action.RenameActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ResizeActionItem/491417437", "org.jahia.ajax.gwt.client.widget.toolbar.action.ResizeActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ReversePublishActionItem/2969308908", "org.jahia.ajax.gwt.client.widget.toolbar.action.ReversePublishActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.RotateActionItem/1155532575", "org.jahia.ajax.gwt.client.widget.toolbar.action.RotateActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem/2959731733", "org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SeparatorActionItem/2754889510", "org.jahia.ajax.gwt.client.widget.toolbar.action.SeparatorActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ShowCompareEngine/997042135", "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowCompareEngine_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ShowConsultPreviousVersionEngine/3055747891", "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowConsultPreviousVersionEngine_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ShowTrashboardActionItem/2965037405", "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowTrashboardActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ShowVersionEngine/2116317239", "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowVersionEngine_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem/2451370901", "org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem/1551256590", "org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchModeActionItem/1186102267", "org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchModeActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchViewActionItem/591686928", "org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchViewActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateActionItem/1581743711", "org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateMenuActionItem/1023817736", "org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateMenuActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UndeleteActionItem/4110478658", "org.jahia.ajax.gwt.client.widget.toolbar.action.UndeleteActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UnlockActionItem/1956267342", "org.jahia.ajax.gwt.client.widget.toolbar.action.UnlockActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UnmountActionItem/472003340", "org.jahia.ajax.gwt.client.widget.toolbar.action.UnmountActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UnpublishActionItem/1267918995", "org.jahia.ajax.gwt.client.widget.toolbar.action.UnpublishActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UnzipActionItem/3990439368", "org.jahia.ajax.gwt.client.widget.toolbar.action.UnzipActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UpdateActionItem/4291559028", "org.jahia.ajax.gwt.client.widget.toolbar.action.UpdateActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UploadActionItem/1227022710", "org.jahia.ajax.gwt.client.widget.toolbar.action.UploadActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenPropertiesActionItem/2870271137", "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenPropertiesActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenTypesActionItem/1858376067", "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenTypesActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem/4007760406", "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ViewPublishStatusActionItem/1183431927", "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewPublishStatusActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ViewWorkflowStatusActionItem/3458748782", "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewWorkflowStatusActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.WebfolderActionItem/4200270355", "org.jahia.ajax.gwt.client.widget.toolbar.action.WebfolderActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem/3858195633", "org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.WorkflowDashboardActionItem/786479678", "org.jahia.ajax.gwt.client.widget.toolbar.action.WorkflowDashboardActionItem_FieldSerializer");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ZipActionItem/1579033043", "org.jahia.ajax.gwt.client.widget.toolbar.action.ZipActionItem_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.extjs.gxt.ui.client.Style$SortDir/640452531"] = [
        @com.extjs.gxt.ui.client.Style_SortDir_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.Style_SortDir_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/Style$SortDir;),
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
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseBooleanFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseBooleanFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseBooleanFilterConfig;/1642589127"] = [
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseBooleanFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseBooleanFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseBooleanFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseDateFilterConfig/4013643245"] = [
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseDateFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseDateFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseDateFilterConfig;/2667437259"] = [
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseDateFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseDateFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseDateFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseFilterConfig;/3740213292"] = [
        @com.extjs.gxt.ui.client.data.BaseFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig/2138211457"] = [
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseFilterPagingLoadConfig;),
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseFilterPagingLoadConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig;/34593227"] = [
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseFilterPagingLoadConfig;),
        @com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseFilterPagingLoadConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig/12264880"] = [
        @com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseGroupingLoadConfig;),
        @com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseGroupingLoadConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseGroupingLoadConfig;/937164088"] = [
        @com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseGroupingLoadConfig;),
        @com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseGroupingLoadConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418"] = [
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseListFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseListFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626"] = [
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseListFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseListFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseListFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseListLoadConfig/2201172752"] = [
        @com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseListLoadConfig;),
        @com.extjs.gxt.ui.client.data.BaseListLoadConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseListLoadConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseListLoadConfig;/3974160532"] = [
        @com.extjs.gxt.ui.client.data.BaseListLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseListLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseListLoadConfig;),
        @com.extjs.gxt.ui.client.data.BaseListLoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseListLoadConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseModel/405059268"] = [
        @com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseModel;),
        @com.extjs.gxt.ui.client.data.BaseModel_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseModel;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseModelData/3541881726"] = [
        @com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseModelData;),
        @com.extjs.gxt.ui.client.data.BaseModelData_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseModelData;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseModelData;/1474801170"] = [
        @com.extjs.gxt.ui.client.data.BaseModelData_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseModelData_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseModelData;),
        @com.extjs.gxt.ui.client.data.BaseModelData_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseModelData;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseModel;/2011808370"] = [
        @com.extjs.gxt.ui.client.data.BaseModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseModel;),
        @com.extjs.gxt.ui.client.data.BaseModel_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseModel;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159"] = [
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseNumericFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseNumericFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402"] = [
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseNumericFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseNumericFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseNumericFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567"] = [
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BasePagingLoadConfig;),
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BasePagingLoadConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BasePagingLoadConfig;/2317712753"] = [
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BasePagingLoadConfig;),
        @com.extjs.gxt.ui.client.data.BasePagingLoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BasePagingLoadConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394"] = [
        @com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BasePagingLoadResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BasePagingLoadResult;),
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig/312164525"] = [
        @com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseRemoteSortTreeLoadConfig;),
        @com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseRemoteSortTreeLoadConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig;/3584703654"] = [
        @com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseRemoteSortTreeLoadConfig;),
        @com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseRemoteSortTreeLoadConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562"] = [
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseStringFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseStringFilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225"] = [
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseStringFilterConfig;),
        @com.extjs.gxt.ui.client.data.BaseStringFilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseStringFilterConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BaseTreeModel/629153380"] = [
        @com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BaseTreeModel;),
        @com.extjs.gxt.ui.client.data.BaseTreeModel_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BaseTreeModel;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BaseTreeModel;/3798848776"] = [
        @com.extjs.gxt.ui.client.data.BaseTreeModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BaseTreeModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BaseTreeModel;),
        @com.extjs.gxt.ui.client.data.BaseTreeModel_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BaseTreeModel;)
      ];
    
    result["com.extjs.gxt.ui.client.data.BeanModel/158346479"] = [
        @com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/BeanModel;),
        @com.extjs.gxt.ui.client.data.BeanModel_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/BeanModel;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.BeanModel;/1738188982"] = [
        @com.extjs.gxt.ui.client.data.BeanModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.BeanModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/BeanModel;),
        @com.extjs.gxt.ui.client.data.BeanModel_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/BeanModel;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560"] = [
        @com.extjs.gxt.ui.client.data.FilterConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.FilterConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/FilterConfig;),
        @com.extjs.gxt.ui.client.data.FilterConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/FilterConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.FilterPagingLoadConfig;/764130373"] = [
        @com.extjs.gxt.ui.client.data.FilterPagingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.FilterPagingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/FilterPagingLoadConfig;),
        @com.extjs.gxt.ui.client.data.FilterPagingLoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/FilterPagingLoadConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.GroupingLoadConfig;/2566816166"] = [
        @com.extjs.gxt.ui.client.data.GroupingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.GroupingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/GroupingLoadConfig;),
        @com.extjs.gxt.ui.client.data.GroupingLoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/GroupingLoadConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.ListLoadConfig;/4056684818"] = [
        @com.extjs.gxt.ui.client.data.ListLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.ListLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/ListLoadConfig;),
        @com.extjs.gxt.ui.client.data.ListLoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/ListLoadConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.LoadConfig;/305088416"] = [
        @com.extjs.gxt.ui.client.data.LoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.LoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/LoadConfig;),
        @com.extjs.gxt.ui.client.data.LoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/LoadConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.ModelData;/1278407794"] = [
        @com.extjs.gxt.ui.client.data.ModelData_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.ModelData_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/ModelData;),
        @com.extjs.gxt.ui.client.data.ModelData_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/ModelData;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.Model;/2864064799"] = [
        @com.extjs.gxt.ui.client.data.Model_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.Model_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/Model;),
        @com.extjs.gxt.ui.client.data.Model_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/Model;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.PagingLoadConfig;/3362861869"] = [
        @com.extjs.gxt.ui.client.data.PagingLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.PagingLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/PagingLoadConfig;),
        @com.extjs.gxt.ui.client.data.PagingLoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/PagingLoadConfig;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig;/837711618"] = [
        @com.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/RemoteSortTreeLoadConfig;),
        @com.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/RemoteSortTreeLoadConfig;)
      ];
    
    result["com.extjs.gxt.ui.client.data.RpcMap/3441186752"] = [
        @com.extjs.gxt.ui.client.data.RpcMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.RpcMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/RpcMap;),
        @com.extjs.gxt.ui.client.data.RpcMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/RpcMap;)
      ];
    
    result["com.extjs.gxt.ui.client.data.SortInfo/1143517771"] = [
        @com.extjs.gxt.ui.client.data.SortInfo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.SortInfo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/data/SortInfo;),
        @com.extjs.gxt.ui.client.data.SortInfo_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/data/SortInfo;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.data.TreeModel;/4230972141"] = [
        @com.extjs.gxt.ui.client.data.TreeModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.data.TreeModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/data/TreeModel;),
        @com.extjs.gxt.ui.client.data.TreeModel_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/data/TreeModel;)
      ];
    
    result["com.extjs.gxt.ui.client.util.Theme/903569106"] = [
        @com.extjs.gxt.ui.client.util.Theme_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.util.Theme_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/util/Theme;),
        @com.extjs.gxt.ui.client.util.Theme_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/util/Theme;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.util.Theme;/2769591727"] = [
        @com.extjs.gxt.ui.client.util.Theme_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.util.Theme_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/util/Theme;),
        @com.extjs.gxt.ui.client.util.Theme_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/util/Theme;)
      ];
    
    result["com.extjs.gxt.ui.client.widget.form.SimpleComboValue/150969862"] = [
        @com.extjs.gxt.ui.client.widget.form.SimpleComboValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.SimpleComboValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/form/SimpleComboValue;),
        @com.extjs.gxt.ui.client.widget.form.SimpleComboValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/widget/form/SimpleComboValue;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.widget.form.SimpleComboValue;/2952812979"] = [
        @com.extjs.gxt.ui.client.widget.form.SimpleComboValue_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.SimpleComboValue_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/widget/form/SimpleComboValue;),
        @com.extjs.gxt.ui.client.widget.form.SimpleComboValue_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/widget/form/SimpleComboValue;)
      ];
    
    result["com.extjs.gxt.ui.client.widget.form.Time/415600523"] = [
        @com.extjs.gxt.ui.client.widget.form.Time_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.Time_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/extjs/gxt/ui/client/widget/form/Time;),
        @com.extjs.gxt.ui.client.widget.form.Time_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/extjs/gxt/ui/client/widget/form/Time;)
      ];
    
    result["[Lcom.extjs.gxt.ui.client.widget.form.Time;/3588548357"] = [
        @com.extjs.gxt.ui.client.widget.form.Time_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.extjs.gxt.ui.client.widget.form.Time_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/extjs/gxt/ui/client/widget/form/Time;),
        @com.extjs.gxt.ui.client.widget.form.Time_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/extjs/gxt/ui/client/widget/form/Time;)
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
    
    result["[[Ljava.lang.String;/4182515373"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[[Ljava/lang/String;)
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
    
    result["[J/53942082"] = [
        @com.google.gwt.user.client.rpc.core.long_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.long_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[J),
        @com.google.gwt.user.client.rpc.core.long_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[J)
      ];
    
    result["org.jahia.ajax.gwt.client.core.SessionExpirationException/393293680"] = [
        @org.jahia.ajax.gwt.client.core.SessionExpirationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.core.SessionExpirationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/core/SessionExpirationException;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean/240799174"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaBasicDataBean;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/GWTJahiaBasicDataBean;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean;/3424400174"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaBasicDataBean;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaBasicDataBean;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry/3903149692"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaContentHistoryEntry;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/GWTJahiaContentHistoryEntry;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry;/1760956560"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaContentHistoryEntry;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaContentHistoryEntry;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean/339348539"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaCreateEngineInitBean;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean/4220957974"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaCreatePortletInitBean;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean/979792120"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaEditEngineInitBean;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer/3645589140"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaFieldInitializer;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaGroup/2288036138"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaGroup_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaGroup_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaGroup;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaGroup_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/GWTJahiaGroup;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.GWTJahiaGroup;/663718150"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaGroup_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaGroup_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaGroup;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaGroup_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaGroup;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaLanguage/2570574484"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaLanguage_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaLanguage_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaLanguage;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaLanguage_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/GWTJahiaLanguage;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.GWTJahiaLanguage;/2845507214"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaLanguage_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaLanguage_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaLanguage;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaLanguage_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaLanguage;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean/1075615865"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaPortletOutputBean;),
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.GWTJahiaPrincipal;/293685660"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaPrincipal_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaPrincipal_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaPrincipal;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaPrincipal_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaPrincipal;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaProperty/1173953330"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaProperty_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaProperty_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaProperty;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase/2285712303"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaRolePermissionBase;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/GWTJahiaRolePermissionBase;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase;/1797353467"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaRolePermissionBase;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaRolePermissionBase;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery/1764725974"] = [
        ,
        ,
        @org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/GWTJahiaSearchQuery;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaSite/3769976405"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaSite_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaSite_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaSite;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaSite_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/GWTJahiaSite;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.GWTJahiaSite;/4230977654"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaSite_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaSite_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaSite;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaSite_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaSite;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaUser/848623473"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaUser_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaUser_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaUser;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaUser_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/GWTJahiaUser;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.GWTJahiaUser;/2598410512"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaUser_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaUser_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaUser;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaUser_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaUser;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean/3299436324"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTJahiaValueDisplayBean;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/GWTJahiaValueDisplayBean;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean;/3707572674"] = [
        @org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaValueDisplayBean;),
        @org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/GWTJahiaValueDisplayBean;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.GWTRenderResult/1320889043"] = [
        @org.jahia.ajax.gwt.client.data.GWTRenderResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.GWTRenderResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/GWTRenderResult;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.SerializableBaseModel/3106002308"] = [
        @org.jahia.ajax.gwt.client.data.SerializableBaseModel_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.SerializableBaseModel_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/SerializableBaseModel;),
        @org.jahia.ajax.gwt.client.data.SerializableBaseModel_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/SerializableBaseModel;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.SerializableBaseModel;/603082059"] = [
        @org.jahia.ajax.gwt.client.data.SerializableBaseModel_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.SerializableBaseModel_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/SerializableBaseModel;),
        @org.jahia.ajax.gwt.client.data.SerializableBaseModel_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/SerializableBaseModel;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE/2325491209"] = [
        @org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/acl/GWTJahiaNodeACE;),
        @org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/acl/GWTJahiaNodeACE;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE;/1343520823"] = [
        @org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/acl/GWTJahiaNodeACE;),
        @org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/acl/GWTJahiaNodeACE;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL/65499619"] = [
        @org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/acl/GWTJahiaNodeACL;),
        @org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/acl/GWTJahiaNodeACL;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition/2779735320"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaItemDefinition;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaItemDefinition;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition;/2033195064"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaItemDefinition;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaItemDefinition;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition/3058226338"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeDefinition;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeDefinition;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition;/4214281171"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeDefinition;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeDefinition;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty/3461251655"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeProperty;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeProperty;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue/2699023724"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodePropertyValue;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodePropertyValue;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue;/2710462433"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodePropertyValue;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodePropertyValue;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty;/670559118"] = [
        ,
        ,
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeProperty;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType/872566806"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeType;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeType;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType;/2632164710"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeType;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaNodeType;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition/506217201"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaPropertyDefinition;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaPropertyDefinition;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition;/3582191288"] = [
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaPropertyDefinition;),
        @org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/definition/GWTJahiaPropertyDefinition;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail/800041659"] = [
        @org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/job/GWTJahiaJobDetail;),
        @org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/job/GWTJahiaJobDetail;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail;/1032322537"] = [
        @org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/job/GWTJahiaJobDetail;),
        @org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/job/GWTJahiaJobDetail;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.node.GWTBitSet/1207593675"] = [
        @org.jahia.ajax.gwt.client.data.node.GWTBitSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.node.GWTBitSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/node/GWTBitSet;),
        @org.jahia.ajax.gwt.client.data.node.GWTBitSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/node/GWTBitSet;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult/4147396572"] = [
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaGetPropertiesResult;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance/3905935021"] = [
        ,
        ,
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNewPortletInstance;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.node.GWTJahiaNode/3656480997"] = [
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNode;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNode;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage/2390203779"] = [
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNodeUsage;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNodeUsage;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage;/3782408302"] = [
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNodeUsage;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNodeUsage;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion/2787906897"] = [
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNodeVersion;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNodeVersion;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion;/3000930272"] = [
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNodeVersion;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNodeVersion;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNode;/811873210"] = [
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNode;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaNode_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaNode;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition/1299303684"] = [
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaPortletDefinition;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaPortletDefinition;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition;/2494202527"] = [
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaPortletDefinition;),
        @org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/node/GWTJahiaPortletDefinition;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo/1630255428"] = [
        @org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/publication/GWTJahiaPublicationInfo;),
        @org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/publication/GWTJahiaPublicationInfo;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo;/4276086825"] = [
        @org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/publication/GWTJahiaPublicationInfo;),
        @org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/publication/GWTJahiaPublicationInfo;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping/3813412003"] = [
        @org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/seo/GWTJahiaUrlMapping;),
        @org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/seo/GWTJahiaUrlMapping;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping;/396244820"] = [
        @org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/seo/GWTJahiaUrlMapping;),
        @org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/seo/GWTJahiaUrlMapping;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.toolbar.GWTColumn/504799770"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTColumn_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTColumn_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/toolbar/GWTColumn;),
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTColumn;/355365718"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTColumn_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTColumn_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/toolbar/GWTColumn;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration/270552710"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/toolbar/GWTEditConfiguration;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab/1422002046"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/toolbar/GWTEngineTab;),
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab;/2101651470"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/toolbar/GWTEngineTab;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar/2275563968"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/toolbar/GWTJahiaToolbar;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem/550923180"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/toolbar/GWTJahiaToolbarItem;),
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem;/1088348224"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/toolbar/GWTJahiaToolbarItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu/985578135"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/toolbar/GWTJahiaToolbarMenu;),
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu;/1195443599"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/toolbar/GWTJahiaToolbarMenu;),
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar;/3016177145"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/toolbar/GWTJahiaToolbar;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration/4146945601"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/toolbar/GWTManagerConfiguration;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.toolbar.GWTRepository/3923971869"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTRepository_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTRepository_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/toolbar/GWTRepository;),
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTRepository;/4013274454"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTRepository_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTRepository_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/toolbar/GWTRepository;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab/3058110275"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/toolbar/GWTSidePanelTab;),
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab;/758643499"] = [
        @org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/toolbar/GWTSidePanelTab;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult/1488102128"] = [
        @org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/wcag/WCAGValidationResult;),
      ];
    
    result["org.jahia.ajax.gwt.client.data.wcag.WCAGViolation/2818457669"] = [
        @org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/wcag/WCAGViolation;),
        @org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/wcag/WCAGViolation;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.wcag.WCAGViolation;/1311567025"] = [
        @org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/wcag/WCAGViolation;),
        @org.jahia.ajax.gwt.client.data.wcag.WCAGViolation_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/wcag/WCAGViolation;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow/3965068784"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflow;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflow;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment/3877903601"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowComment;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowComment;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment;/3080838422"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowComment;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowComment;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition/3723077732"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowDefinition;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowDefinition;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition;/3443310125"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowDefinition;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowDefinition;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo/1250493874"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowInfo;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowInfo;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome/3426175649"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowOutcome;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowOutcome;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome;/3565140722"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowOutcome;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowOutcome;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask/2438645135"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowTask;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowTask;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask;/384819417"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowTask;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowTask;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType/3680752569"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowType;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowType;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType;/222554869"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowType;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflowType;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow;/1063690934"] = [
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflow;),
        @org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/workflow/GWTJahiaWorkflow;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem/318217452"] = [
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryItem;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryItem;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem;/3081001293"] = [
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryItem;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryItem;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess/3575110589"] = [
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryProcess;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryProcess;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess;/3626830995"] = [
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryProcess;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryProcess;)
      ];
    
    result["org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask/4153298318"] = [
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryTask;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryTask;)
      ];
    
    result["[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask;/2300412773"] = [
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryTask;),
        @org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/jahia/ajax/gwt/client/data/workflow/history/GWTJahiaWorkflowHistoryTask;)
      ];
    
    result["org.jahia.ajax.gwt.client.service.GWTJahiaServiceException/1749529410"] = [
        @org.jahia.ajax.gwt.client.service.GWTJahiaServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.service.GWTJahiaServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/service/GWTJahiaServiceException;),
      ];
    
    result["org.jahia.ajax.gwt.client.service.content.ExistingFileException/4216580985"] = [
        @org.jahia.ajax.gwt.client.service.content.ExistingFileException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.service.content.ExistingFileException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/service/content/ExistingFileException;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.content.InfoTabItem/667480788"] = [
        @org.jahia.ajax.gwt.client.widget.content.InfoTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.content.InfoTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/content/InfoTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.CategoriesTabItem/2426149929"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.CategoriesTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.CategoriesTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/CategoriesTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem/1569090106"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/ContentTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.HistoryTabItem/4191222864"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.HistoryTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.HistoryTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/HistoryTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem/776869795"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/LayoutTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem/1410485593"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/ListOrderingContentTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.PortletsTabItem/1777359406"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.PortletsTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.PortletsTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/PortletsTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem/629873488"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/PropertiesTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.RolePermissionsTabItem/2691873343"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.RolePermissionsTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.RolePermissionsTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/RolePermissionsTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem/2799501076"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/RolesTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.SeoTabItem/1715114128"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.SeoTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.SeoTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/SeoTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.TagsTabItem/463028688"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.TagsTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.TagsTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/TagsTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.UsagesTabItem/395646046"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.UsagesTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.UsagesTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/UsagesTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.VersioningTabItem/1181920889"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.VersioningTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.VersioningTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/VersioningTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.VisibilityTabItem/1457074498"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.VisibilityTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.VisibilityTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/VisibilityTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.contentengine.WorkflowTabItem/532861348"] = [
        @org.jahia.ajax.gwt.client.widget.contentengine.WorkflowTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.contentengine.WorkflowTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/contentengine/WorkflowTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.edit.sidepanel.CategoryBrowseTabItem/687731884"] = [
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.CategoryBrowseTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.CategoryBrowseTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/edit/sidepanel/CategoryBrowseTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem/2436047628"] = [
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/edit/sidepanel/ContentBrowseTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem/2366637751"] = [
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/edit/sidepanel/CreateContentTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.edit.sidepanel.FileImagesBrowseTabItem/400394362"] = [
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.FileImagesBrowseTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.FileImagesBrowseTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/edit/sidepanel/FileImagesBrowseTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem/304499426"] = [
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/edit/sidepanel/LastContentBrowseTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem/2353730947"] = [
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/edit/sidepanel/PagesTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.edit.sidepanel.PortletBrowseTabItem/77222914"] = [
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.PortletBrowseTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.PortletBrowseTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/edit/sidepanel/PortletBrowseTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.edit.sidepanel.SearchTabItem/138295418"] = [
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.SearchTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.SearchTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/edit/sidepanel/SearchTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem/643517159"] = [
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/edit/sidepanel/SidePanelTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.edit.sidepanel.TemplatesTabItem/3999357778"] = [
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.TemplatesTabItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.edit.sidepanel.TemplatesTabItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/edit/sidepanel/TemplatesTabItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow/2249416204"] = [
        @org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/publication/PublicationWorkflow;),
        @org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/widget/publication/PublicationWorkflow;)
      ];
    
    result["org.jahia.ajax.gwt.client.widget.publication.UnpublicationWorkflow/497234572"] = [
        @org.jahia.ajax.gwt.client.widget.publication.UnpublicationWorkflow_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.publication.UnpublicationWorkflow_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/publication/UnpublicationWorkflow;),
        @org.jahia.ajax.gwt.client.widget.publication.UnpublicationWorkflow_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/jahia/ajax/gwt/client/widget/publication/UnpublicationWorkflow;)
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
    
    result["org.jahia.ajax.gwt.client.widget.subscription.SendNewsletterActionItem/3841347550"] = [
        @org.jahia.ajax.gwt.client.widget.subscription.SendNewsletterActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.subscription.SendNewsletterActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/subscription/SendNewsletterActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.subscription.SubscriptionManagerActionItem/1469646957"] = [
        @org.jahia.ajax.gwt.client.widget.subscription.SubscriptionManagerActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.subscription.SubscriptionManagerActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/subscription/SubscriptionManagerActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.subscription.TestNewsletterActionItem/2477504329"] = [
        @org.jahia.ajax.gwt.client.widget.subscription.TestNewsletterActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.subscription.TestNewsletterActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/subscription/TestNewsletterActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem/156946072"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ClearAllLocksActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ClipboardActionItem/521655179"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ClipboardActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ClipboardActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ClipboardActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.CopyActionItem/3820802802"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.CopyActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.CopyActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/CopyActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.CropActionItem/48120417"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.CropActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.CropActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/CropActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.CustomWorkflowMenuActionItem/2964791552"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.CustomWorkflowMenuActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.CustomWorkflowMenuActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/CustomWorkflowMenuActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.CustomizedPreviewActionItem/3958858945"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.CustomizedPreviewActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.CustomizedPreviewActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/CustomizedPreviewActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.CutActionItem/2706972636"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.CutActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.CutActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/CutActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem/1978142810"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/DeleteActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.DeployPortletDefinitionActionItem/787558709"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.DeployPortletDefinitionActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.DeployPortletDefinitionActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/DeployPortletDefinitionActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.DeployTemplatesActionItem/2042484811"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.DeployTemplatesActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.DeployTemplatesActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/DeployTemplatesActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.DownloadActionItem/2261430491"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.DownloadActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.DownloadActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/DownloadActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.DuplicateTemplatesSetActionItem/2607567705"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.DuplicateTemplatesSetActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.DuplicateTemplatesSetActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/DuplicateTemplatesSetActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.EditContentActionItem/3837381882"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.EditContentActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.EditContentActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/EditContentActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.EditSourceContentActionItem/1627436972"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.EditSourceContentActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.EditSourceContentActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/EditSourceContentActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem/1630743886"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ExecuteActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ExportActionItem/3027148335"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ExportActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ExportActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ExportActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ExportTemplateActionItem/2376496783"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ExportTemplateActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ExportTemplateActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ExportTemplateActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.FillActionItem/2458105339"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.FillActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.FillActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/FillActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.FlushActionItem/896055322"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.FlushActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.FlushActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/FlushActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.FlushAllActionItem/2773864846"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.FlushAllActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.FlushAllActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/FlushAllActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem/3535509054"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/FlushSiteActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.GenerateWarActionItem/612826555"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.GenerateWarActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.GenerateWarActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/GenerateWarActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ImportActionItem/915876751"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ImportActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ImportActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ImportActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem/668913029"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/LanguageSwitcherActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.LockActionItem/883538842"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.LockActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.LockActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/LockActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.MountActionItem/2648446527"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.MountActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.MountActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/MountActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem/3238070399"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/NewContentActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem/3614582521"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/NewFolderActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.NewPortletActionItem/340111801"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NewPortletActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NewPortletActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/NewPortletActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.NewRemotePublicationActionItem/3373801263"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NewRemotePublicationActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NewRemotePublicationActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/NewRemotePublicationActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem/3869538254"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/NewTemplatesSetActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeTableViewFiltering/3714521818"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeTableViewFiltering_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeTableViewFiltering_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/NodeTypeTableViewFiltering;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.NumberOfTasksWorkflowMenuActionItem/3944807176"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NumberOfTasksWorkflowMenuActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.NumberOfTasksWorkflowMenuActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/NumberOfTasksWorkflowMenuActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.OpenHTMLWindowActionItem/1481813685"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.OpenHTMLWindowActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.OpenHTMLWindowActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/OpenHTMLWindowActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem/735003262"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/OpenWindowActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem$OpenWindowForSingleFileActionItem/1858031597"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem_OpenWindowForSingleFileActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem_OpenWindowForSingleFileActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/OpenWindowActionItem$OpenWindowForSingleFileActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem/3270806622"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/PasteActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.PasteReferenceActionItem/1002441281"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PasteReferenceActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PasteReferenceActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/PasteReferenceActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.PreviewActionItem/222472983"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PreviewActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PreviewActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/PreviewActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.PublicationManagerActionItem/2894184277"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PublicationManagerActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PublicationManagerActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/PublicationManagerActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.PublishActionItem/4110276634"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PublishActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PublishActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/PublishActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.PublishAllActionItem/1780606001"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PublishAllActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PublishAllActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/PublishAllActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.PublishSiteActionItem/1112258252"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PublishSiteActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.PublishSiteActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/PublishSiteActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectOrOpenWindowActionItem/3581928489"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectOrOpenWindowActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectOrOpenWindowActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/RedirectOrOpenWindowActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectWindowActionItem/3724826245"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectWindowActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectWindowActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/RedirectWindowActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.RefreshActionItem/3445219948"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.RefreshActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.RefreshActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/RefreshActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.RenameActionItem/2840380010"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.RenameActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.RenameActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/RenameActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ResizeActionItem/491417437"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ResizeActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ResizeActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ResizeActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ReversePublishActionItem/2969308908"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ReversePublishActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ReversePublishActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ReversePublishActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.RotateActionItem/1155532575"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.RotateActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.RotateActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/RotateActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem/2959731733"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/SaveAsReferencesMenuActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.SeparatorActionItem/2754889510"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SeparatorActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SeparatorActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/SeparatorActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ShowCompareEngine/997042135"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ShowCompareEngine_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ShowCompareEngine_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ShowCompareEngine;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ShowConsultPreviousVersionEngine/3055747891"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ShowConsultPreviousVersionEngine_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ShowConsultPreviousVersionEngine_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ShowConsultPreviousVersionEngine;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ShowTrashboardActionItem/2965037405"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ShowTrashboardActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ShowTrashboardActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ShowTrashboardActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ShowVersionEngine/2116317239"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ShowVersionEngine_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ShowVersionEngine_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ShowVersionEngine;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem/2451370901"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/SiteLanguageSwitcherActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem/1551256590"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/SiteSwitcherActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchModeActionItem/1186102267"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchModeActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchModeActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/SwitchModeActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchViewActionItem/591686928"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchViewActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchViewActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/SwitchViewActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateActionItem/1581743711"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/TranslateActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateMenuActionItem/1023817736"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateMenuActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateMenuActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/TranslateMenuActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.UndeleteActionItem/4110478658"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UndeleteActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UndeleteActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/UndeleteActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.UnlockActionItem/1956267342"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UnlockActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UnlockActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/UnlockActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.UnmountActionItem/472003340"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UnmountActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UnmountActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/UnmountActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.UnpublishActionItem/1267918995"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UnpublishActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UnpublishActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/UnpublishActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.UnzipActionItem/3990439368"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UnzipActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UnzipActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/UnzipActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.UpdateActionItem/4291559028"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UpdateActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UpdateActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/UpdateActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.UploadActionItem/1227022710"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UploadActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.UploadActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/UploadActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenPropertiesActionItem/2870271137"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenPropertiesActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenPropertiesActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ViewHiddenPropertiesActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenTypesActionItem/1858376067"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenTypesActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenTypesActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ViewHiddenTypesActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem/4007760406"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ViewIconStatusActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ViewPublishStatusActionItem/1183431927"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ViewPublishStatusActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ViewPublishStatusActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ViewPublishStatusActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ViewWorkflowStatusActionItem/3458748782"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ViewWorkflowStatusActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ViewWorkflowStatusActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ViewWorkflowStatusActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.WebfolderActionItem/4200270355"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.WebfolderActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.WebfolderActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/WebfolderActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem/3858195633"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/WorkInProgressActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.WorkflowDashboardActionItem/786479678"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.WorkflowDashboardActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.WorkflowDashboardActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/WorkflowDashboardActionItem;),
      ];
    
    result["org.jahia.ajax.gwt.client.widget.toolbar.action.ZipActionItem/1579033043"] = [
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ZipActionItem_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.jahia.ajax.gwt.client.widget.toolbar.action.ZipActionItem_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/jahia/ajax/gwt/client/widget/toolbar/action/ZipActionItem;),
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
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig;/34593227");
    result.put("com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig", "com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig/12264880");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseGroupingLoadConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseGroupingLoadConfig;/937164088");
    result.put("com.extjs.gxt.ui.client.data.BaseListFilterConfig", "com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626");
    result.put("com.extjs.gxt.ui.client.data.BaseListLoadConfig", "com.extjs.gxt.ui.client.data.BaseListLoadConfig/2201172752");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseListLoadConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseListLoadConfig;/3974160532");
    result.put("com.extjs.gxt.ui.client.data.BaseModel", "com.extjs.gxt.ui.client.data.BaseModel/405059268");
    result.put("com.extjs.gxt.ui.client.data.BaseModelData", "com.extjs.gxt.ui.client.data.BaseModelData/3541881726");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseModelData;", "[Lcom.extjs.gxt.ui.client.data.BaseModelData;/1474801170");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseModel;", "[Lcom.extjs.gxt.ui.client.data.BaseModel;/2011808370");
    result.put("com.extjs.gxt.ui.client.data.BaseNumericFilterConfig", "com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402");
    result.put("com.extjs.gxt.ui.client.data.BasePagingLoadConfig", "com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567");
    result.put("[Lcom.extjs.gxt.ui.client.data.BasePagingLoadConfig;", "[Lcom.extjs.gxt.ui.client.data.BasePagingLoadConfig;/2317712753");
    result.put("com.extjs.gxt.ui.client.data.BasePagingLoadResult", "com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394");
    result.put("com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig", "com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig/312164525");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig;/3584703654");
    result.put("com.extjs.gxt.ui.client.data.BaseStringFilterConfig", "com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;", "[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225");
    result.put("com.extjs.gxt.ui.client.data.BaseTreeModel", "com.extjs.gxt.ui.client.data.BaseTreeModel/629153380");
    result.put("[Lcom.extjs.gxt.ui.client.data.BaseTreeModel;", "[Lcom.extjs.gxt.ui.client.data.BaseTreeModel;/3798848776");
    result.put("com.extjs.gxt.ui.client.data.BeanModel", "com.extjs.gxt.ui.client.data.BeanModel/158346479");
    result.put("[Lcom.extjs.gxt.ui.client.data.BeanModel;", "[Lcom.extjs.gxt.ui.client.data.BeanModel;/1738188982");
    result.put("[Lcom.extjs.gxt.ui.client.data.FilterConfig;", "[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560");
    result.put("[Lcom.extjs.gxt.ui.client.data.FilterPagingLoadConfig;", "[Lcom.extjs.gxt.ui.client.data.FilterPagingLoadConfig;/764130373");
    result.put("[Lcom.extjs.gxt.ui.client.data.GroupingLoadConfig;", "[Lcom.extjs.gxt.ui.client.data.GroupingLoadConfig;/2566816166");
    result.put("[Lcom.extjs.gxt.ui.client.data.ListLoadConfig;", "[Lcom.extjs.gxt.ui.client.data.ListLoadConfig;/4056684818");
    result.put("[Lcom.extjs.gxt.ui.client.data.LoadConfig;", "[Lcom.extjs.gxt.ui.client.data.LoadConfig;/305088416");
    result.put("[Lcom.extjs.gxt.ui.client.data.ModelData;", "[Lcom.extjs.gxt.ui.client.data.ModelData;/1278407794");
    result.put("[Lcom.extjs.gxt.ui.client.data.Model;", "[Lcom.extjs.gxt.ui.client.data.Model;/2864064799");
    result.put("[Lcom.extjs.gxt.ui.client.data.PagingLoadConfig;", "[Lcom.extjs.gxt.ui.client.data.PagingLoadConfig;/3362861869");
    result.put("[Lcom.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig;", "[Lcom.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig;/837711618");
    result.put("com.extjs.gxt.ui.client.data.RpcMap", "com.extjs.gxt.ui.client.data.RpcMap/3441186752");
    result.put("com.extjs.gxt.ui.client.data.SortInfo", "com.extjs.gxt.ui.client.data.SortInfo/1143517771");
    result.put("[Lcom.extjs.gxt.ui.client.data.TreeModel;", "[Lcom.extjs.gxt.ui.client.data.TreeModel;/4230972141");
    result.put("com.extjs.gxt.ui.client.util.Theme", "com.extjs.gxt.ui.client.util.Theme/903569106");
    result.put("[Lcom.extjs.gxt.ui.client.util.Theme;", "[Lcom.extjs.gxt.ui.client.util.Theme;/2769591727");
    result.put("com.extjs.gxt.ui.client.widget.form.SimpleComboValue", "com.extjs.gxt.ui.client.widget.form.SimpleComboValue/150969862");
    result.put("[Lcom.extjs.gxt.ui.client.widget.form.SimpleComboValue;", "[Lcom.extjs.gxt.ui.client.widget.form.SimpleComboValue;/2952812979");
    result.put("com.extjs.gxt.ui.client.widget.form.Time", "com.extjs.gxt.ui.client.widget.form.Time/415600523");
    result.put("[Lcom.extjs.gxt.ui.client.widget.form.Time;", "[Lcom.extjs.gxt.ui.client.widget.form.Time;/3588548357");
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
    result.put("[[Ljava.lang.String;", "[[Ljava.lang.String;/4182515373");
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
    result.put("[J", "[J/53942082");
    result.put("org.jahia.ajax.gwt.client.core.SessionExpirationException", "org.jahia.ajax.gwt.client.core.SessionExpirationException/393293680");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean", "org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean/240799174");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean;", "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean;/3424400174");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry", "org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry/3903149692");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry;", "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry;/1760956560");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean", "org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean/339348539");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean", "org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean/4220957974");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean", "org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean/979792120");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer", "org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer/3645589140");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaGroup", "org.jahia.ajax.gwt.client.data.GWTJahiaGroup/2288036138");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaGroup;", "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaGroup;/663718150");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaLanguage", "org.jahia.ajax.gwt.client.data.GWTJahiaLanguage/2570574484");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaLanguage;", "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaLanguage;/2845507214");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean", "org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean/1075615865");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaPrincipal;", "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaPrincipal;/293685660");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaProperty", "org.jahia.ajax.gwt.client.data.GWTJahiaProperty/1173953330");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase", "org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase/2285712303");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase;", "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase;/1797353467");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery", "org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery/1764725974");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaSite", "org.jahia.ajax.gwt.client.data.GWTJahiaSite/3769976405");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaSite;", "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaSite;/4230977654");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaUser", "org.jahia.ajax.gwt.client.data.GWTJahiaUser/848623473");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaUser;", "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaUser;/2598410512");
    result.put("org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean", "org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean/3299436324");
    result.put("[Lorg.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean;", "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean;/3707572674");
    result.put("org.jahia.ajax.gwt.client.data.GWTRenderResult", "org.jahia.ajax.gwt.client.data.GWTRenderResult/1320889043");
    result.put("org.jahia.ajax.gwt.client.data.SerializableBaseModel", "org.jahia.ajax.gwt.client.data.SerializableBaseModel/3106002308");
    result.put("[Lorg.jahia.ajax.gwt.client.data.SerializableBaseModel;", "[Lorg.jahia.ajax.gwt.client.data.SerializableBaseModel;/603082059");
    result.put("org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE", "org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE/2325491209");
    result.put("[Lorg.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE;", "[Lorg.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE;/1343520823");
    result.put("org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL", "org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL/65499619");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition/2779735320");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition;", "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition;/2033195064");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition/3058226338");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition;", "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition;/4214281171");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty/3461251655");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue/2699023724");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue;", "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue;/2710462433");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty;", "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty;/670559118");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType/872566806");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType;", "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType;/2632164710");
    result.put("org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition", "org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition/506217201");
    result.put("[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition;", "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition;/3582191288");
    result.put("org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail", "org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail/800041659");
    result.put("[Lorg.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail;", "[Lorg.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail;/1032322537");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTBitSet", "org.jahia.ajax.gwt.client.data.node.GWTBitSet/1207593675");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult", "org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult/4147396572");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance/3905935021");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaNode", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNode/3656480997");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage/2390203779");
    result.put("[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage;", "[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage;/3782408302");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion", "org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion/2787906897");
    result.put("[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion;", "[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion;/3000930272");
    result.put("[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNode;", "[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNode;/811873210");
    result.put("org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition", "org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition/1299303684");
    result.put("[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition;", "[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition;/2494202527");
    result.put("org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo", "org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo/1630255428");
    result.put("[Lorg.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo;", "[Lorg.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo;/4276086825");
    result.put("org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping", "org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping/3813412003");
    result.put("[Lorg.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping;", "[Lorg.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping;/396244820");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTColumn", "org.jahia.ajax.gwt.client.data.toolbar.GWTColumn/504799770");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTColumn;", "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTColumn;/355365718");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration", "org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration/270552710");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab", "org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab/1422002046");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab;", "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab;/2101651470");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar", "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar/2275563968");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem", "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem/550923180");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem;", "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem;/1088348224");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu", "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu/985578135");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu;", "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu;/1195443599");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar;", "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar;/3016177145");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration", "org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration/4146945601");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTRepository", "org.jahia.ajax.gwt.client.data.toolbar.GWTRepository/3923971869");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTRepository;", "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTRepository;/4013274454");
    result.put("org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab", "org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab/3058110275");
    result.put("[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab;", "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab;/758643499");
    result.put("org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult", "org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult/1488102128");
    result.put("org.jahia.ajax.gwt.client.data.wcag.WCAGViolation", "org.jahia.ajax.gwt.client.data.wcag.WCAGViolation/2818457669");
    result.put("[Lorg.jahia.ajax.gwt.client.data.wcag.WCAGViolation;", "[Lorg.jahia.ajax.gwt.client.data.wcag.WCAGViolation;/1311567025");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow/3965068784");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment/3877903601");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment;", "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment;/3080838422");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition/3723077732");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition;", "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition;/3443310125");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo/1250493874");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome/3426175649");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome;", "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome;/3565140722");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask/2438645135");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask;", "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask;/384819417");
    result.put("org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType", "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType/3680752569");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType;", "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType;/222554869");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow;", "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow;/1063690934");
    result.put("org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem", "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem/318217452");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem;", "[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem;/3081001293");
    result.put("org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess", "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess/3575110589");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess;", "[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess;/3626830995");
    result.put("org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask", "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask/4153298318");
    result.put("[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask;", "[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask;/2300412773");
    result.put("org.jahia.ajax.gwt.client.service.GWTJahiaServiceException", "org.jahia.ajax.gwt.client.service.GWTJahiaServiceException/1749529410");
    result.put("org.jahia.ajax.gwt.client.service.content.ExistingFileException", "org.jahia.ajax.gwt.client.service.content.ExistingFileException/4216580985");
    result.put("org.jahia.ajax.gwt.client.widget.content.InfoTabItem", "org.jahia.ajax.gwt.client.widget.content.InfoTabItem/667480788");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.CategoriesTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.CategoriesTabItem/2426149929");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem/1569090106");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.HistoryTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.HistoryTabItem/4191222864");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem/776869795");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem/1410485593");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.PortletsTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.PortletsTabItem/1777359406");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem/629873488");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.RolePermissionsTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.RolePermissionsTabItem/2691873343");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem/2799501076");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.SeoTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.SeoTabItem/1715114128");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.TagsTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.TagsTabItem/463028688");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.UsagesTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.UsagesTabItem/395646046");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.VersioningTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.VersioningTabItem/1181920889");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.VisibilityTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.VisibilityTabItem/1457074498");
    result.put("org.jahia.ajax.gwt.client.widget.contentengine.WorkflowTabItem", "org.jahia.ajax.gwt.client.widget.contentengine.WorkflowTabItem/532861348");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.CategoryBrowseTabItem", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.CategoryBrowseTabItem/687731884");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem/2436047628");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem/2366637751");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.FileImagesBrowseTabItem", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.FileImagesBrowseTabItem/400394362");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem/304499426");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem/2353730947");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.PortletBrowseTabItem", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.PortletBrowseTabItem/77222914");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.SearchTabItem", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.SearchTabItem/138295418");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem/643517159");
    result.put("org.jahia.ajax.gwt.client.widget.edit.sidepanel.TemplatesTabItem", "org.jahia.ajax.gwt.client.widget.edit.sidepanel.TemplatesTabItem/3999357778");
    result.put("org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow", "org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow/2249416204");
    result.put("org.jahia.ajax.gwt.client.widget.publication.UnpublicationWorkflow", "org.jahia.ajax.gwt.client.widget.publication.UnpublicationWorkflow/497234572");
    result.put("org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription", "org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription/3953111335");
    result.put("[Lorg.jahia.ajax.gwt.client.widget.subscription.GWTSubscription;", "[Lorg.jahia.ajax.gwt.client.widget.subscription.GWTSubscription;/3360068089");
    result.put("org.jahia.ajax.gwt.client.widget.subscription.SendNewsletterActionItem", "org.jahia.ajax.gwt.client.widget.subscription.SendNewsletterActionItem/3841347550");
    result.put("org.jahia.ajax.gwt.client.widget.subscription.SubscriptionManagerActionItem", "org.jahia.ajax.gwt.client.widget.subscription.SubscriptionManagerActionItem/1469646957");
    result.put("org.jahia.ajax.gwt.client.widget.subscription.TestNewsletterActionItem", "org.jahia.ajax.gwt.client.widget.subscription.TestNewsletterActionItem/2477504329");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem/156946072");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ClipboardActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ClipboardActionItem/521655179");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.CopyActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.CopyActionItem/3820802802");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.CropActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.CropActionItem/48120417");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.CustomWorkflowMenuActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.CustomWorkflowMenuActionItem/2964791552");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.CustomizedPreviewActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.CustomizedPreviewActionItem/3958858945");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.CutActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.CutActionItem/2706972636");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem/1978142810");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.DeployPortletDefinitionActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.DeployPortletDefinitionActionItem/787558709");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.DeployTemplatesActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.DeployTemplatesActionItem/2042484811");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.DownloadActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.DownloadActionItem/2261430491");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.DuplicateTemplatesSetActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.DuplicateTemplatesSetActionItem/2607567705");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.EditContentActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.EditContentActionItem/3837381882");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.EditSourceContentActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.EditSourceContentActionItem/1627436972");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem/1630743886");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ExportActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ExportActionItem/3027148335");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ExportTemplateActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ExportTemplateActionItem/2376496783");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.FillActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.FillActionItem/2458105339");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.FlushActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.FlushActionItem/896055322");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.FlushAllActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.FlushAllActionItem/2773864846");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem/3535509054");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.GenerateWarActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.GenerateWarActionItem/612826555");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ImportActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ImportActionItem/915876751");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem/668913029");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.LockActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.LockActionItem/883538842");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.MountActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.MountActionItem/2648446527");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem/3238070399");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem/3614582521");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NewPortletActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.NewPortletActionItem/340111801");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NewRemotePublicationActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.NewRemotePublicationActionItem/3373801263");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem/3869538254");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeTableViewFiltering", "org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeTableViewFiltering/3714521818");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.NumberOfTasksWorkflowMenuActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.NumberOfTasksWorkflowMenuActionItem/3944807176");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.OpenHTMLWindowActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.OpenHTMLWindowActionItem/1481813685");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem/735003262");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem$OpenWindowForSingleFileActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem$OpenWindowForSingleFileActionItem/1858031597");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem/3270806622");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PasteReferenceActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.PasteReferenceActionItem/1002441281");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PreviewActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.PreviewActionItem/222472983");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PublicationManagerActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.PublicationManagerActionItem/2894184277");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PublishActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.PublishActionItem/4110276634");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PublishAllActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.PublishAllActionItem/1780606001");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.PublishSiteActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.PublishSiteActionItem/1112258252");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectOrOpenWindowActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectOrOpenWindowActionItem/3581928489");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectWindowActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectWindowActionItem/3724826245");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.RefreshActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.RefreshActionItem/3445219948");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.RenameActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.RenameActionItem/2840380010");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ResizeActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ResizeActionItem/491417437");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ReversePublishActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ReversePublishActionItem/2969308908");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.RotateActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.RotateActionItem/1155532575");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem/2959731733");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SeparatorActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.SeparatorActionItem/2754889510");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ShowCompareEngine", "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowCompareEngine/997042135");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ShowConsultPreviousVersionEngine", "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowConsultPreviousVersionEngine/3055747891");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ShowTrashboardActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowTrashboardActionItem/2965037405");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ShowVersionEngine", "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowVersionEngine/2116317239");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem/2451370901");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem/1551256590");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchModeActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchModeActionItem/1186102267");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchViewActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchViewActionItem/591686928");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateActionItem/1581743711");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateMenuActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateMenuActionItem/1023817736");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UndeleteActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.UndeleteActionItem/4110478658");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UnlockActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.UnlockActionItem/1956267342");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UnmountActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.UnmountActionItem/472003340");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UnpublishActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.UnpublishActionItem/1267918995");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UnzipActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.UnzipActionItem/3990439368");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UpdateActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.UpdateActionItem/4291559028");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.UploadActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.UploadActionItem/1227022710");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenPropertiesActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenPropertiesActionItem/2870271137");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenTypesActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenTypesActionItem/1858376067");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem/4007760406");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ViewPublishStatusActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewPublishStatusActionItem/1183431927");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ViewWorkflowStatusActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewWorkflowStatusActionItem/3458748782");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.WebfolderActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.WebfolderActionItem/4200270355");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem/3858195633");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.WorkflowDashboardActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.WorkflowDashboardActionItem/786479678");
    result.put("org.jahia.ajax.gwt.client.widget.toolbar.action.ZipActionItem", "org.jahia.ajax.gwt.client.widget.toolbar.action.ZipActionItem/1579033043");
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
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseFilterPagingLoadConfig;/34593227";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig/12264880";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseGroupingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseGroupingLoadConfig;/937164088";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseListFilterConfig/3409120418";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseListFilterConfig;/1641032626";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BaseListLoadConfig/2201172752";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseListLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseListLoadConfig;/3974160532";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseModel::class)] = "com.extjs.gxt.ui.client.data.BaseModel/405059268";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseModelData::class)] = "com.extjs.gxt.ui.client.data.BaseModelData/3541881726";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseModelData[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseModelData;/1474801170";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseModel[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseModel;/2011808370";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseNumericFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseNumericFilterConfig/1870815159";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseNumericFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseNumericFilterConfig;/2888123402";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BasePagingLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BasePagingLoadConfig/2011366567";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BasePagingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BasePagingLoadConfig;/2317712753";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BasePagingLoadResult::class)] = "com.extjs.gxt.ui.client.data.BasePagingLoadResult/496878394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig::class)] = "com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig/312164525";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseRemoteSortTreeLoadConfig;/3584703654";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseStringFilterConfig::class)] = "com.extjs.gxt.ui.client.data.BaseStringFilterConfig/2159604562";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseStringFilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseStringFilterConfig;/1612961225";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseTreeModel::class)] = "com.extjs.gxt.ui.client.data.BaseTreeModel/629153380";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BaseTreeModel[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BaseTreeModel;/3798848776";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BeanModel::class)] = "com.extjs.gxt.ui.client.data.BeanModel/158346479";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.BeanModel[]::class)] = "[Lcom.extjs.gxt.ui.client.data.BeanModel;/1738188982";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.FilterConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.FilterConfig;/1920562560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.FilterPagingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.FilterPagingLoadConfig;/764130373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.GroupingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.GroupingLoadConfig;/2566816166";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.ListLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.ListLoadConfig;/4056684818";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.LoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.LoadConfig;/305088416";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.ModelData[]::class)] = "[Lcom.extjs.gxt.ui.client.data.ModelData;/1278407794";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.Model[]::class)] = "[Lcom.extjs.gxt.ui.client.data.Model;/2864064799";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.PagingLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.PagingLoadConfig;/3362861869";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig[]::class)] = "[Lcom.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig;/837711618";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.RpcMap::class)] = "com.extjs.gxt.ui.client.data.RpcMap/3441186752";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.SortInfo::class)] = "com.extjs.gxt.ui.client.data.SortInfo/1143517771";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.data.TreeModel[]::class)] = "[Lcom.extjs.gxt.ui.client.data.TreeModel;/4230972141";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.util.Theme::class)] = "com.extjs.gxt.ui.client.util.Theme/903569106";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.util.Theme[]::class)] = "[Lcom.extjs.gxt.ui.client.util.Theme;/2769591727";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.SimpleComboValue::class)] = "com.extjs.gxt.ui.client.widget.form.SimpleComboValue/150969862";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.SimpleComboValue[]::class)] = "[Lcom.extjs.gxt.ui.client.widget.form.SimpleComboValue;/2952812979";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.Time::class)] = "com.extjs.gxt.ui.client.widget.form.Time/415600523";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.extjs.gxt.ui.client.widget.form.Time[]::class)] = "[Lcom.extjs.gxt.ui.client.widget.form.Time;/3588548357";
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
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[][]::class)] = "[[Ljava.lang.String;/4182515373";
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
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@J[]::class)] = "[J/53942082";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.core.SessionExpirationException::class)] = "org.jahia.ajax.gwt.client.core.SessionExpirationException/393293680";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean/240799174";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaBasicDataBean;/3424400174";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry/3903149692";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaContentHistoryEntry;/1760956560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaCreateEngineInitBean/339348539";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaCreatePortletInitBean/4220957974";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaEditEngineInitBean/979792120";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaFieldInitializer/3645589140";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaGroup::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaGroup/2288036138";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaGroup[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaGroup;/663718150";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaLanguage::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaLanguage/2570574484";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaLanguage[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaLanguage;/2845507214";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaPortletOutputBean/1075615865";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaPrincipal[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaPrincipal;/293685660";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaProperty::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaProperty/1173953330";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase/2285712303";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaRolePermissionBase;/1797353467";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaSearchQuery/1764725974";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaSite::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaSite/3769976405";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaSite[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaSite;/4230977654";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaUser::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaUser/848623473";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaUser[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaUser;/2598410512";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean::class)] = "org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean/3299436324";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.GWTJahiaValueDisplayBean;/3707572674";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.GWTRenderResult::class)] = "org.jahia.ajax.gwt.client.data.GWTRenderResult/1320889043";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.SerializableBaseModel::class)] = "org.jahia.ajax.gwt.client.data.SerializableBaseModel/3106002308";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.SerializableBaseModel[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.SerializableBaseModel;/603082059";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE::class)] = "org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE/2325491209";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACE;/1343520823";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL::class)] = "org.jahia.ajax.gwt.client.data.acl.GWTJahiaNodeACL/65499619";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition::class)] = "org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition/2779735320";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaItemDefinition;/2033195064";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition::class)] = "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition/3058226338";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeDefinition;/4214281171";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty::class)] = "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty/3461251655";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue::class)] = "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue/2699023724";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodePropertyValue;/2710462433";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeProperty;/670559118";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType::class)] = "org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType/872566806";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaNodeType;/2632164710";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition::class)] = "org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition/506217201";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.definition.GWTJahiaPropertyDefinition;/3582191288";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail::class)] = "org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail/800041659";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.job.GWTJahiaJobDetail;/1032322537";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTBitSet::class)] = "org.jahia.ajax.gwt.client.data.node.GWTBitSet/1207593675";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult::class)] = "org.jahia.ajax.gwt.client.data.node.GWTJahiaGetPropertiesResult/4147396572";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance::class)] = "org.jahia.ajax.gwt.client.data.node.GWTJahiaNewPortletInstance/3905935021";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode::class)] = "org.jahia.ajax.gwt.client.data.node.GWTJahiaNode/3656480997";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage::class)] = "org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage/2390203779";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNodeUsage;/3782408302";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion::class)] = "org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion/2787906897";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNodeVersion;/3000930272";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTJahiaNode[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaNode;/811873210";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition::class)] = "org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition/1299303684";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.node.GWTJahiaPortletDefinition;/2494202527";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo::class)] = "org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo/1630255428";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.publication.GWTJahiaPublicationInfo;/4276086825";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping::class)] = "org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping/3813412003";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.seo.GWTJahiaUrlMapping;/396244820";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn::class)] = "org.jahia.ajax.gwt.client.data.toolbar.GWTColumn/504799770";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTColumn[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTColumn;/355365718";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration::class)] = "org.jahia.ajax.gwt.client.data.toolbar.GWTEditConfiguration/270552710";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab::class)] = "org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab/1422002046";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTEngineTab;/2101651470";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar::class)] = "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar/2275563968";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem::class)] = "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem/550923180";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarItem;/1088348224";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu::class)] = "org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu/985578135";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbarMenu;/1195443599";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTJahiaToolbar;/3016177145";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration::class)] = "org.jahia.ajax.gwt.client.data.toolbar.GWTManagerConfiguration/4146945601";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTRepository::class)] = "org.jahia.ajax.gwt.client.data.toolbar.GWTRepository/3923971869";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTRepository[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTRepository;/4013274454";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab::class)] = "org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab/3058110275";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.toolbar.GWTSidePanelTab;/758643499";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult::class)] = "org.jahia.ajax.gwt.client.data.wcag.WCAGValidationResult/1488102128";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.wcag.WCAGViolation::class)] = "org.jahia.ajax.gwt.client.data.wcag.WCAGViolation/2818457669";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.wcag.WCAGViolation[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.wcag.WCAGViolation;/1311567025";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow::class)] = "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow/3965068784";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment::class)] = "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment/3877903601";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowComment;/3080838422";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition::class)] = "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition/3723077732";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowDefinition;/3443310125";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo::class)] = "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowInfo/1250493874";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome::class)] = "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome/3426175649";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowOutcome;/3565140722";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask::class)] = "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask/2438645135";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowTask;/384819417";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType::class)] = "org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType/3680752569";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflowType;/222554869";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.workflow.GWTJahiaWorkflow;/1063690934";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem::class)] = "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem/318217452";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryItem;/3081001293";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess::class)] = "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess/3575110589";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryProcess;/3626830995";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask::class)] = "org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask/4153298318";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask[]::class)] = "[Lorg.jahia.ajax.gwt.client.data.workflow.history.GWTJahiaWorkflowHistoryTask;/2300412773";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.service.GWTJahiaServiceException::class)] = "org.jahia.ajax.gwt.client.service.GWTJahiaServiceException/1749529410";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.service.content.ExistingFileException::class)] = "org.jahia.ajax.gwt.client.service.content.ExistingFileException/4216580985";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.content.InfoTabItem::class)] = "org.jahia.ajax.gwt.client.widget.content.InfoTabItem/667480788";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.CategoriesTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.CategoriesTabItem/2426149929";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.ContentTabItem/1569090106";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.HistoryTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.HistoryTabItem/4191222864";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.LayoutTabItem/776869795";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.ListOrderingContentTabItem/1410485593";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.PortletsTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.PortletsTabItem/1777359406";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.PropertiesTabItem/629873488";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.RolePermissionsTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.RolePermissionsTabItem/2691873343";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.RolesTabItem/2799501076";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.SeoTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.SeoTabItem/1715114128";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.TagsTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.TagsTabItem/463028688";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.UsagesTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.UsagesTabItem/395646046";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.VersioningTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.VersioningTabItem/1181920889";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.VisibilityTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.VisibilityTabItem/1457074498";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.contentengine.WorkflowTabItem::class)] = "org.jahia.ajax.gwt.client.widget.contentengine.WorkflowTabItem/532861348";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.edit.sidepanel.CategoryBrowseTabItem::class)] = "org.jahia.ajax.gwt.client.widget.edit.sidepanel.CategoryBrowseTabItem/687731884";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem::class)] = "org.jahia.ajax.gwt.client.widget.edit.sidepanel.ContentBrowseTabItem/2436047628";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem::class)] = "org.jahia.ajax.gwt.client.widget.edit.sidepanel.CreateContentTabItem/2366637751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.edit.sidepanel.FileImagesBrowseTabItem::class)] = "org.jahia.ajax.gwt.client.widget.edit.sidepanel.FileImagesBrowseTabItem/400394362";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem::class)] = "org.jahia.ajax.gwt.client.widget.edit.sidepanel.LastContentBrowseTabItem/304499426";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem::class)] = "org.jahia.ajax.gwt.client.widget.edit.sidepanel.PagesTabItem/2353730947";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.edit.sidepanel.PortletBrowseTabItem::class)] = "org.jahia.ajax.gwt.client.widget.edit.sidepanel.PortletBrowseTabItem/77222914";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.edit.sidepanel.SearchTabItem::class)] = "org.jahia.ajax.gwt.client.widget.edit.sidepanel.SearchTabItem/138295418";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem::class)] = "org.jahia.ajax.gwt.client.widget.edit.sidepanel.SidePanelTabItem/643517159";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.edit.sidepanel.TemplatesTabItem::class)] = "org.jahia.ajax.gwt.client.widget.edit.sidepanel.TemplatesTabItem/3999357778";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow::class)] = "org.jahia.ajax.gwt.client.widget.publication.PublicationWorkflow/2249416204";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.publication.UnpublicationWorkflow::class)] = "org.jahia.ajax.gwt.client.widget.publication.UnpublicationWorkflow/497234572";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription::class)] = "org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription/3953111335";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.subscription.GWTSubscription[]::class)] = "[Lorg.jahia.ajax.gwt.client.widget.subscription.GWTSubscription;/3360068089";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.subscription.SendNewsletterActionItem::class)] = "org.jahia.ajax.gwt.client.widget.subscription.SendNewsletterActionItem/3841347550";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.subscription.SubscriptionManagerActionItem::class)] = "org.jahia.ajax.gwt.client.widget.subscription.SubscriptionManagerActionItem/1469646957";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.subscription.TestNewsletterActionItem::class)] = "org.jahia.ajax.gwt.client.widget.subscription.TestNewsletterActionItem/2477504329";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ClearAllLocksActionItem/156946072";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ClipboardActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ClipboardActionItem/521655179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.CopyActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.CopyActionItem/3820802802";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.CropActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.CropActionItem/48120417";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.CustomWorkflowMenuActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.CustomWorkflowMenuActionItem/2964791552";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.CustomizedPreviewActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.CustomizedPreviewActionItem/3958858945";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.CutActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.CutActionItem/2706972636";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.DeleteActionItem/1978142810";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.DeployPortletDefinitionActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.DeployPortletDefinitionActionItem/787558709";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.DeployTemplatesActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.DeployTemplatesActionItem/2042484811";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.DownloadActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.DownloadActionItem/2261430491";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.DuplicateTemplatesSetActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.DuplicateTemplatesSetActionItem/2607567705";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.EditContentActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.EditContentActionItem/3837381882";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.EditSourceContentActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.EditSourceContentActionItem/1627436972";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ExecuteActionItem/1630743886";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ExportActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ExportActionItem/3027148335";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ExportTemplateActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ExportTemplateActionItem/2376496783";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.FillActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.FillActionItem/2458105339";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.FlushActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.FlushActionItem/896055322";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.FlushAllActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.FlushAllActionItem/2773864846";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.FlushSiteActionItem/3535509054";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.GenerateWarActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.GenerateWarActionItem/612826555";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ImportActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ImportActionItem/915876751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.LanguageSwitcherActionItem/668913029";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.LockActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.LockActionItem/883538842";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.MountActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.MountActionItem/2648446527";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.NewContentActionItem/3238070399";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.NewFolderActionItem/3614582521";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.NewPortletActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.NewPortletActionItem/340111801";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.NewRemotePublicationActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.NewRemotePublicationActionItem/3373801263";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.NewTemplatesSetActionItem/3869538254";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeTableViewFiltering::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.NodeTypeTableViewFiltering/3714521818";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.NumberOfTasksWorkflowMenuActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.NumberOfTasksWorkflowMenuActionItem/3944807176";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.OpenHTMLWindowActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.OpenHTMLWindowActionItem/1481813685";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem/735003262";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem$OpenWindowForSingleFileActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.OpenWindowActionItem$OpenWindowForSingleFileActionItem/1858031597";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.PasteActionItem/3270806622";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.PasteReferenceActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.PasteReferenceActionItem/1002441281";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.PreviewActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.PreviewActionItem/222472983";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.PublicationManagerActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.PublicationManagerActionItem/2894184277";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.PublishActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.PublishActionItem/4110276634";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.PublishAllActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.PublishAllActionItem/1780606001";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.PublishSiteActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.PublishSiteActionItem/1112258252";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectOrOpenWindowActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectOrOpenWindowActionItem/3581928489";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectWindowActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.RedirectWindowActionItem/3724826245";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.RefreshActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.RefreshActionItem/3445219948";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.RenameActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.RenameActionItem/2840380010";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ResizeActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ResizeActionItem/491417437";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ReversePublishActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ReversePublishActionItem/2969308908";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.RotateActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.RotateActionItem/1155532575";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.SaveAsReferencesMenuActionItem/2959731733";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.SeparatorActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.SeparatorActionItem/2754889510";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ShowCompareEngine::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowCompareEngine/997042135";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ShowConsultPreviousVersionEngine::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowConsultPreviousVersionEngine/3055747891";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ShowTrashboardActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowTrashboardActionItem/2965037405";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ShowVersionEngine::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ShowVersionEngine/2116317239";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.SiteLanguageSwitcherActionItem/2451370901";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.SiteSwitcherActionItem/1551256590";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchModeActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchModeActionItem/1186102267";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchViewActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.SwitchViewActionItem/591686928";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateActionItem/1581743711";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateMenuActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.TranslateMenuActionItem/1023817736";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.UndeleteActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.UndeleteActionItem/4110478658";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.UnlockActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.UnlockActionItem/1956267342";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.UnmountActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.UnmountActionItem/472003340";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.UnpublishActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.UnpublishActionItem/1267918995";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.UnzipActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.UnzipActionItem/3990439368";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.UpdateActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.UpdateActionItem/4291559028";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.UploadActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.UploadActionItem/1227022710";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenPropertiesActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenPropertiesActionItem/2870271137";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenTypesActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewHiddenTypesActionItem/1858376067";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewIconStatusActionItem/4007760406";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ViewPublishStatusActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewPublishStatusActionItem/1183431927";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ViewWorkflowStatusActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ViewWorkflowStatusActionItem/3458748782";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.WebfolderActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.WebfolderActionItem/4200270355";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.WorkInProgressActionItem/3858195633";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.WorkflowDashboardActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.WorkflowDashboardActionItem/786479678";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.jahia.ajax.gwt.client.widget.toolbar.action.ZipActionItem::class)] = "org.jahia.ajax.gwt.client.widget.toolbar.action.ZipActionItem/1579033043";
    return result;
  }-*/;
  
  public JahiaContentManagementService_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}
