<%-- 
    Document   : mainLayout
    Created on : May 16, 2016, 5:55:09 PM
    Author     : tekeste
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="pageTitle" required="true"%>

<%-- any content can be specified here e.g.: --%>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>${pageTitle}</title>
        <link rel="stylesheet" href="resources/styles/main.css">
    </head>
    <body>
        <div class="wrapper">
            <t:header></t:header>
            <jsp:doBody/>
            <t:footer></t:footer>
        </div>
        <script src="/resources/scripts/main.js"></script>
        <script src="resources/scripts/vendor.js"></script>
        <!--<script src="resources/scripts/prism.js"></script>-->
    </body>
</html>
