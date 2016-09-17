$(document).ready(function() {
    $('.dataTables-example').dataTable();
    /* Init DataTables */
    var oTable = $('#editable').dataTable();

    $('#new_stdTime').datetimepicker({
    	language: 'zh-CN',
    	autoclose: true,
    	minView: 2,
        format: 'yyyy-mm-dd'
    });

    // add a new brand
    $('#addNewBrand').click(function (){
    	var span = "";
    	$.ajax({
    		url: '/category/getCateId',
    		async: false,
    		success: function(data){
    			var obj = eval(data);
    			$(obj).each(function(index) {
    				var val = obj[index];
    				span += "<option value='"+val.key+"'>"+val.value+"</option>";
    			});
    		}
    	});
    	$('#new_tagName').parent().parent().css('display','none');
    	$('#new_brandId').val('');
    	$('#new_cateId').html(span);
    	$('#new_brandName').val('');
    	$('#new_coName').val('');
    	$('#new_stdTime').val('');
    	$('#new_coAddress').val('');
    	$('#new_bizScope').val('');
    	$('#brandModal').modal('show');
    });

    // submit form
    $('#saveBrand').click(function (){
    	var brandId = $('#new_brandId').val();
    	var cateId = $('#new_cateId').val();
    	var brandName = $('#new_brandName').val();
    	var tagName = $('#new_tagName').val().replace(" ","");
    	var coName = $('#new_coName').val();
    	var stdTime = $('#new_stdTime').val();
    	var coAddress = $('#new_coAddress').val();
    	var bizScope = $('#new_bizScope').val();
    	var status = $('#new_status').val();
    	var officialWebsite = $('#new_officialWebsite').val();
    	var data = {"cateId":cateId,"brandName":brandName,"coName":coName,"stdTime":stdTime,"coAddress":coAddress,"bizScope":bizScope,"status":status,"officialWebsite":officialWebsite};
    	var url = '/brand/add';
    	if(brandId != ''){
    		url = '/brand/update';
    		data = {"brandId":brandId,"cateId":cateId,"brandName":brandName,"coName":coName,"stdTime":stdTime,"coAddress":coAddress,"bizScope":bizScope,"status":status,"officialWebsite":officialWebsite,"tagName":tagName};
    	}
    	$.ajax({
    		type: 'POST',
    		url: url,
    		async: false,
    		data: data,
    		success: function(data){
    			if(data == '0'){
    				$('#brandModal').modal('hide');
    			}else{
    				$('.alert-warning').css('display', 'block');
    			}
    		}
    	});
    });

    // update the datatable when close the modal
    $('#brandModal').on('hidden.bs.modal', function () {
    	$('#chan').load('/brand');
    });

    $('#new_cateId').change(function(){
    	var cateId = $(this).children('option:selected').val();
    	// 取分类下的所有标签
    	$.ajax({
    		url: '/brand/getAllTags',
    		async: false,
    		data: {"cateId":cateId},
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
    			$('#new_tagName').tokenfield({
    				typeahead: [null, { source: engine.ttAdapter() }]
    			});
    		}
    	});
    });
    

    // modify the brand
    oTable.$('button').click(function (){
    	var brandId = $(this).attr('id');
    	var cateId = '';
    	var brandName = '';
    	var coName = '';
    	var stdTime = '';
    	var coAddress='';
    	var bizScope='';
    	var status='';
    	$.ajax({
    		url: '/brand/getBrand',
    		async: false,
    		data: {"brandId":brandId},
    		success: function(data){
    			var obj = eval('('+data+')');
    			cateId = obj.cateId;
    			brandName = obj.brandName;
    			coName = obj.coName;
    			stdTime = obj.stdTime;
    			coAddress = obj.coAddress;
    			bizScope = obj.bizScope;
    			status = obj.status;
    			officialWebsite = obj.officialWebsite;
    		}
    	});
    	
    	
    	
    	var span = "";
    	$.ajax({
    		url: '/category/getCateId',
    		async: false,
    		success: function(data){
    			var obj = eval(data);
    			$(obj).each(function(index) {
    				var val = obj[index];
    				if(val.key == cateId){
    					span += "<option value='"+val.key+"' selected>"+val.value+"</option>";
    				}else{
    					span += "<option value='"+val.key+"'>"+val.value+"</option>";
    				}
    			});
    		}
    	});

    	// 取分类下的所有标签
    	$.ajax({
    		url: '/brand/getAllTags',
    		async: false,
    		data: {"cateId":cateId},
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
    			$('#new_tagName').tokenfield({
    				typeahead: [null, { source: engine.ttAdapter() }]
    			});
    		}
    	});

    	// 取已加标签
    	$.ajax({
    		url: '/brand/getTags',
    		async: false,
    		data: {"brandId":brandId},
    		success: function(data){
    			$('#new_tagName').val(data);
    		}
    	});

    	$('#new_brandId').val(brandId);
    	$('#new_cateId').html(span);
    	$('#new_brandName').val(brandName);
    	$('#new_coName').val(coName);
    	$('#new_stdTime').val(stdTime);
    	$('#new_coAddress').val(coAddress);
    	$('#new_bizScope').val(bizScope);
    	$('#new_status').val(status);
    	$('#new_officialWebsite').val(officialWebsite);
    	$('#brandModal').modal('show');
    });
});