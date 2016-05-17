<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Snippet title will go here |SnippetHub">
    <jsp:body>

        <div class="row">
            <div class="col-xs-12">
                <div class="single-snippet paper">
                    <div class="heading">
                        <h2>String left pad</h2>
                        <div class="actions">
                            <a href="#"><span class="glyphicon glyphicon-pencil"></span></a>
                            <a href="#" class="trash"><span class="glyphicon glyphicon-trash"></span></a>
                        </div>
                    </div>
                    <div class="body">
                        <div class="code-snippet">
                            <pre>
                                      <code class="language-javascript">
module.exports = leftpad;
function leftpad (str, len, ch) {
  str = String(str);
  var i = -1;
  if (!ch && ch !== 0) ch = ' ';
  len = len - str.length;
  while (++i < len) {
    str = ch + str;
  }
  return str;
}
                                      </code>
                            </pre>
                        </div>
                        <div class="snippet-details">
                            <div class="snippet-title">
                                String left pad
                            </div>
                            <div class="description">
                                The infamous left-pad npm package that shook the NodeJs community
                            </div>
                            <ul class="list-inline tags">
                                <li><a href="" class="tag">JavaScript</a></li>
                                <li><a href="" class="tag">NodeJS</a></li>
                                <li><a href="" class="tag">left-pad</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </jsp:body>
</t:mainLayout>