angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    
  

      .state('tabsController.home', {
    url: '/home',
    views: {
      'tab1': {
        templateUrl: 'templates/home.html',
        controller: 'homeCtrl'
      }
    }
  })

  .state('tabsController.cart', {
    url: '/cart',
    views: {
      'tab2': {
        templateUrl: 'templates/cart.html',
        controller: 'cartCtrl'
      }
    }
  })

  .state('tabsController.userCenter', {
    url: '/user',
    views: {
      'tab3': {
        templateUrl: 'templates/userCenter.html',
        controller: 'userCenterCtrl'
      }
    }
  })

  .state('tabsController.help', {
    url: '/help',
    views: {
      'tab4': {
        templateUrl: 'templates/help.html',
        controller: 'helpCtrl'
      }
    }
  })

  .state('tabsController', {
    url: '/home',
    templateUrl: 'templates/tabsController.html',
    abstract:true
  })

  .state('tabsController.productDetail', {
    url: '/product/001',
    views: {
      'tab1': {
        templateUrl: 'templates/productDetail.html',
        controller: 'productDetailCtrl'
      }
    }
  })

  .state('tabsController.infomation', {
    url: '/info/001',
    views: {
      'tab4': {
        templateUrl: 'templates/infomation.html',
        controller: 'infomationCtrl'
      }
    }
  })

  .state('withdraw', {
    url: '/withdraw',
    templateUrl: 'templates/withdraw.html',
    controller: 'withdrawCtrl'
  })

$urlRouterProvider.otherwise('/home/home')

  

});