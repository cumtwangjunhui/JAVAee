<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>评价</title>

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
      <div style="margin:200px auto;width:15%;">
          <div>
         <form action="pingjia" method="post">
          <div class="input-group">
             <span  id="sizing-addon2">物流评价</span>
              <input type="text" class="form-control" placeholder="物流评价" aria-describedby="sizing-addon2" name="wuliu">
          </div>
          <div class="input-group" style="margin-top:15px">
             <span  id="sizing-addon2">质量评价</span>
              <input type="text" class="form-control" placeholder="质量评价" aria-describedby="sizing-addon2" name="ziliang">
          </div>
          <div style="margin-top:15px;margin-left:100px;"><button type="submit" class="btn btn-info">提交</button></div>
         </form>
         </div>
      </div>
    </body>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    </html>