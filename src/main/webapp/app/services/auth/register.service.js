(function () {
    'use strict';

    angular
        .module('grammarInboxExtApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
