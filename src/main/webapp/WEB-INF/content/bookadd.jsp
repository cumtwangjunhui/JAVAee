<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加商品</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
.thtd{
        color:coral;
        font-family:华文细黑;
        font-size: 16px;
        padding: 5px 15px;
        width:150px;
        }
     table {
	border-collapse: collapse;
	border-spacing: 0;
	border-left: 1px solid #888;
	border-top: 1px solid #888;
	background: #efefef;
}

 td {
	border-right: 1px solid #888;
	border-bottom: 1px solid #888;
	border-bgcolor:#CC6666;
	padding: 1px 1px;
	width:200px;
}

th {
	font-weight: bold;
	background: #ccc;
	width:150px;
}
    </style>
  </head>
  <body>
 <div>
     <div style="width:60%;margin:auto auto;">
         <h1>添加书籍</h1>
         <br>
         <form action="bookadd" method="post">
         <table class="table table-hover" >
                <td width="200px" class="thtd">书籍图片</td>
                <td class="thtd">书籍编号</td>
                <td class="thtd">书籍名称</td>
                <td class="thtd">书籍类型</td>
                <td class="thtd">书籍详情</td> 
                <td class="thtd">书籍价格</td>
                <td class="thtd">书籍数量</td>
                <td class="thtd">添加</td>
            <tr>
                <td><input type="text" name="bookimage"></td>
                <td><input type="text" name="booknomber"></td>
                <td><input type="text" name="bookname"></td>
                 <td><input type="text" name="booktype"></td>
                <td><input type="text" name="bookintro"></td>
                <td><input type="text" name="bookprice"></td>
                <td><input type="text" name="bookcount"></td>
                <td><button type="submit" class="btn btn-info">添加</button></td> 
            </tr>
           
        </table></form>
     </div>
 </div>
  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>