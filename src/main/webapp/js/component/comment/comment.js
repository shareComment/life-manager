$(document).ready(function() {
    $('.dataTables-example').dataTable();
    /* Init DataTables */
    var oTable = $('#editable').dataTable();

    // check the status of comment
    $('table a').click(function () {
    	var status = $(this).attr('status');
    	if(status == '0'){
    		status = '1';
    	}else{
    		status = '0';
    	}
    	var commentId = $(this).attr('id');
    	$.ajax({
    		url: '/comment/updateP',
    		async: false,
    		data: {"commentId":commentId, "status":status},
    		success: function(data){
    			if(data == '0'){
    				$('.alert-success').css('display', 'block');
    				setTimeout(function(e){
    					$('#chan').load('/comment');
                    },2000)
    			}else{
    				$('.alert-warning').css('display', 'block');
    			}
    		}
    	});
    });

    $('#editable tbody').on('click', 'tr', function(){
    	var commentId = $(this).context.cells[0].innerText;
    	$('#detail').load('/comment/reply?commentId=' + commentId);
    });

});