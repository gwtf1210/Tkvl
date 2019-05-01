<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>RESTful 웹서비스 클라이언트(JSON)</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		customerList();
		customerSelect();
		customerDelete();
		customerInsert();
		customerUpdate();
		init();
	});

	//초기화
	function init() {
		//초기화 버튼 클릭
		$('#btnInit').click(function() {
			$('#form1').each(function() {
				this.reset();
			});
		});
	}//init

	//사용자 삭제 요청
	function customerDelete() {
		//삭제 버튼 클릭
		$('body').on('click', '#btnDelete', function() {
			var num = $(this).closest('tr').find('#hidden_num').val();
			$.ajax({
				url : 'http://localhost:8080/board/customers/' + num,
				type : 'DELETE',
				contentType : 'application/json;charset=euc-kr',
				dataType : '',
				error : function(xhr, status, msg) {
					alert("상태값 :" + status + " Http에러메시지 :" + msg);
				},
				success : customerList
			});
		}); //삭제 버튼 클릭
	}//customerDelete

	//사용자 조회 요청
	function customerSelect() {
		//조회 버튼 클릭
		$('body').on('click', '#btnSelect', function() {
			var num = $(this).closest('tr').find('#hidden_num').val();
			$.ajax({
				url : 'http://localhost:8080/board/customers/' + num,
				type : 'GET',
				contentType : 'application/json;charset=euc-kr',
				dataType : 'json',
				error : function(xhr, status, msg) {
					alert("상태값 :" + status + " Http에러메시지 :" + msg);
				},
				success : customerSelectResult
			});
		});//조회 버튼 클릭
	}//customerSelect

	//사용자 조회 응답
	function customerSelectResult(data) {
		// data가 Customer 객체
		$('#num').val(data.num);
		$('#name').val(data.name);
		$('#address').val(data.address);
	}//customerSelectResult

	//사용자 수정 요청
	function customerUpdate() {
		//수정 버튼 클릭
		$('#btnUpdate').on('click', function() {
			var num = $('#num').val();
			var name = $('#name').val();
			var address = $('#address').val();
			$.ajax({
				url : 'http://localhost:8080/board/customers',
				type : 'PUT',
				contentType : 'application/json;charset=euc-kr',
				dataType : 'json',
				data : JSON.stringify({
					num : num,
					name : name,
					address : address
				}),
				error : function(xhr, status, msg) {
					alert("상태값 :" + status + " Http에러메시지 :" + msg);
				},
				success : customerList
			});
		});//수정 버튼 클릭
	}//customerUpdate

	//사용자 등록 요청
	function customerInsert() {
		//등록 버튼 클릭
		$('#btnInsert').on('click', function() {
			var num = $('#num').val();
			var name = $('#name').val();
			var address = $('#address').val();
			$.ajax({
				url : 'http://localhost:8080/board/customers',
				type : 'POST',
				contentType : 'application/json;charset=euc-kr',
				dataType : 'json',
				data : JSON.stringify({
					num : num,
					name : name,
					address : address
				}),
				error : function(xhr, status, msg) {
					alert("상태값 :" + status + " Http에러메시지 :" + msg);
				},
				success : customerList
			});

		});//등록 버튼 클릭
	}//customerInsert

	//사용자 목록 조회 요청
	function customerList() {
		$.ajax({
			url : 'http://localhost:8080/board/customers',
			type : 'GET',
			contentType : 'application/json;charset=euc-kr',
			dataType : 'json',
			error : function(xhr, status, msg) {
				alert("상태값 :" + status + " Http에러메시지 :" + msg);
			},
			success : customerListResult
		});
	}//customerList

	//사용자 목록 조회 응답
	function customerListResult(data) {
		$("tbody").empty();
		$.each(data, function(idx, item) {
			$('<tr>').append($('<td>').html(item.num)).append(
					$('<td>').html(item.name)).append(
					$('<td>').html(item.address)).append(
					$('<td>').html('<button id=btnSelect>조회</button>')).append(
					$('<td>').html('<button id=btnDelete>삭제</button>')).append(
					$('<input type=hidden id=hidden_num>').val(item.num))
					.appendTo('tbody');
		});//each
	}//customerListResult
</script>
</head>
<body>
	<div class="container">
		<form id="form1" class="form-horizontal">
			<h2>사용자 등록 및 수정</h2>
			<div class="form-group">
				<label>번호:</label> <input type="text" class="form-control" id="num">
			</div>
			<div class="form-group">
				<label>이름:</label> <input type="text" class="form-control" id="name">
			</div>

			<div class="form-group">
				<label>주소: </label> <input type="text" class="form-control"
					id="address">
			</div>
			<div class="btn-group">
				<input type="button" class="btn btn-primary" value="등록"
					id="btnInsert" /> <input type="button" class="btn btn-primary"
					value="수정" id="btnUpdate" /> <input type="button"
					class="btn btn-primary" value="초기화" id="btnInit" />
			</div>
		</form>
	</div>
	<hr />
	<div class="container">
		<h2>사용자 목록</h2>
		<table class="table text-center">
			<thead>
				<tr>
					<th class="text-center">번호</th>
					<th class="text-center">이름</th>
					<th class="text-center">주소</th>
				</tr>
			</thead>
			<tbody></tbody>
		</table>
	</div>
</body>
</html>