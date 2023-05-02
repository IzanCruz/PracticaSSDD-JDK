document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('form');
    form.addEventListener('submit', function(event) {
      formatDescription();
    });
  
    function formatDescription() {
      const descriptionInput = document.querySelector('#description-input');
      const descriptionDiv = document.querySelector('#description');
      const descriptionText = descriptionDiv.innerHTML;
      descriptionInput.value = descriptionText;
    }
  });
  