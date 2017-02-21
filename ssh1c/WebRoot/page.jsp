<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		function f(v){
			var searchForm=document.getElementById("searchForm");
			document.getElementById("currentPage").value=v;
			searchForm.submit();
		}
	</script>
	<form action="query.action" method="post" id="searchForm">
		<input type="hidden" name="currentPage" id="currentPage">
	</form>
	<table>
		<tr>
			<td>
				<a href="#" onclick="f(1);return false;">首页</a>
				<c:choose>
					<c:when test="${currentPage<=1}">
						上一页
					</c:when>
					<c:otherwise>
						<a href="#" onclick="f(${currentPage-1});return false;">上一页</a>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${currentPage>=totalPage}">
						下一页
					</c:when>
					<c:otherwise>
						<a href="#" onclick="f(${currentPage+1});return false;">下一页</a>
					</c:otherwise>
				</c:choose>
				<a href="#" onclick="f(${totalPage});return false;">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>