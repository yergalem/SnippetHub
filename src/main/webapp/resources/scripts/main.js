'use strict';
 var $tags = $('#tag-list').select2({
   width: '100%',
   placeholder: 'Select tags'
 });
 $('#save-tag').on('click', function(e){
   e.preventDefault();
   //make ajax request to save to db
   var existing = [];
   if($tags.val() != null)
      existing = $tags.val();
   var newtag = $('#tag-name').val();
   var $option = $('<option></option');
   $option.val(newtag);
   $option.text(newtag);
   $tags.append($option).trigger('change'); // add it to the list of selections

   //after adding the option let's make it one of the selected
   //check if there was no selected tags first
   existing.push(newtag);
   $tags.val(existing).trigger('change');
   //close modal after saving
   $('#addTag').modal('hide');
   $('#tag-name').val('');
 });

var Search = {
    //wire up event listeners
    keystrokeTimeout: "",
    ajaxRequest: "",
    init: function() {
            var searchBox = $(".search-box");
            this.bindEvents(searchBox)
    },
    bindEvents: function(searchBox) {
        var that = this;
        var searchTerm = "XXX"; //I needed to do this because it was hitting getbytitle instead of search if it is empty
        searchBox.on('keyup', function(){
            if(searchBox.val() != "")
                searchTerm = searchBox.val();
            else
                searchTerm = "XXX";
            that.keyupHandler(searchTerm);
        });
    },
    keyupHandler: function(searchTerm) {
        var that = this;
        window.clearTimeout(this.keystrokeTimeout);
        //this.keystrokeTimeout = window.setTimeout(function(){
            that.search(searchTerm);
        //}, 350);
    },
    search: function(searchTerm) {
        var url = "http://localhost:8080/SnippetHub/snippets/search/" + searchTerm;
//        this.ajaxRequest = $.get(url).success(function(res) {
//            $(".snippets-row").html(res);
//        });
        $.ajax({
            url:url,
            success: function(res) {
                $(".snippets-row").html(res);
                Prism.highlightAll();
            }
        })
    }
};
(function(){
    Search.init();
    var myTextarea = document.getElementById("codeEditor");
//    console.log(myTextarea);
//    var editor = CodeMirror.fromTextArea(myTextarea, {
//        lineNumbers: true
//    });
})();