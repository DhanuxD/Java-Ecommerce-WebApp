function userRegister() {


    var name = document.getElementById("username").value;
    var email = document.getElementById("useremail").value;
    var password = document.getElementById("pwup").value;
    var confirmpassword = document.getElementById("comfirmpwup").value;




    if (name == "" && email == "") {

        alert("User name and email Cannot be null");

    } else if (name == "") {
        alert("User name cannot be null");
    } else if (email == "") {
        alert("Email cannot be null");
    } else {

        if (password == confirmpassword) {


            var httpr = new XMLHttpRequest();
            httpr.onreadystatechange = function () {

                if (this.readyState == 4 && this.status == 200) {

                    //  var response = this.responseText;
                    console.log("Success !");
//            location.href = response;
                    //  console.log(response);

                }

            };
            httpr.open("POST", "Signup", true);
            httpr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            httpr.send("email=" + email + "&name=" + name + "&password=" + password);


        } else {

            alert("Plese Cheack password");

        }


    }






}
