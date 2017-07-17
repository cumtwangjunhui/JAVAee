<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户管理</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/biao.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
 <div>
     <div style="width:60%;margin:auto auto;">
         <h1>桔果书屋用户管理</h1>
         <br>
         <table class="table table-hover">
                
                <td class="thtd">用户昵称</td>
                <td class="thtd">用户账号</td>
                <td class="thtd">用户密码</td> 
                <td class="thtd">联系方式</td>
                <td class="thtd">用户住址</td>
                <td class="thtd">删除用户</td>
                <td class="thtd">修改用户</td>
                
                
             <c:forEach items="${requestScope.user_list}" var="user">
            <tr>
          
                <td>${user.username}</td>
                <td>${user.loginnumber}</td> 
                <td>${user.password}</td>
                <td>${user.phone}</td>
                <td>${user.address}</td>
                <td><a class="btn btn-primary" href="deleteuser?user_id=${user.id}" role="button" >删除用户</a></td>
                <td><a class="btn btn-info" href="updetuser?user_id=${user.id}" role="button">修改信息</a></td> 
                
            </tr>
            </c:forEach>
        </table>
     </div>
 </div>
  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>