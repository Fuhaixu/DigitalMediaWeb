//i来控制当前播放的图片  slider-i.jpg
var i=1;
//播放图片函数autoImages，运行一次i++
function clearNum(){
	for(var num=1;num<=5;num++){
		$("#"+num).css("background","#242424");
	}
}
function autoImages(){
	clearNum();
	if(i==5){
		i=1;
	}
	else i++;
	$("#slide").attr("src","resources/img/slider-"+i+".jpg");
	$("#"+i).css("background","#C20C0C");
	$("#box").css("background","url(resources/img/bg-"+i+".jpg)");
}
var st;
var interval=2000;
//调用setInterval函数，自动播放轮播图，
//st对象作为全局对象，记录setInterval函数抛出的对象，
//便于clearInterval使用st，清空自动播放的效果
st=setInterval(autoImages,interval);

$(document).ready(function(){
	//轮播图的js函数，一共有三个
	//效果：鼠标放在或单击1-5数字按钮上，停止轮播图片，
	//跳转到对应数字的图片，鼠标移走时，继续自动播放图片


	//1---第一个函数
    $("#hd > ul > li").mouseover(function(){
		//鼠标移动走mouseleave，轮播继续(用setInterval)
    	clearInterval(st);
    	i=parseInt($(this).html());//i获得当前鼠标位置的按钮数字
    	//清空1-5按钮的蓝色，变为白色
    	clearNum();
    	$("#"+i).css("background","#C20C0C");//标记按下的按钮为蓝色，改变slide图片的路径
	$("#box").css("background","url(resources/img/bg-"+i+".jpg)");
    	$("#slide").attr("src","resources/img/slider-"+i+".jpg");
    });


    //2----第二个函数
	$("#hd > ul > li").click(function(){
		//click与mouseover类似
		clearInterval(st);
		i=parseInt($(this).html());
		clearNum();
		$("#"+i).css("background","#C20C0C");//#3b7abd
	$("#box").css("background","url(resources/img/bg-"+i+".jpg)");
		$("#slide").attr("src","resources/image/slider-"+i+".jpg");
	});


	//3----第三个函数
    $("#hd > ul > li").mouseleave(function(){
    	var num=$(this).html();
    	i=parseInt(num);
    	st=setInterval(autoImages,interval);
    });
});