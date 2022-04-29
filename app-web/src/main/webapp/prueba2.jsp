<html>
<head>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/est.css">
</head>
<body>
<div class="container">
	<div class="header">
		<h2>Create Account</h2>
	</div>
	<form id="form" class="form">
		<div class="form-control">
			<label for="username">Username</label>
			<input type="text" placeholder="florinpop17" id="username" />
			<small>Error message</small>
		</div>
		<div class="form-control">
			<label for="username">Email</label>
			<input type="email" placeholder="a@florin-pop.com" id="email" />
			<small>Error message</small>
		</div>
		<div class="form-control">
			<label for="username">Password</label>
			<input type="password" placeholder="Password" id="password"/>
			<small>Error message</small>
		</div>
		<div class="form-control">
			<label for="username">Password check</label>
			<input type="password" placeholder="Password two" id="password2"/>
			<small>Error message</small>
		</div>
		<button>Submit</button>
	</form>
</div>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/val2.js"></script>
</html>