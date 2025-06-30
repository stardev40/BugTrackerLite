
function validateForm() {
  const title = document.getElementById("title").value.trim();
  const desc = document.getElementById("description").value.trim();
  const priority = document.getElementById("priority").value;

  if (!title || !desc || !priority) {
    alert("Please fill all fields!");
    return false;
  }

  return true;
}
