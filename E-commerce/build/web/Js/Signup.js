var state = false;
function toggle() {
    if (state) {
        document.getElementById("pwin").setAttribute("type", "password");
        document.getElementById("comfirmpwup").setAttribute("type", "password");
        state = false;
    } else {
        document.getElementById("pwin").setAttribute("type", "text");
        document.getElementById("comfirmpwup").setAttribute("type", "text");
        state = true;
    }
}

var state2 = false;
function toggler() {
    if (state2) {
        document.getElementById("userpassword").setAttribute("type", "password");
        document.getElementById("comfirmpwup").setAttribute("type", "password");
        state2 = false;
    } else {
        document.getElementById("userpassword").setAttribute("type", "text");
        document.getElementById("comfirmpwup").setAttribute("type", "text");
        state2 = true;
    }
}



function validatePass() {

    var pass = document.getElementById("pwup").value;
    var confirmPass = document.getElementById("comfirmpwup").value;

    if (pass == confirmPass) {

        document.getElementById("comfirmpwup").setAttribute("style", "border-color : black; border-width : 1px;");
        //document.getElementById("comfirmpwup").setAttribute("style","");

    } else {

        document.getElementById("comfirmpwup").setAttribute("style", "border-color : red; border-width : 2px;");
        //document.getElementById("comfirmpwup").setAttribute("style","");

    }


}