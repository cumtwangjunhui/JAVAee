<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>
      <div style="margin:30px auto;width:25%;">
          <div style="margin-left:35%;"><img src="img/touxiang.png" class="img-circle"></div><br>
          <div>
         <form action="enroll" method="post">
          <div class="input-group">
             <span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-user"></span></span>
              <input type="text" class="form-control" placeholder="用户昵称" aria-describedby="sizing-addon2" name="username">
          </div>
          <div class="input-group" style="margin-top:15px">
             <span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-certificate"></span></span>
              <input type="text" class="form-control" placeholder="用户账号" aria-describedby="sizing-addon2" name="loginnumber">
          </div>
          <div class="input-group" style="margin-top:15px">
             <span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-lock"></span></span>
              <input type="text" class="form-control" placeholder="用户密码" aria-describedby="sizing-addon2" name="password">
          </div>
          <div class="input-group" style="margin-top:15px">
             <span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-phone"></span></span>
              <input type="text" class="form-control" placeholder="用户手机" aria-describedby="sizing-addon2" name="phone">
          </div>
          <div class="input-group" style="margin-top:15px">
             <span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-envelope"></span></span>
              <input type="text" class="form-control" placeholder="用户邮箱" aria-describedby="sizing-addon2" name="email">
          </div>
          <div class="input-group" style="margin-top:15px">
             <span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-map-marker"></span></span>
              <input type="text" class="form-control" placeholder="用户地址" aria-describedby="sizing-addon2" name="address">
          </div>
          <div style="margin-top:15px;margin-left:150px;"><button type="submit" class="btn btn-info">立即注册</button></div>
         </form>
         </div>
      </div>
    </body>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    </html>