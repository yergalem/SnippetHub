<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="${singleUser.firstName} | SnippetHub">
    <jsp:body>
        <div class="container profile-container">
            <div class="paper profile">
                <div class="row">
                    <div class="col-xs-12 col-sm-3">
                        <aside class="sidebar">
                            <a href="#" class="edit-profile">
                                Edit
                                <span class="glyphicon glyphicon-pencil"></span>
                            </a>
                            <img src='<c:url value="/resources/images/profile.jpg" />' alt="Profile image" class="profile-img">
                            <div class="user-info">
                                <h1>${singleUser.fullName} <span class="count">90</span></h1>
                                <h2>${singleUser.email}</h2>
                                <p>
                                    ${singleUser.biography}
                                </p>
                            </div>
                        </aside>
                    </div>
                    <div class="col-xs-12 col-sm-9">
                        <div class="row">
                                <!-- Single snippet box -->
                                <div class="col-xs-12 col-sm-6">
                                    <a href="#">
                                        <div class="snippet-box">
                                            <div class="snippet-code">
                                                <pre>
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
                                                
                                            </div>
                                        </div>
                                </div>
                                <!-- End Single Snippet Box -->
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Profile -->
    </jsp:body>
</t:mainLayout>
