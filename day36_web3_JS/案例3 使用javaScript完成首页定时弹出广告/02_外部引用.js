//确定事件为页面加载事件
function init(){
	//书写轮播图片的定时操作,参数中写一个具体方法参数和间隔时间参数.
setInterval("changeImg()",1000);

//1:设置参数广告图片定时操作  并给一个返回值,(下一步清除要)值不用var修饰,就是成员变量,整个html文件可用.用var修饰,只能本方法用
time = setInterval("showAd()",3000);
}
var i= 0;
	//实现上面的方法参数
function changeImg(){
		i++;
		//获取轮播图标签的id属性值并赋值
document.getElementById("jpg").src="../img/"+i+".jpg";
	if(i==3){
		i=0;					
	}
}
//2:书写显示广告图片的函数
function showAd(){
	//3:获取广告图片位置
var adEle = document.getElementById("img");
//4:修改广告图片中的隐藏属性,改为显示
adEle.style.display = "block";
//5:清除显示广告图片的页面操作(不能让广告霸屏)
clearInterval(time)
//6:设置隐藏图片的定时操作, 并给一个返回值,(下一步清除要)
time = setInterval("hiddenAd",2000);
}
	//7:书写隐藏广告图片函数
function hiddenAd(){
	//8:获取广告图片并设置其style属性的display的值为none
document.getElementById("img").style.display= "none";
//9:清除显示广告图片的页面操作(不能让广告霸屏)
	clearInterval(time);

}