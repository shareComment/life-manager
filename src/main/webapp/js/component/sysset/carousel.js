$(document).ready(function() {
	$('.dataTables-example').dataTable();
    /* Init DataTables */
    var oTable = $('#editable').dataTable();

    $('#carousel_0').click(function(){
    	$('#file_carousel_0').click();
    });

    $('#file_carousel_0').on('change', function(){
    	ajaxfileupload('file_carousel_0',$('#file_carousel_0').attr('data-id'),'carousel_0');
    });

    $('#carousel_1').click(function(){
    	$('#file_carousel_1').click();
    });

    $('#file_carousel_1').on('change', function(){
    	ajaxfileupload('file_carousel_1',$('#file_carousel_1').attr('data-id'),'carousel_1');
    });

    $('#carousel_2').click(function(){
    	$('#file_carousel_2').click();
    });

    $('#file_carousel_2').on('change', function(){
    	ajaxfileupload('file_carousel_2',$('#file_carousel_2').attr('data-id'),'carousel_2');
    });
    function ajaxfileupload(id,ele,imgId){
	    $.ajaxFileUpload({
	    	url: '/sysset/updateCarousel',
	    	type: 'POST',
	    	secureuri: false,
	    	data: {"id":ele},
	    	fileElementId: id,
	    	dataType: 'text',
	    	success: function(data, status){
	    		console.log(data);
	    		$('#'+imgId).attr('src','http://i.ziyoush.com/life_interface'+data);
	    	},
            error: function (data, status, e)
            {
                console.log(e);
            }
	    });
    }
});