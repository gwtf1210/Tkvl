<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>RESTful ������ Ŭ���̾�Ʈ(JSON)</title>
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

	//�ʱ�ȭ
	function init() {
		//�ʱ�ȭ ��ư Ŭ��
		$('#btnInit').click(function() {
			$('#form1').each(function() {
				this.reset();
			});
		});
	}//init

	//����� ���� ��û
	function customerDelete() {
		//���� ��ư Ŭ��
		$('body').on('click', '#btnDelete', function() {
			var num = $(this).closest('tr').find('#hidden_num').val();
			$.ajax({
				url : 'http://localhost:8080/board/customers/' + num,
				type : 'DELETE',
				contentType : 'application/json;charset=euc-kr',
				dataType : '',
				error : function(xhr, status, msg) {
					alert("���°� :" + status + " Http�����޽��� :" + msg);
				},
				success : customerList
			});
		}); //���� ��ư Ŭ��
	}//customerDelete

	//����� ��ȸ ��û
	function customerSelect() {
		//��ȸ ��ư Ŭ��
		$('body').on('click', '#btnSelect', function() {
			var num = $(this).closest('tr').find('#hidden_num').val();
			$.ajax({
				url : 'http://localhost:8080/board/customers/' + num,
				type : 'GET',
				contentType : 'application/json;charset=euc-kr',
				dataType : 'json',
				error : function(xhr, status, msg) {
					alert("���°� :" + status + " Http�����޽��� :" + msg);
				},
				success : customerSelectResult
			});
		});//��ȸ ��ư Ŭ��
	}//customerSelect

	//����� ��ȸ ����
	function customerSelectResult(data) {
		// data�� Customer ��ü
		$('#num').val(data.num);
		$('#name').val(data.name);
		$('#address').val(data.address);
	}//customerSelectResult

	//����� ���� ��û
	function customerUpdate() {
		//���� ��ư Ŭ��
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
					alert("���°� :" + status + " Http�����޽��� :" + msg);
				},
				success : customerList
			});
		});//���� ��ư Ŭ��
	}//customerUpdate

	//����� ��� ��û
	function customerInsert() {
		//��� ��ư Ŭ��
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
					alert("���°� :" + status + " Http�����޽��� :" + msg);
				},
				success : customerList
			});

		});//��� ��ư Ŭ��
	}//customerInsert

	//����� ��� ��ȸ ��û
	function customerList() {
		$.ajax({
			url : 'http://localhost:8080/board/customers',
			type : 'GET',
			contentType : 'application/json;charset=euc-kr',
			dataType : 'json',
			error : function(xhr, status, msg) {
				alert("���°� :" + status + " Http�����޽��� :" + msg);
			},
			success : customerListResult
		});
	}//customerList

	//����� ��� ��ȸ ����
	function customerListResult(data) {
		$("tbody").empty();
		$.each(data, function(idx, item) {
			$('<tr>').append($('<td>').html(item.num)).append(
					$('<td>').html(item.name)).append(
					$('<td>').html(item.address)).append(
					$('<td>').html('<button id=btnSelect>��ȸ</button>')).append(
					$('<td>').html('<button id=btnDelete>����</button>')).append(
					$('<input type=hidden id=hidden_num>').val(item.num))
					.appendTo('tbody');
		});//each
	}//customerListResult
</script>
</head>
<body>
	<div class="container">
		<form id="form1" class="form-horizontal">
			<h2>����� ��� �� ����</h2>
			<div class="form-group">
				<label>��ȣ:</label> <input type="text" class="form-control" id="num">
			</div>
			<div class="form-group">
				<label>�̸�:</label> <input type="text" class="form-control" id="name">
			</div>

			<div class="form-group">
				<label>�ּ�: </label> <input type="text" class="form-control"
					id="address">
			</div>
			<div class="btn-group">
				<input type="button" class="btn btn-primary" value="���"
					id="btnInsert" /> <input type="button" class="btn btn-primary"
					value="����" id="btnUpdate" /> <input type="button"
					class="btn btn-primary" value="�ʱ�ȭ" id="btnInit" />
			</div>
		</form>
	</div>
	<hr />
	<div class="container">
		<h2>����� ���</h2>
		<table class="table text-center">
			<thead>
				<tr>
					<th class="text-center">��ȣ</th>
					<th class="text-center">�̸�</th>
					<th class="text-center">�ּ�</th>
				</tr>
			</thead>
			<tbody></tbody>
		</table>
	</div>
</body>
</html>