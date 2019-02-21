var xhr = null;
	function getXHR() {
		xhr = new XMLHttpRequest();
	}

	function startMethod() {
		var word = document.getElementById('word');

		var param = "?word=" + word.value;

		if(word.value ==''){
			var result = document.getElementById('popupPart');
			result.setAttribute("style", "display:none");
		}else{
			getXHR(); // XML HttpRequest 생성
			xhr.open('get', 'searchWordDB.jsp' + param, true); // ajax 통신 준비
			xhr.onreadystatechange = callback; // callback 함수 지정
			xhr.send(null); // ajax 통신 요청	
		}
	}
	
	function callback() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			var popupPart = document.getElementById("popupPart");
			popupPart.innerHTML = "<h2>" + xhr.responseText + "</h2>";
		}
	}
	
		function callback() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			processJson();
		}
	}

	function processJson() {
		var text = xhr.responseText; // text 형식으로 받음
		var json = eval("(" + text + ")"); // 문자열형식 --> json 객체로 변환됨
		var msg = '';

		if(json == null){
			var result = document.getElementById('popupPart');
			result.setAttribute("style", "display:none");
			return;
		}
		
		for (var i = 0; i < json.length; i++) {
			msg += "<h1>" + json[i] + "</h1>";
		}
		
		
		var result = document.getElementById('popupPart');
		result.setAttribute("style", "display:block");
		result.innerHTML = msg;
			
	}
	
	