$(document).ready(function() {
	$('.dataTables-example').dataTable();
    /* Init DataTables */
    var oTable = $('#editable').dataTable();

    /**
     * modify param
     */
    $('table button').click(function (){
    	$('#paramKey').text($(this).attr('id'));
    	$('#paramValue').val($(this).attr('data'));
    	$('#myModal').modal('show');
    });

    $('#submit').click(function () {
    	$.ajax({
    		type: 'POST',
    		url: '/sysset/param/update',
    		async: false,
    		data: {"paramKey":$('#paramKey').text(),"paramValue":$('#paramValue').val()},
    		success: function(data){
    			if(data == '0'){
    				$('.alert-success').css('display', 'block');
    				setTimeout(function(e){
    					$('#myModal').modal('hide');
    					setTimeout(function(e){
    						$('#chan').load('/sysset/param');
    					},1000);
                    },2000);
    			}else{
    				$('.alert-warning').css('display', 'block');
    			}
    		}
    	});
    });
});