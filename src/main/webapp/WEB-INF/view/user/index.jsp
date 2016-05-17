<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Create Snippet">
    <jsp:body>
        <div class="snippets-container">
            <div class="container">
                <div class="row">
                    <c:forEach var="i" begin="0" end="4">
                        <div class="col-xs-6 col-sm-4">
                            <div class="user-profile">
                                <img src='<c:url value="resources/images/profile.jpg" />' alt="Profile image" class="profile-img">
                                <div class="user-info">
                                    <h1>Melissa Troy <span class="count">90</span></h1>
                                    <h2>meli@gmail.com</h2>
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet quis corporis, aperiam nulla et repudiandae ipsam numquam aut delectus dignissimos cupiditate iste perferendis vitae repellendus, facilis nihil minus. Nihil, totam.
                                    </p>
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