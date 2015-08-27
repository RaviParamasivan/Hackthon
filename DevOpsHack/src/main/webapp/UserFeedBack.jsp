<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
</head>
<body>
<input type="text" id ="feedBackTitle">
<input type="text" id ="feedBackDesc">
<input type="text" id ="feedBackGroup">
<button onClick="updateFeedback()" name ="xxxx"> </button>
</body>
<script>
 function updateFeedback(){
	
	 var data={"feedBackTitle":$("#feedBackTitle").val(),"feedBackDesc":$("#feedBackDesc").val(),"feedBackGroup":$("#feedBackGroup").val()};
	 alert("---->"  +JSON.stringify(data));
	 $.ajax({url: "/DevOpsHack/index.jsp?jsonStr="+JSON.stringify(data), success: function(result){
         alert(result);
     }});
} 
</script>
</html>