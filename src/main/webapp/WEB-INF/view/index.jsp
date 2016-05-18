<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Welcome to SnippetHub">
    <jsp:body>
        <t:marketing></t:marketing>
            <!-- End Marketing -->
            <div class="snippets-container">
                <div class="container">
                    <div class="row">
                        <c:forEach var="snippet" items="${snippets}">
                            <div class="col-xs-12 col-sm-6">
                                <a href="#">
                                    <div class="snippet-box">
                                        <div class="snippet-code">
                                    <pre>
                                      <code class="language-${snippet.language}">
${snippet.content}
                                     </code>
                                            </pre>
                                        </div>
                                        <div class="snippet-details">
                                            <div class="snippet-title">
                                                ${snippet.snippetTitle}
                                            </div>
                                            <div class="description">
                                                ${snippet.snippetDescription}
                                            </div>
                                            <ul class="list-inline tags">
                                                <li><a href="" class="tag">${snippet.tags}</a></li>
                                            </ul>
                                        </div>
                                    </div>
                            </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- End Snippets Container -->
    </jsp:body>
</t:mainLayout>