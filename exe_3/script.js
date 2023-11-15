document.getElementById("login-form");
document.addEventListener("submit", function (event) {
 event.preventDefault();
 const username = document.getElementById("username").value;
 const password = document.getElementById("password").value;
 if (username === "webtech" && password === "htmlcss") {
 alert("Login successful!");
 } else {
 document.getElementById("error-message").textContent =
 "Invalid username or password.";
 }
});