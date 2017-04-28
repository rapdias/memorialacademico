(function () {
  'use strict';

  angular
    .module('memorialacademico')
    .controller('MainController', MainController);

  /** @ngInject */
  function MainController(toastr, $state, $stateParams, $http, $window, $log) {
    var vm = this;
    vm.showToastr = showToastr;
    $http.get("http://memorialacademico.com.br/estatistica").then(function (response) {
      vm.visitantes = response.data.accessTotalNum;
    });
    $http.get("http://memorialacademico.com.br/admin/mensagem").then(function (response) {
      vm.messages = response.data;
    });

    if (!$window.sessionStorage.getItem("access")) {
      $window.sessionStorage.setItem("access", "on");
      $http.get("http://memorialacademico.com.br/listaIndicados").then(function (response) {
        vm.listaNomesRemote = response.data;
      });
    } else {
      $http.get("http://memorialacademico.com.br/listaIndicados/same").then(function (response) {
        vm.listaNomesRemote = response.data;
      });
    }

    vm.formName='';
    vm.formEmail='';
    vm.formMessage='';
    vm.formJournal='';

    vm.formSendDetails = function(name, email, message, journal) {

      var formData = {
        'name': name,
        'email': email,
        'message': message,
        'journal': journal
      };

      $http({
        method: 'POST',
        url: 'http://memorialacademico.com.br/mensagem',
        data: formData,
        headers: {'Content-Type' : 'application/json'}
      }).success(function(){
        showToastr("Mensagem enviada com sucesso!");
      }).error(function(e) {
        console.log(e);
      });


    };

    vm.formAdminLogin = function(username, password) {
      var loginData = {
        'userName': username,
        'password': password
      }
    };

    vm.orderItem = angular.identity;

    function showToastr(text) {
      toastr.info(text);
      vm.classAnimation = 'fade';
    }

  }
})();
