$(document).ready(function() {
		
		$(".add").click(function(){
			var name = $(this).siblings("#left1").html();
			var cast = $(this).siblings("#left2").html();
			var totalNum = $("#gwc").html();
			var totalCast =  $("#bill").html();
			var j = 0;
			var num = 0;
			var cast1 = 0;
			for(var i = 1;i<$("#order-body").children("div").length;i++){
				if($("#order-body").children("div").eq(i).children("div").html()==name){
				num = $("#order-body").children("div").eq(i).children("div").eq(1).children("span").html();
				num = parseInt(num) +1;
				if (num > 0){
					$("#show").show();
				}
				cast1 = $("#order-body").children("div").eq(i).children("div").eq(2).html();
				cast1 = (parseFloat(cast1)+parseFloat(cast)).toFixed(1);
				j = parseInt(j)+1;					
				$("#order-body").children("div").eq(i).children("div").eq(1).children("span").html(num);
				$("#order-body").children("div").eq(i).children("div").eq(2).html(cast1);
				break;
				}
			}
			if(j==0){
				$("#order-body").children("div:last-child").after("<div class='order-body-both' id='show'><div id='itemName' class='order-body-1-both'>"+name+"</div><div class='order-body-2-both'><input type='button' value='-' id='jian' class='order-math' onclick='jian()'/><span id='num'>1</span><input type='button' value='+' id='jia'  class='order-math' onclick='jia()'/></div><div class='order-body-3-both' id='price'>"+cast+"</div></div>");
			}
			totalNum = parseInt(totalNum)+1;
			totalCast = (parseFloat(totalCast)+parseFloat(cast)).toFixed(1);
			$("#gwc").html(totalNum);
			$("#bill").html(totalCast);
			var id= $(this).siblings("#left3").html();
			$.ajax({
				url:"http://127.0.0.1:8080/WMWeb/cart/addItems.do",
				type:"post",
				data:{"itemsId":id},
				xhrFields: {
			           withCredentials: true
			       },
			       crossDomain: true,
				success:function(data){
					
				},
				error:function(){
					
				}
			});
			
		});
		
	});

/*加号的实现
function jia(){
	var i = parseInt(document.getElementById("num").innerText) ;  //数量
	var price = parseInt(document.getElementById("price").innerText); //某项商品的单一总价
	var soloPrice = price/i;
	i++;
	var totalNum = parseInt(document.getElementById("gwc").innerText) + 1;
	var totalPrice = parseFloat(document.getElementById("bill").innerText);
	price += soloPrice;
	totalPrice += soloPrice;
	parseFloat(totalPrice);
	
	document.getElementById("price").innerText = price;
	document.getElementById("num").innerText = i;
	document.getElementById("gwc").innerText = totalNum;
	document.getElementById("bill").innerText = parseFloat(totalPrice);
}

减号的实现
function jian(){
	var i = parseInt(document.getElementById("num").innerText); 
	
	var price = parseInt(document.getElementById("price").innerText);
	var soloPrice = price / i;
	i--;
	if(i == 0){
		document.getElementById("show").style.display='none';
	}
	var totalNum = parseInt(document.getElementById("gwc").innerText) - 1;
	var totalPrice = parseFloat(document.getElementById("bill").innerText);
	price -= soloPrice; 
	totalPrice = totalPrice - parseFloat(soloPrice);
	
	document.getElementById("price").innerText = price;
	document.getElementById("num").innerText = i;
	document.getElementById("gwc").innerText = totalNum;
	document.getElementById("bill").innerText = totalPrice;
}
*/