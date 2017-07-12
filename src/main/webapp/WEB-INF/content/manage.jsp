<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <!-- Bootstrap -->
    <title>桔果后台管理系统</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
     <link rel="stylesheet" href="css/normalize.css">
	  <link rel="stylesheet" href="css/ideal-image-slider.css">
   	<link rel="stylesheet" href="css/default.css">
   	<style>
	body{
		background:url(img/bg.jpg) top left;
		background-size:100% 100%;
		overflow:hidden;
	}
</style>
     </head>
   <body style="width:100%; height:100%;">
   <script>
   function myFunction()
{
alert("目前在线人数为："${applicationScope.count}"人");
}
</script>
   <h2 style="text-align:center;"><font color="#FF8000">桔果后台管理系统</font></h2>
  <div style="margin-top:50px;margin-left:5px;width:20%;">
   <ul class="nav nav-pills nav-stacked">
      <li role="presentation" class="btn btn-primary"><button class="btn btn-primary" onclick="myFunction()">在线人数统计${applicationScope.count}人</button></li>
      <li role="presentation" class="btn btn-info"><a href="users">用户管理</a></li>
      <li role="presentation" class="btn btn-success"><a href="jieguobooks">商品管理</a></li>
      <li role="presentation" class="btn btn-success"><a href="history">已售商品</a></li>
      <li role="presentation" class="btn btn-success"><a href="bookadd">添加商品</a></li>
   </ul>
   </div>
   <div>在线人数为：${applicationScope.count}人</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>