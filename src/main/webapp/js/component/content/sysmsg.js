$(document).ready(function() {
	$('.dataTables-example').dataTable();
    /* Init DataTables */
    var oTable = $('#editable').dataTable();

    // add a new Manager
    $('#addNewMsg').click(function (){
    	$('#title').val('');
    	$('#content').val('');
    	$('#myModal').modal('show');
    });

    // submit form
    $('#submit').click(function (){
    	var title = $('#title').val();
    	var content = $('#content').val();
    	$.ajax({
    		type: 'POST',
    		url: '/content/sysmsg/add',
    		async: false,
    		data: {"title":title,"content":content},
    		success: function(data){
    			if(data == '0'){
    				$('.alert-success').css('display', 'block');
    				setTimeout(function(e){
    					$('#myModal').modal('hide');
    					setTimeout(function(e){
    						$('#chan').load('/content/sysmsg');
    					},1000);
                    },2000);
    			}else{
    				$('.alert-warning').css('display', 'block');
    			}
    		}
    	});
    });
});