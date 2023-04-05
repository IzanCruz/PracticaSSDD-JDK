document.getElementById("button").addEventListener("click", function() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    if (username === "admin" && password === "1234") {
        window.location.href = "resources/static/index.html";
    } else if (username === "usuario1" && password === "56789") {
        window.location.href = "resources/static/entradas.html";
    } else {
        alert("Usuario o contraseña incorrecta. Inténtalo de nuevo.TU PUTA MADRE");
    }
});
