<!--
author: W3layouts
author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Teaching an Education School Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Teaching Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- //js -->
<link href='//fonts.googleapis.com/css?family=Capriola' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
<!-- animation-effect -->
<link href="css/animate.min.css" rel="stylesheet"> 
<script src="js/wow.min.js"></script>
<script>
 new WOW().init();
</script>
<!-- //animation-effect -->
</head>
	
<body>
<!-- banner -->
	<div class="banner-login-contacto">
	<!-- navigation bar -->
		<div class="header">
			<div class="container">
				<nav class="navbar navbar-default" style="background-color:rgb(200,0,0)" height="200">
					<div class="navbar-header navbar-left">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<h1>					
							<a class="navbar-brand" href="home.jsp">
							<span style="background-image: url(images/title_bg.jpg);background-size: cover; position: relative;">
								<img src="C:\Users\arsenicCatnip\Desktop\logo especialidad.png" height="75" width="100" ></img>
								<i>Computación</i>
								</span>
							</a>
						</h1>
					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
						<nav class="menu menu--shylock">
							<div class="agileinfo_social_icons">
								<ul class="agileinfo_social_icons1">
									<li><a href="#" class="facebook"></a></li>
									<li><a href="#" class="twitter"></a></li>
								</ul>
							</div>
							<ul class="nav navbar-nav">
								<li class="active"><a href="login.jsp">Log in</a></li>
								<li><a href="home.jsp" class="hvr-bounce-to-bottom">Home</a></li>
								<li><a href="curricula.jsp" class="hvr-bounce-to-bottom">Curricula</a></li>
								<li><a href="galeria.jsp" class="hvr-bounce-to-bottom">Galeria</a></li>
								<li><a href="contactos.jsp" class="hvr-bounce-to-bottom">Contactos</a></li>
								<li><a href="acercade.jsp" class="hvr-bounce-to-bottom">Acerca de...</a></li>								
							</ul>	
						</nav>
					</div>
				</nav>	
			</div>
		</div>
		<!-- //navigation bar -->
		<br>	
		<br>
		<div id="form-main">
			  <div id="form-div-contacto">
				<h1 style="color:rgb(255,255,255); text-align:center" >Comuníquese con nosotros!</h1>
				<br>
				<form class="form" id="form1">
				  
				  <p class="name">
					<input name="name" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" placeholder="Name" id="name" />
				  </p>
				  
				  <p class="email">
					<input name="email" type="text" class="validate[required,custom[email]] feedback-input" id="email" placeholder="Email" />
				  </p>
				  
				  <p class="text">
					<textarea name="text" class="validate[required,length[6,300]] feedback-input" id="comment" placeholder="Comment"></textarea>
				  </p>
				  
				  
				  <div class="submit">
					<input type="submit" value="SEND" id="button-blue"/>
					<div class="ease"></div>
				  </div>
				</form>
			  </div>
		</div>
		<!-- <div class="w3agile_banner_info">
			
			<div class="w3_scroll">
			
				<div class="scroll-down">
					<span class="dot"> </span>
					
				</div> 
			</div>
		</div>
		<div class="w3_banner_pos"></div> -->
	</div>
<!-- //banner -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="col-md-4 w3l_footer_grid">
				<h2><a href="home.jsp"><span>C</span>omputación</a></h2>
				<p>Vestibulum sed convallis massa, eu aliquet massa. Suspendisse 
					lacinia rutrum tincidunt. Integer id erat porta, convallis tortor a, 
					ullamcorper magna.</p>
			</div>
			<div class="col-md-3 w3l_footer_grid">
				<h3>Address</h3>
				<ul class="w3_address">
					<li><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i>Paseo Colón, 650<span>C.A.B.A</span></li>
					<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><a href="mailto:info@example.com">info@example.com</a></li>
					<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>+1234 567 567</li>
				</ul>
			</div>
			<div>
					<img src="images/3.jpg" alt=" " class="img-responsive" style="width: 420px" ><img>
			</div>	
			<div class="w3agile_footer_copy">
				<p>© 2016 Teaching. All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
			</div>
		</div>
	</div>
<!-- //footer -->
<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
</body>
</html>