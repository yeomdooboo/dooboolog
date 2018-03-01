doobooRequire([
    'jquery',
    'lodash'
], function($, _) {
    console.log($().jquery);
    _.forEach([1, 2, 3], function(value) {
        console.log(value);
    });
    console.log('dooboo require js!');

    $(document).ready(function() {
        var navBar = $(".nav").offset();
        $(window).scroll(function() {
            var docScrollY = $(document).scrollTop();
            var barThis = $(".nav");

            if (docScrollY > navBar.top) {
                barThis.addClass("nav_fix");
            } else {
                barThis.removeClass("nav_fix");
            }
        });
    });

});


