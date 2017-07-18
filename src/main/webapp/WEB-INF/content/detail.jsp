<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>书籍详情</title>
<!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/css.css" type="text/css" rel="stylesheet">	
<SCRIPT src="js/jquery-1.2.6.pack.js" type=text/javascript></SCRIPT>
<SCRIPT src="js/base.js" type=text/javascript></SCRIPT>
 
</head>

<body style="text-align:center">
<h2><font color="#333399">${requestScope.bookname}</font></h2>
<div id=preview>
	<div class=jqzoom id=spec-n1 onClick="window.open('#')"><IMG height=350
	src="img/${requestScope.img4}" img="img/${requestScope.img4}" width=350>
	</div>
	<div id=spec-n5>
		<div class=control id=spec-left>
			<img src="img/left.gif" />
		</div>
		<div id=spec-list>
			<ul class=list-h>
				<li><img src="img/${requestScope.img1}"> </li>
				<li><img src="img/${requestScope.img2}"> </li>
				<li><img src="img/${requestScope.img3}"> </li>
				<li><img src="img/${requestScope.img4}"> </li>
				<li><img src="img/${requestScope.img1}"> </li>
				<li><img src="img/${requestScope.img2}"> </li>
				<li><img src="img/${requestScope.img3}"> </li>
				<li><img src="img/${requestScope.img4}"> </li>
				<li><img src="img/${requestScope.img1}"> </li>
				<li><img src="img/${requestScope.img2}"> </li>
				<li><img src="img/${requestScope.img3}"> </li>
				<li><img src="img/${requestScope.img4}"> </li>
			</ul>
		</div>
		<div class=control id=spec-right>
			<img src="img/right.gif" />
		</div>
		
    </div>
</div>
<div style="margin-left:30%;float:left;">
书籍详情：${requestScope.intro};<br>
书籍价格：<font color="red">${requestScope.price};￥</font><br>
          <a class="btn btn-primary" href="save?book_id=${book.id}" role="button" >购物车</a>&nbsp;&nbsp;&nbsp;
          <a class="btn btn-info" href="saveorder?book_id=${book.id}" role="button">购买</a> &nbsp;&nbsp;&nbsp;
          <a class="btn btn-danger" href="savecollect?book_id=${book.id}" role="button">收藏</a> 
</div>
<SCRIPT type=text/javascript>
	$(function(){			
	   $(".jqzoom").jqueryzoom({
			xzoom:400,
			yzoom:400,
			offset:10,
			position:"right",
			preload:1,
			lens:1
		});
		$("#spec-list").jdMarquee({
			deriction:"left",
			width:350,
			height:56,
			step:2,
			speed:4,
			delay:10,
			control:true,
			_front:"#spec-right",
			_back:"#spec-left"
		});
		$("#spec-list img").bind("mouseover",function(){
			var src=$(this).attr("src");
			$("#spec-n1 img").eq(0).attr({
				src:src.replace("\/n5\/","\/n1\/"),
				jqimg:src.replace("\/n5\/","\/n0\/")
			});
			$(this).css({
				"border":"2px solid #ff6600",
				"padding":"1px"
			});
		}).bind("mouseout",function(){
			$(this).css({
				"border":"1px solid #ccc",
				"padding":"2px"
			});
		});				
	})
	</SCRIPT>

<SCRIPT src="js/lib.js" type=text/javascript></SCRIPT>
<SCRIPT src="js/163css.js" type=text/javascript></SCRIPT>
</body>
</html>