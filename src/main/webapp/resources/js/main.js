doobooRequire([
    'jquery'
], function($) {
    $(document).ready(function() {
        var topBar = $(".top__box").offset();
        $(window).scroll(function() {
            var docScrollY = $(document).scrollTop();
            var barThis = $(".top__box");
            if (docScrollY > topBar.top) {
                barThis.addClass("top_fix");
            } else {
                barThis.removeClass("top_fix");
            }
        });
    });

});


