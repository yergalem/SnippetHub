<%-- 
    Document   : page1
    Created on : May 16, 2016, 5:57:07 PM
    Author     : tekeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<t:mainLayout pageTitle="Edit Snippet">
    <jsp:body>
              <div class="container">
        <div class="row">
          <div class="col-xs-12">
            <div class="add-edit-snippet paper">
              <div class="heading">
                <h2>New Snippet</h2>
              </div>
              <div class="body">
                <form action="#" class="form-horizontal">
                  <select name="language" id="language-list" class="form-control">
                    <option value="">Select Language</option>
                    <option value="javascript">JavaScript</option>
                    <option value="php">PHP</option>
                    <option value="java">Java</option>
                  </select>
                  <input type="text" class="form-control" placeholder="Title">
                  <textarea placeholder="//Your Code Here" name="content" id="codeEditor" cols="30" rows="10" class="form-control"></textarea>
                  <textarea name="description" id="description" cols="30" rows="5" class="form-control" placeholder="What does it do?"></textarea>
                  
                  <div class="visiblity-control">
                    <div>
                      Visiblity
                    </div>
                    <label class="radio-inline"><input type="radio" name="visiblity">Private</label>
                    <label class="radio-inline"><input type="radio" name="visiblity">Public</label>
                  </div>
                  <select name="tags" id="tag-list" class="form-control">
                    <option value="">Select Tag</option>
                    <option value="javascript">Recursion</option>
                    <option value="php">PHP</option>
                    <option value="java">Java</option>
                  </select>
                  <a href="#" class="create-tag"> Or add your own tag</a>
                  <input type="submit" class="login btn" value="Save">
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </jsp:body>
</t:mainLayout>