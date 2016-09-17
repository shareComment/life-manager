$(document).ready(function() {
	$('.dropdown-toggle').dropdown();
    // modify the pass
    $('#chgPass').click(function (){
    	$('#oldPass').val('');
    	$('#newPass1').val('');
    	$('#newPass2').val('');
    	$('#chgPassModal').modal('show');
    });

    // submit form
    $('#submit').click(function (){
    	var oldPass = $('#oldPass').val();
    	var newPass1 = $('#newPass1').val();
    	var newPass2 = $('#newPass2').val();
    	if(!oldPass || !newPass1 || !newPass2){
    		$('.alert-warning').css('display', 'block');
    		$('.alert-warning').text('请填写完整！');
    		setTimeout(function(e){
    			$('.alert-warning').css('display', 'none');
			},2000);
    		return;
    	}
    	if(newPass1 != newPass2){
    		$('.alert-warning').css('display', 'block');
    		$('.alert-warning').text('两次输入的新密码不一致！');
    		setTimeout(function(e){
    			$('.alert-warning').css('display', 'none');
			},2000);
    		return;
    	}
    	$.ajax({
    		type: 'POST',
    		url: '/manager/chgPass',
    		async: false,
    		data:{"oldPass":oldPass, "newPass":newPass1},
    		success: function(data){
    			if(data == '0'){
    				$('.alert-success').css('display', 'block');
    				setTimeout(function(e){
    					$('#myModal').modal('hide');
    					setTimeout(function(e){
    						window.location.href = '/';
    					},1000);
                    },2000);
    			}else{
    				$('.alert-success').css('display', 'none');
    				$('.alert-warning').css('display', 'block');
    				$('.alert-warning').html('<strong>失败！</strong>操作失败，稍后再试。');
    				setTimeout(function(e){
    	    			$('.alert-warning').css('display', 'none');
    				},2000);
    			}
    		}
    	});
    });

    $("input[type='password']").bind({
    	focus:function(){
    		$('.alert').css('display', 'hidden');
    	}
    });
});