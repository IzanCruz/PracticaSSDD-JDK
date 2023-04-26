var login = document.querySelector('#loginButton');
var buyButtons = document.querySelectorAll('#buyButton'); // '[href="/entradas.html"]'
buyButtons.forEach( (buyButton) => {
    buyButton.addEventListener('click',(event) => {
        event.preventDefault();
        if(login.textContent.trim() === 'INICIA SESION'){
            alert('Para comprar entradas debes iniciar sesion.');
            window.location.href = "/login.html"; // revisar .html
            return;
        }

    window.location.href = "/entradas.html";
    return;
    });
})