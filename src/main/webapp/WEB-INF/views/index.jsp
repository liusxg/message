<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="application/json; charset=utf-8">
<title>index</title>
<script language="javascript">
	function addclick() {                                        //点击触发addclick事件
        var id = $("#id").val();									//用$获取id为id的页面标记的value，存放在id变量里
	    $.ajax({
	        type: "POST",                                         //ajax的方式为post(get方式对传送数据长度有限制)
	        url: "http://localhost:8080/message/login",           //一般处理程序页面AddUser.ashx(在2中会写出该页面内容)
	        dataType: "json",                                   //数据传回的格式为json
	        data: {"id": id}       								//要传送的数据键值对"id"为键（方便2中的文件用此名称接受数据）id为值（要传递的变量，例如用户名）
	    })
	}
</script>
</head>
<body>

<form id="Login" name="Login"> 
	id:
    <input type="text" id="id" value=""> </ br>
    name:
    <input type="text" id="name" value=""> </ br>
    password:
    <input type="password" id="password" value=""> </ br>
    <input type = "submit" value = "submit" onclick = "addclick()">
</form>

</body>
</html>