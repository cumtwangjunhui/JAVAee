<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>桔果，啥都有。</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
     <link rel="stylesheet" href="css/normalize.css">
	  <link rel="stylesheet" href="css/ideal-image-slider.css">
   	<link rel="stylesheet" href="css/default.css">
     <script src="js/ideal-image-slider.js"></script>
     <script src="js/getDate.js"></script>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
function startTime()
{
var today=new Date()
var h=today.getHours()
var m=today.getMinutes()
var s=today.getSeconds()
// add a zero in front of numbers<10
m=checkTime(m)
s=checkTime(s)
document.getElementById('txt').innerHTML=h+":"+m+":"+s
t=setTimeout('startTime()',500)
}

function checkTime(i)
{
if (i<10) 
  {i="0" + i}
  return i
}
</script>
    <style>    
        .navcolor{
       background-color:#FF9933;}
      body{margin-left:5%;
            margin-right:5%;
            margin-top:2px;
           
            }
     .li{margin-left:2px;}
     #slider {
		max-width: 1350px;
		margin: 0 0;
	}
    </style>
   
  </head>
  <body onload="startTime()">
    <div>
     <div> 
       <nav class="navbar navbar-default navcolor">
           <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
              <div class="navbar-header">
               
                 <img src="img/logo.jpg">&nbsp;&nbsp;&nbsp;&nbsp;
             </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
             <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="margin-top:30px">
      <ul class="nav navbar-nav">
        <li class="li"><a href="#"><font size="4px" face="幼圆" color="#76CB9A">首页</font> <span class="sr-only">(current)</span></a></li>
        <li class="li"><a href="ours"><font size="4px" face="幼圆" color="#76CB9A">关于我们</font></a></li>
        <li class="dropdown li">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><font size="4px" face="幼圆" color="#76CB9A">经营商品</font><span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="wenyibook">文艺书</a></li>
            <li><a href="kejibook">科技书</a></li>
            <li><a href="shenghuobook">生活书</a></li>
            <li><a href="jingguanbook">经管书</a></li>
          </ul>
        </li>
        <li class="li"><a href="lianxi"><font size="4px" face="幼圆" color="#76CB9A">联系我们</font></a></li>
        <li class="dropdown li">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><font size="4px" face="幼圆" color="#76CB9A">${sessionScope.user.username}</font><span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="cart">我的购物车</a></li>
            <li><a href="collect">我的收藏</a></li>
            <li><a href="order">我的订单</a></li>
            <li><a href="updatepwd">修改密码</a></li>
             <li><a href="main">注销</a></li>
            
          </ul>
        </li>
        <li id="txt" style="padding-left:40px;padding-top:15px"></li>
      
      </ul>
      
      <form class="navbar-form navbar-right">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
      </form>
     
    </div><!-- /.navbar-collapse -->
   </div><!-- /.container-fluid -->
 </nav>
</div>
    <div id="slider" style="margin-top:2px,0px,0px,0px">      
		<img src="img/1.jpg" data-src-2x="img/1@2x.jpg" alt="Slide 1" />
		<img data-src="img/2.jpg" data-src-2x="img/2@2x.jpg" src="" alt="Slide 2" />
		<img data-src="img/3.jpg" data-src-2x="img/3@2x.jpg" src="" alt="Slide 3" />
	</div>
	
	<script>
	var slider = new IdealImageSlider.Slider('#slider');
	slider.start();
	</script>
  <div>
    <div style="margin-left:10px;width:300px;margin-top:0px;float:left;">
        <div class="alert alert-success" role="alert" style="margin-top:10px;border-radius:25px;box-shadow: 10px 10px 5px #888888;">
           <a href="wenyibook" class="alert-link">文艺书&nbsp;&nbsp;&nbsp;&nbsp;<span class="badge">火热书籍</span></a>
       </div>
       <div class="alert alert-info" role="alert" style="border-radius:25px;box-shadow: 10px 10px 5px #888888;">
           <a href="kejibook" class="alert-link">科技书</a>
       </div>
      <div class="alert alert-warning" role="alert" style="border-radius:25px;box-shadow: 10px 10px 5px #888888;">
          <a href="shenghuobook" class="alert-link">生活书</a>
      </div>
       <div class="alert alert-danger" role="alert" style="border-radius:25px;box-shadow: 10px 10px 5px #888888;">
           <a href="jingguanbook" class="alert-link">经管书</a>
       </div>
    </div>
    <div style="float:left;">
        <div class="row" style="margin-left:2%;width:250px;margin-top:10px;" >
              <div class="thumbnail" style="height:280px;background-color:#EEDE9D;">
                 <a href="firstdetail"><img  src="img/111.jpg" alt="picture"></a>
                   <div class="caption">
                      <h3>乖，摸摸头<span><font color="red">￥35</font></span></h3>
                      <p>《乖，摸摸头》是由著名主持人大冰所著，一本记录了大冰十余年的江湖游历，以及他和他朋友们的爱与温暖的传奇故事的书籍。 </p>                   
                  </div>
                </div> 
          </div>   
    </div>
     <div style="float:left;margin-left:2%;">
        <div class="row" style="margin-left:30px;width:250px;margin-top:10px;" >
              <div class="thumbnail" style="height:280px;background-color:#EEDE9D;">
                 <a href="seconddetail"><img  src="img/222.jpg" alt="picture"></a>
                   <div class="caption">
                      <h3>平凡的世界<span><font color="red">￥46</font></span></h3>
                      <p>《平凡的世界》是由著名作家路遥所著，这是一部全景式地表现中国当代城乡社会生活的长篇小说，全书共三部。 </p>                   
                  </div>
                </div> 
          </div>   
    </div>
     <div style="float:left;margin-left:2%;">
        <div class="row" style="margin-left:30px;width:250px;margin-top:10px;" >
              <div class="thumbnail" style="height:280px;background-color:#EEDE9D;">
                 <a href="thirddetail"><img  src="img/333.png" alt="picture"></a>
                   <div class="caption">
                      <h3>Spring MVC<span><font color="red">￥38</font></span></h3>
                      <p>《SpringMVC》是由李刚编著，详细讲解了Spring MVC框架及webflow页面流，学习Spring MVC非常不错的学习资料 </p>                  
                  </div>
                </div> 
          </div>   
    </div>
   </div>
    </div>
    <br>
    <div class="pull-right" style="margin-right:8%;">
      <img src="img/foot1.PNG">
      <p style="text-align:center;">版权所有：桔果书屋。联系地址：中国矿业大学南湖校区。联系电话：15162143956.</p>
      </div>
      
   </body>
   <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>