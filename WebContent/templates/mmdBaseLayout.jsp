<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<html:html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1252" />
<title><tiles:getAsString name="title" /></title>
</head>
<body background="images/bg-template.jpg">
	<table cellspacing="2" cellpadding="3" width="100%">
		<tr>
			<td width="100%"><tiles:insert attribute="header" /></td>
		</tr>
		<tr>
			<td width="100%"><tiles:insert attribute="menu" /></td>
		</tr>
		<tr>
			<td width="100%" align="center">
				<div style="color: red">
					<html:errors />
				</div> 
				
					<tiles:insert attribute="body" />
			
			</td>
		</tr>
		<tr>
			<td width="100%"><tiles:insert attribute="footer" /></td>
		</tr>
	</table>

</body>

</html:html>