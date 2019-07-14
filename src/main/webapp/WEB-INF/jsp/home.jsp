<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="language" content="zh-CN">
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1">
<meta name="renderer" content="webkit">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script src="./js/jquery.min.js"></script>
<title>淘宝优惠券</title>
</head>
<body>
	<div class="new_home">
		<div id="headNav">
			<div id="header">
				<a class="header_logo" href="#"
					style="background: url('images/logo.png') left top no-repeat;">
				</a>


				<div id="showList">
					<div id="search">
						<input type="hidden" name="h_kw" id="h_kw" value="六一儿童节礼物">
						<input type="hidden" name="h_url" id="h_url"
							value="/index.php?r=l"> <input type="hidden" name="m_url"
							id="m_url"
							value="/index.php?r=l&amp;kw=%E5%85%AD%E4%B8%80%E5%84%BF%E7%AB%A5%E8%8A%82%E7%A4%BC%E7%89%A9">
						<form action="http://lingquanbuy.com/index.php?r=index/index"
							method="get">
							<input type="hidden" name="r" value="l"> <input
								type="text" autocomplete="off"
								class="theme-border-color-1 my-src-input" value="" name="kw"
								placeholder="六一儿童节礼物">
							<button class="theme-bg-color-1 my-src-btn">搜 索</button>
						</form>
						<div class="rec_word">
							<a href="#" style="color: red;">沐浴露</a> 
							<a href="#" style="">手表</a>
							<a href="#" style="">拖鞋</a>
							<a href="#" style="">连衣裙</a>
							<a href="#" style="">睡衣</a>
						</div>
					</div>
				</div>
				<img class="head_group fr" src="./images/headgrup.png" alt="">
			</div>
		</div>

		<div id="baner" class="theme-bg-color-1">
			<div id="nav">
				<a href="#" class="theme-hover-bg-color-8 active "> 首页 </a>  
				<a href="#" class="theme-hover-bg-color-8"> 9块9包邮 </a>
				<a href="#" class="theme-hover-bg-color-8">每日半价 <i class="new">New!</i></a> 
			</div>
		</div>

		<div id="dtk_mian">
			<div class="year-bg">
				<div class="nine_center w_1200">
					<div class="nine_nav_link ">
						<div class="center">
							<a href="#" class="link active "> 精选 </a> 
							<a href="#" class="link"> 居家百货 </a> 
							<a href="#" class="link"> 美食 </a> 
							<a href="#" class="link"> 服装 </a> 
							<a href="#" class="link"> 配饰 </a> 
							<a href="#" class="link"> 美妆 </a> 
							<a href="#" class="link"> 内衣 </a> 
							<a href="#" class="link"> 母婴 </a> 
							<a href="#" class="link"> 箱包 </a> 
							<a href="#" class="link"> 数码配件 </a> 
							<a href="#" class="link"> 文娱车品 </a> 
						</div>
					</div>

					<div class="goods-list main-container new_comp">
						<ul class="clearfix" id="goodsItems">
							<s:iterator id="g" value="list">
								<li class=" g_over"><a
									href="#"
									class="img" target="_blank"> <img src="${g.goodPic }"></a>
									<div class="goods-padding">
										<div class="title">
											<a target="_blank" href="detail?id=xxxxx"> <i
												class="tag tag-tmall fl" title="天猫"></i>${g.goodName }
											</a>
										</div>
										<div class="goods-num-type">
											<span class="old-price fl">原价 <i>${g.price }</i></span><span
                                                class="goods-num fr"><button name="unlike"
                                                    data-gid="${g.goodId }">不喜欢</button></span><span class="goods-num fr">销量
												<i>${g.sales }</i>
											</span>
										</div>
										<div class="coupon-wrap clearfix">
											<span class="price"><i>￥</i><span>${g.promotePrice }</span>
											</span><b class="coupon fr"><i>${g.couponValue }</i> 元券</b>
										</div>
									</div> <em class="border_l_b border"></em> <em
									class="border_l_t border"></em> <em class="border_r_b border"></em>
									<em class="border_r_t border"></em></li>
							</s:iterator>
						</ul>
					</div>
				</div>
			</div>
		</div>


		<div id="footer" class="com-footer" style="height: auto">
			<div class="footer-wrapper">
				<ul>
					<li>网站导航</li>
					<li><a href="#">首页</a></li>
					<li><a href="#">好货精选</a></li>
					<li><a href="#">9.9包邮</a></li>
					<li><a href="#">关于我们</a></li>
					<li><a href="#">广告加盟</a></li>
				</ul>
				<p>妈妈优惠券是一家导购网站，网站中的商品信息均来自于互联网。如商品信息不同，可能是商品信息未及时更新，所有商品信息请以天猫/淘宝店铺内为准。</p>
				<div class="text">
					<span>版权所有 本站内容未经书面许可,禁止一切形式的转载</span> 
					© CopyRight&nbsp;2019
				</div>

			</div>
		</div>
	</div>


	<ul class="float-tool">
		<li onclick="alert('暂未实现')"><img src="./images/sc.png" alt=""> <p>收藏</p></li>
		<li onclick="alert('暂未实现')"><img src="./images/share.png" alt=""> <p>分享</p></li>
		<li onclick="alert('暂未实现')"><img src="./images/kf.png" alt=""> <p>客服</p></li>
		<li onclick="alert('暂未实现')"><img src="./images/feedback.png" alt=""> <p>反馈</p></li>
	</ul>

<script type="text/javascript">
$(function () {
    $("button[name=unlike]").click(function(){
        alert("I don't like it! " + $(this).attr('data-gid'));
        $(this).parent().parent().parent().parent().hide();
        _id = $(this).attr('data-gid');
        $.get("unlike", { id: _id });
    });
});
</script>
</body>
</html>