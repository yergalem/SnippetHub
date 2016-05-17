<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Register">
    <jsp:body>
        <t:marketing></t:marketing>
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <div class="register paper">
                        <div class="heading">
                            <h2>Register</h2>
                        </div>
                        <div class="body">
                            <form action="#" class="form-horizontal">
                                <input type="text" class="form-control" placeholder="Email">
                                <input type="text" class="form-control" placeholder="First Name">
                                <input type="text" class="form-control" placeholder="Last Name">
                                <input type="text" class="form-control" placeholder="Password">
                                <input type="text" class="form-control" placeholder="Address">
                                <textarea class="form-control" placeholder="Who are you?"></textarea>
                                <input type="submit" class="login btn" value="Register">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </jsp:body>
</t:mainLayout>