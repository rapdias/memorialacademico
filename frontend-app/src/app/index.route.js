(function() {
  'use strict';

  angular
    .module('memorialacademico')
    .config(routerConfig);

  /** @ngInject */
  function routerConfig($stateProvider, $urlRouterProvider) {
    $stateProvider
      .state('home', {
        url: '/',
        templateUrl: 'app/main/main.html',
        controller: 'MainController',
        controllerAs: 'main'
      })
      .state('about', {
        url: '/sobre',
        templateUrl: 'app/sobre/sobre.html'
      })
      .state('contact', {
        url: '/contato',
        templateUrl: 'app/contato/contato.html',
        controller: 'MainController',
        controllerAs: 'main'
      })
      .state('detail', {
        url: '/detail?{id}&{name}&{file}&{year}',
        templateUrl: 'app/detail/detail.html',
        controller: 'DetailController',
        controllerAs: 'detail'
      })
      .state('admin', {
        url: '/admin',
        templateUrl: 'app/admin/admin.html',
        controller: 'MainController',
        controllerAs: 'main'
      });

    $urlRouterProvider.otherwise('/');
  }

})();
