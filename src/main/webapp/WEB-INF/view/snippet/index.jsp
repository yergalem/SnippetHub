<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Snippets  | SnippetHub">
    <jsp:body>
        <div class="snippets-container">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <a href="#">
                        <div class="snippet-box">
                            <div class="snippet-code">
                                <pre>
                                      <code class="language-css">
@import url(http://fonts.googleapis.com/css?family=Questrial);
@import url(http://fonts.googleapis.com/css?family=Arvo);
@font-face {
  src: url(http://lea.verou.me/logo.otf);
  font-family: 'LeaVerou';
}
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
                                    <li><a href="" class="tag">ReactJs</a></li>
                                </ul>
                            </div>
                        </div>
                </div>
            </div>
        </div>
        </div>
    </jsp:body>
</t:mainLayout>