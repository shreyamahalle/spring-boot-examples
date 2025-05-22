$(document).ready(function() {
    $("#locales").change(function() {
        var selectedLang = $(this).val();
        if (selectedLang !== '') {
            // Redirect to locale endpoint with language parameter
            window.location.href = 'locale?lang=' + selectedLang;
        }
    });
});
