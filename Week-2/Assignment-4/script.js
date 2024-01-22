//Request 1
const welcomeBlock = document.getElementById('welcomeBlock');

welcomeBlock.addEventListener('click', () => welcomeBlock.querySelector('h2').textContent = "Have a Good Time!");

//Request 2
const button = document.getElementById('readMore');
const hideContainer = document.querySelector('.hide-container');

button.addEventListener('click', function() {
  if (hideContainer.style.display === 'none') {
    hideContainer.style.display = 'flex';
    button.textContent = 'Hide Content';
  } else {
    hideContainer.style.display = 'none';
    button.textContent = 'Read More';
  }
});