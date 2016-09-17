$(document).ready(function() {
    $('.dataTables-example').dataTable();
    /* Init DataTables */
    var oTable = $('#editable').dataTable();

    // add a new Tag
    $('#addNewTag').click(function (){
    	$('#tagId').val('');
    	$('#new_tagName').val('');
    	$('#myModal').modal('show');
    });

    // add a new Tag
    $('#submit').click(function (){
    	var tagId = $('#tagId').val();
    	var tagName = $('#new_tagName').val();
    	var data = {"tagName":tagName};
    	var url = 'tag/add';
    	if(tagId != ''){
    		data = {"tagId":tagId, "tagName":tagName};
    		url = 'tag/update';
    	}
    	$.ajax({
    		type: 'POST',
    		url: url,
    		async: false,
    		data: data,
    		success: function(data){
    			if(data == '0'){
    				$('.alert-success').css('display', 'block');
    				setTimeout(function(e){
    					$('#myModal').modal('hide');
    					setTimeout(function(e){
    						$('#chan').load('/tag');
    					},1000);
                    },2000);
    			}else{
    				$('.alert-warning').css('display', 'block');
    			}
    		}
    	});
    });

    // modify a tag
    $('table button').click(function (){
    	$('#tagId').val($(this).attr('id'));
    	$('#new_tagName').val($(this).attr('tagName'));
    	$('#myModal').modal('show');
    });
});