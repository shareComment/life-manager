$(document).ready(function() {
	$('.dataTables-example').dataTable();
    /* Init DataTables */
    var oTable = $('#editable').dataTable();

    // add a new Manager
    $('#addNewManager').click(function (){
    	$('#new_telephone').val('');
    	$('#new_nickname').val('');
    	$('#myModal').modal('show');
    });

    // submit form
    $('#submit').click(function (){
    	var telephone = $('#new_telephone').val();
    	var nickname = $('#new_nickname').val();
    	$.ajax({
    		type: 'POST',
    		url: '/manager/add',
    		async: false,
    		data: {"telephone":telephone,"nickname":nickname},
    		success: function(data){
    			if(data == '0'){
    				$('#myModal').modal('hide');
    			}else{
    				$('.alert-warning').css('display', 'block');
    			}
    		}
    	});
    });

    $('table a').click(function (){
    	$('#confirmModal').modal('show');
    	$('#mngId').val($(this).attr('mngId'));
    });
    // reset the password
    $('#reset').click(function (){
    	var mngId = $('#mngId').val();
    	$.ajax({
    		type: 'POST',
    		url: '/manager/reset',
    		async: false,
    		data: {"mngId":mngId},
    		success: function(data){
    			if(data == '0'){
    				$('.alert-success').css('display', 'block');
    				setTimeout(function(e){
    					$('#confirmModal').modal('hide');
                    },2000)
    			}else{
    				$('.alert-warning').css('display', 'block');
    			}
    		}
    	});
    });

    // update the datatable when close the modal
    $('#myModal').on('hidden.bs.modal', function () {
    	$('#chan').load('/manager');
    });
});