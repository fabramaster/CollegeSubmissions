

$(document).ready(function() {
    // Add a neon glow effect to the header
    $('header').hover(function() {
        $(this).toggleClass('neon-glow');
});
	// Smooth scrolling for navigation links
	$('nav a').click(function() {
    	var target = $(this.hash);
    	$('html, body').animate({
        	scrollTop: target.offset().top
    	}, 800);
    	return false;
	});

	// Add a rotating animation to the gallery images on hover
	$('.gallery img').hover(function() {
    	$(this).toggleClass('rotate');
	});

});
