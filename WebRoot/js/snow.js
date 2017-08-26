/*
	1.产生的时候，距离浏览器的左边是随机的（startPositionLeft）
	2.雪片的大小是随机的（size）
	3.雪片下降的速度是随机的
	4.下降的时候，距离浏览器的左边是随机的（endPositionLeft）
	5.雪片的透明度是随机的（opacity）
	6.持续的时间（duration）
	*/
    var minSize=20;
    var maxSize=30;
    var newOn=200;
    var snow=$("<div></div>").css({
    	"position":"absolute",
    	"top":"-50px",
    	"color":"white"
    	}
    	).html("❃");
    $(function(){
     var documentHeight=$(document).height();
     var documentWidth=$(document).width();
     setInterval(function(){
     	var startPositionLeft=Math.random()*documentWidth;
     	var size=Math.random()*maxSize+minSize;
     	var endPositionLeft=Math.random()*documentWidth;
     	var endTop=documentHeight;
     	var duration=Math.random()*3000+5000;
     	snow.clone().appendTo("body").css({
     	"left":startPositionLeft,
     	"color":"white",
     	"font-size":size
     }).animate({
     "top": endTop,
     "left": endPositionLeft
     }, duration,function(){
     	$(this).remove();
     });
     },200);
     
    });