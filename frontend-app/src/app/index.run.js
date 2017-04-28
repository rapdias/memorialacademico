(function() {
  'use strict';

  angular
    .module('memorialacademico')
    .run(runBlock);

  /** @ngInject */
  function runBlock($log) {

    $log.debug('runBlock end');
  }

})();
