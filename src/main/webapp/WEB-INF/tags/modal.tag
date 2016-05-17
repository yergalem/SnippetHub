<%-- 
    Document   : modal
    Created on : May 17, 2016, 3:34:32 PM
    Author     : tekeste
--%>

<%@tag description="create tag modal" pageEncoding="UTF-8"%>
  <!-- start add snippet modal -->
  <div class="modal fade" tabindex="-1" role="dialog" id="addTag">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title">Create new Snippet</h4>
        </div>
        <div class="modal-body">
          <form action="/tags/create" class="addTag">
            <input type="text" class="form-control" placeholder="Tag name" id="tag-name">
            <textarea name="" id="" cols="30" rows="10" class="form-control" placeholder="Tag details"></textarea>
            <div class="modal-footer">
              <input type="submit" value="Save tag" class="btn btn-primary" id="save-tag">
              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
          </form>
        </div>
      </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
  </div><!-- /.modal -->