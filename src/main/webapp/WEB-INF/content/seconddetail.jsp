<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>平凡的世界</title>
<link href="css/css.css" type="text/css" rel="stylesheet">	
<SCRIPT src="js/jquery-1.2.6.pack.js" type=text/javascript></SCRIPT>
<SCRIPT src="js/base.js" type=text/javascript></SCRIPT>
</head>

<body style="text-align:center">
<h1 style="float:left";><font color="#FFCC33">平凡的世界</font></12>
<div id=preview>
	<div class=jqzoom id=spec-n1 onClick="window.open('#')"><IMG height=350
	src="img/ping04.jpg" jqimg="img/ping04.jpg" width=350>
	</div>
	<div id=spec-n5>
		<div class=control id=spec-left>
			<img src="img/left.gif" />
		</div>
		<div id=spec-list>
			<ul class=list-h>
				<li><img src="img/ping01.jpg"> </li>
				<li><img src="img/ping02.jpg"> </li>
				<li><img src="img/ping03.jpg"> </li>
				<li><img src="img/ping04.jpg"> </li>
				<li><img src="img/ping01.jpg"> </li>
				<li><img src="img/ping02.jpg"> </li>
				<li><img src="img/ping03.jpg"> </li>
				<li><img src="img/ping04.jpg"> </li>
				<li><img src="img/ping01.jpg"> </li>
				<li><img src="img/ping02.jpg"> </li>
				<li><img src="img/ping03.jpg"> </li>
				<li><img src="img/ping04.jpg"> </li>
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
<p>《平凡的世界》是中国作家路遥创作的一部百万字的小说。这是一部全景式地表现中国当代城乡社会生活的长篇小说，全书共三部。</p>
<p>该书以中国70年代中期到80年代中期十年间为背景，通过复杂的矛盾纠葛，以孙少安和孙少平两兄弟为中心，刻画了当时社会各阶层众多普通人的形象；劳动与爱情、挫折与追求、痛苦与欢乐、日常生活与巨大社会冲突纷繁地交织在一起，深刻地展示了普通人在大时代历史进程中所走过的艰难曲折的道路。</p>
<p>1991年3月份《平凡的世界》获中国第三届茅盾文学奖。第一版于1986年12月在文联出版社出版；第二版于2012年3月在北京十月文艺出版社正式发行。</p>
</body>
</html>