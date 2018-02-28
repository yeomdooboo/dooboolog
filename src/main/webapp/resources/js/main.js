doobooRequire([
    'jquery',
    'lodash'
], function($, _) {
    console.log($().jquery);
    _.forEach([1, 2, 3], function(value) {
        console.log(value);
    });
    console.log('dooboo require js!');
});