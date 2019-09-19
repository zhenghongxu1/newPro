<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>阿甲学子商城首页</title>
    <link rel="stylesheet" href="common.css">
    <link rel="stylesheet" href="hearder1.css">
    <link rel="stylesheet" href="index1.css">


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
<!-- 页面主nav -->
<nav id="nav">
    <ul>
        <li><a href="index.jsp">首页</a></li>
        <li><a href="item_food.jsp">生活餐饮</a></li>
        <li><a href="itemCat.jsp">学习用品</a></li>
        <li><a href="lookforward.jsp">私人订制</a></li>
    </ul>
</nav>
<!-- banner部分 -->
<div class="ck-slide">
    <div class="ck-slide-content">
        <img src="../images/index/index_banner1.png" />
    </div>
    <a class="ck-prev" href="">上一页</a>
    <a class="ck-next" href="">下一页</a>
    <div class="ck-pageControl">
        <ul class="ck-dot">
            <li>1</li>
            <li>2></li>
            <li>3</li>
            <li>4</li>
            <li>5</li>
        </ul>
    </div>
</div>
<!-- 特别推荐special recommend -->
<div id="spe-recommend">
    <div class="recommend1 lf">
        <img class="recommend-picture short-distance" src="../images/index/index_Sbanner_img1.png" alt="" />
        <div class="recommend-text rf">
            <p class="title">联想小新Air3</p>
            <p class="subTitle">设计师独享高端配置</p>
        </div>
    </div>
    <div class="recommend2 lf">
        <img class="recommend-picture" src="../images/index/index_Sbanner_img2.png" alt="" />
        <div class="recommend-text rf">
            <p class="title">得力书包Bag</p>
            <p>给你满载而归的喜悦</p>
        </div>
    </div>
    <div class="recommend3 lf">
        <img class="recommend-picture" src="../images/index/index_Sbanner_img3.png" alt="" />
        <div class="recommend-text rf">
            <p class="title">刀鱼焖排骨</p>
            <p>吃饱了才有力气学习</p>
        </div>
    </div>
</div>
<!-- Welcome部分 -->
<div id="welcome">
    <a href="" alt="">阅读更多</a>
</div>
<!-- 学习用品 -->
<div id="study">
    <p class="section-title">学习用品<span class="section-subtitle">爱学习 享品质工作</span></p>
    <div class="study-left lf">
        <div id="study-product1-param">
            <p><img src="../images/index/wenan.png" /></p>
            <h3 class="param-title">联想(Lenovo)小新Air13 pro版</h3>
            <h3 class="param-price">限时特惠￥6688.00</h3>
            <p class="param-detail" ><a class="param-detail-text" href="">查看详情</a></p>
        </div>
        <img  id="study-product1-img" src="../images/index/index_hot_study_img1.png" alt="" />
    </div>
    <div class="study-right rf">
        <div id="study-right-top">
            <div class="study-product-param">
                <h3 class="param-title">联想(Lenovo)小新Air13不超15mm才敢叫轻薄</h3>
                <h3 class="param-price">￥6688.00</h3>
                <p class="param-detail" ><a class="param-detail-text" href="">查看详情</a></p>
            </div>
            <img class="study-product-img"src="../images/index/index_hot_study_img2.png" alt=""/>
        </div>
        <div id="study-right-bottom">
            <div class="study-product-param">
                <h3 class="param-title">雅致布面年历本 张扬个性，点亮生活新时尚</h3>
                <h3 class="param-price">￥68.00</h3>
                <p class="param-detail" ><a class="param-detail-text" href="">查看详情</a></p>
            </div>
            <img class="study-product-img"src="../images/index/index_hot_study_img3.png" alt=""/>
        </div>
    </div>
</div>
<!-- 美食推荐food recommend -->
<div id="food-recommend">
    <p class="section-title">
        美食餐饮<span class="section-subtitle">爱美食 享品质生活</span>
    </p>
    <div class="food-left lf">
        <div>
            <h2>红烧肉盖饭(吉野家)</h2>
            <p>红烧肉是热菜菜谱之一。以五花肉为制作主料，香甜松软。最好选用肥瘦相间的三层肉（五花肉）来做。红烧肉的烹饪技巧以砂锅为主，肥瘦相间，香甜松软，入口即化。红烧肉在我国各地流传甚广，是一道著名的大众菜肴,当然也是大家最喜欢的菜。</p>
        </div>
    </div>
    <div class="food-right rf">
        <div class="food-order">
            <img src="../images/index/index_hot_food_img1.png" alt="" />
            <h2>红烧肉盖饭套餐<span>(吉野家)</span></h2>
            <p>￥20.00</p>
            <a class="food-purchase" href="">立即订餐</a>
        </div>
        <div class="food-order">
            <img src="../images/index/index_hot_food_img2.png" alt="" />
            <h2>全素套餐<span>(魏家凉皮)</span></h2>
            <p>￥16.00</p>
            <a class="food-purchase" href="">立即订餐</a>
        </div>
        <div class="food-order">
            <img src="../images/index/index_hot_food_img3.png" alt="" />
            <h2>营养海鲜汤<span>(山西面食家)</span></h2>
            <p>￥25.00</p>
            <a class="food-purchase" href="">立即订餐</a>
        </div>
    </div>
</div>







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