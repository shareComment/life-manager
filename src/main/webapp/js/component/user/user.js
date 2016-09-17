$(document).ready(function() {
	/* Init DataTables */
    var oTable = $('#editable').dataTable();

    // view user info
    oTable.$('button').click(function (){
    	var userId = $(this).attr('id');
    	$('#userId').val(userId);
    	$.ajax({
    		url: '/user/userInfo',
    		async: false,
    		data: {"userId":userId},
    		success: function(data){
    			var obj = eval('('+data+')');
    			$('#telephone').text(obj.telephone);
    			$('#nickname').text(obj.nickname);
    			$('#gradeName').text(obj.gradeName);
    			$('#bonusPoint').text(obj.bonusPoint);
    			$('#gender').text(obj.gender == '0' ? '女' : '男');
    			$('#age').text(obj.age);
    			$('#education').text(obj.education);
    			$('#collage').text(obj.collage);
    			$('#email').text(obj.email);
    			$('#address').text(obj.address);
    			$('#verified').val(obj.verified);
    			$('#idcard').text(obj.idcard);
    			$('#imgA').attr('src', obj.imgA);
    			$('#imgB').attr('src', obj.imgB);
    			$('#status').val(obj.status);
    			$('#addTime').text(obj.addTime);
    			$('#lastTime').text(obj.lastTime);
    		}
    	});
    	$('#myModal').modal('show');
    });

    // 会员状态变更
    $('#submit').click(function (){
    	$.ajax({
    		url: '/user/update',
    		async: false,
    		data: {"userId":$('#userId').val(), "verified":$('#verified').val(), "status":$('#status').val()},
    		success: function(data){
    			if(data == '0'){
    				$('.alert-success').css('display', 'block');
    				setTimeout(function(e){
    					$('#myModal').modal('hide');
    					setTimeout(function(e){
    						$('#chan').load('/user');
    					},1000);
                    },2000);
    			}else{
    				$('.alert-warning').css('display', 'block');
    			}
    		}
    	});
    });
});