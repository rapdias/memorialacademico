/**
 * Created by i857583 on 11/03/17.
 */
(function() {
  'use strict';

angular.module('memorialacademico')
.controller('DetailController', DetailController);

function DetailController($stateParams, $state) {
  var vm = this;

  vm.state = $state.current;
  vm.params = $stateParams;

  vm.id = $stateParams.id;
  vm.name = $stateParams.name;
  vm.file = $stateParams.file;
  vm.year = $stateParams.year;

}

})();
