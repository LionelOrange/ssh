<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <script type='text/javascript' src='dwr/interface/cc.js'></script>
  <script type='text/javascript' src='dwr/engine.js'></script>
  <script type='text/javascript' src='dwr/util.js'></script>
  <script type="text/javascript">
  	function f(){
  		alert("sdsd");
  		cc.say(function(msg){
  			
  			alert(msg);
  		});
  	}
  </script>
</head>
<body>
	<a href="#" onclick="f();return false;">dfdf</a>
	<form action="add.action" method="post">
		userName:<input type="text" name="user.userName">
		password:<input type="text" name="user.password">
		<input type="submit" value="add">
	</form>
</body>
</html>