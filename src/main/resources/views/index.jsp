<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<pre>
		Welcome to spring mvc world
	</pre>
	<script src="resource/ws/sockjs.js"></script>
	<script src="resource/ws/stomp.min.js"></script>
	<script src="resource/jquery/jquery-1.12.4.min.js"></script>
	<script type="text/javascript">
		/* using stomp.js and the sockjs-client: */

		var socket = new SockJS("/ws/portfolio");
		var stompClient = Stomp.over(socket);

		stompClient.connect({}, function(frame) {
		});
	</script>

	<script type="text/javascript">
		/* Or if connecting via WebSocket (without SockJS): */
		/* var socket = new WebSocket("/ws/portfolio");
		var stompClient = Stomp.over(socket);

		stompClient.connect({}, function(frame) {
		}) */
	</script>
</body>
</html>