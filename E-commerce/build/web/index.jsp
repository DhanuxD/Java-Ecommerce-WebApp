<%-- 
    Document   : index
    Created on : Jan 5, 2022, 12:47:10 PM
    Author     : Dhanusha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="Js/Userregister.js"></script>
        <link rel="stylesheet" type="text/css" href="CSS/signup.css">
        <link rel= "stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <!--        <h1>User Register</h1>
        
                <span>Username :-</span>&nbsp;&nbsp;&nbsp;
                <input id="username" type="text" /></br>
                </br>
                </br>
        
                <span>Email :-</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input id="useremail" type="email" /></br>
                </br>
                </br>
        
                <span>Password :-</span>&nbsp;&nbsp;&nbsp;&nbsp;
                <input id="userpassword" type="password" /></br>
                </br>
                </br>
        
                <span>Mobile :-</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input id="usermobile" type="text" /></br>
                </br>
                </br>
        
                <button onclick="userRegister()">Sign up</button>-->

        <div class="container">
            <div class="blueBg">
                <div class="box signin">
                    <h2>Already have an account?</h2>
                    <button class="signinBtn">Sign in</button>
                </div>
                <div class="box signup">
                    <h2>Don't have an account?</h2>
                    <button class="signupBtn">Sign up</button>
                </div>
            </div>
            <div class="formBx">
                <!--Signin-->
                <div class="form signinForm">
                    <form>
                        <h3>Sign In</h3>

                        <input id="loginusername" type="text" placeholder="Username">
                        <input  id="pwin"  type="password" placeholder="Password">
                        <span onclick="toggle()"><i class="fa fa-eye logeye" aria-hidden="true"></span></i>
                        <input  onclick="signin()" type="submit" value="Sign in">


                        <a href="#" class="forgot">Forgot Password</a>
                    </form>
                </div>


                <!--Signup-->
                <div class="form signupForm">
                    <form>
                        <h3>Sign Up</h3>
                        <input id="username" type="text" placeholder="Username">
                        <input id="useremail" type="email" placeholder="Email">
                        <input  type="password" id="pwup" placeholder="Password">
                        <span onclick="toggler()"><i class="fa fa-eye regieye" aria-hidden="true"></i></span>
                        <input onkeyup="validatePass()" id="comfirmpwup" type="password" placeholder="Confirm Password">
                        <input onclick="userRegister()" type="submit" value="Sign up">

                    </form>
                </div>
            </div>
        </div>
        <script>
            const signinBtn = document.querySelector('.signinBtn');
            const signupBtn = document.querySelector('.signupBtn');
            const formBx = document.querySelector('.formBx');
            const body = document.querySelector('body');

            signupBtn.onclick = function () {
                formBx.classList.add('active');
                body.classList.add('active');
            };
            signinBtn.onclick = function () {
                formBx.classList.remove('active');
                body.classList.remove('active');
            };
        </script>
        <script type="text/javascript" src="Js/Signup.js"></script>
        <script type="text/javascript" src="Js/Signin.js"></script>
        <script type="text/javascript" src="Js/Userregister.js"></script>

    </body>
</html>
