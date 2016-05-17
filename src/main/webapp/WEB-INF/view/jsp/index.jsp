<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Welcome to SnippetHub">
    <jsp:body>
        <t:marketing></t:marketing>
        <!-- End Marketing -->
        <div class="snippets-container">
            <div class="container">
                <div class="row">
                    <div class="col-xs-12 col-sm-6">
                        <a href="#">
                            <div class="snippet-box">
                                <div class="snippet-code">
                                    <pre>
                                      <code class="language-css">
                                          //code goes here
                                      </code>
                                    </pre>
                                </div>
                                <div class="snippet-details">
                                    <div class="snippet-title">
                                        React Component Creation
                                    </div>
                                    <div class="description">
                                        Lorem ipsum dolor sit amet,consectetur  adipisicing elit,
                                        sed do eiusmod
                                    </div>
                                    <ul class="list-inline tags">
                                        <li><a href="" class="tag">JavaScript</a></li>
                                    </ul>
                                </div>
                            </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Snippets Container -->
    </jsp:body>
</t:mainLayout>