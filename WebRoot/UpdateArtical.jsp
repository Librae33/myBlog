<%@ page language="java" contentType="text/html; "
    pageEncoding="GB18030"%>

      <%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"> 
<script type="text/javascript" src="./js/jquery-3.2.0.min.js"></script>  
<script type="text/javascript" src="./ckeditor/ckeditor.js" ></script> 
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script type="text/javascript">
�0�2CKEDITOR.replace("tcontent");
</script>
<style type="text/css">
	body{
		background: url(./img/topic2.jpg);
		width: 100%;
		height: 1200px;
		background-size: 100%;
		height: 600px;
	}
	table{
		height: 1000px;
		width: 80%;
		border: 1px;
		font-size: 20px;
		font-weight: bold;
	}

	tbody{
		background: rgb(52,73,74);
	}
	
</style>
</head>
<body>
<form method="post" action="myBlog.jsp" name="form2">

<input type="submit" class="btn btn-danger" value="������ҳ" >
</form>
 <form method="post" action="TopicAction?method=addTopic" name="form1">
<table class="table table-condensed">
		<caption class="text-info">��������</caption>
		<tbody>
		
			<tr>
				<td class="text-primary">���±���</td>
				<td><input type="text" value="${topic.tiltle}"></td>
			</tr>
	
			<tr>
            <td class="text-primary">��������</td>
            <td><textarea name="tcontent"  id="tcontent" cols="100" rows="30">${topic.tcontent}</textarea></td>
            </tr>
			<tr>
           <td  colspan="2">
           <input type="submit" value="�ύ" class="btn btn-primary" name="button3">     <input type="reset" value="����" class="btn btn-danger" name="button4"></td>
           </td>
          </tr>
		</tbody>
	</table>
</form>
<script type="text/javascript">
�0�2CKEDITOR.replace("tcontent");
</script>
</body>
</html>