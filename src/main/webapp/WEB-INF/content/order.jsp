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
    <title>订单</title>

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
         <h1>${sessionScope.user.username}：订单.<a class="btn btn-primary" href="mainshop" role="button">继续购物</a>
          </h1>
         <br>
         <table class="table table-hover">
                
                <tr>
			<th class="thtd">书籍图片</th>
			
			<th class="thtd">书籍名称</th>
			<th class="thtd">书籍价格</th>
			<th class="thtd">书籍数量</th>
			<th class="thtd">书籍状态</th>
			<th class="thtd"><font color="blue">确认收货</font></th>
			
			<th class="thtd"><font color="red">删除</font></th>
		    </tr>		    
           <c:forEach items="${requestScope.order_list }" var="order">
		   <c:forEach items="${order.book }" var="book">
			<tr>
				<td><img src="img/${book.bookimage}"></td>			
				<td>${book.bookname}</td>
				<td>${book.bookprice}</td>
				<td>${order.count}</td>
				<td>${order.state}</td>
			<td>
			<a class="btn btn-info" href="buy?book_id=${book.id}" role="button">确认收货</a>
		    </td>
		    <td>
			<a class="btn btn-danger" href="removeorder?book_id=${book.id}" role="button">删除</a>
		    </td>
		  </tr>
		</c:forEach>		
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