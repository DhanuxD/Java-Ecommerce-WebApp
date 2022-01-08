function signin() {


    var userName = document.getElementById("loginusername").value;
    var userPass = document.getElementById("pwin").value;

    

    var xttpreq = new XMLHttpRequest();

    xttpreq.onreadystatechange = function () {

        if (this.readyState == 4 && this.status == 200) {

            var response = xttpreq.responseText;
            console.log(response);
            console.log(userName);
            console.log(userPass);
           
        }

    };

    xttpreq.open("POST", "Signin", true);
    xttpreq.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xttpreq.send("username=" + userName + "&userpassword=" + userPass);


}


