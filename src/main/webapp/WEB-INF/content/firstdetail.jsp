<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>乖，摸摸头</title>
<link href="css/css.css" type="text/css" rel="stylesheet">	
<SCRIPT src="js/jquery-1.2.6.pack.js" type=text/javascript></SCRIPT>
<SCRIPT src="js/base.js" type=text/javascript></SCRIPT>
</head>

<body style="text-align:center">
<h2><font color="#333399">乖，摸摸头</font></h2>
<div id=preview>
	<div class=jqzoom id=spec-n1 onClick="window.open('#')"><IMG height=350
	src="img/img04.jpg" jqimg="img/img04.jpg" width=350>
	</div>
	<div id=spec-n5>
		<div class=control id=spec-left>
			<img src="img/left.gif" />
		</div>
		<div id=spec-list>
			<ul class=list-h>
				<li><img src="img/img01.jpg"> </li>
				<li><img src="img/img02.jpg"> </li>
				<li><img src="img/img03.jpg"> </li>
				<li><img src="img/img04.jpg"> </li>
				<li><img src="img/img01.jpg"> </li>
				<li><img src="img/img02.jpg"> </li>
				<li><img src="img/img03.jpg"> </li>
				<li><img src="img/img04.jpg"> </li>
				<li><img src="img/img01.jpg"> </li>
				<li><img src="img/img02.jpg"> </li>
				<li><img src="img/img03.jpg"> </li>
				<li><img src="img/img04.jpg"> </li>
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
<p>真实的故事自有万钧之力，本书讲述了12个真实的故事。</p>
<p>或许会让你看到那些你永远无法去体会的生活，见识那些可能你永远都无法结交的人。</p>
<p>【乖，摸摸头】“杂草敏”的故事。每年一条的短信和一个让人心疼的南方姑娘。</p>
<p>【我有一碗酒，可以慰风尘】一个比酒还烈的故事。一个隐居滇西北的越战老兵跌宕起伏的人生，以及充满善意的、出人意料的结局。</p>
<p>【对不起】她和被主人遗弃的松狮狗的故事。</p>
<p>【普通朋友】或许没有人知道，大鹏在成为“屌丝男士”前，曾差一点儿被砸死在舞台上。每个硬着骨头敢拼敢搏的人都有个柔软的理由，大鹏的那个理由是一个小姑娘。</p>
<p>【不许哭】藏地往事，酒吧掌柜大冰、日语翻译妮可、民谣歌手赵雷的拉萨旧时光。</p>
<p>【唱歌人不许掉眼泪】一个从缅甸金三角走来的流浪歌手的故事……故事里有穷困窘迫、颠沛流离、渺茫的希望、忽晴忽雨的前路，还有一把红棉吉他和一个很想唱歌的孩子。</p>
<p>【听歌人不许掉眼泪】为你们讲述小屋存在的最遥远的理由，以及大树和兜兜凄美的爱情故事。</p>
<p>【一个叫木头，一个叫马尾】毛毛叛逆的青春、艰辛的奋斗和与木头的爱情史。</p>
<p>【椰子姑娘流浪记】一段长达13年的爱情，一个普通人的传奇。（及不用手机的女孩之后续）。</p>
<p>【风马少年】我、二宝、成子的纳木措惊险之旅，离死亡仅差60厘米。</p>
<p>【小因果】这个9岁的小男孩不会知道，24年后，身旁的这个小姑娘会成为他的妻子，陪他浪迹天涯。</p>
<p>【我的师弟不是人】我的师弟昌宝不是人，是一只哈奇士。</p>
<p>就像大冰说的那样:不要那么孤独，请相信，这个世界上真的有人在过着你想要的生活愿你我带着最微薄的行李和最丰盛的自己在世间流浪。</p><p>
你我迤逦人世间，每个人都需要被善意地摸摸头。不论你晴朗或是阴霾，低谷期还是巅峰期，愿你永远被这个世间的善意所护持。善良是一种天赋，善意是一份选择。</p>
</body>
</html>