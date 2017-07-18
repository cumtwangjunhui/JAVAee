<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单评价</title>
</head>
<body>
<meta charset="UTF-8" />  
    <title>商品评价</title>  
    <link rel="stylesheet" href="http://v3.bootcss.com/dist/css/bootstrap.min.css" />  
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>  
    <style>  
        /* 向左的箭头 */    
        .glyphicon{  
            cursor: pointer;  
        }  
        .dot-left {    
            font-size: 0;    
            line-height: 0;    
            border-width: 5px;    
            border-color: #f37a0e;    
            border-left-width: 0;    
            border-style: dashed;    
            border-right-style: solid;    
            border-top-color: transparent;    
            border-bottom-color: transparent;    
            display: inline-block;  
        }   
        /* 文字提示框 */  
        .tip{  
            background: #f37a0e;  
            padding: 0 5px;  
            display: inline-block;  
            border-radius: 5px;  
        }  
    </style>  
</head>  
<body>  
    <div class="container"> 
      <h3> 欢迎【 ${sessionScope.user.username}】</h3>
          <img src="img/${requestScope.bookimg}" >
          <p style="float:left">商品简介：${requestScope.intro}<br>商品编号：${requestScope.number}<br>商品单价：${requestScope.price}</p> <p id="book_id" style="float:left">${requestScope.book_id}</p>
     <form action="comment" method="post">
        <table class="table table-bordered table-hover table-striped table-condensed">  
            <tr>  
                <td colspan='3'>  
                    <h2>订单评价</h2>  
                </td>  
            </tr>  
            <tr>  
                <th width="33%">评价项目</th>  
                <th width="33%">星星</th>  
                <th width="33%">分数</th>  
            </tr>  
            <tr class="tr">  
                <td>物流速度</td>  
                <td>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                </td>  
                <td class="score" id="tra" > </td>         
            </tr>  
            <tr class="tr">  
                <td>商品质量</td>  
                <td>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                </td>  
                <td class="score" id="pro"></td>  
            </tr>  
            <tr class="tr">  
                <td>卖家服务</td>  
                <td>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                    <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>  
                </td>  
                <td class="score" id="ser"></td>  
            </tr>  
            <tr>  
                                  
                <td colspan="3" style="text-align: center;">  
                
              <!--     <input type="hidden" name="book_id" id="book_id" value="${requestScope.book_id}" />  -->
                 
<!--                    <button type="button" class="btn btn-success">提交</button>   -->
				    <button type="button" class="btn btn-primary" onclick="submit_a();">立即评价</button>
                    <button type="button" class="btn btn-info" onclick="javascript:location.reload();">重选</button>  
                </td>  
            </tr>  
        </table> 
        </form> 
    </div>  
 <script>
 function submit_a(){
	    //获取用户输入的值
       
        var tra=document.getElementById('tra').innerText;
        var pro=document.getElementById('pro').innerText;
        var ser=document.getElementById('ser').innerText;
        var book_id=document.getElementById('book_id').innerText;
        
	    //拼接url
	    var url = "comment?";
	    url += "tra="+tra+"&pro="+pro+"&ser="+ser+"&book_id="+book_id;
	    //重新定位url
	    window.location = url;
	}
 </script>
    <script>  
        $(function(){  
            /**  
             * 整体思路:该评价案例主要分为两种情况，1、当某行的星星还没有被选中时，此时鼠标移到哪颗星星时，就显示该星星对应的文字提示，前面的星星包括自己都变成实心星，如果该行后面还有星星，那后面的依然是空心星，鼠标离开时文字提示消失，该行星星全部变回原来的空心星；2、当某行有星星被选中，即鼠标点中某颗星，该星星以及前面的星星都变成实心星，如果该行后面还有星星，则依然还是空心星，分数和文字内容显示在该行的后面一列。鼠标移到某颗星星时，还是显示该星星对应的文字提示，前面的星星包括自己依然变成实心星，如果该行后面还有星星，那后面的依然是空心星，鼠标离开时，继续显示原来选中时星星状态。如果重新选中星星，则此时是新的评分分数，新的星星状态了。   
            为所有的span标签绑定mouseout和mouseover事件。bind({事件名：function(){},事件名：function(){}})的方法绑定多个事件  
            */  
            var tip_text = '',$parent = {};  
            $(".glyphicon").bind({  
                mouseout: function () {  
                    $parent.children('.extra').remove();  
                    var score = $parent.siblings('.score').html();  
                    if(score){//有星星选中时  
                        $parent.children(":lt("+ parseInt(score) +")").removeClass('glyphicon-star-empty').addClass('glyphicon-star');//PS:此处应该加上parseInt进行整型转换，否则会没有效果  
                        $parent.children(":gt("+ eval(parseInt(score)-1) + ")").removeClass('glyphicon-star').addClass('glyphicon-star-empty');//PS:此处要记得加eval，进行js计算，不然会报“jquery.min.js:2 Uncaught Error: Syntax error, unrecognized expression: NaN)”的错误  
                    }else{  
                        $(this).prevAll().andSelf().removeClass('glyphicon-star').addClass('glyphicon-star-empty');  
                    }  
                },  
                mouseover: function () {  
                    $parent = $(this).parent();//把父节点存放起来  
                    var score = $parent.siblings('.score').html();  
                    $parent.append('<span class="extra dot-left"></span><span class="extra tip"></span>');//添加提示框  
                    tip_text = indexText($(this).index());//得到相应的文字提示  
                    $(this).siblings('.tip').html(tip_text);//显示文字提示  
                    $(this).prevAll().andSelf().removeClass('glyphicon-star-empty').addClass('glyphicon-star');  
                    if(score){//当有星星选中时，为了解决鼠标移到选中星星的的前面星星时的小bug，此时会出现前面星星鼠标滑动时，星星颜色不变化现象  
                        $(this).nextAll().not('.extra').removeClass('glyphicon-star').addClass('glyphicon-star-empty');     
                    }  
                },  
                click: function(){  
                    var score = $(this).index() + 1;  
                    $parent.siblings('.score').html(score+'(' + tip_text + ')');  
                    $(this).prevAll().andSelf().removeClass('glyphicon-star-empty').addClass('glyphicon-star');  
                }  
            });  
  
            $('.btn-success').click(function(){  
                var allScore = '';  
                $('.score').each(function(){  
                    var text = $(this).html();  
                    if(text == ''){  
                        alert('请完成每项的评分后再提交!');  
                        throw "请完成每项的评分后再提交!";//向浏览器抛出异常，终止程序运行，用了return false试了下，还是会继续执行下面的弹窗，这里用throw刚好恰到好处,如果想继续用return false则可以改成if...else...进行判断处理也可以。  
                        //return false;  
                    }  
                    allScore += $(this).siblings(":first").html() + ':' + text + '\n';  
                })  
                alert(allScore);  
            })  
        })  
  
        //封装文字提示函数  
        function indexText(i){  
            switch(i){  
                case 0:  
                    return 'Very dissatisfied';  
                case 1:  
                    return 'Dissatisfied';  
                case 2:  
                    return 'commonly';  
                case 3:  
                    return 'Satisfied';  
                case 4:  
                    return 'Very satisfied';  
            }  
        }  
    </script>  
</body>
</html>