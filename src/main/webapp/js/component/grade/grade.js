$(document).ready(function() {
    /* Init DataTables */
    var oTable = $('#editable').dataTable({
    	ordering: false
    });

    // init the colorpicker
    $('#new_gradeColor').colorpicker({
    	format : 'hex'
    });

    // modify grade info
    oTable.$('button').click(function (){
    	var nTrs = oTable.fnGetNodes();//fnGetNodes获取表格所有行，nTrs[i]表示第i行tr
    	var t = oTable.fnGetData(nTrs[$(this).attr('id')]);
    	$('#new_gradeId').val(t[0]);
    	$('#new_gradeName').val(t[1]);
    	$('#new_minPoint').val(t[2]);
    	$('#new_maxPoint').val(t[3]);
    	$('#new_gradeColor').val(t[4]);
    	$('#myModal').modal('show');
    });

    $('#submit').click(function (){
    	var gradeId = $('#new_gradeId').val();
    	var gradeName = $('#new_gradeName').val();
    	var minPoint = $('#new_minPoint').val();
    	var maxPoint = $('#new_maxPoint').val();
    	var gradeColor = $('#new_gradeColor').val();
    	var data = {"gradeId":gradeId,"gradeName":gradeName,"minPoint":minPoint,"maxPoint":maxPoint,"gradeColor":gradeColor};
    	$.ajax({
    		type: 'POST',
    		url: 'grade/update',
    		async: false,
    		data: data,
    		success: function(data){
    			if(data == '0'){
    				$('#myModal').modal('hide');
    			}else{
    				$('.alert-warning').css('display', 'block');
    			}
    		}
    	});
    });

    // update the datatable when close the modal
    $('#myModal').on('hidden.bs.modal', function () {
    	$('#chan').load('/grade');
    });
});