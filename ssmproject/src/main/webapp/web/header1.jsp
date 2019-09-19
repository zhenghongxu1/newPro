<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <style type="text/css">
        /*通用*/
        body {
            font: 12px "simhei", Arial, Helvetica, sans-serif;
            color: #666;
            margin: 0px;
            padding: 0px;
            background-color: #f5f5f5;
        }
        .bgColor{
            background-color: #a0dbc4;
        }
        .lf{
            float:left;
        }
        .rf{
            float: right;
        }
        ul, li, p, h1, h2, h3, h4, h5, h6, dl, dt, dd {
            margin: 0px;
            padding: 0px;
            border: none;
            list-style: none;
        }
        a,a:hover{
            text-decoration: none;
        }
        /*定位header*/
        header{
            width: 1000px;
            display: block;
            margin: 50px auto 0;
            min-height: 50px;
        }
        /*顶部中间的搜索区域*/
        #search{
            margin-left: 113px;
            position: relative;
        }
        #input{
            width: 409px;
            height: 36px;
            padding: 10px;
            border: 1px #0aa1ed solid;
            box-sizing: border-box;
            background-color: #f5f5f5;
        }
        .searchMenu {
            width: 97px;
            height: 92px;
            position: absolute;
            top: 1px;
            right: 36px;
            z-index: 200;
            cursor: pointer;

            text-align: center;
            color: #c3c3c3;
            font: 14px simhei;
            padding-top: 8px;
        }

        #search_active{
            height: 26px;
        }
        #search_option{
            text-align: left;
            width: 87px;
            padding-left: 10px;
            color: #0aa1ed;
            position: absolute;
            top: 36px;
            left: 0px;
            background: -moz-linear-gradient(top, #f0f0f0 0%, #e0e0e0 100%);
            background: -webkit-linear-gradient(top, #f0f0f0 0%, #e0e0e0 100%);
            background: -o-linear-gradient(top, #f0f0f0 0%, #e0e0e0 100%);
            background: -ms-linear-gradient(top, #f0f0f0 0%, #e0e0e0 100%);
            background: linear-gradient(top, #f0f0f0 0%, #e0e0e0 100%);
            box-shadow: 0px 3px 6px #ccc;
            display: none;
        }
        #search_option > div{
            font: 12px simhei;
            height: 16px;
            margin-top: 5px;
        }

        #search_option > div:hover{
            background: -moz-linear-gradient(top, #25a7e9 0%, #0998df 100%);
            background: -webkit-linear-gradient(top, #25a7e9 0%, #0998df 100%);
            background: -o-linear-gradient(top, #25a7e9 0%, #0998df 100%);
            background: -ms-linear-gradient(top, #25a7e9 0%, #0998df 100%);
            background: linear-gradient(top, #25a7e9 0%, #0998df 100%);
            color:#fff;
        }

        .clickhover{
            color: #0aa1ed;
        }


        .searchMenu img{
            position: relative;
            top: -2px;
        }

        /*#searchMenu:after{
            content: "";
            display: block;
            clear: both;
        }
        #searchMenu:focus{
            outline: none;
        }*/

        #search > a{
            position: absolute;
            top: 0px;
            right: 0px;
        }
        #searchImg{
            width: 36px;
            height: 35px;

        }

        /*顶部的最右侧的位置导航*/
        #siteNav li{
            float: left;
            line-height: 33px;
            padding:2px 14px;
        }
        #siteNav li img{
            vertical-align: middle;
        }
        
        #siteNav li b{
            position: relative;
            right: -11px;
            font-weight: inherit;
            top: 0;
        }
        #siteNav li a{
            cursor: pointer;
            color: #808080;
            /*text-align: center;*/
        }
        #siteNav li a:hover{
            color: #0aa1ed;
        }

        /*导航*/
        #nav{
            width: 1000px;
            margin: 0px auto;
            margin-top: 38px;
            font-size: 16px;
        }

        #nav li{
            float: left;
            margin-right: 40px;
        }

        #nav a{
            color: #cccccc;
        }
        #nav a:hover{
            color: #b8b8b8;
        }
        #nav a:focus{
            color:#0aa1ed;
        }

    </style>
</head>
<body>
<!-- 页面顶部 -->
<header>
    <div id="logo" class="lf">
        <img src="../images/header/logo.png" alt="logo"/>
    </div>
    <div id="search" class="lf">
        <input id="input" placeholder="请输入要搜索的内容" type="text"/>

        <!-- 搜索菜单 -->
        <div class="searchMenu">
            <div id="search_active">
                <span>分类搜索</span> <img src="../images/header/header_normal.png" alt=""/>
            </div>
            <div id="search_option">
                <div id="shcy" >生活餐饮</div>
                <div id="xxyp" >学习用品</div>
                <div id="srdz" >私人订制</div>
            </div>
        </div>
        <!-- 搜索菜单结束 -->

        <a href="" class="rf">
            <img id="searchImg" src="../images/header/search.png" alt="搜索"/>
        </a>
    </div>
    <div id="siteNav" class="rf">
        <ul>
            <li>
                <a href="myCollect.jsp" title="我的收藏"><img class="care" src="../images/header/care.png" alt=""/></a><b>|</b>
            </li>
            <li>
                <a href="myOrder.jsp" title="我的订单"><img class="order" src="../images/header/order.png" alt=""/></a><b>|</b>
            </li>
            <li>
                <a href="cart.jsp" title="我的购物车"><img class="shopcar" src="../images/header/shop_car.png" alt=""/></a><b>|</b>
            </li>
            <li>
                <a href="lookforward.jsp">帮助</a><b>|</b>
            </li>
            <li>
                <a href="login.jsp"></a>
                <a href="login.jsp">登录</a>
            </li>
        </ul>
    </div>
</header>
<nav id="nav">
    <ul>
        <li><a href="index.jsp">首页</a></li>
        <li><a href="item_food.jsp">生活餐饮</a></li>
        <li><a href="itemCat.jsp">学习用品</a></li>
        <li><a href="lookforward.jsp">私人订制</a></li>
    </ul>
</nav>


<script src="../js/jquery-3.1.1.min.js"></script>
<script>

    //头部hover
    $(".care").hover(function(){
        $(this).attr('src',"../images/header/care1.png");
    },function(){
        $(this).attr('src',"../images/header/care.png");
    });
    $(".order").hover(function(){
        $(this).attr('src',"../images/header/order1.png");
    },function(){
        $(this).attr('src',"../images/header/order.png");
    });
    $(".shopcar").hover(function(){
        $(this).attr('src',"../images/header/shop_car1.png");
    },function(){
        $(this).attr('src',"../images/header/shop_car.png");
    });


    //搜索下拉
    $('.searchMenu').click(function(){
        console.log(1);
        if($(this).hasClass('clickhover')){

            $(this).removeClass('clickhover');
            $(this).find('#search_option').hide();
            $(this).find('img').attr('src','../images/header/header_normal.png');

        }else{
            $(this).addClass('clickhover');
            $(this).find('#search_option').show();
            $(this).find('img').attr('src','../images/header/header_true.png');
        }
    })
    /*$('.seek_content>div').click(function(){
        $('.seek').removeClass('clickhover');
        var text=$(this).html();
        $('.seek span').html(text);
        $(this).parent().hide();
        $('.seek').find('img').attr('src','../images/header/header_normal.png');
        $('.seek').blur();

    })*/

    $('#searchMenu').blur(function(){

        $('.searchMenu').removeClass('clickhover');
        $('#search_option').hide();

        $('.searchMenu').find('img').attr('src','../images/header/header_normal.png');
        console.log(1);
    })
</script>

</body>
</html>