<%@ taglib uri="http://www.jahia.org/tags/jcr" prefix="jcr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib" %>
<template:addResources type="css" resources="box4.css"/>
<template:addResources>
<!--[if lte IE 6]><link rel="stylesheet" type="text/css" href="<c:url value='${url.currentModule}/css/box4-ie6.css'/>" media="screen" /><![endif]-->
</template:addResources>
<jcr:nodeProperty node="${currentNode}" name="jcr:title" var="title"/>

<div class="box4 ">
    <div class="box4-topright"></div>
    <div class="box4-topleft"></div>
    <c:if test="${not empty title}">
        <h3 class="box4-header"><span>${fn:escapeXml(title.string)}</span></h3>
    </c:if>
    <div class="box4-bottomright"></div>
    <div class="box4-bottomleft"></div>
    <div class="clear"> </div>
</div>
<div class="box4-text">
    ${wrappedContent}
</div>
<div class="clear"> </div>
