const userModal = document.getElementById("user-modal")

var status = document.getElementById("profile").getAttribute("status");

console.log(status);
if (status == "true") {
    userModal.innerHTML = `
        <p>Your profile haven't completed yet</p>
        <button class="complete-profile-button" id="complete-profile-button">Complete Profile</button>
    `;
} else if (status == "false") {
    userModal.innerHTML = `
        <p>Your profile is up to date TODO: Fill out some informations</p>
    `;
} else {
    userModal.innerHTML = `
        <p>Something wrong happened, can't update information</p>
        <button class="complete-profile-button" id="complete-profile-button">Try Again</button>
    `;
}