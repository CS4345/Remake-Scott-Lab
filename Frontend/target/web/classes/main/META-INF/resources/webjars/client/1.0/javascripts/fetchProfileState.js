const userModal = document.getElementById("user-modal")
var usernameToCheck = document.getElementById("profile").getAttribute("username");
console.log("Fetching: ", usernameToCheck);

function updateAccountStatus() {

    const url = "http://localhost:9005/users/getAccountStatus?username=" + usernameToCheck;
    console.log("Fetching with new request: ", url)

    fetch(url, {
        mode: 'no-cors'
    })
        .then(response => {
            console.log(response.ok)
            let test = response.json()
            console.log("Response: ", test);
            // console.log(response.body);
            // response.body;
            return test
        })
        .then(data => {
            console.log(data)
            if (data.shouldUpdate) {
                userModal.innerHTML = `
                    <p>Your profile haven't completed yet</p>
                    <button class="complete-profile-button" id="complete-profile-button">Complete Profile</button>
                `;
            } else {
                userModal.innerHTML = `
                    <p>Your profile is up to date TODO: Fill out some informations</p>
                `;
                clearInterval(intervalId)
            }
        })
        .catch(error => {
            console.error(error);
            userModal.innerHTML = `
                <p>Failed to retrieve account status</p>
            `;
            clearInterval(intervalId)
        });
}

updateAccountStatus(); // initial fetch

const intervalId = setInterval(updateAccountStatus, 5000); // repeat every 5 seconds