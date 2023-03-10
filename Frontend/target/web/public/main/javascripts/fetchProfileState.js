const userModal = document.getElementById("user-modal")

var status = document.getElementById("profile").getAttribute("status").replace(/"/g, '');
var first = document.getElementById("profile").getAttribute("first").replace(/"/g, '');
var last = document.getElementById("profile").getAttribute("last").replace(/"/g, '');
var aStatus = document.getElementById("profile").getAttribute("aStatus").replace(/"/g, '');
var email = document.getElementById("profile").getAttribute("email").replace(/"/g, '');
var phone = document.getElementById("profile").getAttribute("phone").replace(/"/g, '');

console.log(first);
console.log(last);
console.log(aStatus);
console.log(status);
if (status == "true") {
    userModal.innerHTML = `
        <p>Your profile haven't completed yet</p>
        <button class="complete-profile-button" id="complete-profile-button">Complete Profile</button>
    `;
} else if (status == "false") {
    userModal.innerHTML = `
<div style="">
<div style="display: flex; justify-content: center;">
        <img src="https://ionicframework.com/docs/img/demos/avatar.svg" style="width: 60%; height: auto;"/>
        </div>
        <p>First Name: ${first}</p>
        <p>Last Name: ${last}</p>
        <p>Academic Status: ${aStatus}</p>
        <p>Email: ${email}</p>
        <p>Phone: ${phone}</p>
        <button class="complete-profile-button" id="complete-profile-button">Edit Profile</button>
    `;
} else {
    userModal.innerHTML = `
        <p>Something wrong happened, can't update information</p>
        <button class="complete-profile-button" id="complete-profile-button">Try Again</button>
    `;
}