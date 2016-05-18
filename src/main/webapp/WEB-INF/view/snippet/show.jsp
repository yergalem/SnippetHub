<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="${snippet.snippetTitle} |SnippetHub">
    <jsp:body>
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div class="single-snippet paper">
                        <div class="heading">
                            <h2>${snippet.snippetTitle}</h2>
                            <div class="actions">
                                <a href="#"><span class="glyphicon glyphicon-pencil"></span></a>
                                <a href="#" class="trash"><span class="glyphicon glyphicon-trash"></span></a>
                            </div>
                        </div>
                        <div class="body">
                            <div class="code-snippet">
                                <pre>
                                      <code class="language-javascript">
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
                                    <c:forEach var="tag" items="${snippet.tags}">
                                        <li><a href="" class="tag">${tag.tagTitle}</a></li>
                                        </c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </jsp:body>
</t:mainLayout>