$(document).ready(function() {
    $('.dataTables-example').dataTable();
    /* Init DataTables */
    var oTable = $('#editable').dataTable();

    var tags = [];

    // add a new category
    $('#addNewCate').click(function (){
    	var span = "<option value='0'>一级分类</option>";
    	$.ajax({
    		url: '/category/getCatePid',
    		async: false,
    		success: function(data){
    			var obj = eval(data);
    			$(obj).each(function(index) {
    				var val = obj[index];
    				span += "<option value='"+val.key+"'>"+val.value+"</option>";
    			});
    		}
    	});
    	$('#tagName').parent().parent().css('display','none');
    	$('#tagName1').parent().parent().css('display','none');
    	$('#new_cateId').val('');
    	$('#new_catePid').html(span);
    	$('#new_cateName').val('');
    	$('#myModal').modal('show');
    });

    // submit form
    $('#cateSubmit').click(function (){
    	var cateId = $('#new_cateId').val();
    	var catePid = $('#new_catePid').val();
    	var cateName = $('#new_cateName').val();
    	var data = {"catePid":catePid,"cateName":cateName};
    	var url = '/category/add';
    	if(cateId != ''){
    		url = '/category/update';
    		data = {"cateId":cateId,"catePid":catePid,"cateName":cateName,"tagName":$('#tagName').val().replace(" ",""),"tagName1":$('#tagName1').val()};
    	}
    	$.ajax({
    		type: 'POST',
    		url: url,
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
    	$('#chan').load('/category');
    });

    // modify cate info
    oTable.$('button').click(function (){
    	// 取分类信息
    	var cateId = $(this).attr('id');
    	var catePid = '';
    	var cateName = '';
    	$.ajax({
    		url: '/category/getCate',
    		async: false,
    		data: {"cateId":cateId},
    		success: function(data){
    			var obj = eval('('+data+')');
    			catePid = obj.catePid;
    			cateName = obj.cateName;
    		}
    	});
    	
    	
    	// 取分类
    	var span = "<option value='0'>一级分类</option>";
    	$.ajax({
    		url: '/category/getCatePid',
    		async: false,
    		success: function(data){
    			var obj = eval(data);
    			$(obj).each(function(index) {
    				var val = obj[index];
    				if(val.key == catePid){
    					span += "<option value='"+val.key+"' selected>"+val.value+"</option>";
    				}else{
    					span += "<option value='"+val.key+"'>"+val.value+"</option>";
    				}
    			});
    		}
    	});

    	// 取已加标签
    	$.ajax({
    		url: '/tag/getiTags',
    		async: false,
    		data: {"cateId":cateId},
    		success: function(data){
    			$('#tagName').val(data);
    		}
    	});

    	// 取显示标签
    	$.ajax({
    		url: '/tag/getShowTags',
    		async: false,
    		data: {"cateId":cateId},
    		success: function(data){
    			$('#tagName1').val(data);
    		}
    	});

    	// 取所有标签
    	$.ajax({
    		url: '/tag/getTags',
    		async: false,
    		success: function(data){
    			var datas = [];
    			var tags = data.split(',');
    			$.each(tags, function(i,val){
    				var obj = {};
    				obj.value = val;
    				obj.label = i+1;
    				datas.push(obj);
    			});
    			var engine = new Bloodhound({
    				local: datas,
    				datumTokenizer: function(d) {
    					return Bloodhound.tokenizers.whitespace(d.value);
    				},
    				queryTokenizer: Bloodhound.tokenizers.whitespace
    			});
    			engine.initialize();
    			$('#tagName').tokenfield({
    				typeahead: [null, { source: engine.ttAdapter() }]
    			});
    			$('#tagName1').tokenfield({
    				typeahead: [null, { source: engine.ttAdapter() }]
    			});
    		}
    	});

    	$('#new_cateId').val(cateId);
    	$('#new_catePid').html(span);
    	$('#new_cateName').val(cateName);
    	$('#myModal').modal('show');
    });
	
});