<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
    
<main>
<section class="container">
	<article class="half">
		<h1>Yoribogo</h1>
		<div class="tabs">
			<span class="tab signin active">Sign in</span>
			<span class="tab signup"><a href="${ctx}/member/join">Sign up</a></span>
		</div>
		
		
		<div class="content">
			<div class="signin-cont cont">
				<form method="post">
					<input type="text" name="username" id="id" class="inpt" required="required" placeholder="user id"> 
					<input type="password" name="password" id="pwd" class="inpt" required="required" placeholder="Your password"> 
					
					<input type="checkbox" id="remember" class="checkbox" checked> <label for="remember">Remember me</label>
					<div class="submit-wrap">
						<input type="submit" value="Sign in" class="submit"> 
						<a href="#" class="more">have a nice day :)</a>
					</div>
				</form>
			</div>
			
		</div>
	</article>
	
	
	<div class="half bg">
		<img src="${ctx}/resources/images/login-door.png">
	</div>
</section>
</main>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> 
<script type="text/javascript">
	$('.tabs .tab').click(function() {
		if ($(this).hasClass('signin')) {
			$('.tabs .tab').removeClass('active');
			$(this).addClass('active');
			$('.cont').hide();
			$('.signin-cont').show();
		}
		if ($(this).hasClass('signup')) {
			$('.tabs .tab').removeClass('active');
			$(this).addClass('active');
			$('.cont').hide();
			$('.signup-cont').show();
		}
	});
</script>
<!-- <script>
$(document).ready(function(){
                       
	$('#form').submit(function(){
		$.ajax({
            type: 'POST',
            url: '/yoribogo/member/login/checkMember',
            data: {
                'memberId' : $('#id').val()
                //'memberPwd' : $('#pwd').val()
            },
            dataType:'html',                
            success: function(data){
            	if(data == "OK"){
            		
            		$('#id').attr("name","username");
            		$('#pwd').attr("name","password");
            		
            	}else
            		{
            			$('#id').removeAttr("name");
            			$('#pwd').removeAttr("name");
            		}                                         
            },
            /* complete : function(data) {
				alert("not connect");
                // 통신이 실패했어도 완료가 되었을 때 이 함수를 타게 된다.

            }, */
            error:function(request,status,error){
               alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
              }           
        });
		
		//패스워드도 ajax로 확인할 것 
		
		if($('#id').attr('name') == null || $('#pwd').attr('name') == null){
			alert("fail");
			$('#pwd').val('');
			$('#pwd').focus();
			//텍스트 빨간색으로 출력
			return false;
		}else
			alert("login success");
	});
});
</script> -->