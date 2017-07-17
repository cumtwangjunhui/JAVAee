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
    <title>全部书单</title>

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
         <h1>桔果书屋所有上架书籍</h1>
         <br>
         <table class="table table-hover">
                <td width="200px" class="thtd">书籍图片</td>
                <td class="thtd">书籍编号</td>
                <td class="thtd">书籍名称</td>
                <td class="thtd">书籍详情</td> 
                <td class="thtd">书籍价格</td>
                <td class="thtd">书籍数量</td>
                <td class="thtd">下架</td>
                
             <c:forEach items="${requestScope.book_list}" var="book">
            <tr>
                <td><img src="img/${book.bookimage }"></td>
                <td>${book.booknomber}</td>
                <td>${book.bookname}</td> 
                <td>${book.bookintro}</td>
                <td><font color="red">￥${book.bookprice}</font></td>
               
               
                <td><a class="btn btn-danger" href="removebook?book_id=${book.id}" role="button">下架</a></td> 
            </tr>
            </c:forEach>
        </table>
        
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