// TODO: Create a variable that selects the form element
const fillOut = document.querySelector("form")

// TODO: Create a function that handles the form submission. Grab the form data and store it in local storage, then redirect to the blog page using the redirectPage function. If the form is submitted with missing data, display an error message to the user.

const userName = document.getElementById("username");
const title = document.getElementById("title");
const content = document.getElementById("content");
const submit = document.getElementById("submit")
const error = document.getElementById("error")

// TODO: Add an event listener to the form on submit. Call the function to handle the form submission.

const handleFormSubmit = function (event) {
  event.preventDefault(); 

 const blogInfo = {
    username: userName.value.trim(),
    title: title.value.trim(),
    content: content.value.trim(),
  };

  localStorage.setItem("blogInfo", JSON.stringify(blogInfo));
  if (blogInfo.username === "" || blogInfo.title === ""  || blogInfo.content === "") {
    error.textContent = "Please complete the form."
  };
}

function renderMessage() {

}

submit.addEventListener("click", handleFormSubmit);
