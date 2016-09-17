$(document).ready(function() {
    $('.dataTables-example').dataTable();
    /* Init DataTables */
    var oTable1 = $('#reply').dataTable();

    // check the status of comment
    $('table a').click(function () {
    	var status = $(this).attr('status');
    	if(status == '0'){
    		status = '1';
    	}else{
    		status = '0';
    	}
    	var commentId = $(this).attr('id');
    	var commentPid = $(this).attr('commentPid');
    	$.ajax({
    		url: '/comment/update',
    		async: false,
    		data: {"commentId":commentId, "status":status},
    		success: function(data){
    			if(data == '0'){
    				$('.alert-success').css('display', 'block');
    				setTimeout(function(e){
    					$('#detail').load('/comment/reply?commentId=' + commentPid);
                    },2000)
    			}else{
    				$('.alert-warning').css('display', 'block');
    			}
    		}
    	});
    });
});