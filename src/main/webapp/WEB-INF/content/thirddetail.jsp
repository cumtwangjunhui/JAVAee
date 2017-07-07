<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Spring-MVC</title>
<link href="css/css.css" type="text/css" rel="stylesheet">	
<SCRIPT src="js/jquery-1.2.6.pack.js" type=text/javascript></SCRIPT>
<SCRIPT src="js/base.js" type=text/javascript></SCRIPT>
</head>

<body style="text-align:center;">

<h1 style="float:left";><font color="#FFCC33">Spring-MVC</font></h1>
<div id=preview>
	<div class=jqzoom id=spec-n1 onClick="window.open('#')"><IMG height=350
	src="img/mvc04.jpg" jqimg="img/mvc04.jpg" width=350>
	</div>
	<div id=spec-n5>
		<div class=control id=spec-left>
			<img src="img/left.gif" />
		</div>
		<div id=spec-list>
			<ul class=list-h>
				<li><img src="img/mvc01.jpg"> </li>
				<li><img src="img/mvc02.jpg"> </li>
				<li><img src="img/mvc03.jpg"> </li>
				<li><img src="img/mvc04.jpg"> </li>
				<li><img src="img/mvc01.jpg"> </li>
				<li><img src="img/mvc02.jpg"> </li>
				<li><img src="img/mvc03.jpg"> </li>
				<li><img src="img/mvc04.jpg"> </li>
				<li><img src="img/mvc01.jpg"> </li>
				<li><img src="img/mvc02.jpg"> </li>
				<li><img src="img/mvc03.jpg"> </li>
				<li><img src="img/mvc04.jpg"> </li>
			</ul>
		</div>
		<div class=control id=spec-right>
			<img src="img/right.gif" />
		</div>
		
    </div>
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
<p>Spring MVC属于SpringFrameWork的后续产品，已经融合在Spring Web Flow里面。<br>
Spring 框架提供了构建 Web 应用程序的全功能 MVC 模块。使用 Spring 可插入的 MVC 架构，从而在使用Spring进行WEB开发时，<br>
可以选择使用Spring的SpringMVC框架或集成其他MVC开发框架，如Struts1，Struts2等。</p>

</body>
</html>