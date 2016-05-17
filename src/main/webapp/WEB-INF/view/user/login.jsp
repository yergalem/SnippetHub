<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Login">
    <jsp:body>
        <t:marketing></t:marketing>
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div class="login paper">
                        <div class="heading">
                            <h2>Login</h2>
                        </div>
                        <div class="body">
                            <form action="#" class="form-horizontal">
                                <input type="text" class="form-control" placeholder="Email">
                                <input type="text" class="form-control" placeholder="Password">
                                <input type="submit" class="login btn" value="Login">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </jsp:body>
</t:mainLayout>