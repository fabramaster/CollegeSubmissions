// ajax-script.js
$(document).ready(function() {
    // AJAX for login
    $("#loginForm").submit(function(e) {
        e.preventDefault();
        var username = $("#loginUsername").val();
        var password = $("#loginPassword").val();

        $.ajax({
            type: "POST",
            url: "login_ajax.php",
            data: { username: username, password: password },
            success: function(response) {
                if (response === "success") {
                    window.location.href = "secret_page.php";
                } else {
                    $("#loginMessage").text(response);
                }
            }
        });
    });

    // AJAX for registration
    $("#registerForm").submit(function(e) {
        e.preventDefault();
        var username = $("#registerUsername").val();
        var password = $("#registerPassword").val();

        $.ajax({
            type: "POST",
            url: "register_ajax.php",
            data: { username: username, password: password },
            success: function(response) {
                $("#registerMessage").text(response);
            }
        });
    });
});
