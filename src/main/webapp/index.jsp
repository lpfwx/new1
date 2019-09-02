<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<body>
<a href="user/select">查询</a>
<%-- <img alt="" src="<%=request.getContextPath()%>/img/1.jpg"> --%>
<form action="<%=request.getContextPath()%>/user/insert" method="post" id="form" enctype="multipart/form-data">
用户名： <input type="text" name="username"><br><br>
密码：<input type="password" name="password"><br><br>
年龄：<input type="text" name="age"><br><br>

喜欢的水果：<input type="checkbox" name="fruit" value="apple">苹果
<input type="checkbox" name="fruit" value="banana">香蕉
<input type="checkbox" name = "fruit" value="orange">橘子<br>
<input type="file" name="img" onchange="preview()">
<div id="divimg">

</div>
<input type="submit">
<!-- <input type="button" value="提交" onclick="sub()"> -->
</form>
<script type="text/javascript">
 function preview(){
	 var formData = new FormData($("#form")[0]);
	 $.ajax({
	       url : '<%= request.getContextPath()%>/user/select1',
	       type : "POST",
	       data : formData,
	       dataType : "json",
	       processData : false, //必须false才会避开jQuery对 formdata 的默认处理
	       contentType :  false, //必须false才会自动加上正确的Content-Type
	       cache : false, //true的话会读缓存
	       success : function(data) {
	           $.each(data, function(i, val) {
	               console.log(val);
	            	   //访问上传上去的图片方法 路径+图片上传保存后的名字
	                 $("#divimg").append("<img   alt=''  src='<%= request.getContextPath()%>/serverimg/"+val+"'     height='300' width='650'>")
	            });
	        }
	     });
	    <%-- $.ajax({
	       url : '<%= request.getContextPath()%>/user/select',
	       type : "POST",
	       data : formData,
	       dataType : "text",
	       processData : false, //必须false才会避开jQuery对 formdata 的默认处理
	       contentType :  false, //必须false才会自动加上正确的Content-Type
	       cache : false, //true的话会读缓存
	       success : function(data) {
	       	   console.log(data); 
	       	   alert(data);
	       },
	       error: function(returnedData) {  
				 alert("加载数据出错!");
				} 
	    }); --%>
	 }
</script> 
</body>
</html>