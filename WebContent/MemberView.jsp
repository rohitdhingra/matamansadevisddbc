<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<tiles:insert page="/templates/mmdBaseLayout.jsp" flush="true">
  <tiles:put name="title" value="Mata Mansa Devi Sewak Dal Bhandara Committee"/>
  <tiles:put name="header" value="/pages/header.jspf"/>
  <tiles:put name="menu" value="/pages/menu.jspf"/>
  <tiles:put name="body" value="/pages/memberViewPage.jspf"/>
  <tiles:put name="footer" value="/pages/footer.jspf"/>
</tiles:insert>