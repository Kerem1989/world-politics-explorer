document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('contactForm');
    const responseDiv = document.getElementById('formResponse');

    form.addEventListener('submit', function(event) {
        event.preventDefault();
        const formData = new FormData(form);

        fetch('/sendEmail', {
            method: 'POST',
            body: formData
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.text();
            })
            .then(data => {
                console.log('Server response:', data);  // Logga serverns svar
                responseDiv.style.display = 'block';
                if (data.trim() === 'success') {
                    responseDiv.innerHTML = '<p style="color: green;">Message Sent Successfully!</p>';
                } else {
                    responseDiv.innerHTML = '<p style="color: red;">Failed to Send Message. Please Try Again.</p>';
                }
            })
            .catch(error => {
                console.error('Error:', error);  // Logga fel
                responseDiv.style.display = 'block';
                responseDiv.innerHTML = '<p style="color: red;">An error occurred. Please try again later.</p>';
            });
    });
});
